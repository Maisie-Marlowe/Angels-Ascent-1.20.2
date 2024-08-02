package net.maisiemarlowe.angelsascent.world;

import net.maisiemarlowe.angelsascent.AngelsAscent;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;
import java.util.Random;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> SOUL_ORE_PLACED_KEY = registerKey("soul_ore_placed");
    public static final RegistryKey<PlacedFeature> HOLY_ORE_PLACED_KEY = registerKey("holy_ore_placed");
    public static final RegistryKey<PlacedFeature> BLASPHEMOUS_ORE_PLACED_KEY = registerKey("blasphemous_ore_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);



        register(context, SOUL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SOUL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));

        register(context, HOLY_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.HOLY_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));

        register(context, BLASPHEMOUS_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BLASPHEMOUS_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));


    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(AngelsAscent.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

}