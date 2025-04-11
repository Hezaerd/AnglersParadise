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
        itemModelGenerator.register(ModItems.WOODEN_CRATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_CRATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_CRATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.OCEAN_CRATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEEP_OCEAN_CRATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RIVER_CRATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEACH_CRATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FOREST_CRATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLAINS_CRATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWAMP_CRATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.JUNGLE_CRATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SNOW_CRATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TAIGA_CRATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DESERT_CRATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAVANNA_CRATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BADLANDS_CRATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLOWER_CRATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHROOM_CRATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOUNTAIN_CRATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CAVE_CRATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LUSH_CAVE_CRATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEEP_DARK_CRATE, Models.GENERATED);
    }
}
