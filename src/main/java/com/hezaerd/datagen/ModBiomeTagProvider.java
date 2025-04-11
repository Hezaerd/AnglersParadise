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
        configureAquaticBiomes();
        configureTemperateBiomes();
        configureColdBiomes();
        configureHotBiomes();
        configureSpecialBiomes();
        configureCaveBiomes();
    }

    private void configureAquaticBiomes() {
        // Ocean
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, ModLib.id("ocean_biomes")))
                .setReplace(false)
                .addOptional(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "is_ocean")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "ocean")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "cold_ocean")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "lukewarm_ocean")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "warm_ocean")));

        // Deep Ocean
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, ModLib.id("deep_ocean_biomes")))
                .setReplace(false)
                .addOptional(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "is_deep_ocean")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "deep_ocean")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "deep_cold_ocean")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "deep_lukewarm_ocean")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "deep_frozen_ocean")));

        // River
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, ModLib.id("river_biomes")))
                .setReplace(false)
                .addOptional(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "is_river")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "river")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "frozen_river")));

        // Beach
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, ModLib.id("beach_biomes")))
                .setReplace(false)
                .addOptional(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "is_beach")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "beach")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "snowy_beach")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "stony_shore")));
    }

    private void configureTemperateBiomes() {
        // Forest
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, ModLib.id("forest_biomes")))
                .setReplace(false)
                .addOptional(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "is_forest")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "forest")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "birch_forest")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "old_growth_birch_forest")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "dark_forest")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "flower_forest")));

        // Plains
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, ModLib.id("plains_biomes")))
                .setReplace(false)
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "plains")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "sunflower_plains")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "meadow")));

        // Swamp
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, ModLib.id("swamp_biomes")))
                .setReplace(false)
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "swamp")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "mangrove_swamp")));

        // Jungle
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, ModLib.id("jungle_biomes")))
                .setReplace(false)
                .addOptional(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "is_jungle")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "jungle")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "sparse_jungle")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "bamboo_jungle")));
    }

    private void configureColdBiomes() {
        // Snow
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, ModLib.id("snow_biomes")))
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

        // Taiga
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, ModLib.id("taiga_biomes")))
                .setReplace(false)
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "taiga")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "snowy_taiga")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "old_growth_pine_taiga")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "old_growth_spruce_taiga")));
    }

    private void configureHotBiomes() {
        // Desert
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, ModLib.id("desert_biomes")))
                .setReplace(false)
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "desert")));

        // Savanna
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, ModLib.id("savanna_biomes")))
                .setReplace(false)
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "savanna")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "savanna_plateau")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "windswept_savanna")));

        // Badlands
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, ModLib.id("badlands_biomes")))
                .setReplace(false)
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "badlands")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "eroded_badlands")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "wooded_badlands")));
    }

    private void configureSpecialBiomes() {
        // Flower
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, ModLib.id("flower_biomes")))
                .setReplace(false)
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "flower_forest")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "sunflower_plains")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "meadow")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "cherry_grove")));

        // Shroom
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, ModLib.id("shroom_biomes")))
                .setReplace(false)
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "mushroom_fields")));

        // Mountains
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, ModLib.id("mountain_biomes")))
                .setReplace(false)
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "windswept_hills")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "windswept_gravelly_hills")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "windswept_forest")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "frozen_peaks")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "jagged_peaks")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "stony_peaks")));
    }

    private void configureCaveBiomes() {
        // Cave
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, ModLib.id("cave_biomes")))
                .setReplace(false)
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "lush_caves")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "deep_dark")))
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "dripstone_caves")));

        // Lush-Cave
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, ModLib.id("lush_cave_biomes")))
                .setReplace(false)
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "lush_caves")));

        // Deep Dark
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, ModLib.id("deep_dark_biomes")))
                .setReplace(false)
                .add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "deep_dark")));
    }
}
