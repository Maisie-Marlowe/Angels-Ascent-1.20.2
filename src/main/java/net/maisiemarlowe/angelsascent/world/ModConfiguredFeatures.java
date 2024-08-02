package net.maisiemarlowe.angelsascent.world;

import net.maisiemarlowe.angelsascent.AngelsAscent;
import net.maisiemarlowe.angelsascent.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> SOUL_ORE_KEY = registerKey("soul_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HOLY_ORE_KEY = registerKey("holy_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLASPHEMOUS_ORE_KEY = registerKey("blasphemous_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest endReplacables = new BlockMatchRuleTest(Blocks.END_STONE);


        List<OreFeatureConfig.Target> endSoulOres =
                List.of(OreFeatureConfig.createTarget(endReplacables, ModBlocks.SOUL_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> endHolyOres =
                List.of(OreFeatureConfig.createTarget(endReplacables, ModBlocks.HOLY_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> endBlasphemousOres =
                List.of(OreFeatureConfig.createTarget(endReplacables, ModBlocks.BLASPHEMOUS_ORE.getDefaultState()));

        register(context, SOUL_ORE_KEY, Feature.ORE, new OreFeatureConfig(endSoulOres, 8));
        register(context, HOLY_ORE_KEY, Feature.ORE, new OreFeatureConfig(endHolyOres, 8));
        register(context, BLASPHEMOUS_ORE_KEY, Feature.ORE, new OreFeatureConfig(endBlasphemousOres, 8));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(AngelsAscent.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}