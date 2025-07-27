package net.wierdpotato.prophecyofluggage.worldgen;


import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.wierdpotato.prophecyofluggage.ProphecyofLuggage;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> LEAN_ORE_PLACED_KEY = registerKey("lean_ore_placed");



    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, LEAN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LEAN_ORE_KEY),

                //ModOrePlacement.commonOrePlacement(10, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-67), VerticalAnchor.aboveBottom(67))));
                ModOrePlacement.commonOrePlacement(10, HeightRangePlacement.triangle(VerticalAnchor.absolute(-67), VerticalAnchor.absolute(67))));



    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(ProphecyofLuggage.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
