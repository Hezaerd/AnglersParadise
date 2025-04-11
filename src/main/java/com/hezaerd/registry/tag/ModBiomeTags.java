package com.hezaerd.registry.tag;

import com.hezaerd.util.ModLib;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.world.biome.Biome;

public class ModBiomeTags {
    public static final TagKey<Biome> CAN_DROP_OCEAN_CRATE = of("can_drop_ocean_crate");
    public static final TagKey<Biome> CAN_DROP_JUNGLE_CRATE = of("can_drop_jungle_crate");
    public static final TagKey<Biome> CAN_DROP_MIRAGE_CRATE = of("can_drop_mirage_crate");
    public static final TagKey<Biome> CAN_DROP_FROZEN_CRATE = of("can_drop_frozen_crate");
    public static final TagKey<Biome> CAN_DROP_SLIMY_CRATE = of("can_drop_slimy_crate");
    public static final TagKey<Biome> CAN_DROP_FLOWER_CRATE = of("can_drop_flower_crate");
    public static final TagKey<Biome> CAN_DROP_SHROOM_CRATE = of("can_drop_shroom_crate");
    public static final TagKey<Biome> CAN_DROP_LUSH_CRATE = of("can_drop_lush_crate");
    public static final TagKey<Biome> CAN_DROP_DEEP_DARK_CRATE = of("can_drop_deep_dark_crate");

    private static TagKey<Biome> of(String id) {
        return TagKey.of(RegistryKeys.BIOME, ModLib.id(id));
    }
}
