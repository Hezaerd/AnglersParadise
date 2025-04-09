package com.hezaerd.registry;

import com.hezaerd.AnglersParadise;
import com.hezaerd.item.Crate;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {
    public static Crate WOOD_CRATE;
    
    public static void init() {
        WOOD_CRATE = registerCrate("wood_crate", Crate::new, new Item.Settings());
        WOOD_CRATE.setLootTable(ModLootTables.WOOD_CRATE);
        
        ItemGroupEvents.modifyEntriesEvent(ModItemGroups.MOD_ITEM_GROUP_KEY).register((itemGroup) -> {
            itemGroup.add(ModItems.WOOD_CRATE);
        });
    }
    
    private static Crate registerCrate(String name, Function<Item.Settings, Crate> itemFactory, Item.Settings settings) {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AnglersParadise.MOD_ID, name));
        Crate item = itemFactory.apply(settings.registryKey(itemKey));
        Registry.register(Registries.ITEM, itemKey, item);
        return item;
    }
    
    private static Item registerItem(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AnglersParadise.MOD_ID, name));
        Item item = itemFactory.apply(settings.registryKey(itemKey));
        Registry.register(Registries.ITEM, itemKey, item);
        return item;
    }
}
