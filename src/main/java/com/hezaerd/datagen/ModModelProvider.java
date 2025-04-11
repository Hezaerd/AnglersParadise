package com.hezaerd.datagen;

import com.hezaerd.registry.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        generateCratesItemModels(itemModelGenerator);
    }
    
    private void generateCratesItemModels(ItemModelGenerator itemModelGenerator) {
        // - Generic
        itemModelGenerator.register(ModItems.WOODEN_CRATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_CRATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_CRATE, Models.GENERATED);
        // - Biomes
        itemModelGenerator.register(ModItems.OCEAN_CRATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.JUNGLE_CRATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MIRAGE_CRATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FROZEN_CRATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SLIMY_CRATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLOWER_CRATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHROOM_CRATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LUSH_CRATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEEP_DARK_CRATE, Models.GENERATED);
        // - Other
        itemModelGenerator.register(ModItems.CELESTIAL_CRATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DUNGEON_CRATE, Models.GENERATED);
    }
}
