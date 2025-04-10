package com.hezaerd.registry;

import com.hezaerd.util.ModLib;
import net.minecraft.loot.LootTable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class ModLootTables {
    public static RegistryKey<LootTable> WOODEN_CRATE = RegistryKey.of(RegistryKeys.LOOT_TABLE, ModLib.id("crate/wooden_crate"));
}
