package com.hezaerd.util;

import net.minecraft.util.Identifier;

public class ModLib {
    public static final String MOD_ID = "anglersparadise";

    public static Identifier id(String path) {
        return Identifier.of(MOD_ID, path);
    }
}
