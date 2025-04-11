package com.hezaerd.registry;

import com.hezaerd.util.ModLib;
import net.minecraft.loot.LootTable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class ModLootTables {
    // Crates
    // - Generic
    public static RegistryKey<LootTable> WOODEN_CRATE = RegistryKey.of(RegistryKeys.LOOT_TABLE, ModLib.id("crate/wooden_crate"));
    public static RegistryKey<LootTable> IRON_CRATE = RegistryKey.of(RegistryKeys.LOOT_TABLE, ModLib.id("crate/iron_crate"));
    public static RegistryKey<LootTable> GOLDEN_CRATE = RegistryKey.of(RegistryKeys.LOOT_TABLE, ModLib.id("crate/golden_crate"));
    // - Biomes
    public static RegistryKey<LootTable> OCEAN_CRATE = RegistryKey.of(RegistryKeys.LOOT_TABLE, ModLib.id("crate/ocean_crate"));
    public static RegistryKey<LootTable> JUNGLE_CRATE = RegistryKey.of(RegistryKeys.LOOT_TABLE, ModLib.id("crate/jungle_crate"));
    public static RegistryKey<LootTable> MIRAGE_CRATE = RegistryKey.of(RegistryKeys.LOOT_TABLE, ModLib.id("crate/mirage_crate"));
    public static RegistryKey<LootTable> FROZEN_CRATE = RegistryKey.of(RegistryKeys.LOOT_TABLE, ModLib.id("crate/frozen_crate"));
    public static RegistryKey<LootTable> SLIMY_CRATE = RegistryKey.of(RegistryKeys.LOOT_TABLE, ModLib.id("crate/slimy_crate"));
    public static RegistryKey<LootTable> FLOWER_CRATE = RegistryKey.of(RegistryKeys.LOOT_TABLE, ModLib.id("crate/flower_crate"));
    public static RegistryKey<LootTable> SHROOM_CRATE = RegistryKey.of(RegistryKeys.LOOT_TABLE, ModLib.id("crate/shroom_crate"));
    public static RegistryKey<LootTable> LUSH_CRATE = RegistryKey.of(RegistryKeys.LOOT_TABLE, ModLib.id("crate/lush_crate"));
    public static RegistryKey<LootTable> DEEP_DARK_CRATE = RegistryKey.of(RegistryKeys.LOOT_TABLE, ModLib.id("crate/deep_dark_crate"));
    // - Other
    public static RegistryKey<LootTable> CELESTIAL_CRATE = RegistryKey.of(RegistryKeys.LOOT_TABLE, ModLib.id("crate/celestial_crate"));
    public static RegistryKey<LootTable> DUNGEON_CRATE = RegistryKey.of(RegistryKeys.LOOT_TABLE, ModLib.id("crate/dungeon_crate"));
}    
