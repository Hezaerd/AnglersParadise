package com.hezaerd;

import com.hezaerd.datagen.ModBiomeTagProvider;
import com.hezaerd.datagen.ModCrateLootTableProvider;
import com.hezaerd.datagen.ModModelProvider;
import com.hezaerd.datagen.ModFishingLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class AnglersParadiseDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModBiomeTagProvider::new);
        pack.addProvider(ModCrateLootTableProvider::new);
//        pack.addProvider(ModFishingLootTableProvider::new);
    }
}
