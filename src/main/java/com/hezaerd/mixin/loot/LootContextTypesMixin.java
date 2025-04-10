package com.hezaerd.mixin.loot;

import com.google.common.collect.BiMap;
import com.hezaerd.registry.ModLootContextTypes;
import com.hezaerd.util.ModLib;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.util.Identifier;
import net.minecraft.util.context.ContextType;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.function.Consumer;

@Mixin(LootContextTypes.class)
public class LootContextTypesMixin {
    @Final
    @Shadow
    private static BiMap<Identifier, ContextType> MAP;

    @Unique
    private static ContextType registerAnglersParadise(String name, Consumer<ContextType.Builder> type) {
        ContextType.Builder builder = new ContextType.Builder();
        type.accept(builder);
        ContextType contextType = builder.build();
        Identifier id = ModLib.id(name);
        ContextType contextType2 = MAP.put(id, contextType);
        if (contextType2 != null) {
            throw new IllegalStateException("Loot table parameter set " + id + " is already registered");
        }
        return contextType;
    }

    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void addCrateType(CallbackInfo ci) {
        ModLootContextTypes.CRATE = registerAnglersParadise(
                "crate",
                builder -> builder
                        .require(LootContextParameters.ORIGIN)
                        .allow(LootContextParameters.THIS_ENTITY)
        );
    }
}
