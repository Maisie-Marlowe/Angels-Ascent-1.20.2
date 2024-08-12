package net.maisiemarlowe.angelsascent.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.maisiemarlowe.angelsascent.block.ModBlocks;
import net.maisiemarlowe.angelsascent.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HOLY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLASPHEMOUS_ORE);

        BlockStateModelGenerator.BlockTexturePool Black_Cobble = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLACK_COBBLESTONE);
        BlockStateModelGenerator.BlockTexturePool Cyan_Cobble = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CYAN_COBBLESTONE);
        BlockStateModelGenerator.BlockTexturePool Blue_Cobble = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLUE_COBBLESTONE);
        BlockStateModelGenerator.BlockTexturePool Brown_Cobble = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BROWN_COBBLESTONE);
        BlockStateModelGenerator.BlockTexturePool Green_Cobble = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GREEN_COBBLESTONE);
        BlockStateModelGenerator.BlockTexturePool Grey_Cobble = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GREY_COBBLESTONE);
        BlockStateModelGenerator.BlockTexturePool Light_Blue_Cobble = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_BLUE_COBBLESTONE);
        BlockStateModelGenerator.BlockTexturePool Orange_Cobble = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORANGE_COBBLESTONE);
        BlockStateModelGenerator.BlockTexturePool Magenta_Cobble = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGENTA_COBBLESTONE);
        BlockStateModelGenerator.BlockTexturePool Lime_Cobble = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIME_COBBLESTONE);
        BlockStateModelGenerator.BlockTexturePool Yellow_Cobble = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.YELLOW_COBBLESTONE);
        BlockStateModelGenerator.BlockTexturePool Purple_Cobble = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PURPLE_COBBLESTONE);
        BlockStateModelGenerator.BlockTexturePool Red_Cobble = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_COBBLESTONE);
        BlockStateModelGenerator.BlockTexturePool Pink_Cobble = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_COBBLESTONE);
        BlockStateModelGenerator.BlockTexturePool Light_Grey_Cobble = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_GREY_COBBLESTONE);
        BlockStateModelGenerator.BlockTexturePool White_Cobble = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHITE_COBBLESTONE);

        BlockStateModelGenerator.BlockTexturePool Black_Stone_Bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLACK_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool Cyan_Stone_Bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CYAN_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool Blue_Stone_Bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLUE_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool Brown_Stone_Bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BROWN_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool Green_Stone_Bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GREEN_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool Grey_Stone_Bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GREY_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool Light_Blue_Stone_Bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_BLUE_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool Orange_Stone_Bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORANGE_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool Magenta_Stone_Bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGENTA_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool Lime_Stone_Bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIME_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool Yellow_Stone_Bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.YELLOW_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool Purple_Stone_Bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PURPLE_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool Red_Stone_Bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool Pink_Stone_Bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool Light_Grey_Stone_Bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_GREY_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool White_Stone_Bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHITE_STONE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool Black_Stone = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLACK_STONE);
        BlockStateModelGenerator.BlockTexturePool Cyan_Stone = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CYAN_STONE);
        BlockStateModelGenerator.BlockTexturePool Blue_Stone = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLUE_STONE);
        BlockStateModelGenerator.BlockTexturePool Brown_Stone = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BROWN_STONE);
        BlockStateModelGenerator.BlockTexturePool Green_Stone = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GREEN_STONE);
        BlockStateModelGenerator.BlockTexturePool Grey_Stone = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GREY_STONE);
        BlockStateModelGenerator.BlockTexturePool Light_Blue_Stone = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_BLUE_STONE);
        BlockStateModelGenerator.BlockTexturePool Orange_Stone = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORANGE_STONE);
        BlockStateModelGenerator.BlockTexturePool Magenta_Stone = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGENTA_STONE);
        BlockStateModelGenerator.BlockTexturePool Lime_Stone = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIME_STONE);
        BlockStateModelGenerator.BlockTexturePool Yellow_Stone = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.YELLOW_STONE);
        BlockStateModelGenerator.BlockTexturePool Purple_Stone = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PURPLE_STONE);
        BlockStateModelGenerator.BlockTexturePool Red_Stone = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_STONE);
        BlockStateModelGenerator.BlockTexturePool Pink_Stone = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_STONE);
        BlockStateModelGenerator.BlockTexturePool Light_Grey_Stone = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_GREY_STONE);
        BlockStateModelGenerator.BlockTexturePool White_Stone = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHITE_STONE);


        BlockStateModelGenerator.BlockTexturePool Black_Smooth_Stone = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLACK_SMOOTH_STONE);
        BlockStateModelGenerator.BlockTexturePool Cyan_Smooth_Stone = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CYAN_SMOOTH_STONE);
        BlockStateModelGenerator.BlockTexturePool Blue_Smooth_Stone = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLUE_SMOOTH_STONE);
        BlockStateModelGenerator.BlockTexturePool Brown_Smooth_Stone = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BROWN_SMOOTH_STONE);
        BlockStateModelGenerator.BlockTexturePool Green_Smooth_Stone = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GREEN_SMOOTH_STONE);
        BlockStateModelGenerator.BlockTexturePool Grey_Smooth_Stone = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GREY_SMOOTH_STONE);
        BlockStateModelGenerator.BlockTexturePool Light_Blue_Smooth_Stone = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_BLUE_SMOOTH_STONE);
        BlockStateModelGenerator.BlockTexturePool Orange_Smooth_Stone = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORANGE_SMOOTH_STONE);
        BlockStateModelGenerator.BlockTexturePool Magenta_Smooth_Stone = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGENTA_SMOOTH_STONE);
        BlockStateModelGenerator.BlockTexturePool Lime_Smooth_Stone = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIME_SMOOTH_STONE);
        BlockStateModelGenerator.BlockTexturePool Yellow_Smooth_Stone = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.YELLOW_SMOOTH_STONE);
        BlockStateModelGenerator.BlockTexturePool Purple_Smooth_Stone = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PURPLE_SMOOTH_STONE);
        BlockStateModelGenerator.BlockTexturePool Red_Smooth_Stone = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_SMOOTH_STONE);
        BlockStateModelGenerator.BlockTexturePool Pink_Smooth_Stone = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_SMOOTH_STONE);
        BlockStateModelGenerator.BlockTexturePool Light_Grey_Smooth_Stone = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_GREY_SMOOTH_STONE);
        BlockStateModelGenerator.BlockTexturePool White_Smooth_Stone = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHITE_SMOOTH_STONE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_CRACKED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CYAN_CRACKED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_CRACKED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BROWN_CRACKED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_CRACKED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREY_CRACKED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_BLUE_CRACKED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_CRACKED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGENTA_CRACKED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIME_CRACKED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_CRACKED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_CRACKED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_CRACKED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_CRACKED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_GREY_CRACKED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_CRACKED_STONE_BRICKS);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_CHISELED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CYAN_CHISELED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_CHISELED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BROWN_CHISELED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_CHISELED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREY_CHISELED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_BLUE_CHISELED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_CHISELED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGENTA_CHISELED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIME_CHISELED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_CHISELED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_CHISELED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_CHISELED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_CHISELED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_GREY_CHISELED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_CHISELED_STONE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool Black_Mossy_Stone_Bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLACK_MOSSY_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool Cyan_Mossy_Stone_Bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CYAN_MOSSY_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool Blue_Mossy_Stone_Bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLUE_MOSSY_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool Brown_Mossy_Stone_Bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BROWN_MOSSY_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool Green_Mossy_Stone_Bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GREEN_MOSSY_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool Grey_Mossy_Stone_Bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GREY_MOSSY_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool Light_Blue_Mossy_Stone_Bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_BLUE_MOSSY_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool Orange_Mossy_Stone_Bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORANGE_MOSSY_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool Magenta_Mossy_Stone_Bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGENTA_MOSSY_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool Lime_Mossy_Stone_Bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIME_MOSSY_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool Yellow_Mossy_Stone_Bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.YELLOW_MOSSY_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool Purple_Mossy_Stone_Bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PURPLE_MOSSY_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool Red_Mossy_Stone_Bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_MOSSY_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool Pink_Mossy_Stone_Bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_MOSSY_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool Light_Grey_Mossy_Stone_Bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_GREY_MOSSY_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool White_Mossy_Stone_Bricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHITE_MOSSY_STONE_BRICKS);


        Black_Stone.stairs(ModBlocks.BLACK_STONE_STAIRS);
        Cyan_Stone.stairs(ModBlocks.CYAN_STONE_STAIRS);
        Blue_Stone.stairs(ModBlocks.BLUE_STONE_STAIRS);
        Brown_Stone.stairs(ModBlocks.BROWN_STONE_STAIRS);
        Green_Stone.stairs(ModBlocks.GREEN_STONE_STAIRS);
        Grey_Stone.stairs(ModBlocks.GREY_STONE_STAIRS);
        Light_Blue_Stone.stairs(ModBlocks.LIGHT_BLUE_STONE_STAIRS);
        Orange_Stone.stairs(ModBlocks.ORANGE_STONE_STAIRS);
        Magenta_Stone.stairs(ModBlocks.MAGENTA_STONE_STAIRS);
        Lime_Stone.stairs(ModBlocks.LIME_STONE_STAIRS);
        Yellow_Stone.stairs(ModBlocks.YELLOW_STONE_STAIRS);
        Purple_Stone.stairs(ModBlocks.PURPLE_STONE_STAIRS);
        Red_Stone.stairs(ModBlocks.RED_STONE_STAIRS);
        Pink_Stone.stairs(ModBlocks.PINK_STONE_STAIRS);
        Light_Grey_Stone.stairs(ModBlocks.LIGHT_GREY_STONE_STAIRS);
        White_Stone.stairs(ModBlocks.WHITE_STONE_STAIRS);

        Black_Cobble.stairs(ModBlocks.BLACK_COBBLESTONE_STAIRS);
        Cyan_Cobble.stairs(ModBlocks.CYAN_COBBLESTONE_STAIRS);
        Blue_Cobble.stairs(ModBlocks.BLUE_COBBLESTONE_STAIRS);
        Brown_Cobble.stairs(ModBlocks.BROWN_COBBLESTONE_STAIRS);
        Green_Cobble.stairs(ModBlocks.GREEN_COBBLESTONE_STAIRS);
        Grey_Cobble.stairs(ModBlocks.GREY_COBBLESTONE_STAIRS);
        Light_Blue_Cobble.stairs(ModBlocks.LIGHT_BLUE_COBBLESTONE_STAIRS);
        Orange_Cobble.stairs(ModBlocks.ORANGE_COBBLESTONE_STAIRS);
        Magenta_Cobble.stairs(ModBlocks.MAGENTA_COBBLESTONE_STAIRS);
        Lime_Cobble.stairs(ModBlocks.LIME_COBBLESTONE_STAIRS);
        Yellow_Cobble.stairs(ModBlocks.YELLOW_COBBLESTONE_STAIRS);
        Purple_Cobble.stairs(ModBlocks.PURPLE_COBBLESTONE_STAIRS);
        Red_Cobble.stairs(ModBlocks.RED_COBBLESTONE_STAIRS);
        Pink_Cobble.stairs(ModBlocks.PINK_COBBLESTONE_STAIRS);
        Light_Grey_Cobble.stairs(ModBlocks.LIGHT_GREY_COBBLESTONE_STAIRS);
        White_Cobble.stairs(ModBlocks.WHITE_COBBLESTONE_STAIRS);

        Black_Stone_Bricks.stairs(ModBlocks.BLACK_STONE_BRICK_STAIRS);
        Cyan_Stone_Bricks.stairs(ModBlocks.CYAN_STONE_BRICK_STAIRS);
        Blue_Stone_Bricks.stairs(ModBlocks.BLUE_STONE_BRICK_STAIRS);
        Brown_Stone_Bricks.stairs(ModBlocks.BROWN_STONE_BRICK_STAIRS);
        Green_Stone_Bricks.stairs(ModBlocks.GREEN_STONE_BRICK_STAIRS);
        Grey_Stone_Bricks.stairs(ModBlocks.GREY_STONE_BRICK_STAIRS);
        Light_Blue_Stone_Bricks.stairs(ModBlocks.LIGHT_BLUE_STONE_BRICK_STAIRS);
        Orange_Stone_Bricks.stairs(ModBlocks.ORANGE_STONE_BRICK_STAIRS);
        Magenta_Stone_Bricks.stairs(ModBlocks.MAGENTA_STONE_BRICK_STAIRS);
        Lime_Stone_Bricks.stairs(ModBlocks.LIME_STONE_BRICK_STAIRS);
        Yellow_Stone_Bricks.stairs(ModBlocks.YELLOW_STONE_BRICK_STAIRS);
        Purple_Stone_Bricks.stairs(ModBlocks.PURPLE_STONE_BRICK_STAIRS);
        Red_Stone_Bricks.stairs(ModBlocks.RED_STONE_BRICK_STAIRS);
        Pink_Stone_Bricks.stairs(ModBlocks.PINK_STONE_BRICK_STAIRS);
        Light_Grey_Stone_Bricks.stairs(ModBlocks.LIGHT_GREY_STONE_BRICK_STAIRS);
        White_Stone_Bricks.stairs(ModBlocks.WHITE_STONE_BRICK_STAIRS);

        Black_Mossy_Stone_Bricks.stairs(ModBlocks.BLACK_MOSSY_STONE_BRICK_STAIRS);
        Cyan_Mossy_Stone_Bricks.stairs(ModBlocks.CYAN_MOSSY_STONE_BRICK_STAIRS);
        Blue_Mossy_Stone_Bricks.stairs(ModBlocks.BLUE_MOSSY_STONE_BRICK_STAIRS);
        Brown_Mossy_Stone_Bricks.stairs(ModBlocks.BROWN_MOSSY_STONE_BRICK_STAIRS);
        Green_Mossy_Stone_Bricks.stairs(ModBlocks.GREEN_MOSSY_STONE_BRICK_STAIRS);
        Grey_Mossy_Stone_Bricks.stairs(ModBlocks.GREY_MOSSY_STONE_BRICK_STAIRS);
        Light_Blue_Mossy_Stone_Bricks.stairs(ModBlocks.LIGHT_BLUE_MOSSY_STONE_BRICK_STAIRS);
        Orange_Mossy_Stone_Bricks.stairs(ModBlocks.ORANGE_MOSSY_STONE_BRICK_STAIRS);
        Magenta_Mossy_Stone_Bricks.stairs(ModBlocks.MAGENTA_MOSSY_STONE_BRICK_STAIRS);
        Lime_Mossy_Stone_Bricks.stairs(ModBlocks.LIME_MOSSY_STONE_BRICK_STAIRS);
        Yellow_Mossy_Stone_Bricks.stairs(ModBlocks.YELLOW_MOSSY_STONE_BRICK_STAIRS);
        Purple_Mossy_Stone_Bricks.stairs(ModBlocks.PURPLE_MOSSY_STONE_BRICK_STAIRS);
        Red_Mossy_Stone_Bricks.stairs(ModBlocks.RED_MOSSY_STONE_BRICK_STAIRS);
        Pink_Mossy_Stone_Bricks.stairs(ModBlocks.PINK_MOSSY_STONE_BRICK_STAIRS);
        Light_Grey_Mossy_Stone_Bricks.stairs(ModBlocks.LIGHT_GREY_MOSSY_STONE_BRICK_STAIRS);
        White_Mossy_Stone_Bricks.stairs(ModBlocks.WHITE_MOSSY_STONE_BRICK_STAIRS);


        Black_Stone.slab(ModBlocks.BLACK_STONE_SLAB);
        Cyan_Stone.slab(ModBlocks.CYAN_STONE_SLAB);
        Blue_Stone.slab(ModBlocks.BLUE_STONE_SLAB);
        Brown_Stone.slab(ModBlocks.BROWN_STONE_SLAB);
        Green_Stone.slab(ModBlocks.GREEN_STONE_SLAB);
        Grey_Stone.slab(ModBlocks.GREY_STONE_SLAB);
        Light_Blue_Stone.slab(ModBlocks.LIGHT_BLUE_STONE_SLAB);
        Orange_Stone.slab(ModBlocks.ORANGE_STONE_SLAB);
        Magenta_Stone.slab(ModBlocks.MAGENTA_STONE_SLAB);
        Lime_Stone.slab(ModBlocks.LIME_STONE_SLAB);
        Yellow_Stone.slab(ModBlocks.YELLOW_STONE_SLAB);
        Purple_Stone.slab(ModBlocks.PURPLE_STONE_SLAB);
        Red_Stone.slab(ModBlocks.RED_STONE_SLAB);
        Pink_Stone.slab(ModBlocks.PINK_STONE_SLAB);
        Light_Grey_Stone.slab(ModBlocks.LIGHT_GREY_STONE_SLAB);
        White_Stone.slab(ModBlocks.WHITE_STONE_SLAB);

        Black_Cobble.slab(ModBlocks.BLACK_COBBLESTONE_SLAB);
        Cyan_Cobble.slab(ModBlocks.CYAN_COBBLESTONE_SLAB);
        Blue_Cobble.slab(ModBlocks.BLUE_COBBLESTONE_SLAB);
        Brown_Cobble.slab(ModBlocks.BROWN_COBBLESTONE_SLAB);
        Green_Cobble.slab(ModBlocks.GREEN_COBBLESTONE_SLAB);
        Grey_Cobble.slab(ModBlocks.GREY_COBBLESTONE_SLAB);
        Light_Blue_Cobble.slab(ModBlocks.LIGHT_BLUE_COBBLESTONE_SLAB);
        Orange_Cobble.slab(ModBlocks.ORANGE_COBBLESTONE_SLAB);
        Magenta_Cobble.slab(ModBlocks.MAGENTA_COBBLESTONE_SLAB);
        Lime_Cobble.slab(ModBlocks.LIME_COBBLESTONE_SLAB);
        Yellow_Cobble.slab(ModBlocks.YELLOW_COBBLESTONE_SLAB);
        Purple_Cobble.slab(ModBlocks.PURPLE_COBBLESTONE_SLAB);
        Red_Cobble.slab(ModBlocks.RED_COBBLESTONE_SLAB);
        Pink_Cobble.slab(ModBlocks.PINK_COBBLESTONE_SLAB);
        Light_Grey_Cobble.slab(ModBlocks.LIGHT_GREY_COBBLESTONE_SLAB);
        White_Cobble.slab(ModBlocks.WHITE_COBBLESTONE_SLAB);

        Black_Stone_Bricks.slab(ModBlocks.BLACK_STONE_BRICK_SLAB);
        Cyan_Stone_Bricks.slab(ModBlocks.CYAN_STONE_BRICK_SLAB);
        Blue_Stone_Bricks.slab(ModBlocks.BLUE_STONE_BRICK_SLAB);
        Brown_Stone_Bricks.slab(ModBlocks.BROWN_STONE_BRICK_SLAB);
        Green_Stone_Bricks.slab(ModBlocks.GREEN_STONE_BRICK_SLAB);
        Grey_Stone_Bricks.slab(ModBlocks.GREY_STONE_BRICK_SLAB);
        Light_Blue_Stone_Bricks.slab(ModBlocks.LIGHT_BLUE_STONE_BRICK_SLAB);
        Orange_Stone_Bricks.slab(ModBlocks.ORANGE_STONE_BRICK_SLAB);
        Magenta_Stone_Bricks.slab(ModBlocks.MAGENTA_STONE_BRICK_SLAB);
        Lime_Stone_Bricks.slab(ModBlocks.LIME_STONE_BRICK_SLAB);
        Yellow_Stone_Bricks.slab(ModBlocks.YELLOW_STONE_BRICK_SLAB);
        Purple_Stone_Bricks.slab(ModBlocks.PURPLE_STONE_BRICK_SLAB);
        Red_Stone_Bricks.slab(ModBlocks.RED_STONE_BRICK_SLAB);
        Pink_Stone_Bricks.slab(ModBlocks.PINK_STONE_BRICK_SLAB);
        Light_Grey_Stone_Bricks.slab(ModBlocks.LIGHT_GREY_STONE_BRICK_SLAB);
        White_Stone_Bricks.slab(ModBlocks.WHITE_STONE_BRICK_SLAB);

        Black_Mossy_Stone_Bricks.slab(ModBlocks.BLACK_MOSSY_STONE_BRICK_SLAB);
        Cyan_Mossy_Stone_Bricks.slab(ModBlocks.CYAN_MOSSY_STONE_BRICK_SLAB);
        Blue_Mossy_Stone_Bricks.slab(ModBlocks.BLUE_MOSSY_STONE_BRICK_SLAB);
        Brown_Mossy_Stone_Bricks.slab(ModBlocks.BROWN_MOSSY_STONE_BRICK_SLAB);
        Green_Mossy_Stone_Bricks.slab(ModBlocks.GREEN_MOSSY_STONE_BRICK_SLAB);
        Grey_Mossy_Stone_Bricks.slab(ModBlocks.GREY_MOSSY_STONE_BRICK_SLAB);
        Light_Blue_Mossy_Stone_Bricks.slab(ModBlocks.LIGHT_BLUE_MOSSY_STONE_BRICK_SLAB);
        Orange_Mossy_Stone_Bricks.slab(ModBlocks.ORANGE_MOSSY_STONE_BRICK_SLAB);
        Magenta_Mossy_Stone_Bricks.slab(ModBlocks.MAGENTA_MOSSY_STONE_BRICK_SLAB);
        Lime_Mossy_Stone_Bricks.slab(ModBlocks.LIME_MOSSY_STONE_BRICK_SLAB);
        Yellow_Mossy_Stone_Bricks.slab(ModBlocks.YELLOW_MOSSY_STONE_BRICK_SLAB);
        Purple_Mossy_Stone_Bricks.slab(ModBlocks.PURPLE_MOSSY_STONE_BRICK_SLAB);
        Red_Mossy_Stone_Bricks.slab(ModBlocks.RED_MOSSY_STONE_BRICK_SLAB);
        Pink_Mossy_Stone_Bricks.slab(ModBlocks.PINK_MOSSY_STONE_BRICK_SLAB);
        Light_Grey_Mossy_Stone_Bricks.slab(ModBlocks.LIGHT_GREY_MOSSY_STONE_BRICK_SLAB);
        White_Mossy_Stone_Bricks.slab(ModBlocks.WHITE_MOSSY_STONE_BRICK_SLAB);

        Black_Stone.button(ModBlocks.BLACK_STONE_BUTTON);
        Cyan_Stone.button(ModBlocks.CYAN_STONE_BUTTON);
        Blue_Stone.button(ModBlocks.BLUE_STONE_BUTTON);
        Brown_Stone.button(ModBlocks.BROWN_STONE_BUTTON);
        Green_Stone.button(ModBlocks.GREEN_STONE_BUTTON);
        Grey_Stone.button(ModBlocks.GREY_STONE_BUTTON);
        Light_Blue_Stone.button(ModBlocks.LIGHT_BLUE_STONE_BUTTON);
        Orange_Stone.button(ModBlocks.ORANGE_STONE_BUTTON);
        Magenta_Stone.button(ModBlocks.MAGENTA_STONE_BUTTON);
        Lime_Stone.button(ModBlocks.LIME_STONE_BUTTON);
        Yellow_Stone.button(ModBlocks.YELLOW_STONE_BUTTON);
        Purple_Stone.button(ModBlocks.PURPLE_STONE_BUTTON);
        Red_Stone.button(ModBlocks.RED_STONE_BUTTON);
        Pink_Stone.button(ModBlocks.PINK_STONE_BUTTON);
        Light_Grey_Stone.button(ModBlocks.LIGHT_GREY_STONE_BUTTON);
        White_Stone.button(ModBlocks.WHITE_STONE_BUTTON);

        Black_Stone.pressurePlate(ModBlocks.BLACK_STONE_PRESSURE_PLATE);
        Cyan_Stone.pressurePlate(ModBlocks.CYAN_STONE_PRESSURE_PLATE);
        Blue_Stone.pressurePlate(ModBlocks.BLUE_STONE_PRESSURE_PLATE);
        Brown_Stone.pressurePlate(ModBlocks.BROWN_STONE_PRESSURE_PLATE);
        Green_Stone.pressurePlate(ModBlocks.GREEN_STONE_PRESSURE_PLATE);
        Grey_Stone.pressurePlate(ModBlocks.GREY_STONE_PRESSURE_PLATE);
        Light_Blue_Stone.pressurePlate(ModBlocks.LIGHT_BLUE_STONE_PRESSURE_PLATE);
        Orange_Stone.pressurePlate(ModBlocks.ORANGE_STONE_PRESSURE_PLATE);
        Magenta_Stone.pressurePlate(ModBlocks.MAGENTA_STONE_PRESSURE_PLATE);
        Lime_Stone.pressurePlate(ModBlocks.LIME_STONE_PRESSURE_PLATE);
        Yellow_Stone.pressurePlate(ModBlocks.YELLOW_STONE_PRESSURE_PLATE);
        Purple_Stone.pressurePlate(ModBlocks.PURPLE_STONE_PRESSURE_PLATE);
        Red_Stone.pressurePlate(ModBlocks.RED_STONE_PRESSURE_PLATE);
        Pink_Stone.pressurePlate(ModBlocks.PINK_STONE_PRESSURE_PLATE);
        Light_Grey_Stone.pressurePlate(ModBlocks.LIGHT_GREY_STONE_PRESSURE_PLATE);
        White_Stone.pressurePlate(ModBlocks.WHITE_STONE_PRESSURE_PLATE);

        Black_Stone_Bricks.wall(ModBlocks.BLACK_STONE_BRICK_WALL);
        Cyan_Stone_Bricks.wall(ModBlocks.CYAN_STONE_BRICK_WALL);
        Blue_Stone_Bricks.wall(ModBlocks.BLUE_STONE_BRICK_WALL);
        Brown_Stone_Bricks.wall(ModBlocks.BROWN_STONE_BRICK_WALL);
        Green_Stone_Bricks.wall(ModBlocks.GREEN_STONE_BRICK_WALL);
        Grey_Stone_Bricks.wall(ModBlocks.GREY_STONE_BRICK_WALL);
        Light_Blue_Stone_Bricks.wall(ModBlocks.LIGHT_BLUE_STONE_BRICK_WALL);
        Orange_Stone_Bricks.wall(ModBlocks.ORANGE_STONE_BRICK_WALL);
        Magenta_Stone_Bricks.wall(ModBlocks.MAGENTA_STONE_BRICK_WALL);
        Lime_Stone_Bricks.wall(ModBlocks.LIME_STONE_BRICK_WALL);
        Yellow_Stone_Bricks.wall(ModBlocks.YELLOW_STONE_BRICK_WALL);
        Purple_Stone_Bricks.wall(ModBlocks.PURPLE_STONE_BRICK_WALL);
        Red_Stone_Bricks.wall(ModBlocks.RED_STONE_BRICK_WALL);
        Pink_Stone_Bricks.wall(ModBlocks.PINK_STONE_BRICK_WALL);
        Light_Grey_Stone_Bricks.wall(ModBlocks.LIGHT_GREY_STONE_BRICK_WALL);
        White_Stone_Bricks.wall(ModBlocks.WHITE_STONE_BRICK_WALL);

        Black_Cobble.wall(ModBlocks.BLACK_COBBLESTONE_WALL);
        Cyan_Cobble.wall(ModBlocks.CYAN_COBBLESTONE_WALL);
        Blue_Cobble.wall(ModBlocks.BLUE_COBBLESTONE_WALL);
        Brown_Cobble.wall(ModBlocks.BROWN_COBBLESTONE_WALL);
        Green_Cobble.wall(ModBlocks.GREEN_COBBLESTONE_WALL);
        Grey_Cobble.wall(ModBlocks.GREY_COBBLESTONE_WALL);
        Light_Blue_Cobble.wall(ModBlocks.LIGHT_BLUE_COBBLESTONE_WALL);
        Orange_Cobble.wall(ModBlocks.ORANGE_COBBLESTONE_WALL);
        Magenta_Cobble.wall(ModBlocks.MAGENTA_COBBLESTONE_WALL);
        Lime_Cobble.wall(ModBlocks.LIME_COBBLESTONE_WALL);
        Yellow_Cobble.wall(ModBlocks.YELLOW_COBBLESTONE_WALL);
        Purple_Cobble.wall(ModBlocks.PURPLE_COBBLESTONE_WALL);
        Red_Cobble.wall(ModBlocks.RED_COBBLESTONE_WALL);
        Pink_Cobble.wall(ModBlocks.PINK_COBBLESTONE_WALL);
        Light_Grey_Cobble.wall(ModBlocks.LIGHT_GREY_COBBLESTONE_WALL);
        White_Cobble.wall(ModBlocks.WHITE_COBBLESTONE_WALL);

        Black_Stone_Bricks.wall(ModBlocks.BLACK_MOSSY_STONE_BRICK_WALL);
        Cyan_Stone_Bricks.wall(ModBlocks.CYAN_MOSSY_STONE_BRICK_WALL);
        Blue_Stone_Bricks.wall(ModBlocks.BLUE_MOSSY_STONE_BRICK_WALL);
        Brown_Stone_Bricks.wall(ModBlocks.BROWN_MOSSY_STONE_BRICK_WALL);
        Green_Stone_Bricks.wall(ModBlocks.GREEN_MOSSY_STONE_BRICK_WALL);
        Grey_Stone_Bricks.wall(ModBlocks.GREY_MOSSY_STONE_BRICK_WALL);
        Light_Blue_Stone_Bricks.wall(ModBlocks.LIGHT_BLUE_MOSSY_STONE_BRICK_WALL);
        Orange_Stone_Bricks.wall(ModBlocks.ORANGE_MOSSY_STONE_BRICK_WALL);
        Magenta_Stone_Bricks.wall(ModBlocks.MAGENTA_MOSSY_STONE_BRICK_WALL);
        Lime_Stone_Bricks.wall(ModBlocks.LIME_MOSSY_STONE_BRICK_WALL);
        Yellow_Stone_Bricks.wall(ModBlocks.YELLOW_MOSSY_STONE_BRICK_WALL);
        Purple_Stone_Bricks.wall(ModBlocks.PURPLE_MOSSY_STONE_BRICK_WALL);
        Red_Stone_Bricks.wall(ModBlocks.RED_MOSSY_STONE_BRICK_WALL);
        Pink_Stone_Bricks.wall(ModBlocks.PINK_MOSSY_STONE_BRICK_WALL);
        Light_Grey_Stone_Bricks.wall(ModBlocks.LIGHT_GREY_MOSSY_STONE_BRICK_WALL);
        White_Stone_Bricks.wall(ModBlocks.WHITE_MOSSY_STONE_BRICK_WALL);



    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PURIFIED_EYE_OF_ENDER, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDER_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURIFIED_ENDER_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.SOUL_POWDER, Models.GENERATED);
        itemModelGenerator.register(ModItems.COMPRESSED_ENDER_PEARL, Models.GENERATED);
        itemModelGenerator.register(ModItems.DOUBLE_COMPRESSED_ENDER_PEARL, Models.GENERATED);
        itemModelGenerator.register(ModItems.TRIPLE_COMPRESSED_ENDER_PEARL, Models.GENERATED);
        itemModelGenerator.register(ModItems.ULTRA_COMPRESSED_ENDER_PEARL, Models.GENERATED);
        itemModelGenerator.register(ModItems.HOLY_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.HOLY_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLASPHEMOUS_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLASPHEMOUS_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SOUL_FRAGMENT, Models.GENERATED);


        itemModelGenerator.registerArmor(((ArmorItem) ModItems.HALO));

        itemModelGenerator.register(ModItems.SOUL_DRILL, Models.HANDHELD);

        itemModelGenerator.register(ModItems.HOLY_CARROT, Models.GENERATED);
        itemModelGenerator.register(ModItems.HOLY_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.HOLY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.HOLY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.HOLY_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.HOLY_SHOVEL, Models.HANDHELD);

        itemModelGenerator.register(ModItems.BLASPHEMOUS_CARROT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLASPHEMOUS_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLASPHEMOUS_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLASPHEMOUS_DRILL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLASPHEMOUS_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLASPHEMOUS_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLASPHEMOUS_SHOVEL, Models.HANDHELD);

        itemModelGenerator.register(ModItems.HOLY_WINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLASPHEMOUS_WINGS, Models.GENERATED);


    }
}
