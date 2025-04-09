package com.hezaerd;

import com.hezaerd.registry.ModItemGroups;
import com.hezaerd.registry.ModItems;
import com.hezaerd.registry.ModLootTables;
import com.hezaerd.util.Log;
import com.hezaerd.util.Wisdom;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

public class AnglersParadise implements ModInitializer {
	public static final String MOD_ID = "anglersparadise";

	@Override
	public void onInitialize() {
		ModItemGroups.init();
		ModLootTables.init();
		ModItems.init();

		Wisdom.spread();

		Log.i("Angler's Paradise initialized!");
	}
	
	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}