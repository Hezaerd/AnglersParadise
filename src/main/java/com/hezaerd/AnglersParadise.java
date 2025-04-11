package com.hezaerd;

import com.hezaerd.registry.ModLootTableModifiers;
import com.hezaerd.registry.ModItemGroups;
import com.hezaerd.registry.ModItems;
import com.hezaerd.util.Log;
import com.hezaerd.util.Wisdom;
import net.fabricmc.api.ModInitializer;

public class AnglersParadise implements ModInitializer {
    @Override
    public void onInitialize() {
        ModItemGroups.init();
        ModItems.init();

        ModLootTableModifiers.modifyLootTables();
        
        Wisdom.spread();

        Log.i("Angler's Paradise initialized!");
    }
}