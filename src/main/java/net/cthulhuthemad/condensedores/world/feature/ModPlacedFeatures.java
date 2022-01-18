package net.cthulhuthemad.condensedores.world.feature;


import net.cthulhuthemad.condensedores.CondensedOres;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.feature.PlacedFeature;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> CONDENSED_COAL_ORE_UPPER_PLACED_KEY = registerKey("condensed_coal_ore_upper_placed");
    public static final RegistryKey<PlacedFeature> CONDENSED_COAL_ORE_BURIED_PLACED_KEY = registerKey("condensed_coal_ore_buried_placed");

    public static final PlacedFeature CONDENSED_COAL_ORE_UPPER_PLACED = registerPlacedFeature("condensed_coal_ore_upper_placed",
            ModConfiguredFeature.CONDENSED_COAL_ORE.withPlacement(ModOreFeatures.modifiersWithCount(25,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(136), YOffset.getTop()))));
    public static final PlacedFeature CONDENSED_COAL_ORE_BURIED_PLACED = registerPlacedFeature("condensed_coal_ore_BURIED_placed",
            ModConfiguredFeature.CONDENSED_COAL_ORE_BURIED.withPlacement(ModOreFeatures.modifiersWithCount(15,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(192)))));

    private static PlacedFeature registerPlacedFeature(String name, PlacedFeature placedFeature) {
        return Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(CondensedOres.MOD_ID, name), placedFeature);
    }

    private static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(CondensedOres.MOD_ID, name));
    }
}
