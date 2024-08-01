package net.maisiemarlowe.angelsascent.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.maisiemarlowe.angelsascent.world.ModPlacedFeatures;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGeneration {
    public static void generateOres() {

        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SOUL_ORE_PLACED_KEY);
    }
}