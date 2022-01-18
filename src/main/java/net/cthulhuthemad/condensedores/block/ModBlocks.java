package net.cthulhuthemad.condensedores.block;

import net.cthulhuthemad.condensedores.CondensedOres;
import net.cthulhuthemad.condensedores.block.custom.CondensedRedstoneOreBlock;
import net.cthulhuthemad.condensedores.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.function.ToIntFunction;

public class ModBlocks {

    public static final Block CONDENSED_COAL_ORE = registerBlock("condensed_coal_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).requiresTool()), ModItemGroup.CONDENSED_ORES);
    public static final Block DEEPSLATE_CONDENSED_COAL_ORE = registerBlock("deepslate_condensed_coal_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f, 3f).requiresTool().mapColor(MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.DEEPSLATE)), ModItemGroup.CONDENSED_ORES);
    public static final Block CONDENSED_COPPER_ORE = registerBlock("condensed_copper_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).requiresTool()), ModItemGroup.CONDENSED_ORES);
    public static final Block DEEPSLATE_CONDENSED_COPPER_ORE = registerBlock("deepslate_condensed_copper_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f, 3f).requiresTool().mapColor(MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.DEEPSLATE)), ModItemGroup.CONDENSED_ORES);
    public static final Block CONDENSED_DIAMOND_ORE = registerBlock("condensed_diamond_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).requiresTool()), ModItemGroup.CONDENSED_ORES);
    public static final Block DEEPSLATE_CONDENSED_DIAMOND_ORE = registerBlock("deepslate_condensed_diamond_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f, 3f).requiresTool().mapColor(MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.DEEPSLATE)), ModItemGroup.CONDENSED_ORES);
    public static final Block CONDENSED_EMERALD_ORE = registerBlock("condensed_emerald_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).requiresTool()), ModItemGroup.CONDENSED_ORES);
    public static final Block DEEPSLATE_CONDENSED_EMERALD_ORE = registerBlock("deepslate_condensed_emerald_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f, 3f).requiresTool().mapColor(MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.DEEPSLATE)), ModItemGroup.CONDENSED_ORES);
    public static final Block CONDENSED_GOLD_ORE = registerBlock("condensed_gold_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).requiresTool()), ModItemGroup.CONDENSED_ORES);
    public static final Block DEEPSLATE_CONDENSED_GOLD_ORE = registerBlock("deepslate_condensed_gold_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f, 3f).requiresTool().mapColor(MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.DEEPSLATE)), ModItemGroup.CONDENSED_ORES);
    public static final Block CONDENSED_IRON_ORE = registerBlock("condensed_iron_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).requiresTool()), ModItemGroup.CONDENSED_ORES);
    public static final Block DEEPSLATE_CONDENSED_IRON_ORE = registerBlock("deepslate_condensed_iron_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f, 3f).requiresTool().mapColor(MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.DEEPSLATE)), ModItemGroup.CONDENSED_ORES);
    public static final Block CONDENSED_LAPIS_ORE = registerBlock("condensed_lapis_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).requiresTool()), ModItemGroup.CONDENSED_ORES);
    public static final Block DEEPSLATE_CONDENSED_LAPIS_ORE = registerBlock("deepslate_condensed_lapis_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f, 3f).requiresTool().mapColor(MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.DEEPSLATE)), ModItemGroup.CONDENSED_ORES);
    public static final Block CONDENSED_REDSTONE_ORE = registerBlock("condensed_redstone_ore",
            new CondensedRedstoneOreBlock(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).requiresTool().ticksRandomly().luminance(createLightLevelFromLitBlockState(9))), ModItemGroup.CONDENSED_ORES);
    public static final Block DEEPSLATE_CONDENSED_REDSTONE_ORE = registerBlock("deepslate_condensed_redstone_ore",
            new CondensedRedstoneOreBlock(FabricBlockSettings.of(Material.STONE).strength(4.5f, 3f).requiresTool().ticksRandomly().luminance(createLightLevelFromLitBlockState(9)).mapColor(MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.DEEPSLATE)), ModItemGroup.CONDENSED_ORES);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(CondensedOres.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(CondensedOres.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static ToIntFunction<BlockState> createLightLevelFromLitBlockState(int litLevel) {
        return (state) -> {
            return (Boolean)state.get(Properties.LIT) ? litLevel : 0;
        };
    }

    public static void registerBlocks() {
        System.out.println("Registering Blocks for " + CondensedOres.MOD_ID);
    }

}
