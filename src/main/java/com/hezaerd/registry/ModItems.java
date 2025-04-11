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
    public static Crate WOODEN_CRATE;
    public static Crate IRON_CRATE;
    public static Crate GOLDEN_CRATE;
    public static Crate OCEAN_CRATE;
    public static Crate DEEP_OCEAN_CRATE;
    public static Crate RIVER_CRATE;
    public static Crate BEACH_CRATE;
    public static Crate FOREST_CRATE;
    public static Crate PLAINS_CRATE;
    public static Crate SWAMP_CRATE;
    public static Crate JUNGLE_CRATE;
    public static Crate SNOW_CRATE;
    public static Crate TAIGA_CRATE;
    public static Crate DESERT_CRATE;
    public static Crate SAVANNA_CRATE;
    public static Crate BADLANDS_CRATE;
    public static Crate FLOWER_CRATE;
    public static Crate SHROOM_CRATE;
    public static Crate MOUNTAIN_CRATE;
    public static Crate CAVE_CRATE;
    public static Crate LUSH_CAVE_CRATE;
    public static Crate DEEP_DARK_CRATE;

    public static void init() {
        // Crates
        WOODEN_CRATE = registerCrate("wooden_crate", Crate::new, new Item.Settings(), ModLootTables.WOODEN_CRATE);
        IRON_CRATE = registerCrate("iron_crate", Crate::new, new Item.Settings(), ModLootTables.IRON_CRATE);
        GOLDEN_CRATE = registerCrate("golden_crate", Crate::new, new Item.Settings(), ModLootTables.GOLDEN_CRATE);
        OCEAN_CRATE = registerCrate("ocean_crate", Crate::new, new Item.Settings(), ModLootTables.OCEAN_CRATE);
        DEEP_OCEAN_CRATE = registerCrate("deep_ocean_crate", Crate::new, new Item.Settings(), ModLootTables.DEEP_OCEAN_CRATE);
        RIVER_CRATE = registerCrate("river_crate", Crate::new, new Item.Settings(), ModLootTables.RIVER_CRATE);
        BEACH_CRATE = registerCrate("beach_crate", Crate::new, new Item.Settings(), ModLootTables.BEACH_CRATE);
        FOREST_CRATE = registerCrate("forest_crate", Crate::new, new Item.Settings(), ModLootTables.FOREST_CRATE);
        PLAINS_CRATE = registerCrate("plains_crate", Crate::new, new Item.Settings(), ModLootTables.PLAINS_CRATE);
        SWAMP_CRATE = registerCrate("swamp_crate", Crate::new, new Item.Settings(), ModLootTables.SWAMP_CRATE);
        JUNGLE_CRATE = registerCrate("jungle_crate", Crate::new, new Item.Settings(), ModLootTables.JUNGLE_CRATE);
        SNOW_CRATE = registerCrate("snow_crate", Crate::new, new Item.Settings(), ModLootTables.SNOW_CRATE);
        TAIGA_CRATE = registerCrate("taiga_crate", Crate::new, new Item.Settings(), ModLootTables.TAIGA_CRATE);
        DESERT_CRATE = registerCrate("desert_crate", Crate::new, new Item.Settings(), ModLootTables.DESERT_CRATE);
        SAVANNA_CRATE = registerCrate("savanna_crate", Crate::new, new Item.Settings(), ModLootTables.SAVANNA_CRATE);
        BADLANDS_CRATE = registerCrate("badlands_crate", Crate::new, new Item.Settings(), ModLootTables.BADLANDS_CRATE);
        FLOWER_CRATE = registerCrate("flower_crate", Crate::new, new Item.Settings(), ModLootTables.FLOWER_CRATE);
        SHROOM_CRATE = registerCrate("shroom_crate", Crate::new, new Item.Settings(), ModLootTables.SHROOM_CRATE);
        MOUNTAIN_CRATE = registerCrate("mountain_crate", Crate::new, new Item.Settings(), ModLootTables.MOUNTAIN_CRATE);
        CAVE_CRATE = registerCrate("cave_crate", Crate::new, new Item.Settings(), ModLootTables.CAVE_CRATE);
        LUSH_CAVE_CRATE = registerCrate("lush_cave_crate", Crate::new, new Item.Settings(), ModLootTables.LUSH_CAVE_CRATE);
        DEEP_DARK_CRATE = registerCrate("deep_dark_crate", Crate::new, new Item.Settings(), ModLootTables.DEEP_DARK_CRATE);

        ItemGroupEvents.modifyEntriesEvent(ModItemGroups.MOD_ITEM_GROUP_KEY).register((itemGroup) -> {
            // Crates
            itemGroup.add(WOODEN_CRATE);
            itemGroup.add(IRON_CRATE);
            itemGroup.add(GOLDEN_CRATE);
            itemGroup.add(OCEAN_CRATE);
            itemGroup.add(DEEP_OCEAN_CRATE);
            itemGroup.add(RIVER_CRATE);
            itemGroup.add(BEACH_CRATE);
            itemGroup.add(FOREST_CRATE);
            itemGroup.add(PLAINS_CRATE);
            itemGroup.add(SWAMP_CRATE);
            itemGroup.add(JUNGLE_CRATE);
            itemGroup.add(SNOW_CRATE);
            itemGroup.add(TAIGA_CRATE);
            itemGroup.add(DESERT_CRATE);
            itemGroup.add(SAVANNA_CRATE);
            itemGroup.add(BADLANDS_CRATE);
            itemGroup.add(FLOWER_CRATE);
            itemGroup.add(SHROOM_CRATE);
            itemGroup.add(MOUNTAIN_CRATE);
            itemGroup.add(CAVE_CRATE);
            itemGroup.add(LUSH_CAVE_CRATE);
            itemGroup.add(DEEP_DARK_CRATE);
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
