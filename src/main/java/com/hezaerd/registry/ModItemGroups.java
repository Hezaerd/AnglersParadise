package com.hezaerd.registry;

import com.hezaerd.util.ModLib;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> MOD_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), ModLib.id("item_group"));
    public static ItemGroup ITEM_GROUP;

    public static void init() {
        ITEM_GROUP = FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModItems.WOODEN_CRATE))
                .displayName(Text.translatable("itemGroup.anglersparadise"))
                .build();

        Registry.register(Registries.ITEM_GROUP, MOD_ITEM_GROUP_KEY, ITEM_GROUP);
    }
}
