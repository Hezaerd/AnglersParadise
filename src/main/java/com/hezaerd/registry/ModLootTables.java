package com.hezaerd.registry;

import com.hezaerd.AnglersParadise;
import net.minecraft.loot.LootTable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class ModLootTables {
    public static RegistryKey<LootTable> WOOD_CRATE;
    
    public static void init() {
        WOOD_CRATE = RegistryKey.of(RegistryKeys.LOOT_TABLE, AnglersParadise.id("wood_crate"));
    }
}
