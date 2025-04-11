package com.hezaerd.registry.tag;

import com.hezaerd.util.ModLib;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.world.biome.Biome;

public class ModBiomeTags {
    // Aquatic Biomes
    public static final TagKey<Biome> OCEAN_BIOMES = of("ocean_biomes");
    public static final TagKey<Biome> DEEP_OCEAN_BIOMES = of("deep_ocean_biomes");
    public static final TagKey<Biome> RIVER_BIOMES = of("river_biomes");
    public static final TagKey<Biome> BEACH_BIOMES = of("beach_biomes");

    // Temperate Biomes
    public static final TagKey<Biome> FOREST_BIOMES = of("forest_biomes");
    public static final TagKey<Biome> PLAINS_BIOMES = of("plains_biomes");
    public static final TagKey<Biome> SWAMP_BIOMES = of("swamp_biomes");
    public static final TagKey<Biome> JUNGLE_BIOMES = of("jungle_biomes");

    // Cold Biomes
    public static final TagKey<Biome> SNOW_BIOMES = of("snow_biomes");
    public static final TagKey<Biome> TAIGA_BIOMES = of("taiga_biomes");

    // Hot Biomes
    public static final TagKey<Biome> DESERT_BIOMES = of("desert_biomes");
    public static final TagKey<Biome> SAVANNA_BIOMES = of("savanna_biomes");
    public static final TagKey<Biome> BADLANDS_BIOMES = of("badlands_biomes");

    // Special Biomes
    public static final TagKey<Biome> FLOWER_BIOMES = of("flower_biomes");
    public static final TagKey<Biome> SHROOM_BIOMES = of("shroom_biomes");
    public static final TagKey<Biome> MOUNTAIN_BIOMES = of("mountain_biomes");

    // Cave Biomes
    public static final TagKey<Biome> CAVE_BIOMES = of("cave_biomes");
    public static final TagKey<Biome> LUSH_CAVE_BIOMES = of("lush_cave_biomes");
    public static final TagKey<Biome> DEEP_DARK_BIOMES = of("deep_dark_biomes");

    private static TagKey<Biome> of(String id) {
        return TagKey.of(RegistryKeys.BIOME, ModLib.id(id));
    }
}
