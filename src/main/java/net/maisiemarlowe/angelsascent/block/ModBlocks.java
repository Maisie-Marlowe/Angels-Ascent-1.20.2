package net.maisiemarlowe.angelsascent.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.maisiemarlowe.angelsascent.AngelsAscent;
import net.maisiemarlowe.angelsascent.block.custom.CompressorBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block SOUL_ORE = registerBlock("soul_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(4f), UniformIntProvider.create(2, 5)));

    public static final Block HOLY_ORE = registerBlock("holy_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(5f), UniformIntProvider.create(3, 7)));

    public static final Block BLASPHEMOUS_ORE = registerBlock("blasphemous_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(6f), UniformIntProvider.create(5, 10)));

    public static final Block COMPRESSOR_BLOCK = Registry.register(Registries.BLOCK, new Identifier(AngelsAscent.MOD_ID, "compressor_block"),
            new CompressorBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).nonOpaque()));

    public static final Block WHITE_COBBLESTONE = registerBlock("white_cobblestone",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

    public static final Block LIGHT_GREY_COBBLESTONE = registerBlock("light_gray_cobblestone",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

    public static final Block GREY_COBBLESTONE = registerBlock("gray_cobblestone",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

    public static final Block BLACK_COBBLESTONE = registerBlock("black_cobblestone",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

    public static final Block BROWN_COBBLESTONE = registerBlock("brown_cobblestone",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

    public static final Block RED_COBBLESTONE = registerBlock("red_cobblestone",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

    public static final Block ORANGE_COBBLESTONE = registerBlock("orange_cobblestone",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

    public static final Block YELLOW_COBBLESTONE = registerBlock("yellow_cobblestone",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

    public static final Block LIME_COBBLESTONE = registerBlock("lime_cobblestone",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

    public static final Block GREEN_COBBLESTONE = registerBlock("green_cobblestone",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

    public static final Block CYAN_COBBLESTONE = registerBlock("cyan_cobblestone",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

    public static final Block LIGHT_BLUE_COBBLESTONE = registerBlock("light_blue_cobblestone",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

    public static final Block BLUE_COBBLESTONE = registerBlock("blue_cobblestone",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

    public static final Block PURPLE_COBBLESTONE = registerBlock("purple_cobblestone",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

    public static final Block MAGENTA_COBBLESTONE = registerBlock("magenta_cobblestone",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

    public static final Block PINK_COBBLESTONE = registerBlock("pink_cobblestone",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));


    public static final Block WHITE_STONE_BRICKS = registerBlock("white_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static final Block LIGHT_GREY_STONE_BRICKS = registerBlock("light_gray_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static final Block GREY_STONE_BRICKS = registerBlock("gray_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static final Block BLACK_STONE_BRICKS = registerBlock("black_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static final Block BROWN_STONE_BRICKS = registerBlock("brown_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static final Block RED_STONE_BRICKS = registerBlock("red_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static final Block ORANGE_STONE_BRICKS = registerBlock("orange_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static final Block YELLOW_STONE_BRICKS = registerBlock("yellow_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static final Block LIME_STONE_BRICKS = registerBlock("lime_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static final Block GREEN_STONE_BRICKS = registerBlock("green_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static final Block CYAN_STONE_BRICKS = registerBlock("cyan_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static final Block LIGHT_BLUE_STONE_BRICKS = registerBlock("light_blue_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static final Block BLUE_STONE_BRICKS = registerBlock("blue_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static final Block PURPLE_STONE_BRICKS = registerBlock("purple_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static final Block MAGENTA_STONE_BRICKS = registerBlock("magenta_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static final Block PINK_STONE_BRICKS = registerBlock("pink_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));


    public static final Block WHITE_STONE = registerBlock("white_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block LIGHT_GREY_STONE = registerBlock("light_gray_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block GREY_STONE = registerBlock("gray_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block BLACK_STONE = registerBlock("black_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block BROWN_STONE = registerBlock("brown_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block RED_STONE = registerBlock("red_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block ORANGE_STONE = registerBlock("orange_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block YELLOW_STONE = registerBlock("yellow_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block LIME_STONE = registerBlock("lime_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block GREEN_STONE = registerBlock("green_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block CYAN_STONE = registerBlock("cyan_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block LIGHT_BLUE_STONE = registerBlock("light_blue_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block BLUE_STONE = registerBlock("blue_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block PURPLE_STONE = registerBlock("purple_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block MAGENTA_STONE = registerBlock("magenta_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block PINK_STONE = registerBlock("pink_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));


    public static final Block WHITE_SMOOTH_STONE = registerBlock("white_smooth_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));

    public static final Block LIGHT_GREY_SMOOTH_STONE = registerBlock("light_gray_smooth_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));

    public static final Block GREY_SMOOTH_STONE = registerBlock("gray_smooth_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));

    public static final Block BLACK_SMOOTH_STONE = registerBlock("black_smooth_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));

    public static final Block BROWN_SMOOTH_STONE = registerBlock("brown_smooth_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));

    public static final Block RED_SMOOTH_STONE = registerBlock("red_smooth_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));

    public static final Block ORANGE_SMOOTH_STONE = registerBlock("orange_smooth_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));

    public static final Block YELLOW_SMOOTH_STONE = registerBlock("yellow_smooth_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));

    public static final Block LIME_SMOOTH_STONE = registerBlock("lime_smooth_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));

    public static final Block GREEN_SMOOTH_STONE = registerBlock("green_smooth_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));

    public static final Block CYAN_SMOOTH_STONE = registerBlock("cyan_smooth_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));

    public static final Block LIGHT_BLUE_SMOOTH_STONE = registerBlock("light_blue_smooth_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));

    public static final Block BLUE_SMOOTH_STONE = registerBlock("blue_smooth_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));

    public static final Block PURPLE_SMOOTH_STONE = registerBlock("purple_smooth_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));

    public static final Block MAGENTA_SMOOTH_STONE = registerBlock("magenta_smooth_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));

    public static final Block PINK_SMOOTH_STONE = registerBlock("pink_smooth_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));


    public static final Block WHITE_CRACKED_STONE_BRICKS = registerBlock("white_cracked_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS)));

    public static final Block LIGHT_GREY_CRACKED_STONE_BRICKS = registerBlock("light_gray_cracked_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS)));

    public static final Block GREY_CRACKED_STONE_BRICKS = registerBlock("gray_cracked_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS)));

    public static final Block BLACK_CRACKED_STONE_BRICKS = registerBlock("black_cracked_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS)));

    public static final Block BROWN_CRACKED_STONE_BRICKS = registerBlock("brown_cracked_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS)));

    public static final Block RED_CRACKED_STONE_BRICKS = registerBlock("red_cracked_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS)));

    public static final Block ORANGE_CRACKED_STONE_BRICKS = registerBlock("orange_cracked_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS)));

    public static final Block YELLOW_CRACKED_STONE_BRICKS = registerBlock("yellow_cracked_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS)));

    public static final Block LIME_CRACKED_STONE_BRICKS = registerBlock("lime_cracked_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS)));

    public static final Block GREEN_CRACKED_STONE_BRICKS = registerBlock("green_cracked_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS)));

    public static final Block CYAN_CRACKED_STONE_BRICKS = registerBlock("cyan_cracked_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS)));

    public static final Block LIGHT_BLUE_CRACKED_STONE_BRICKS = registerBlock("light_blue_cracked_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS)));

    public static final Block BLUE_CRACKED_STONE_BRICKS = registerBlock("blue_cracked_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS)));

    public static final Block PURPLE_CRACKED_STONE_BRICKS = registerBlock("purple_cracked_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS)));

    public static final Block MAGENTA_CRACKED_STONE_BRICKS = registerBlock("magenta_cracked_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS)));

    public static final Block PINK_CRACKED_STONE_BRICKS = registerBlock("pink_cracked_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS)));


    public static final Block WHITE_CHISELED_STONE_BRICKS= registerBlock("white_chiseled_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS)));

    public static final Block LIGHT_GREY_CHISELED_STONE_BRICKS = registerBlock("light_gray_chiseled_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS)));

    public static final Block GREY_CHISELED_STONE_BRICKS = registerBlock("gray_chiseled_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS)));

    public static final Block BLACK_CHISELED_STONE_BRICKS = registerBlock("black_chiseled_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS)));

    public static final Block BROWN_CHISELED_STONE_BRICKS = registerBlock("brown_chiseled_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS)));

    public static final Block RED_CHISELED_STONE_BRICKS = registerBlock("red_chiseled_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS)));

    public static final Block ORANGE_CHISELED_STONE_BRICKS = registerBlock("orange_chiseled_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS)));

    public static final Block YELLOW_CHISELED_STONE_BRICKS = registerBlock("yellow_chiseled_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS)));

    public static final Block LIME_CHISELED_STONE_BRICKS = registerBlock("lime_chiseled_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS)));

    public static final Block GREEN_CHISELED_STONE_BRICKS = registerBlock("green_chiseled_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS)));

    public static final Block CYAN_CHISELED_STONE_BRICKS = registerBlock("cyan_chiseled_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS)));

    public static final Block LIGHT_BLUE_CHISELED_STONE_BRICKS = registerBlock("light_blue_chiseled_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS)));

    public static final Block BLUE_CHISELED_STONE_BRICKS = registerBlock("blue_chiseled_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS)));

    public static final Block PURPLE_CHISELED_STONE_BRICKS = registerBlock("purple_chiseled_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS)));

    public static final Block MAGENTA_CHISELED_STONE_BRICKS = registerBlock("magenta_chiseled_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS)));

    public static final Block PINK_CHISELED_STONE_BRICKS = registerBlock("pink_chiseled_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS)));


    public static final Block WHITE_MOSSY_STONE_BRICKS = registerBlock("white_mossy_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICKS)));

    public static final Block LIGHT_GREY_MOSSY_STONE_BRICKS = registerBlock("light_gray_mossy_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICKS)));

    public static final Block GREY_MOSSY_STONE_BRICKS = registerBlock("gray_mossy_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICKS)));

    public static final Block BLACK_MOSSY_STONE_BRICKS = registerBlock("black_mossy_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICKS)));

    public static final Block BROWN_MOSSY_STONE_BRICKS = registerBlock("brown_mossy_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICKS)));

    public static final Block RED_MOSSY_STONE_BRICKS = registerBlock("red_mossy_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICKS)));

    public static final Block ORANGE_MOSSY_STONE_BRICKS = registerBlock("orange_mossy_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICKS)));

    public static final Block YELLOW_MOSSY_STONE_BRICKS = registerBlock("yellow_mossy_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICKS)));

    public static final Block LIME_MOSSY_STONE_BRICKS = registerBlock("lime_mossy_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICKS)));

    public static final Block GREEN_MOSSY_STONE_BRICKS = registerBlock("green_mossy_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICKS)));

    public static final Block CYAN_MOSSY_STONE_BRICKS = registerBlock("cyan_mossy_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICKS)));

    public static final Block LIGHT_BLUE_MOSSY_STONE_BRICKS= registerBlock("light_blue_mossy_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICKS)));

    public static final Block BLUE_MOSSY_STONE_BRICKS = registerBlock("blue_mossy_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICKS)));

    public static final Block PURPLE_MOSSY_STONE_BRICKS = registerBlock("purple_mossy_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICKS)));

    public static final Block MAGENTA_MOSSY_STONE_BRICKS = registerBlock("magenta_mossy_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICKS)));

    public static final Block PINK_MOSSY_STONE_BRICKS = registerBlock("pink_mossy_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICKS)));



    public static final Block WHITE_STONE_STAIRS = registerBlock("white_stone_stairs",
            new StairsBlock(ModBlocks.WHITE_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));

    public static final Block LIGHT_GREY_STONE_STAIRS = registerBlock("light_gray_stone_stairs",
            new StairsBlock(ModBlocks.LIGHT_GREY_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));

    public static final Block GREY_STONE_STAIRS = registerBlock("gray_stone_stairs",
            new StairsBlock(ModBlocks.GREY_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));

    public static final Block BLACK_STONE_STAIRS = registerBlock("black_stone_stairs",
            new StairsBlock(ModBlocks.BLACK_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));

    public static final Block BROWN_STONE_STAIRS = registerBlock("brown_stone_stairs",
            new StairsBlock(ModBlocks.BROWN_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));

    public static final Block RED_STONE_STAIRS = registerBlock("red_stone_stairs",
            new StairsBlock(ModBlocks.RED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));

    public static final Block ORANGE_STONE_STAIRS = registerBlock("orange_stone_stairs",
            new StairsBlock(ModBlocks.ORANGE_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));

    public static final Block YELLOW_STONE_STAIRS = registerBlock("yellow_stone_stairs",
            new StairsBlock(ModBlocks.YELLOW_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));

    public static final Block LIME_STONE_STAIRS = registerBlock("lime_stone_stairs",
            new StairsBlock(ModBlocks.LIME_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));

    public static final Block GREEN_STONE_STAIRS = registerBlock("green_stone_stairs",
            new StairsBlock(ModBlocks.GREEN_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));

    public static final Block CYAN_STONE_STAIRS = registerBlock("cyan_stone_stairs",
            new StairsBlock(ModBlocks.CYAN_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));

    public static final Block LIGHT_BLUE_STONE_STAIRS = registerBlock("light_blue_stone_stairs",
            new StairsBlock(ModBlocks.LIGHT_BLUE_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));

    public static final Block BLUE_STONE_STAIRS = registerBlock("blue_stone_stairs",
            new StairsBlock(ModBlocks.BLUE_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));

    public static final Block PURPLE_STONE_STAIRS = registerBlock("purple_stone_stairs",
            new StairsBlock(ModBlocks.PURPLE_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));

    public static final Block MAGENTA_STONE_STAIRS = registerBlock("magenta_stone_stairs",
            new StairsBlock(ModBlocks.MAGENTA_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));

    public static final Block PINK_STONE_STAIRS = registerBlock("pink_stone_stairs",
            new StairsBlock(ModBlocks.PINK_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));


    public static final Block WHITE_COBBLESTONE_STAIRS = registerBlock("white_cobblestone_stairs",
            new StairsBlock(ModBlocks.WHITE_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));

    public static final Block LIGHT_GREY_COBBLESTONE_STAIRS = registerBlock("light_gray_cobblestone_stairs",
            new StairsBlock(ModBlocks.LIGHT_GREY_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));

    public static final Block GREY_COBBLESTONE_STAIRS = registerBlock("gray_cobblestone_stairs",
            new StairsBlock(ModBlocks.GREY_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));

    public static final Block BLACK_COBBLESTONE_STAIRS = registerBlock("black_cobblestone_stairs",
            new StairsBlock(ModBlocks.BLACK_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));

    public static final Block BROWN_COBBLESTONE_STAIRS = registerBlock("brown_cobblestone_stairs",
            new StairsBlock(ModBlocks.BROWN_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));

    public static final Block RED_COBBLESTONE_STAIRS = registerBlock("red_cobblestone_stairs",
            new StairsBlock(ModBlocks.RED_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));

    public static final Block ORANGE_COBBLESTONE_STAIRS = registerBlock("orange_cobblestone_stairs",
            new StairsBlock(ModBlocks.ORANGE_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));

    public static final Block YELLOW_COBBLESTONE_STAIRS = registerBlock("yellow_cobblestone_stairs",
            new StairsBlock(ModBlocks.YELLOW_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));

    public static final Block LIME_COBBLESTONE_STAIRS = registerBlock("lime_cobblestone_stairs",
            new StairsBlock(ModBlocks.LIME_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));

    public static final Block GREEN_COBBLESTONE_STAIRS = registerBlock("green_cobblestone_stairs",
            new StairsBlock(ModBlocks.GREEN_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));

    public static final Block CYAN_COBBLESTONE_STAIRS = registerBlock("cyan_cobblestone_stairs",
            new StairsBlock(ModBlocks.CYAN_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));

    public static final Block LIGHT_BLUE_COBBLESTONE_STAIRS = registerBlock("light_blue_cobblestone_stairs",
            new StairsBlock(ModBlocks.LIGHT_BLUE_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));

    public static final Block BLUE_COBBLESTONE_STAIRS = registerBlock("blue_cobblestone_stairs",
            new StairsBlock(ModBlocks.BLUE_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));

    public static final Block PURPLE_COBBLESTONE_STAIRS = registerBlock("purple_cobblestone_stairs",
            new StairsBlock(ModBlocks.PURPLE_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));

    public static final Block MAGENTA_COBBLESTONE_STAIRS = registerBlock("magenta_cobblestone_stairs",
            new StairsBlock(ModBlocks.MAGENTA_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));

    public static final Block PINK_COBBLESTONE_STAIRS = registerBlock("pink_cobblestone_stairs",
            new StairsBlock(ModBlocks.PINK_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));


    public static final Block WHITE_STONE_BRICK_STAIRS = registerBlock("white_stone_brick_stairs",
            new StairsBlock(ModBlocks.WHITE_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));

    public static final Block LIGHT_GREY_STONE_BRICK_STAIRS = registerBlock("light_gray_stone_brick_stairs",
            new StairsBlock(ModBlocks.LIGHT_GREY_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));

    public static final Block GREY_STONE_BRICK_STAIRS = registerBlock("gray_stone_brick_stairs",
            new StairsBlock(ModBlocks.GREY_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));

    public static final Block BLACK_STONE_BRICK_STAIRS = registerBlock("black_stone_brick_stairs",
            new StairsBlock(ModBlocks.BLACK_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));

    public static final Block BROWN_STONE_BRICK_STAIRS = registerBlock("brown_stone_brick_stairs",
            new StairsBlock(ModBlocks.BROWN_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));

    public static final Block RED_STONE_BRICK_STAIRS = registerBlock("red_stone_brick_stairs",
            new StairsBlock(ModBlocks.RED_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));

    public static final Block ORANGE_STONE_BRICK_STAIRS = registerBlock("orange_stone_brick_stairs",
            new StairsBlock(ModBlocks.ORANGE_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));

    public static final Block YELLOW_STONE_BRICK_STAIRS = registerBlock("yellow_stone_brick_stairs",
            new StairsBlock(ModBlocks.YELLOW_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));

    public static final Block LIME_STONE_BRICK_STAIRS = registerBlock("lime_stone_brick_stairs",
            new StairsBlock(ModBlocks.LIME_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));

    public static final Block GREEN_STONE_BRICK_STAIRS = registerBlock("green_stone_brick_stairs",
            new StairsBlock(ModBlocks.GREEN_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));

    public static final Block CYAN_STONE_BRICK_STAIRS = registerBlock("cyan_stone_brick_stairs",
            new StairsBlock(ModBlocks.CYAN_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));

    public static final Block LIGHT_BLUE_STONE_BRICK_STAIRS = registerBlock("light_blue_stone_brick_stairs",
            new StairsBlock(ModBlocks.LIGHT_BLUE_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));

    public static final Block BLUE_STONE_BRICK_STAIRS = registerBlock("blue_stone_brick_stairs",
            new StairsBlock(ModBlocks.BLUE_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));

    public static final Block PURPLE_STONE_BRICK_STAIRS = registerBlock("purple_stone_brick_stairs",
            new StairsBlock(ModBlocks.PURPLE_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));

    public static final Block MAGENTA_STONE_BRICK_STAIRS = registerBlock("magenta_stone_brick_stairs",
            new StairsBlock(ModBlocks.MAGENTA_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));

    public static final Block PINK_STONE_BRICK_STAIRS = registerBlock("pink_stone_brick_stairs",
            new StairsBlock(ModBlocks.PINK_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));


    public static final Block WHITE_MOSSY_STONE_BRICK_STAIRS = registerBlock("white_mossy_stone_brick_stairs",
            new StairsBlock(ModBlocks.WHITE_MOSSY_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_STAIRS)));

    public static final Block LIGHT_GREY_MOSSY_STONE_BRICK_STAIRS = registerBlock("light_gray_mossy_stone_brick_stairs",
            new StairsBlock(ModBlocks.LIGHT_GREY_MOSSY_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_STAIRS)));

    public static final Block GREY_MOSSY_STONE_BRICK_STAIRS = registerBlock("gray_mossy_stone_brick_stairs",
            new StairsBlock(ModBlocks.GREY_MOSSY_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_STAIRS)));

    public static final Block BLACK_MOSSY_STONE_BRICK_STAIRS = registerBlock("black_mossy_stone_brick_stairs",
            new StairsBlock(ModBlocks.BLACK_MOSSY_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_STAIRS)));

    public static final Block BROWN_MOSSY_STONE_BRICK_STAIRS = registerBlock("brown_mossy_stone_brick_stairs",
            new StairsBlock(ModBlocks.BROWN_MOSSY_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_STAIRS)));

    public static final Block RED_MOSSY_STONE_BRICK_STAIRS = registerBlock("red_mossy_stone_brick_stairs",
            new StairsBlock(ModBlocks.RED_MOSSY_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_STAIRS)));

    public static final Block ORANGE_MOSSY_STONE_BRICK_STAIRS = registerBlock("orange_mossy_stone_brick_stairs",
            new StairsBlock(ModBlocks.ORANGE_MOSSY_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_STAIRS)));

    public static final Block YELLOW_MOSSY_STONE_BRICK_STAIRS = registerBlock("yellow_mossy_stone_brick_stairs",
            new StairsBlock(ModBlocks.YELLOW_MOSSY_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_STAIRS)));

    public static final Block LIME_MOSSY_STONE_BRICK_STAIRS = registerBlock("lime_mossy_stone_brick_stairs",
            new StairsBlock(ModBlocks.LIME_MOSSY_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_STAIRS)));

    public static final Block GREEN_MOSSY_STONE_BRICK_STAIRS = registerBlock("green_mossy_stone_brick_stairs",
            new StairsBlock(ModBlocks.GREEN_MOSSY_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_STAIRS)));

    public static final Block CYAN_MOSSY_STONE_BRICK_STAIRS = registerBlock("cyan_mossy_stone_brick_stairs",
            new StairsBlock(ModBlocks.CYAN_MOSSY_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_STAIRS)));

    public static final Block LIGHT_BLUE_MOSSY_STONE_BRICK_STAIRS = registerBlock("light_blue_mossy_stone_brick_stairs",
            new StairsBlock(ModBlocks.LIGHT_BLUE_MOSSY_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_STAIRS)));

    public static final Block BLUE_MOSSY_STONE_BRICK_STAIRS = registerBlock("blue_mossy_stone_brick_stairs",
            new StairsBlock(ModBlocks.BLUE_MOSSY_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_STAIRS)));

    public static final Block PURPLE_MOSSY_STONE_BRICK_STAIRS = registerBlock("purple_mossy_stone_brick_stairs",
            new StairsBlock(ModBlocks.PURPLE_MOSSY_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_STAIRS)));

    public static final Block MAGENTA_MOSSY_STONE_BRICK_STAIRS = registerBlock("magenta_mossy_stone_brick_stairs",
            new StairsBlock(ModBlocks.MAGENTA_MOSSY_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_STAIRS)));

    public static final Block PINK_MOSSY_STONE_BRICK_STAIRS = registerBlock("pink_mossy_stone_brick_stairs",
            new StairsBlock(ModBlocks.PINK_MOSSY_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_STAIRS)));



    public static final Block WHITE_STONE_SLAB = registerBlock("white_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));

    public static final Block LIGHT_GREY_STONE_SLAB = registerBlock("light_gray_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));

    public static final Block GREY_STONE_SLAB = registerBlock("gray_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));

    public static final Block BLACK_STONE_SLAB = registerBlock("black_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));

    public static final Block BROWN_STONE_SLAB = registerBlock("brown_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));

    public static final Block RED_STONE_SLAB = registerBlock("red_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));

    public static final Block ORANGE_STONE_SLAB = registerBlock("orange_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));

    public static final Block YELLOW_STONE_SLAB = registerBlock("yellow_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));

    public static final Block LIME_STONE_SLAB = registerBlock("lime_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));

    public static final Block GREEN_STONE_SLAB = registerBlock("green_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));

    public static final Block CYAN_STONE_SLAB = registerBlock("cyan_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));

    public static final Block LIGHT_BLUE_STONE_SLAB = registerBlock("light_blue_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));

    public static final Block BLUE_STONE_SLAB = registerBlock("blue_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));

    public static final Block PURPLE_STONE_SLAB = registerBlock("purple_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));

    public static final Block MAGENTA_STONE_SLAB = registerBlock("magenta_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));

    public static final Block PINK_STONE_SLAB = registerBlock("pink_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));


    public static final Block WHITE_COBBLESTONE_SLAB = registerBlock("white_cobblestone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));

    public static final Block LIGHT_GREY_COBBLESTONE_SLAB = registerBlock("light_gray_cobblestone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));

    public static final Block GREY_COBBLESTONE_SLAB = registerBlock("gray_cobblestone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));

    public static final Block BLACK_COBBLESTONE_SLAB = registerBlock("black_cobblestone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));

    public static final Block BROWN_COBBLESTONE_SLAB = registerBlock("brown_cobblestone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));

    public static final Block RED_COBBLESTONE_SLAB = registerBlock("red_cobblestone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));

    public static final Block ORANGE_COBBLESTONE_SLAB = registerBlock("orange_cobblestone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));

    public static final Block YELLOW_COBBLESTONE_SLAB = registerBlock("yellow_cobblestone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));

    public static final Block LIME_COBBLESTONE_SLAB = registerBlock("lime_cobblestone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));

    public static final Block GREEN_COBBLESTONE_SLAB = registerBlock("green_cobblestone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));

    public static final Block CYAN_COBBLESTONE_SLAB = registerBlock("cyan_cobblestone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));

    public static final Block LIGHT_BLUE_COBBLESTONE_SLAB = registerBlock("light_blue_cobblestone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));

    public static final Block BLUE_COBBLESTONE_SLAB = registerBlock("blue_cobblestone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));

    public static final Block PURPLE_COBBLESTONE_SLAB = registerBlock("purple_cobblestone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));

    public static final Block MAGENTA_COBBLESTONE_SLAB = registerBlock("magenta_cobblestone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));

    public static final Block PINK_COBBLESTONE_SLAB = registerBlock("pink_cobblestone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));


    public static final Block WHITE_STONE_BRICK_SLAB = registerBlock("white_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));

    public static final Block LIGHT_GREY_STONE_BRICK_SLAB = registerBlock("light_gray_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));

    public static final Block GREY_STONE_BRICK_SLAB = registerBlock("gray_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));

    public static final Block BLACK_STONE_BRICK_SLAB = registerBlock("black_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));

    public static final Block BROWN_STONE_BRICK_SLAB = registerBlock("brown_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));

    public static final Block RED_STONE_BRICK_SLAB = registerBlock("red_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));

    public static final Block ORANGE_STONE_BRICK_SLAB = registerBlock("orange_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));

    public static final Block YELLOW_STONE_BRICK_SLAB = registerBlock("yellow_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));

    public static final Block LIME_STONE_BRICK_SLAB = registerBlock("lime_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));

    public static final Block GREEN_STONE_BRICK_SLAB = registerBlock("green_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));

    public static final Block CYAN_STONE_BRICK_SLAB = registerBlock("cyan_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));

    public static final Block LIGHT_BLUE_STONE_BRICK_SLAB = registerBlock("light_blue_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));

    public static final Block BLUE_STONE_BRICK_SLAB = registerBlock("blue_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));

    public static final Block PURPLE_STONE_BRICK_SLAB = registerBlock("purple_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));

    public static final Block MAGENTA_STONE_BRICK_SLAB = registerBlock("magenta_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));

    public static final Block PINK_STONE_BRICK_SLAB = registerBlock("pink_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));


    public static final Block WHITE_MOSSY_STONE_BRICK_SLAB = registerBlock("white_mossy_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_SLAB)));

    public static final Block LIGHT_GREY_MOSSY_STONE_BRICK_SLAB = registerBlock("light_gray_mossy_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_SLAB)));

    public static final Block GREY_MOSSY_STONE_BRICK_SLAB = registerBlock("gray_mossy_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_SLAB)));

    public static final Block BLACK_MOSSY_STONE_BRICK_SLAB = registerBlock("black_mossy_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_SLAB)));

    public static final Block BROWN_MOSSY_STONE_BRICK_SLAB = registerBlock("brown_mossy_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_SLAB)));

    public static final Block RED_MOSSY_STONE_BRICK_SLAB = registerBlock("red_mossy_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_SLAB)));

    public static final Block ORANGE_MOSSY_STONE_BRICK_SLAB = registerBlock("orange_mossy_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_SLAB)));

    public static final Block YELLOW_MOSSY_STONE_BRICK_SLAB = registerBlock("yellow_mossy_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_SLAB)));

    public static final Block LIME_MOSSY_STONE_BRICK_SLAB = registerBlock("lime_mossy_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_SLAB)));

    public static final Block GREEN_MOSSY_STONE_BRICK_SLAB = registerBlock("green_mossy_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_SLAB)));

    public static final Block CYAN_MOSSY_STONE_BRICK_SLAB = registerBlock("cyan_mossy_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_SLAB)));

    public static final Block LIGHT_BLUE_MOSSY_STONE_BRICK_SLAB = registerBlock("light_blue_mossy_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_SLAB)));

    public static final Block BLUE_MOSSY_STONE_BRICK_SLAB = registerBlock("blue_mossy_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_SLAB)));

    public static final Block PURPLE_MOSSY_STONE_BRICK_SLAB = registerBlock("purple_mossy_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_SLAB)));

    public static final Block MAGENTA_MOSSY_STONE_BRICK_SLAB = registerBlock("magenta_mossy_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_SLAB)));

    public static final Block PINK_MOSSY_STONE_BRICK_SLAB = registerBlock("pink_mossy_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_SLAB)));


//    public static final Block WHITE_SMOOTH_STONE_SLAB = registerBlock("white_smooth_stone_slab",
//            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
//
//    public static final Block LIGHT_GREY_SMOOTH_STONE_SLAB = registerBlock("light_gray_smooth_stone_slab",
//            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
//
//    public static final Block GREY_SMOOTH_STONE_SLAB = registerBlock("gray_smooth_stone_slab",
//            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
//
//    public static final Block BLACK_SMOOTH_STONE_SLAB = registerBlock("black_smooth_stone_slab",
//            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
//
//    public static final Block BROWN_SMOOTH_STONE_SLAB = registerBlock("brown_smooth_stone_slab",
//            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
//
//    public static final Block RED_SMOOTH_STONE_SLAB = registerBlock("red_smooth_stone_slab",
//            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
//
//    public static final Block ORANGE_SMOOTH_STONE_SLAB = registerBlock("orange_smooth_stone_slab",
//            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
//
//    public static final Block YELLOW_SMOOTH_STONE_SLAB = registerBlock("yellow_smooth_stone_slab",
//            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
//
//    public static final Block LIME_SMOOTH_STONE_SLAB = registerBlock("lime_smooth_stone_slab",
//            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
//
//    public static final Block GREEN_SMOOTH_STONE_SLAB = registerBlock("green_smooth_stone_slab",
//            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
//
//    public static final Block CYAN_SMOOTH_STONE_SLAB = registerBlock("cyan_smooth_stone_slab",
//            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
//
//    public static final Block LIGHT_BLUE_SMOOTH_STONE_SLAB = registerBlock("light_blue_smooth_stone_slab",
//            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
//
//    public static final Block BLUE_SMOOTH_STONE_SLAB = registerBlock("blue_smooth_stone_slab",
//            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
//
//    public static final Block PURPLE_SMOOTH_STONE_SLAB = registerBlock("purple_smooth_stone_slab",
//            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
//
//    public static final Block MAGENTA_SMOOTH_STONE_SLAB = registerBlock("magenta_smooth_stone_slab",
//            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
//
//    public static final Block PINK_SMOOTH_STONE_SLAB = registerBlock("pink_smooth_stone_slab",
//            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));


    public static final Block WHITE_STONE_BUTTON = registerBlock("white_stone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 20, false));

    public static final Block LIGHT_GREY_STONE_BUTTON = registerBlock("light_gray_stone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 20, false));

    public static final Block GREY_STONE_BUTTON = registerBlock("gray_stone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 20, false));

    public static final Block BLACK_STONE_BUTTON = registerBlock("black_stone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 20, false));

    public static final Block BROWN_STONE_BUTTON = registerBlock("brown_stone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 20, false));

    public static final Block RED_STONE_BUTTON = registerBlock("red_stone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 20, false));

    public static final Block ORANGE_STONE_BUTTON = registerBlock("orange_stone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 20, false));

    public static final Block YELLOW_STONE_BUTTON = registerBlock("yellow_stone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 20, false));

    public static final Block LIME_STONE_BUTTON = registerBlock("lime_stone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 20, false));

    public static final Block GREEN_STONE_BUTTON = registerBlock("green_stone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 20, false));

    public static final Block CYAN_STONE_BUTTON = registerBlock("cyan_stone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 20, false));

    public static final Block LIGHT_BLUE_STONE_BUTTON = registerBlock("light_blue_stone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 20, false));

    public static final Block BLUE_STONE_BUTTON = registerBlock("blue_stone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 20, false));

    public static final Block PURPLE_STONE_BUTTON = registerBlock("purple_stone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 20, false));

    public static final Block MAGENTA_STONE_BUTTON = registerBlock("magenta_stone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 20, false));

    public static final Block PINK_STONE_BUTTON = registerBlock("pink_stone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 20, false));


    public static final Block WHITE_STONE_PRESSURE_PLATE = registerBlock("white_stone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));

    public static final Block LIGHT_GREY_STONE_PRESSURE_PLATE = registerBlock("light_gray_stone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));

    public static final Block GREY_STONE_PRESSURE_PLATE = registerBlock("gray_stone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));

    public static final Block BLACK_STONE_PRESSURE_PLATE = registerBlock("black_stone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));

    public static final Block BROWN_STONE_PRESSURE_PLATE = registerBlock("brown_stone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));

    public static final Block RED_STONE_PRESSURE_PLATE = registerBlock("red_stone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));

    public static final Block ORANGE_STONE_PRESSURE_PLATE = registerBlock("orange_stone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));

    public static final Block YELLOW_STONE_PRESSURE_PLATE = registerBlock("yellow_stone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));

    public static final Block LIME_STONE_PRESSURE_PLATE = registerBlock("lime_stone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));

    public static final Block GREEN_STONE_PRESSURE_PLATE = registerBlock("green_stone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));

    public static final Block CYAN_STONE_PRESSURE_PLATE = registerBlock("cyan_stone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));

    public static final Block LIGHT_BLUE_STONE_PRESSURE_PLATE = registerBlock("light_blue_stone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));

    public static final Block BLUE_STONE_PRESSURE_PLATE = registerBlock("blue_stone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));

    public static final Block PURPLE_STONE_PRESSURE_PLATE = registerBlock("purple_stone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));

    public static final Block MAGENTA_STONE_PRESSURE_PLATE = registerBlock("magenta_stone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));

    public static final Block PINK_STONE_PRESSURE_PLATE = registerBlock("pink_stone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));


    public static final Block WHITE_STONE_BRICK_WALL = registerBlock("white_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));

    public static final Block LIGHT_GREY_STONE_BRICK_WALL = registerBlock("light_gray_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));

    public static final Block GREY_STONE_BRICK_WALL = registerBlock("gray_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));

    public static final Block BLACK_STONE_BRICK_WALL = registerBlock("black_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));

    public static final Block BROWN_STONE_BRICK_WALL = registerBlock("brown_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));

    public static final Block RED_STONE_BRICK_WALL = registerBlock("red_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));

    public static final Block ORANGE_STONE_BRICK_WALL = registerBlock("orange_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));

    public static final Block YELLOW_STONE_BRICK_WALL = registerBlock("yellow_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));

    public static final Block LIME_STONE_BRICK_WALL = registerBlock("lime_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));

    public static final Block GREEN_STONE_BRICK_WALL = registerBlock("green_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));

    public static final Block CYAN_STONE_BRICK_WALL = registerBlock("cyan_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));

    public static final Block LIGHT_BLUE_STONE_BRICK_WALL = registerBlock("light_blue_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));

    public static final Block BLUE_STONE_BRICK_WALL = registerBlock("blue_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));

    public static final Block PURPLE_STONE_BRICK_WALL = registerBlock("purple_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));

    public static final Block MAGENTA_STONE_BRICK_WALL = registerBlock("magenta_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));

    public static final Block PINK_STONE_BRICK_WALL = registerBlock("pink_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));


    public static final Block WHITE_COBBLESTONE_WALL = registerBlock("white_cobblestone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));

    public static final Block LIGHT_GREY_COBBLESTONE_WALL = registerBlock("light_gray_cobblestone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));

    public static final Block GREY_COBBLESTONE_WALL = registerBlock("gray_cobblestone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));

    public static final Block BLACK_COBBLESTONE_WALL = registerBlock("black_cobblestone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));

    public static final Block BROWN_COBBLESTONE_WALL = registerBlock("brown_cobblestone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));

    public static final Block RED_COBBLESTONE_WALL = registerBlock("red_cobblestone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));

    public static final Block ORANGE_COBBLESTONE_WALL = registerBlock("orange_cobblestone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));

    public static final Block YELLOW_COBBLESTONE_WALL = registerBlock("yellow_cobblestone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));

    public static final Block LIME_COBBLESTONE_WALL = registerBlock("lime_cobblestone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));

    public static final Block GREEN_COBBLESTONE_WALL = registerBlock("green_cobblestone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));

    public static final Block CYAN_COBBLESTONE_WALL = registerBlock("cyan_cobblestone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));

    public static final Block LIGHT_BLUE_COBBLESTONE_WALL = registerBlock("light_blue_cobblestone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));

    public static final Block BLUE_COBBLESTONE_WALL = registerBlock("blue_cobblestone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));

    public static final Block PURPLE_COBBLESTONE_WALL = registerBlock("purple_cobblestone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));

    public static final Block MAGENTA_COBBLESTONE_WALL = registerBlock("magenta_cobblestone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));

    public static final Block PINK_COBBLESTONE_WALL = registerBlock("pink_cobblestone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));


    public static final Block WHITE_MOSSY_STONE_BRICK_WALL = registerBlock("white_mossy_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_WALL)));

    public static final Block LIGHT_GREY_MOSSY_STONE_BRICK_WALL = registerBlock("light_gray_mossy_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_WALL)));

    public static final Block GREY_MOSSY_STONE_BRICK_WALL = registerBlock("gray_mossy_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_WALL)));

    public static final Block BLACK_MOSSY_STONE_BRICK_WALL = registerBlock("black_mossy_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_WALL)));

    public static final Block BROWN_MOSSY_STONE_BRICK_WALL = registerBlock("brown_mossy_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_WALL)));

    public static final Block RED_MOSSY_STONE_BRICK_WALL = registerBlock("red_mossy_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_WALL)));

    public static final Block ORANGE_MOSSY_STONE_BRICK_WALL = registerBlock("orange_mossy_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_WALL)));

    public static final Block YELLOW_MOSSY_STONE_BRICK_WALL = registerBlock("yellow_mossy_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_WALL)));

    public static final Block LIME_MOSSY_STONE_BRICK_WALL = registerBlock("lime_mossy_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_WALL)));

    public static final Block GREEN_MOSSY_STONE_BRICK_WALL = registerBlock("green_mossy_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_WALL)));

    public static final Block CYAN_MOSSY_STONE_BRICK_WALL = registerBlock("cyan_mossy_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_WALL)));

    public static final Block LIGHT_BLUE_MOSSY_STONE_BRICK_WALL = registerBlock("light_blue_mossy_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_WALL)));

    public static final Block BLUE_MOSSY_STONE_BRICK_WALL = registerBlock("blue_mossy_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_WALL)));

    public static final Block PURPLE_MOSSY_STONE_BRICK_WALL = registerBlock("purple_mossy_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_WALL)));

    public static final Block MAGENTA_MOSSY_STONE_BRICK_WALL = registerBlock("magenta_mossy_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_WALL)));

    public static final Block PINK_MOSSY_STONE_BRICK_WALL = registerBlock("pink_mossy_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_WALL)));







    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(AngelsAscent.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(AngelsAscent.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }


    public static void registerModBlocks() {
        AngelsAscent.LOGGER.info("Registering ModBlocks for " + AngelsAscent.MOD_ID);
    }

}
