package net.cthulhuthemad.condensedores.world.feature;

import net.cthulhuthemad.condensedores.CondensedOres;
import net.cthulhuthemad.condensedores.block.ModBlocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeature {

    public static final List<OreFeatureConfig.Target> OVERWORLD_CONDENSED_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CONDENSED_COAL_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_CONDENSED_COAL_ORE.getDefaultState()));


    public static final ConfiguredFeature<?, ?> CONDENSED_COAL_ORE = register("condensed_coal_ore",
            Feature.ORE.configure(new OreFeatureConfig(OVERWORLD_CONDENSED_ORES, 10)));
    public static final ConfiguredFeature<?, ?> CONDENSED_COAL_ORE_BURIED = register("condensed_coal_ore_buried",
            Feature.ORE.configure(new OreFeatureConfig(OVERWORLD_CONDENSED_ORES, 10, 0.5F)));



    public static <FC extends FeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(CondensedOres.MOD_ID, name),
                configuredFeature);
    }

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + CondensedOres.MOD_ID);
    }
}
