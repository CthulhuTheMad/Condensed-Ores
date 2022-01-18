package net.cthulhuthemad.condensedores.world.feature;

import net.cthulhuthemad.condensedores.CondensedOres;
import net.cthulhuthemad.condensedores.block.ModBlocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeature {

    public static final List<OreFeatureConfig.Target> COAL_CONDENSED_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CONDENSED_COAL_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_CONDENSED_REDSTONE_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> COPPER_CONDENSED_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CONDENSED_COPPER_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_CONDENSED_COPPER_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> DIAMOND_CONDENSED_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CONDENSED_DIAMOND_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_CONDENSED_DIAMOND_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> EMERALD_CONDENSED_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CONDENSED_EMERALD_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_CONDENSED_EMERALD_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> GOLD_CONDENSED_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CONDENSED_GOLD_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_CONDENSED_GOLD_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> IRON_CONDENSED_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CONDENSED_IRON_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_CONDENSED_IRON_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> LAPIS_CONDENSED_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CONDENSED_LAPIS_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_CONDENSED_LAPIS_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> REDSTONE_CONDENSED_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CONDENSED_REDSTONE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_CONDENSED_COAL_ORE.getDefaultState()));

    public static final ConfiguredFeature<?, ?> CONDENSED_COAL_ORE = register("condensed_coal_ore",
            Feature.ORE.configure(new OreFeatureConfig(COAL_CONDENSED_ORES, 9)));
    public static final ConfiguredFeature<?, ?> CONDENSED_COAL_ORE_BURIED = register("condensed_coal_ore_buried",
            Feature.ORE.configure(new OreFeatureConfig(COAL_CONDENSED_ORES, 9, 0.5F)));
    public static final ConfiguredFeature<?, ?> CONDENSED_COPPER_ORE_SMALL = register("condensed_copper_ore_small",
            Feature.ORE.configure(new OreFeatureConfig(COPPER_CONDENSED_ORES, 5)));
    public static final ConfiguredFeature<?, ?> CONDENSED_COPPER_ORE_LARGE = register("condensed_copper_ore_large",
            Feature.ORE.configure(new OreFeatureConfig(COPPER_CONDENSED_ORES, 10)));
    public static final ConfiguredFeature<?, ?> CONDENSED_DIAMOND_ORE_SMALL = register("condensed_diamond_ore_small",
            Feature.ORE.configure(new OreFeatureConfig(DIAMOND_CONDENSED_ORES, 2, 0.5F)));
    public static final ConfiguredFeature<?, ?> CONDENSED_DIAMOND_ORE_LARGE = register("condensed_diamond_ore_large",
            Feature.ORE.configure(new OreFeatureConfig(DIAMOND_CONDENSED_ORES, 6, 0.7F)));
    public static final ConfiguredFeature<?, ?> CONDENSED_DIAMOND_ORE_BURIED = register("condensed_diamond_ore_buried",
            Feature.ORE.configure(new OreFeatureConfig(DIAMOND_CONDENSED_ORES, 4, 1.0F)));
    public static final ConfiguredFeature<?, ?> CONDENSED_EMERALD_ORE = register("condensed_emerald_ore",
            Feature.ORE.configure(new OreFeatureConfig(EMERALD_CONDENSED_ORES, 2)));
    public static final ConfiguredFeature<?, ?> CONDENSED_GOLD_ORE = register("condensed_gold_ore",
            Feature.ORE.configure(new OreFeatureConfig(GOLD_CONDENSED_ORES, 5)));
    public static final ConfiguredFeature<?, ?> CONDENSED_GOLD_ORE_BURIED = register("condensed_gold_ore_buried",
            Feature.ORE.configure(new OreFeatureConfig(GOLD_CONDENSED_ORES, 5, 0.5F)));
    public static final ConfiguredFeature<?, ?> CONDENSED_IRON_ORE = register("condensed_iron_ore",
            Feature.ORE.configure(new OreFeatureConfig(IRON_CONDENSED_ORES, 5)));
    public static final ConfiguredFeature<?, ?> CONDENSED_IRON_ORE_SMALL = register("condensed_iron_ore_small",
            Feature.ORE.configure(new OreFeatureConfig(IRON_CONDENSED_ORES, 2)));
    public static final ConfiguredFeature<?, ?> CONDENSED_LAPIS_ORE = register("condensed_lapis_ore",
            Feature.ORE.configure(new OreFeatureConfig(LAPIS_CONDENSED_ORES, 4)));
    public static final ConfiguredFeature<?, ?> CONDENSED_LAPIS_ORE_BURIED = register("condensed_lapis_ore_buried",
            Feature.ORE.configure(new OreFeatureConfig(LAPIS_CONDENSED_ORES, 4, 1.0F)));
    public static final ConfiguredFeature<?, ?> CONDENSED_REDSTONE_ORE = register("condensed_redstone_ore",
            Feature.ORE.configure(new OreFeatureConfig(REDSTONE_CONDENSED_ORES, 4)));

    public static <FC extends FeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(CondensedOres.MOD_ID, name),
                configuredFeature);
    }

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + CondensedOres.MOD_ID);
    }
}
