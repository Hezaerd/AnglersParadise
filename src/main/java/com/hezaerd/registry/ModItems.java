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
    public static Crate WOODEN_CRATE;

    public static void init() {
        WOODEN_CRATE = registerCrate("wooden_crate", Crate::new, new Item.Settings(), ModLootTables.WOODEN_CRATE);

        ItemGroupEvents.modifyEntriesEvent(ModItemGroups.MOD_ITEM_GROUP_KEY).register((itemGroup) -> {
            itemGroup.add(ModItems.WOODEN_CRATE);
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
