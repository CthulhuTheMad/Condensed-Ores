package net.cthulhuthemad.condensedores.item;

import net.cthulhuthemad.condensedores.CondensedOres;
import net.cthulhuthemad.condensedores.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup CONDENSED_ORES = FabricItemGroupBuilder.build(new Identifier(CondensedOres.MOD_ID, "condensed_ores"),
            () -> new ItemStack(ModBlocks.CONDENSED_COAL_ORE));
}
