package com.hezaerd.datagen;

import com.hezaerd.util.ModLib;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

import java.util.concurrent.CompletableFuture;

public class ModBiomeTagProvider extends FabricTagProvider<Biome> {
    public ModBiomeTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.BIOME, registriesFuture);
    }

    //Note: These tags are used to identify biomes for crates fishing.
    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        // Ocean
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, ModLib.id("can_drop_ocean_crate")))
                .setReplace(false)
                .addOptional(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "is_ocean")))
                .addOptional(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "is_deep_ocean")))
                .addOptional(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "is_beach")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "ocean")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "cold_ocean")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "lukewarm_ocean")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "warm_ocean")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "deep_ocean")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "deep_cold_ocean")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "deep_lukewarm_ocean")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "deep_frozen_ocean")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "beach")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "snowy_beach")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "stony_shore")));

        // Jungle
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, ModLib.id("can_drop_jungle_crate")))
                .setReplace(false)
                .addOptional(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "is_jungle")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "jungle")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "sparse_jungle")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "bamboo_jungle")));

        // Mirage
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, ModLib.id("can_drop_mirage_crate")))
                .setReplace(false)
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "desert")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "savanna")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "savanna_plateau")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "windswept_savanna")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "badlands")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "eroded_badlands")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "wooded_badlands")));

        // Frozen
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, ModLib.id("can_drop_frozen_crate")))
                .setReplace(false)
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "snowy_beach")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "snowy_plains")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "snowy_slopes")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "snowy_taiga")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "frozen_river")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "deep_frozen_ocean")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "frozen_ocean")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "frozen_peaks")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "ice_spikes")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "grove")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "jagged_peaks")));

        // Slimy
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, ModLib.id("can_drop_slimy_crate")))
                .setReplace(false)
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "swamp")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "mangrove_swamp")));

        // Flower
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, ModLib.id("can_drop_flower_crate")))
                .setReplace(false)
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "flower_forest")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "sunflower_plains")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "meadow")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "cherry_grove")));

        // Shroom
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, ModLib.id("can_drop_shroom_crate")))
                .setReplace(false)
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "mushroom_fields")));

        // Lush
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, ModLib.id("can_drop_lush_crate")))
                .setReplace(false)
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "lush_caves")));

        // Deep-Dark
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, ModLib.id("can_drop_deep_dark_crate")))
                .setReplace(false)
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "deep_dark")));
    }
}
