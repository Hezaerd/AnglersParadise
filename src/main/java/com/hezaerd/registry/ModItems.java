package com.hezaerd.registry;

import com.hezaerd.item.Crate;
import com.hezaerd.util.ModLib;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ModItems {
    // Crates
    // - Generic
    public static Crate WOODEN_CRATE;
    public static Crate IRON_CRATE;
    public static Crate GOLDEN_CRATE;
    // - Biomes
    public static Crate OCEAN_CRATE;
    public static Crate JUNGLE_CRATE;
    public static Crate MIRAGE_CRATE;
    public static Crate FROZEN_CRATE;
    public static Crate SLIMY_CRATE;
    public static Crate FLOWER_CRATE;
    public static Crate SHROOM_CRATE;
    public static Crate LUSH_CRATE;
    public static Crate DEEP_DARK_CRATE;
    // - Other
    public static Crate CELESTIAL_CRATE;
    public static Crate DUNGEON_CRATE;

    public static void init() {
        // Crates
        // - Generic
        WOODEN_CRATE = registerCrate("wooden_crate", Crate::new, new Item.Settings(), ModLootTables.WOODEN_CRATE);
        IRON_CRATE = registerCrate("iron_crate", Crate::new, new Item.Settings(), ModLootTables.IRON_CRATE);
        GOLDEN_CRATE = registerCrate("golden_crate", Crate::new, new Item.Settings(), ModLootTables.GOLDEN_CRATE);
        // - Biomes
        OCEAN_CRATE = registerCrate("ocean_crate", Crate::new, new Item.Settings(), ModLootTables.OCEAN_CRATE);
        JUNGLE_CRATE = registerCrate("jungle_crate", Crate::new, new Item.Settings(), ModLootTables.JUNGLE_CRATE);
        MIRAGE_CRATE = registerCrate("mirage_crate", Crate::new, new Item.Settings(), ModLootTables.MIRAGE_CRATE);
        FROZEN_CRATE = registerCrate("frozen_crate", Crate::new, new Item.Settings(), ModLootTables.FROZEN_CRATE);
        SLIMY_CRATE = registerCrate("slimy_crate", Crate::new, new Item.Settings(), ModLootTables.SLIMY_CRATE);
        FLOWER_CRATE = registerCrate("flower_crate", Crate::new, new Item.Settings(), ModLootTables.FLOWER_CRATE);
        SHROOM_CRATE = registerCrate("shroom_crate", Crate::new, new Item.Settings(), ModLootTables.SHROOM_CRATE);
        LUSH_CRATE = registerCrate("lush_crate", Crate::new, new Item.Settings(), ModLootTables.LUSH_CRATE);
        DEEP_DARK_CRATE = registerCrate("deep_dark_crate", Crate::new, new Item.Settings(), ModLootTables.DEEP_DARK_CRATE);
        // - Other
        CELESTIAL_CRATE = registerCrate("celestial_crate", Crate::new, new Item.Settings(), ModLootTables.CELESTIAL_CRATE);
        DUNGEON_CRATE = registerCrate("dungeon_crate", Crate::new, new Item.Settings(), ModLootTables.DUNGEON_CRATE);

        ItemGroupEvents.modifyEntriesEvent(ModItemGroups.MOD_ITEM_GROUP_KEY).register((itemGroup) -> {
            // Crates
            // - Generic
            itemGroup.add(WOODEN_CRATE);
            itemGroup.add(IRON_CRATE);
            itemGroup.add(GOLDEN_CRATE);
            // - Biomes
            itemGroup.add(OCEAN_CRATE);
            itemGroup.add(JUNGLE_CRATE);
            itemGroup.add(MIRAGE_CRATE);
            itemGroup.add(FROZEN_CRATE);
            itemGroup.add(SLIMY_CRATE);
            itemGroup.add(FLOWER_CRATE);
            itemGroup.add(SHROOM_CRATE);
            itemGroup.add(LUSH_CRATE);
            itemGroup.add(DEEP_DARK_CRATE);
            // - Other
            itemGroup.add(CELESTIAL_CRATE);
            itemGroup.add(DUNGEON_CRATE);
        });
    }

    private static Item registerItem(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, ModLib.id(name));
        Item item = itemFactory.apply(settings.registryKey(itemKey));
        Registry.register(Registries.ITEM, itemKey, item);
        return item;
    }

    private static Crate registerCrate(String name, BiFunction<Item.Settings, RegistryKey<LootTable>, Crate> itemFactory,
                                       Item.Settings settings, RegistryKey<LootTable> lootTable) {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, ModLib.id(name));
        Crate item = itemFactory.apply(settings.registryKey(itemKey), lootTable);
        Registry.register(Registries.ITEM, itemKey, item);
        return item;
    }
}
