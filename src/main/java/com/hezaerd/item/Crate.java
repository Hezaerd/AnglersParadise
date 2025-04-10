package com.hezaerd.item;

import com.hezaerd.util.Log;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.loot.context.LootWorldContext;
import net.minecraft.registry.RegistryKey;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class Crate extends Item {
    private final RegistryKey<LootTable> lootTable;
    private ItemStack item = ItemStack.EMPTY;

    public Crate(Settings settings, RegistryKey<LootTable> lootTable) {
        super(settings.maxCount(16));
        this.lootTable = lootTable;
    }

    @Override
    public ActionResult use(World world, PlayerEntity player, Hand hand) {
        ItemStack heldStack = player.getStackInHand(hand);

        if (!world.isClient) {
            if (this.item.isEmpty()) {
                this.generateItem((ServerWorld) world, player, hand);
            }

            if (!this.item.isEmpty()) {
                ItemStack itemToGive = this.item.copy();
                this.item = ItemStack.EMPTY;

                if (!player.isCreative())
                    heldStack.decrement(1);

                player.giveItemStack(itemToGive);
            } else {
                Log.w("Failed to generate loot from loot table {}", this.lootTable.getValue());
            }
        }

        return ActionResult.SUCCESS;
    }

    /**
     * Generates loot from the loot table (if set) using the world's built-in randomness.
     * The resulting loot is stored in the {@code item} field.
     *
     * @param world  The server world.
     * @param player The player opening the crate.
     * @param hand   The hand used to open the crate.
     */
    private void generateItem(ServerWorld world, PlayerEntity player, Hand hand) {
        if (this.lootTable != null) {
            LootTable lootTable = world.getServer()
                    .getReloadableRegistries()
                    .getLootTable(this.lootTable);

            // Trigger advancement
            if (player instanceof ServerPlayerEntity serverPlayerEntity) {
                Criteria.PLAYER_GENERATES_CONTAINER_LOOT.trigger(serverPlayerEntity, this.lootTable);
            }

            // Build loot context
            LootWorldContext lootWorldContext = new LootWorldContext.Builder(world)
                    .add(LootContextParameters.ORIGIN, player.getPos())
                    .add(LootContextParameters.TOOL, player.getStackInHand(hand))
                    .luck(player.getLuck())
                    .add(LootContextParameters.THIS_ENTITY, player)
                    .build(LootContextTypes.FISHING);
            ObjectArrayList<ItemStack> objectArrayList = lootTable.generateLoot(lootWorldContext);

            this.item = switch (objectArrayList.size()) {
                case 0 -> ItemStack.EMPTY;
                case 1 -> objectArrayList.getFirst();
                default -> {
                    Log.w("Expected max 1 loot from loot table {}, but got {}", this.lootTable.getValue(), objectArrayList.size());
                    yield objectArrayList.getFirst();
                }
            };
        }
    }
}