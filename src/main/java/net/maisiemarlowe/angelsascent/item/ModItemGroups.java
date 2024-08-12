package net.maisiemarlowe.angelsascent.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.maisiemarlowe.angelsascent.AngelsAscent;
import net.maisiemarlowe.angelsascent.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ANGELS_ASCENT_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(AngelsAscent.MOD_ID, "angelsascent"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.angelsascent"))
            .icon(() -> new ItemStack(ModItems.PURIFIED_EYE_OF_ENDER)).entries(((displayContext, entries) -> {
                entries.add(ModBlocks.SOUL_ORE);
                entries.add(ModBlocks.HOLY_ORE);
                entries.add(ModBlocks.BLASPHEMOUS_ORE);


                entries.add(ModItems.ENDER_SHARD);
                entries.add(ModItems.PURIFIED_ENDER_SHARD);

                entries.add(ModItems.SOUL_FRAGMENT);
                entries.add(ModItems.SOUL_POWDER);

                entries.add(ModItems.PURIFIED_EYE_OF_ENDER);

                entries.add(ModBlocks.COMPRESSOR_BLOCK);

                entries.add(ModItems.COMPRESSED_ENDER_PEARL);
                entries.add(ModItems.DOUBLE_COMPRESSED_ENDER_PEARL);
                entries.add(ModItems.TRIPLE_COMPRESSED_ENDER_PEARL);
                entries.add(ModItems.ULTRA_COMPRESSED_ENDER_PEARL);

                entries.add(ModItems.HOLY_NUGGET);
                entries.add(ModItems.HOLY_INGOT);
                entries.add(ModItems.BLASPHEMOUS_NUGGET);
                entries.add(ModItems.BLASPHEMOUS_INGOT);

                entries.add(ModItems.SOUL_DRILL);

                entries.add(ModItems.HOLY_CARROT);
                entries.add(ModItems.HOLY_SHOVEL);
                entries.add(ModItems.HOLY_PICKAXE);
                entries.add(ModItems.HOLY_AXE);
                entries.add(ModItems.HOLY_HOE);
                entries.add(ModItems.HOLY_SWORD);

                entries.add(ModItems.BLASPHEMOUS_CARROT);
                entries.add(ModItems.BLASPHEMOUS_SHOVEL);
                entries.add(ModItems.BLASPHEMOUS_PICKAXE);
                entries.add(ModItems.BLASPHEMOUS_AXE);
                entries.add(ModItems.BLASPHEMOUS_HOE);
                entries.add(ModItems.BLASPHEMOUS_SWORD);

                entries.add(ModItems.BLASPHEMOUS_DRILL);

                entries.add(ModItems.HALO);

                entries.add(ModItems.HOLY_WINGS);
                entries.add(ModItems.BLASPHEMOUS_WINGS);






                    })).build());


    public static final ItemGroup STONE_COLOURS_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(AngelsAscent.MOD_ID, "stonecolours"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.stonecolours"))
                    .icon(() -> new ItemStack(ModBlocks.PINK_COBBLESTONE)).entries(((displayContext, entries) -> {

                entries.add(ModBlocks.WHITE_COBBLESTONE);
                entries.add(ModBlocks.LIGHT_GREY_COBBLESTONE);
                entries.add(ModBlocks.GREY_COBBLESTONE);
                entries.add(ModBlocks.BLACK_COBBLESTONE);
                entries.add(ModBlocks.BROWN_COBBLESTONE);
                entries.add(ModBlocks.RED_COBBLESTONE);
                entries.add(ModBlocks.ORANGE_COBBLESTONE);
                entries.add(ModBlocks.YELLOW_COBBLESTONE);
                entries.add(ModBlocks.LIME_COBBLESTONE);
                entries.add(ModBlocks.GREEN_COBBLESTONE);
                entries.add(ModBlocks.CYAN_COBBLESTONE);
                entries.add(ModBlocks.LIGHT_BLUE_COBBLESTONE);
                entries.add(ModBlocks.BLUE_COBBLESTONE);
                entries.add(ModBlocks.PURPLE_COBBLESTONE);
                entries.add(ModBlocks.MAGENTA_COBBLESTONE);
                entries.add(ModBlocks.PINK_COBBLESTONE);

                entries.add(ModBlocks.WHITE_STONE_BRICKS);
                entries.add(ModBlocks.LIGHT_GREY_STONE_BRICKS);
                entries.add(ModBlocks.GREY_STONE_BRICKS);
                entries.add(ModBlocks.BLACK_STONE_BRICKS);
                entries.add(ModBlocks.BROWN_STONE_BRICKS);
                entries.add(ModBlocks.RED_STONE_BRICKS);
                entries.add(ModBlocks.ORANGE_STONE_BRICKS);
                entries.add(ModBlocks.YELLOW_STONE_BRICKS);
                entries.add(ModBlocks.LIME_STONE_BRICKS);
                entries.add(ModBlocks.GREEN_STONE_BRICKS);
                entries.add(ModBlocks.CYAN_STONE_BRICKS);
                entries.add(ModBlocks.LIGHT_BLUE_STONE_BRICKS);
                entries.add(ModBlocks.BLUE_STONE_BRICKS);
                entries.add(ModBlocks.PURPLE_STONE_BRICKS);
                entries.add(ModBlocks.MAGENTA_STONE_BRICKS);
                entries.add(ModBlocks.PINK_STONE_BRICKS);

                entries.add(ModBlocks.WHITE_STONE);
                entries.add(ModBlocks.LIGHT_GREY_STONE);
                entries.add(ModBlocks.GREY_STONE);
                entries.add(ModBlocks.BLACK_STONE);
                entries.add(ModBlocks.BROWN_STONE);
                entries.add(ModBlocks.RED_STONE);
                entries.add(ModBlocks.ORANGE_STONE);
                entries.add(ModBlocks.YELLOW_STONE);
                entries.add(ModBlocks.LIME_STONE);
                entries.add(ModBlocks.GREEN_STONE);
                entries.add(ModBlocks.CYAN_STONE);
                entries.add(ModBlocks.LIGHT_BLUE_STONE);
                entries.add(ModBlocks.BLUE_STONE);
                entries.add(ModBlocks.PURPLE_STONE);
                entries.add(ModBlocks.MAGENTA_STONE);
                entries.add(ModBlocks.PINK_STONE);

                entries.add(ModBlocks.WHITE_SMOOTH_STONE);
                entries.add(ModBlocks.LIGHT_GREY_SMOOTH_STONE);
                entries.add(ModBlocks.GREY_SMOOTH_STONE);
                entries.add(ModBlocks.BLACK_SMOOTH_STONE);
                entries.add(ModBlocks.BROWN_SMOOTH_STONE);
                entries.add(ModBlocks.RED_SMOOTH_STONE);
                entries.add(ModBlocks.ORANGE_SMOOTH_STONE);
                entries.add(ModBlocks.YELLOW_SMOOTH_STONE);
                entries.add(ModBlocks.LIME_SMOOTH_STONE);
                entries.add(ModBlocks.GREEN_SMOOTH_STONE);
                entries.add(ModBlocks.CYAN_SMOOTH_STONE);
                entries.add(ModBlocks.LIGHT_BLUE_SMOOTH_STONE);
                entries.add(ModBlocks.BLUE_SMOOTH_STONE);
                entries.add(ModBlocks.PURPLE_SMOOTH_STONE);
                entries.add(ModBlocks.MAGENTA_SMOOTH_STONE);
                entries.add(ModBlocks.PINK_SMOOTH_STONE);

                entries.add(ModBlocks.WHITE_CRACKED_STONE_BRICKS);
                entries.add(ModBlocks.LIGHT_GREY_CRACKED_STONE_BRICKS);
                entries.add(ModBlocks.GREY_CRACKED_STONE_BRICKS);
                entries.add(ModBlocks.BLACK_CRACKED_STONE_BRICKS);
                entries.add(ModBlocks.BROWN_CRACKED_STONE_BRICKS);
                entries.add(ModBlocks.RED_CRACKED_STONE_BRICKS);
                entries.add(ModBlocks.ORANGE_CRACKED_STONE_BRICKS);
                entries.add(ModBlocks.YELLOW_CRACKED_STONE_BRICKS);
                entries.add(ModBlocks.LIME_CRACKED_STONE_BRICKS);
                entries.add(ModBlocks.GREEN_CRACKED_STONE_BRICKS);
                entries.add(ModBlocks.CYAN_CRACKED_STONE_BRICKS);
                entries.add(ModBlocks.LIGHT_BLUE_CRACKED_STONE_BRICKS);
                entries.add(ModBlocks.BLUE_CRACKED_STONE_BRICKS);
                entries.add(ModBlocks.PURPLE_CRACKED_STONE_BRICKS);
                entries.add(ModBlocks.MAGENTA_CRACKED_STONE_BRICKS);
                entries.add(ModBlocks.PINK_CRACKED_STONE_BRICKS);

                entries.add(ModBlocks.WHITE_CHISELED_STONE_BRICKS);
                entries.add(ModBlocks.LIGHT_GREY_CHISELED_STONE_BRICKS);
                entries.add(ModBlocks.GREY_CHISELED_STONE_BRICKS);
                entries.add(ModBlocks.BLACK_CHISELED_STONE_BRICKS);
                entries.add(ModBlocks.BROWN_CHISELED_STONE_BRICKS);
                entries.add(ModBlocks.RED_CHISELED_STONE_BRICKS);
                entries.add(ModBlocks.ORANGE_CHISELED_STONE_BRICKS);
                entries.add(ModBlocks.YELLOW_CHISELED_STONE_BRICKS);
                entries.add(ModBlocks.LIME_CHISELED_STONE_BRICKS);
                entries.add(ModBlocks.GREEN_CHISELED_STONE_BRICKS);
                entries.add(ModBlocks.CYAN_CHISELED_STONE_BRICKS);
                entries.add(ModBlocks.LIGHT_BLUE_CHISELED_STONE_BRICKS);
                entries.add(ModBlocks.BLUE_CHISELED_STONE_BRICKS);
                entries.add(ModBlocks.PURPLE_CHISELED_STONE_BRICKS);
                entries.add(ModBlocks.MAGENTA_CHISELED_STONE_BRICKS);
                entries.add(ModBlocks.PINK_CHISELED_STONE_BRICKS);

                entries.add(ModBlocks.WHITE_MOSSY_STONE_BRICKS);
                entries.add(ModBlocks.LIGHT_GREY_MOSSY_STONE_BRICKS);
                entries.add(ModBlocks.GREY_MOSSY_STONE_BRICKS);
                entries.add(ModBlocks.BLACK_MOSSY_STONE_BRICKS);
                entries.add(ModBlocks.BROWN_MOSSY_STONE_BRICKS);
                entries.add(ModBlocks.RED_MOSSY_STONE_BRICKS);
                entries.add(ModBlocks.ORANGE_MOSSY_STONE_BRICKS);
                entries.add(ModBlocks.YELLOW_MOSSY_STONE_BRICKS);
                entries.add(ModBlocks.LIME_MOSSY_STONE_BRICKS);
                entries.add(ModBlocks.GREEN_MOSSY_STONE_BRICKS);
                entries.add(ModBlocks.CYAN_MOSSY_STONE_BRICKS);
                entries.add(ModBlocks.LIGHT_BLUE_MOSSY_STONE_BRICKS);
                entries.add(ModBlocks.BLUE_MOSSY_STONE_BRICKS);
                entries.add(ModBlocks.PURPLE_MOSSY_STONE_BRICKS);
                entries.add(ModBlocks.MAGENTA_MOSSY_STONE_BRICKS);
                entries.add(ModBlocks.PINK_MOSSY_STONE_BRICKS);

                entries.add(ModBlocks.WHITE_STONE_STAIRS);
                entries.add(ModBlocks.LIGHT_GREY_STONE_STAIRS);
                entries.add(ModBlocks.GREY_STONE_STAIRS);
                entries.add(ModBlocks.BLACK_STONE_STAIRS);
                entries.add(ModBlocks.BROWN_STONE_STAIRS);
                entries.add(ModBlocks.RED_STONE_STAIRS);
                entries.add(ModBlocks.ORANGE_STONE_STAIRS);
                entries.add(ModBlocks.YELLOW_STONE_STAIRS);
                entries.add(ModBlocks.LIME_STONE_STAIRS);
                entries.add(ModBlocks.GREEN_STONE_STAIRS);
                entries.add(ModBlocks.CYAN_STONE_STAIRS);
                entries.add(ModBlocks.LIGHT_BLUE_STONE_STAIRS);
                entries.add(ModBlocks.BLUE_STONE_STAIRS);
                entries.add(ModBlocks.PURPLE_STONE_STAIRS);
                entries.add(ModBlocks.MAGENTA_STONE_STAIRS);
                entries.add(ModBlocks.PINK_STONE_STAIRS);

                entries.add(ModBlocks.WHITE_COBBLESTONE_STAIRS);
                entries.add(ModBlocks.LIGHT_GREY_COBBLESTONE_STAIRS);
                entries.add(ModBlocks.GREY_COBBLESTONE_STAIRS);
                entries.add(ModBlocks.BLACK_COBBLESTONE_STAIRS);
                entries.add(ModBlocks.BROWN_COBBLESTONE_STAIRS);
                entries.add(ModBlocks.RED_COBBLESTONE_STAIRS);
                entries.add(ModBlocks.ORANGE_COBBLESTONE_STAIRS);
                entries.add(ModBlocks.YELLOW_COBBLESTONE_STAIRS);
                entries.add(ModBlocks.LIME_COBBLESTONE_STAIRS);
                entries.add(ModBlocks.GREEN_COBBLESTONE_STAIRS);
                entries.add(ModBlocks.CYAN_COBBLESTONE_STAIRS);
                entries.add(ModBlocks.LIGHT_BLUE_COBBLESTONE_STAIRS);
                entries.add(ModBlocks.BLUE_COBBLESTONE_STAIRS);
                entries.add(ModBlocks.PURPLE_COBBLESTONE_STAIRS);
                entries.add(ModBlocks.MAGENTA_COBBLESTONE_STAIRS);
                entries.add(ModBlocks.PINK_COBBLESTONE_STAIRS);

                entries.add(ModBlocks.WHITE_STONE_BRICK_STAIRS);
                entries.add(ModBlocks.LIGHT_GREY_STONE_BRICK_STAIRS);
                entries.add(ModBlocks.GREY_STONE_BRICK_STAIRS);
                entries.add(ModBlocks.BLACK_STONE_BRICK_STAIRS);
                entries.add(ModBlocks.BROWN_STONE_BRICK_STAIRS);
                entries.add(ModBlocks.RED_STONE_BRICK_STAIRS);
                entries.add(ModBlocks.ORANGE_STONE_BRICK_STAIRS);
                entries.add(ModBlocks.YELLOW_STONE_BRICK_STAIRS);
                entries.add(ModBlocks.LIME_STONE_BRICK_STAIRS);
                entries.add(ModBlocks.GREEN_STONE_BRICK_STAIRS);
                entries.add(ModBlocks.CYAN_STONE_BRICK_STAIRS);
                entries.add(ModBlocks.LIGHT_BLUE_STONE_BRICK_STAIRS);
                entries.add(ModBlocks.BLUE_STONE_BRICK_STAIRS);
                entries.add(ModBlocks.PURPLE_STONE_BRICK_STAIRS);
                entries.add(ModBlocks.MAGENTA_STONE_BRICK_STAIRS);
                entries.add(ModBlocks.PINK_STONE_BRICK_STAIRS);

                entries.add(ModBlocks.WHITE_MOSSY_STONE_BRICK_STAIRS);
                entries.add(ModBlocks.LIGHT_GREY_MOSSY_STONE_BRICK_STAIRS);
                entries.add(ModBlocks.GREY_MOSSY_STONE_BRICK_STAIRS);
                entries.add(ModBlocks.BLACK_MOSSY_STONE_BRICK_STAIRS);
                entries.add(ModBlocks.BROWN_MOSSY_STONE_BRICK_STAIRS);
                entries.add(ModBlocks.RED_MOSSY_STONE_BRICK_STAIRS);
                entries.add(ModBlocks.ORANGE_MOSSY_STONE_BRICK_STAIRS);
                entries.add(ModBlocks.YELLOW_MOSSY_STONE_BRICK_STAIRS);
                entries.add(ModBlocks.LIME_MOSSY_STONE_BRICK_STAIRS);
                entries.add(ModBlocks.GREEN_MOSSY_STONE_BRICK_STAIRS);
                entries.add(ModBlocks.CYAN_MOSSY_STONE_BRICK_STAIRS);
                entries.add(ModBlocks.LIGHT_BLUE_MOSSY_STONE_BRICK_STAIRS);
                entries.add(ModBlocks.BLUE_MOSSY_STONE_BRICK_STAIRS);
                entries.add(ModBlocks.PURPLE_MOSSY_STONE_BRICK_STAIRS);
                entries.add(ModBlocks.MAGENTA_MOSSY_STONE_BRICK_STAIRS);
                entries.add(ModBlocks.PINK_MOSSY_STONE_BRICK_STAIRS);

                entries.add(ModBlocks.WHITE_STONE_SLAB);
                entries.add(ModBlocks.LIGHT_GREY_STONE_SLAB);
                entries.add(ModBlocks.GREY_STONE_SLAB);
                entries.add(ModBlocks.BLACK_STONE_SLAB);
                entries.add(ModBlocks.BROWN_STONE_SLAB);
                entries.add(ModBlocks.RED_STONE_SLAB);
                entries.add(ModBlocks.ORANGE_STONE_SLAB);
                entries.add(ModBlocks.YELLOW_STONE_SLAB);
                entries.add(ModBlocks.LIME_STONE_SLAB);
                entries.add(ModBlocks.GREEN_STONE_SLAB);
                entries.add(ModBlocks.CYAN_STONE_SLAB);
                entries.add(ModBlocks.LIGHT_BLUE_STONE_SLAB);
                entries.add(ModBlocks.BLUE_STONE_SLAB);
                entries.add(ModBlocks.PURPLE_STONE_SLAB);
                entries.add(ModBlocks.MAGENTA_STONE_SLAB);
                entries.add(ModBlocks.PINK_STONE_SLAB);

                entries.add(ModBlocks.WHITE_COBBLESTONE_SLAB);
                entries.add(ModBlocks.LIGHT_GREY_COBBLESTONE_SLAB);
                entries.add(ModBlocks.GREY_COBBLESTONE_SLAB);
                entries.add(ModBlocks.BLACK_COBBLESTONE_SLAB);
                entries.add(ModBlocks.BROWN_COBBLESTONE_SLAB);
                entries.add(ModBlocks.RED_COBBLESTONE_SLAB);
                entries.add(ModBlocks.ORANGE_COBBLESTONE_SLAB);
                entries.add(ModBlocks.YELLOW_COBBLESTONE_SLAB);
                entries.add(ModBlocks.LIME_COBBLESTONE_SLAB);
                entries.add(ModBlocks.GREEN_COBBLESTONE_SLAB);
                entries.add(ModBlocks.CYAN_COBBLESTONE_SLAB);
                entries.add(ModBlocks.LIGHT_BLUE_COBBLESTONE_SLAB);
                entries.add(ModBlocks.BLUE_COBBLESTONE_SLAB);
                entries.add(ModBlocks.PURPLE_COBBLESTONE_SLAB);
                entries.add(ModBlocks.MAGENTA_COBBLESTONE_SLAB);
                entries.add(ModBlocks.PINK_COBBLESTONE_SLAB);

                entries.add(ModBlocks.WHITE_STONE_BRICK_SLAB);
                entries.add(ModBlocks.LIGHT_GREY_STONE_BRICK_SLAB);
                entries.add(ModBlocks.GREY_STONE_BRICK_SLAB);
                entries.add(ModBlocks.BLACK_STONE_BRICK_SLAB);
                entries.add(ModBlocks.BROWN_STONE_BRICK_SLAB);
                entries.add(ModBlocks.RED_STONE_BRICK_SLAB);
                entries.add(ModBlocks.ORANGE_STONE_BRICK_SLAB);
                entries.add(ModBlocks.YELLOW_STONE_BRICK_SLAB);
                entries.add(ModBlocks.LIME_STONE_BRICK_SLAB);
                entries.add(ModBlocks.GREEN_STONE_BRICK_SLAB);
                entries.add(ModBlocks.CYAN_STONE_BRICK_SLAB);
                entries.add(ModBlocks.LIGHT_BLUE_STONE_BRICK_SLAB);
                entries.add(ModBlocks.BLUE_STONE_BRICK_SLAB);
                entries.add(ModBlocks.PURPLE_STONE_BRICK_SLAB);
                entries.add(ModBlocks.MAGENTA_STONE_BRICK_SLAB);
                entries.add(ModBlocks.PINK_STONE_BRICK_SLAB);

                entries.add(ModBlocks.WHITE_MOSSY_STONE_BRICK_SLAB);
                entries.add(ModBlocks.LIGHT_GREY_MOSSY_STONE_BRICK_SLAB);
                entries.add(ModBlocks.GREY_MOSSY_STONE_BRICK_SLAB);
                entries.add(ModBlocks.BLACK_MOSSY_STONE_BRICK_SLAB);
                entries.add(ModBlocks.BROWN_MOSSY_STONE_BRICK_SLAB);
                entries.add(ModBlocks.RED_MOSSY_STONE_BRICK_SLAB);
                entries.add(ModBlocks.ORANGE_MOSSY_STONE_BRICK_SLAB);
                entries.add(ModBlocks.YELLOW_MOSSY_STONE_BRICK_SLAB);
                entries.add(ModBlocks.LIME_MOSSY_STONE_BRICK_SLAB);
                entries.add(ModBlocks.GREEN_MOSSY_STONE_BRICK_SLAB);
                entries.add(ModBlocks.CYAN_MOSSY_STONE_BRICK_SLAB);
                entries.add(ModBlocks.LIGHT_BLUE_MOSSY_STONE_BRICK_SLAB);
                entries.add(ModBlocks.BLUE_MOSSY_STONE_BRICK_SLAB);
                entries.add(ModBlocks.PURPLE_MOSSY_STONE_BRICK_SLAB);
                entries.add(ModBlocks.MAGENTA_MOSSY_STONE_BRICK_SLAB);
                entries.add(ModBlocks.PINK_MOSSY_STONE_BRICK_SLAB);

                entries.add(ModBlocks.WHITE_STONE_BUTTON);
                entries.add(ModBlocks.LIGHT_GREY_STONE_BUTTON);
                entries.add(ModBlocks.GREY_STONE_BUTTON);
                entries.add(ModBlocks.BLACK_STONE_BUTTON);
                entries.add(ModBlocks.BROWN_STONE_BUTTON);
                entries.add(ModBlocks.RED_STONE_BUTTON);
                entries.add(ModBlocks.ORANGE_STONE_BUTTON);
                entries.add(ModBlocks.YELLOW_STONE_BUTTON);
                entries.add(ModBlocks.LIME_STONE_BUTTON);
                entries.add(ModBlocks.GREEN_STONE_BUTTON);
                entries.add(ModBlocks.CYAN_STONE_BUTTON);
                entries.add(ModBlocks.LIGHT_BLUE_STONE_BUTTON);
                entries.add(ModBlocks.BLUE_STONE_BUTTON);
                entries.add(ModBlocks.PURPLE_STONE_BUTTON);
                entries.add(ModBlocks.MAGENTA_STONE_BUTTON);
                entries.add(ModBlocks.PINK_STONE_BUTTON);

                entries.add(ModBlocks.WHITE_STONE_PRESSURE_PLATE);
                entries.add(ModBlocks.LIGHT_GREY_STONE_PRESSURE_PLATE);
                entries.add(ModBlocks.GREY_STONE_PRESSURE_PLATE);
                entries.add(ModBlocks.BLACK_STONE_PRESSURE_PLATE);
                entries.add(ModBlocks.BROWN_STONE_PRESSURE_PLATE);
                entries.add(ModBlocks.RED_STONE_PRESSURE_PLATE);
                entries.add(ModBlocks.ORANGE_STONE_PRESSURE_PLATE);
                entries.add(ModBlocks.YELLOW_STONE_PRESSURE_PLATE);
                entries.add(ModBlocks.LIME_STONE_PRESSURE_PLATE);
                entries.add(ModBlocks.GREEN_STONE_PRESSURE_PLATE);
                entries.add(ModBlocks.CYAN_STONE_PRESSURE_PLATE);
                entries.add(ModBlocks.LIGHT_BLUE_STONE_PRESSURE_PLATE);
                entries.add(ModBlocks.BLUE_STONE_PRESSURE_PLATE);
                entries.add(ModBlocks.PURPLE_STONE_PRESSURE_PLATE);
                entries.add(ModBlocks.MAGENTA_STONE_PRESSURE_PLATE);
                entries.add(ModBlocks.PINK_STONE_PRESSURE_PLATE);

                entries.add(ModBlocks.WHITE_STONE_BRICK_WALL);
                entries.add(ModBlocks.LIGHT_GREY_STONE_BRICK_WALL);
                entries.add(ModBlocks.GREY_STONE_BRICK_WALL);
                entries.add(ModBlocks.BLACK_STONE_BRICK_WALL);
                entries.add(ModBlocks.BROWN_STONE_BRICK_WALL);
                entries.add(ModBlocks.RED_STONE_BRICK_WALL);
                entries.add(ModBlocks.ORANGE_STONE_BRICK_WALL);
                entries.add(ModBlocks.YELLOW_STONE_BRICK_WALL);
                entries.add(ModBlocks.LIME_STONE_BRICK_WALL);
                entries.add(ModBlocks.GREEN_STONE_BRICK_WALL);
                entries.add(ModBlocks.CYAN_STONE_BRICK_WALL);
                entries.add(ModBlocks.LIGHT_BLUE_STONE_BRICK_WALL);
                entries.add(ModBlocks.BLUE_STONE_BRICK_WALL);
                entries.add(ModBlocks.PURPLE_STONE_BRICK_WALL);
                entries.add(ModBlocks.MAGENTA_STONE_BRICK_WALL);
                entries.add(ModBlocks.PINK_STONE_BRICK_WALL);

                entries.add(ModBlocks.WHITE_COBBLESTONE_WALL);
                entries.add(ModBlocks.LIGHT_GREY_COBBLESTONE_WALL);
                entries.add(ModBlocks.GREY_COBBLESTONE_WALL);
                entries.add(ModBlocks.BLACK_COBBLESTONE_WALL);
                entries.add(ModBlocks.BROWN_COBBLESTONE_WALL);
                entries.add(ModBlocks.RED_COBBLESTONE_WALL);
                entries.add(ModBlocks.ORANGE_COBBLESTONE_WALL);
                entries.add(ModBlocks.YELLOW_COBBLESTONE_WALL);
                entries.add(ModBlocks.LIME_COBBLESTONE_WALL);
                entries.add(ModBlocks.GREEN_COBBLESTONE_WALL);
                entries.add(ModBlocks.CYAN_COBBLESTONE_WALL);
                entries.add(ModBlocks.LIGHT_BLUE_COBBLESTONE_WALL);
                entries.add(ModBlocks.BLUE_COBBLESTONE_WALL);
                entries.add(ModBlocks.PURPLE_COBBLESTONE_WALL);
                entries.add(ModBlocks.MAGENTA_COBBLESTONE_WALL);
                entries.add(ModBlocks.PINK_COBBLESTONE_WALL);

                entries.add(ModBlocks.WHITE_MOSSY_STONE_BRICK_WALL);
                entries.add(ModBlocks.LIGHT_GREY_MOSSY_STONE_BRICK_WALL);
                entries.add(ModBlocks.GREY_MOSSY_STONE_BRICK_WALL);
                entries.add(ModBlocks.BLACK_MOSSY_STONE_BRICK_WALL);
                entries.add(ModBlocks.BROWN_MOSSY_STONE_BRICK_WALL);
                entries.add(ModBlocks.RED_MOSSY_STONE_BRICK_WALL);
                entries.add(ModBlocks.ORANGE_MOSSY_STONE_BRICK_WALL);
                entries.add(ModBlocks.YELLOW_MOSSY_STONE_BRICK_WALL);
                entries.add(ModBlocks.LIME_MOSSY_STONE_BRICK_WALL);
                entries.add(ModBlocks.GREEN_MOSSY_STONE_BRICK_WALL);
                entries.add(ModBlocks.CYAN_MOSSY_STONE_BRICK_WALL);
                entries.add(ModBlocks.LIGHT_BLUE_MOSSY_STONE_BRICK_WALL);
                entries.add(ModBlocks.BLUE_MOSSY_STONE_BRICK_WALL);
                entries.add(ModBlocks.PURPLE_MOSSY_STONE_BRICK_WALL);
                entries.add(ModBlocks.MAGENTA_MOSSY_STONE_BRICK_WALL);
                entries.add(ModBlocks.PINK_MOSSY_STONE_BRICK_WALL);




                    })).build());

    public static void registerItemGroups() {
        AngelsAscent.LOGGER.info("Registering Item Groups for " + AngelsAscent.MOD_ID);
    }
}
