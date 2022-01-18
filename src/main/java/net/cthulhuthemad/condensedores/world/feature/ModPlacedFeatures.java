package net.cthulhuthemad.condensedores.world.feature;


import net.cthulhuthemad.condensedores.CondensedOres;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.feature.PlacedFeature;

import java.util.List;

import static net.cthulhuthemad.condensedores.world.feature.ModOreFeatures.modifiers;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> CONDENSED_COAL_ORE_UPPER_PLACED_KEY = registerKey("condensed_coal_ore_upper_placed");
    public static final RegistryKey<PlacedFeature> CONDENSED_COAL_ORE_LOWER_PLACED_KEY = registerKey("condensed_coal_ore_lower_placed");
    public static final RegistryKey<PlacedFeature> CONDENSED_COPPER_ORE_PLACED_KEY = registerKey("condensed_copper_ore_placed");
    public static final RegistryKey<PlacedFeature> CONDENSED_COPPER_ORE_LARGE_PLACED_KEY = registerKey("condensed_copper_ore_large_placed");
    public static final RegistryKey<PlacedFeature> CONDENSED_DIAMOND_ORE_PLACED_KEY = registerKey("condensed_diamond_ore_placed");
    public static final RegistryKey<PlacedFeature> CONDENSED_DIAMOND_ORE_LARGE_PLACED_KEY = registerKey("condensed_diamond_ore_large_placed");
    public static final RegistryKey<PlacedFeature> CONDENSED_DIAMOND_ORE_BURIED_PLACED_KEY = registerKey("condensed_diamond_ore_buried_placed");
    public static final RegistryKey<PlacedFeature> CONDENSED_EMERALD_ORE_PLACED_KEY = registerKey("condensed_emerald_ore_placed");
    public static final RegistryKey<PlacedFeature> CONDENSED_GOLD_ORE_EXTRA_PLACED_KEY = registerKey("condensed_gold_ore_extra_placed");
    public static final RegistryKey<PlacedFeature> CONDENSED_GOLD_ORE_PLACED_KEY = registerKey("condensed_gold_ore_placed");
    public static final RegistryKey<PlacedFeature> CONDENSED_GOLD_ORE_LOWER_PLACED_KEY = registerKey("condensed_gold_ore_lower_placed");
    public static final RegistryKey<PlacedFeature> CONDENSED_IRON_ORE_UPPER_PLACED_KEY = registerKey("condensed_iron_ore_upper_placed");
    public static final RegistryKey<PlacedFeature> CONDENSED_IRON_ORE_MIDDLE_PLACED_KEY = registerKey("condensed_iron_ore_middle_placed");
    public static final RegistryKey<PlacedFeature> CONDENSED_IRON_ORE_LOWER_PLACED_KEY = registerKey("condensed_iron_ore_lower_placed");
    public static final RegistryKey<PlacedFeature> CONDENSED_LAPIS_ORE_PLACED_KEY = registerKey("condensed_lapis_ore_placed");
    public static final RegistryKey<PlacedFeature> CONDENSED_LAPIS_ORE_BURIED_PLACED_KEY = registerKey("condensed_lapis_ore_buried_placed");
    public static final RegistryKey<PlacedFeature> CONDENSED_REDSTONE_ORE_PLACED_KEY = registerKey("condensed_redstone_ore_placed");
    public static final RegistryKey<PlacedFeature> CONDENSED_REDSTONE_ORE_LOWER_PLACED_KEY = registerKey("condensed_redstone_ore_lower_placed");

    public static final PlacedFeature CONDENSED_COAL_ORE_UPPER_PLACED = registerPlacedFeature("condensed_coal_ore_upper_placed",
            ModConfiguredFeature.CONDENSED_COAL_ORE.withPlacement(ModOreFeatures.modifiersWithCount(15,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(136), YOffset.getTop()))));
    public static final PlacedFeature CONDENSED_COAL_ORE_LOWER_PLACED = registerPlacedFeature("condensed_coal_ore_lower_placed",
            ModConfiguredFeature.CONDENSED_COAL_ORE_BURIED.withPlacement(ModOreFeatures.modifiersWithCount(10,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(192)))));
    public static final PlacedFeature CONDENSED_COPPER_ORE_PLACED = registerPlacedFeature("condensed_copper_ore_placed",
            ModConfiguredFeature.CONDENSED_COPPER_ORE_SMALL.withPlacement(ModOreFeatures.modifiersWithCount(8,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-16), YOffset.fixed(112)))));
    public static final PlacedFeature CONDENSED_COPPER_ORE_LARGE_PLACED = registerPlacedFeature("condensed_copper_ore_large_placed",
            ModConfiguredFeature.CONDENSED_COPPER_ORE_LARGE.withPlacement(ModOreFeatures.modifiersWithCount(8,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-16), YOffset.fixed(112)))));
    public static final PlacedFeature CONDENSED_DIAMOND_ORE_PLACED = registerPlacedFeature("condensed_diamond_ore_placed",
            ModConfiguredFeature.CONDENSED_DIAMOND_ORE_SMALL.withPlacement(ModOreFeatures.modifiersWithCount(4,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80)))));
    public static final PlacedFeature CONDENSED_DIAMOND_ORE_LARGE_PLACED = registerPlacedFeature("condensed_diamond_ore_large_placed",
            ModConfiguredFeature.CONDENSED_DIAMOND_ORE_LARGE.withPlacement(ModOreFeatures.modifiersWithCount(5,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80)))));
    public static final PlacedFeature CONDENSED_DIAMOND_ORE_BURIED_PLACED = registerPlacedFeature("condensed_diamond_ore_buried_placed",
            ModConfiguredFeature.CONDENSED_DIAMOND_ORE_BURIED.withPlacement(ModOreFeatures.modifiersWithCount(2,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80)))));
    public static final PlacedFeature CONDENSED_EMERALD_ORE_PLACED = registerPlacedFeature("condensed_emerald_ore_placed",
            ModConfiguredFeature.CONDENSED_EMERALD_ORE.withPlacement(ModOreFeatures.modifiersWithCount(50,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-16), YOffset.fixed(480)))));
    public static final PlacedFeature CONDENSED_GOLD_ORE_EXTRA_PLACED = registerPlacedFeature("condensed_gold_ore_extra_placed",
            ModConfiguredFeature.CONDENSED_GOLD_ORE.withPlacement(ModOreFeatures.modifiersWithCount(25,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(32), YOffset.fixed(256)))));
    public static final PlacedFeature CONDENSED_GOLD_ORE_PLACED = registerPlacedFeature("condensed_gold_ore_placed",
            ModConfiguredFeature.CONDENSED_GOLD_ORE_BURIED.withPlacement(ModOreFeatures.modifiersWithCount(2,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(32)))));
    public static final PlacedFeature CONDENSED_GOLD_ORE_LOWER_PLACED = registerPlacedFeature("condensed_gold_ore_lower_placed",
            ModConfiguredFeature.CONDENSED_GOLD_ORE_BURIED.withPlacement(modifiers(CountPlacementModifier.of(UniformIntProvider.create(0, 1)), HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(-48)))));
    public static final PlacedFeature CONDENSED_IRON_ORE_UPPER_PLACED = registerPlacedFeature("condensed_iron_ore_upper",
            ModConfiguredFeature.CONDENSED_IRON_ORE.withPlacement(ModOreFeatures.modifiersWithCount(45,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(80), YOffset.fixed(384)))));
    public static final PlacedFeature CONDENSED_IRON_ORE_MIDDLE_PLACED = registerPlacedFeature("condensed_iron_ore_middle_placed",
            ModConfiguredFeature.CONDENSED_IRON_ORE.withPlacement(ModOreFeatures.modifiersWithCount(5,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-24), YOffset.fixed(56)))));
    public static final PlacedFeature CONDENSED_IRON_ORE_LOWER_PLACED = registerPlacedFeature("condensed_iron_ore_lower_placed",
            ModConfiguredFeature.CONDENSED_IRON_ORE_SMALL.withPlacement(ModOreFeatures.modifiersWithCount(5,
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(72)))));
    public static final PlacedFeature CONDENSED_LAPIS_ORE_PLACED = registerPlacedFeature("condensed_lapis_ore_placed",
            ModConfiguredFeature.CONDENSED_LAPIS_ORE.withPlacement(ModOreFeatures.modifiersWithCount(1,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-32), YOffset.fixed(32)))));
    public static final PlacedFeature CONDENSED_LAPIS_ORE_BURIED_PLACED = registerPlacedFeature("condensed_lapis_ore_buried_placed",
            ModConfiguredFeature.CONDENSED_LAPIS_ORE_BURIED.withPlacement(ModOreFeatures.modifiersWithCount(2,
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64)))));
    public static final PlacedFeature CONDENSED_REDSTONE_ORE_PLACED = registerPlacedFeature("condensed_redstone_ore_placed",
            ModConfiguredFeature.CONDENSED_REDSTONE_ORE.withPlacement(ModOreFeatures.modifiersWithCount(2,
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(15)))));
    public static final PlacedFeature CONDENSED_REDSTONE_ORE_LOWER_PLACED = registerPlacedFeature("condensed_redstone_lower_ore",
            ModConfiguredFeature.CONDENSED_REDSTONE_ORE.withPlacement(ModOreFeatures.modifiersWithCount(4,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-32), YOffset.aboveBottom(32)))));

    private static PlacedFeature registerPlacedFeature(String name, PlacedFeature placedFeature) {
        return Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(CondensedOres.MOD_ID, name), placedFeature);
    }

    private static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(CondensedOres.MOD_ID, name));
    }
}
