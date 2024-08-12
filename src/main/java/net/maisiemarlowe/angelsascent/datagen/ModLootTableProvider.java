package net.maisiemarlowe.angelsascent.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.maisiemarlowe.angelsascent.block.ModBlocks;
import net.maisiemarlowe.angelsascent.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //addDrop(ModBlocks.);

       addDrop(ModBlocks.SOUL_ORE, oreDrops(ModBlocks.SOUL_ORE, ModItems.SOUL_FRAGMENT)); //replace oreDrops with copperLikeOreDrops
       addDrop(ModBlocks.HOLY_ORE, oreDrops(ModBlocks.HOLY_ORE, ModItems.HOLY_NUGGET));
        addDrop(ModBlocks.BLASPHEMOUS_ORE, oreDrops(ModBlocks.BLASPHEMOUS_ORE, ModItems.BLASPHEMOUS_NUGGET));

        addDrop(ModBlocks.CYAN_COBBLESTONE);
        addDrop(ModBlocks.BLUE_COBBLESTONE);
        addDrop(ModBlocks.BLACK_COBBLESTONE);
        addDrop(ModBlocks.BROWN_COBBLESTONE);
        addDrop(ModBlocks.GREEN_COBBLESTONE);
        addDrop(ModBlocks.GREY_COBBLESTONE);
        addDrop(ModBlocks.LIGHT_BLUE_COBBLESTONE);
        addDrop(ModBlocks.LIGHT_GREY_COBBLESTONE);
        addDrop(ModBlocks.ORANGE_COBBLESTONE);
        addDrop(ModBlocks.MAGENTA_COBBLESTONE);
        addDrop(ModBlocks.LIME_COBBLESTONE);
        addDrop(ModBlocks.WHITE_COBBLESTONE);
        addDrop(ModBlocks.YELLOW_COBBLESTONE);
        addDrop(ModBlocks.PURPLE_COBBLESTONE);
        addDrop(ModBlocks.RED_COBBLESTONE);
        addDrop(ModBlocks.PINK_COBBLESTONE);

        addDrop(ModBlocks.CYAN_STONE_BRICKS);
        addDrop(ModBlocks.BLUE_STONE_BRICKS);
        addDrop(ModBlocks.BLACK_STONE_BRICKS);
        addDrop(ModBlocks.BROWN_STONE_BRICKS);
        addDrop(ModBlocks.GREEN_STONE_BRICKS);
        addDrop(ModBlocks.GREY_STONE_BRICKS);
        addDrop(ModBlocks.LIGHT_BLUE_STONE_BRICKS);
        addDrop(ModBlocks.LIGHT_GREY_STONE_BRICKS);
        addDrop(ModBlocks.ORANGE_STONE_BRICKS);
        addDrop(ModBlocks.MAGENTA_STONE_BRICKS);
        addDrop(ModBlocks.LIME_STONE_BRICKS);
        addDrop(ModBlocks.WHITE_STONE_BRICKS);
        addDrop(ModBlocks.YELLOW_STONE_BRICKS);
        addDrop(ModBlocks.PURPLE_STONE_BRICKS);
        addDrop(ModBlocks.RED_STONE_BRICKS);
        addDrop(ModBlocks.PINK_STONE_BRICKS);

        addDrop(ModBlocks.CYAN_STONE, drops(ModBlocks.CYAN_COBBLESTONE));
        addDrop(ModBlocks.BLUE_STONE, drops(ModBlocks.BLUE_COBBLESTONE));
        addDrop(ModBlocks.BLACK_STONE, drops(ModBlocks.BLACK_COBBLESTONE));
        addDrop(ModBlocks.BROWN_STONE, drops(ModBlocks.BROWN_COBBLESTONE));
        addDrop(ModBlocks.GREEN_STONE, drops(ModBlocks.GREEN_COBBLESTONE));
        addDrop(ModBlocks.GREY_STONE, drops(ModBlocks.GREY_COBBLESTONE));
        addDrop(ModBlocks.LIGHT_BLUE_STONE, drops(ModBlocks.LIGHT_BLUE_COBBLESTONE));
        addDrop(ModBlocks.LIGHT_GREY_STONE, drops(ModBlocks.LIGHT_GREY_COBBLESTONE));
        addDrop(ModBlocks.ORANGE_STONE, drops(ModBlocks.ORANGE_COBBLESTONE));
        addDrop(ModBlocks.MAGENTA_STONE, drops(ModBlocks.MAGENTA_COBBLESTONE));
        addDrop(ModBlocks.LIME_STONE, drops(ModBlocks.LIME_COBBLESTONE));
        addDrop(ModBlocks.WHITE_STONE, drops(ModBlocks.WHITE_COBBLESTONE));
        addDrop(ModBlocks.YELLOW_STONE, drops(ModBlocks.YELLOW_COBBLESTONE));
        addDrop(ModBlocks.PURPLE_STONE, drops(ModBlocks.PURPLE_COBBLESTONE));
        addDrop(ModBlocks.RED_STONE, drops(ModBlocks.RED_COBBLESTONE));
        addDrop(ModBlocks.PINK_STONE, drops(ModBlocks.PINK_COBBLESTONE));

        addDrop(ModBlocks.CYAN_SMOOTH_STONE);
        addDrop(ModBlocks.BLUE_SMOOTH_STONE);
        addDrop(ModBlocks.BLACK_SMOOTH_STONE);
        addDrop(ModBlocks.BROWN_SMOOTH_STONE);
        addDrop(ModBlocks.GREEN_SMOOTH_STONE);
        addDrop(ModBlocks.GREY_SMOOTH_STONE);
        addDrop(ModBlocks.LIGHT_BLUE_SMOOTH_STONE);
        addDrop(ModBlocks.LIGHT_GREY_SMOOTH_STONE);
        addDrop(ModBlocks.ORANGE_SMOOTH_STONE);
        addDrop(ModBlocks.MAGENTA_SMOOTH_STONE);
        addDrop(ModBlocks.LIME_SMOOTH_STONE);
        addDrop(ModBlocks.WHITE_SMOOTH_STONE);
        addDrop(ModBlocks.YELLOW_SMOOTH_STONE);
        addDrop(ModBlocks.PURPLE_SMOOTH_STONE);
        addDrop(ModBlocks.RED_SMOOTH_STONE);
        addDrop(ModBlocks.PINK_SMOOTH_STONE);

        addDrop(ModBlocks.CYAN_CRACKED_STONE_BRICKS);
        addDrop(ModBlocks.BLUE_CRACKED_STONE_BRICKS);
        addDrop(ModBlocks.BLACK_CRACKED_STONE_BRICKS);
        addDrop(ModBlocks.BROWN_CRACKED_STONE_BRICKS);
        addDrop(ModBlocks.GREEN_CRACKED_STONE_BRICKS);
        addDrop(ModBlocks.GREY_CRACKED_STONE_BRICKS);
        addDrop(ModBlocks.LIGHT_BLUE_CRACKED_STONE_BRICKS);
        addDrop(ModBlocks.LIGHT_GREY_CRACKED_STONE_BRICKS);
        addDrop(ModBlocks.ORANGE_CRACKED_STONE_BRICKS);
        addDrop(ModBlocks.MAGENTA_CRACKED_STONE_BRICKS);
        addDrop(ModBlocks.LIME_CRACKED_STONE_BRICKS);
        addDrop(ModBlocks.WHITE_CRACKED_STONE_BRICKS);
        addDrop(ModBlocks.YELLOW_CRACKED_STONE_BRICKS);
        addDrop(ModBlocks.PURPLE_CRACKED_STONE_BRICKS);
        addDrop(ModBlocks.RED_CRACKED_STONE_BRICKS);
        addDrop(ModBlocks.PINK_CRACKED_STONE_BRICKS);

        addDrop(ModBlocks.CYAN_CHISELED_STONE_BRICKS);
        addDrop(ModBlocks.BLUE_CHISELED_STONE_BRICKS);
        addDrop(ModBlocks.BLACK_CHISELED_STONE_BRICKS);
        addDrop(ModBlocks.BROWN_CHISELED_STONE_BRICKS);
        addDrop(ModBlocks.GREEN_CHISELED_STONE_BRICKS);
        addDrop(ModBlocks.GREY_CHISELED_STONE_BRICKS);
        addDrop(ModBlocks.LIGHT_BLUE_CHISELED_STONE_BRICKS);
        addDrop(ModBlocks.LIGHT_GREY_CHISELED_STONE_BRICKS);
        addDrop(ModBlocks.ORANGE_CHISELED_STONE_BRICKS);
        addDrop(ModBlocks.MAGENTA_CHISELED_STONE_BRICKS);
        addDrop(ModBlocks.LIME_CHISELED_STONE_BRICKS);
        addDrop(ModBlocks.WHITE_CHISELED_STONE_BRICKS);
        addDrop(ModBlocks.YELLOW_CHISELED_STONE_BRICKS);
        addDrop(ModBlocks.PURPLE_CHISELED_STONE_BRICKS);
        addDrop(ModBlocks.RED_CHISELED_STONE_BRICKS);
        addDrop(ModBlocks.PINK_CHISELED_STONE_BRICKS);

        addDrop(ModBlocks.CYAN_MOSSY_STONE_BRICKS);
        addDrop(ModBlocks.BLUE_MOSSY_STONE_BRICKS);
        addDrop(ModBlocks.BLACK_MOSSY_STONE_BRICKS);
        addDrop(ModBlocks.BROWN_MOSSY_STONE_BRICKS);
        addDrop(ModBlocks.GREEN_MOSSY_STONE_BRICKS);
        addDrop(ModBlocks.GREY_MOSSY_STONE_BRICKS);
        addDrop(ModBlocks.LIGHT_BLUE_MOSSY_STONE_BRICKS);
        addDrop(ModBlocks.LIGHT_GREY_MOSSY_STONE_BRICKS);
        addDrop(ModBlocks.ORANGE_MOSSY_STONE_BRICKS);
        addDrop(ModBlocks.MAGENTA_MOSSY_STONE_BRICKS);
        addDrop(ModBlocks.LIME_MOSSY_STONE_BRICKS);
        addDrop(ModBlocks.WHITE_MOSSY_STONE_BRICKS);
        addDrop(ModBlocks.YELLOW_MOSSY_STONE_BRICKS);
        addDrop(ModBlocks.PURPLE_MOSSY_STONE_BRICKS);
        addDrop(ModBlocks.RED_MOSSY_STONE_BRICKS);
        addDrop(ModBlocks.PINK_MOSSY_STONE_BRICKS);

        addDrop(ModBlocks.CYAN_STONE_STAIRS);
        addDrop(ModBlocks.BLUE_STONE_STAIRS);
        addDrop(ModBlocks.BLACK_STONE_STAIRS);
        addDrop(ModBlocks.BROWN_STONE_STAIRS);
        addDrop(ModBlocks.GREEN_STONE_STAIRS);
        addDrop(ModBlocks.GREY_STONE_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_STONE_STAIRS);
        addDrop(ModBlocks.LIGHT_GREY_STONE_STAIRS);
        addDrop(ModBlocks.MAGENTA_STONE_STAIRS);
        addDrop(ModBlocks.LIME_STONE_STAIRS);
        addDrop(ModBlocks.WHITE_STONE_STAIRS);
        addDrop(ModBlocks.YELLOW_STONE_STAIRS);
        addDrop(ModBlocks.PURPLE_STONE_STAIRS);
        addDrop(ModBlocks.RED_STONE_STAIRS);
        addDrop(ModBlocks.PINK_STONE_STAIRS);

        addDrop(ModBlocks.CYAN_COBBLESTONE_STAIRS);
        addDrop(ModBlocks.BLUE_COBBLESTONE_STAIRS);
        addDrop(ModBlocks.BLACK_COBBLESTONE_STAIRS);
        addDrop(ModBlocks.BROWN_COBBLESTONE_STAIRS);
        addDrop(ModBlocks.GREEN_COBBLESTONE_STAIRS);
        addDrop(ModBlocks.GREY_COBBLESTONE_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_COBBLESTONE_STAIRS);
        addDrop(ModBlocks.LIGHT_GREY_COBBLESTONE_STAIRS);
        addDrop(ModBlocks.MAGENTA_COBBLESTONE_STAIRS);
        addDrop(ModBlocks.LIME_COBBLESTONE_STAIRS);
        addDrop(ModBlocks.WHITE_COBBLESTONE_STAIRS);
        addDrop(ModBlocks.YELLOW_COBBLESTONE_STAIRS);
        addDrop(ModBlocks.PURPLE_COBBLESTONE_STAIRS);
        addDrop(ModBlocks.RED_COBBLESTONE_STAIRS);
        addDrop(ModBlocks.PINK_COBBLESTONE_STAIRS);

        addDrop(ModBlocks.CYAN_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.BLUE_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.BLACK_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.BROWN_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.GREEN_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.GREY_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.LIGHT_GREY_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.MAGENTA_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.LIME_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.WHITE_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.YELLOW_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.PURPLE_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.RED_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.PINK_STONE_BRICK_STAIRS);

        addDrop(ModBlocks.CYAN_MOSSY_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.BLUE_MOSSY_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.BLACK_MOSSY_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.BROWN_MOSSY_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.GREEN_MOSSY_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.GREY_MOSSY_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_MOSSY_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.LIGHT_GREY_MOSSY_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.MAGENTA_MOSSY_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.LIME_MOSSY_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.WHITE_MOSSY_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.YELLOW_MOSSY_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.PURPLE_MOSSY_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.RED_MOSSY_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.PINK_MOSSY_STONE_BRICK_STAIRS);

        addDrop(ModBlocks.CYAN_STONE_SLAB, slabDrops(ModBlocks.CYAN_STONE_SLAB));
        addDrop(ModBlocks.BLUE_STONE_SLAB, slabDrops(ModBlocks.BLUE_STONE_SLAB));
        addDrop(ModBlocks.BLACK_STONE_SLAB, slabDrops(ModBlocks.BLACK_STONE_SLAB));
        addDrop(ModBlocks.BROWN_STONE_SLAB, slabDrops(ModBlocks.BROWN_STONE_SLAB));
        addDrop(ModBlocks.GREEN_STONE_SLAB, slabDrops(ModBlocks.GREEN_STONE_SLAB));
        addDrop(ModBlocks.GREY_STONE_SLAB, slabDrops(ModBlocks.GREY_STONE_SLAB));
        addDrop(ModBlocks.LIGHT_BLUE_STONE_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_STONE_SLAB));
        addDrop(ModBlocks.LIGHT_GREY_STONE_SLAB, slabDrops(ModBlocks.LIGHT_GREY_STONE_SLAB));
        addDrop(ModBlocks.MAGENTA_STONE_SLAB, slabDrops(ModBlocks.MAGENTA_STONE_SLAB));
        addDrop(ModBlocks.LIME_STONE_SLAB, slabDrops(ModBlocks.LIME_STONE_SLAB));
        addDrop(ModBlocks.WHITE_STONE_SLAB, slabDrops(ModBlocks.WHITE_STONE_SLAB));
        addDrop(ModBlocks.YELLOW_STONE_SLAB, slabDrops(ModBlocks.YELLOW_STONE_SLAB));
        addDrop(ModBlocks.PURPLE_STONE_SLAB, slabDrops(ModBlocks.PURPLE_STONE_SLAB));
        addDrop(ModBlocks.RED_STONE_SLAB, slabDrops(ModBlocks.RED_STONE_SLAB));
        addDrop(ModBlocks.PINK_STONE_SLAB, slabDrops(ModBlocks.PINK_STONE_SLAB));

        addDrop(ModBlocks.CYAN_COBBLESTONE_SLAB, slabDrops(ModBlocks.CYAN_COBBLESTONE_SLAB));
        addDrop(ModBlocks.BLUE_COBBLESTONE_SLAB, slabDrops(ModBlocks.BLUE_COBBLESTONE_SLAB));
        addDrop(ModBlocks.BLACK_COBBLESTONE_SLAB, slabDrops(ModBlocks.BLACK_COBBLESTONE_SLAB));
        addDrop(ModBlocks.BROWN_COBBLESTONE_SLAB, slabDrops(ModBlocks.BROWN_COBBLESTONE_SLAB));
        addDrop(ModBlocks.GREEN_COBBLESTONE_SLAB, slabDrops(ModBlocks.GREEN_COBBLESTONE_SLAB));
        addDrop(ModBlocks.GREY_COBBLESTONE_SLAB, slabDrops(ModBlocks.GREY_COBBLESTONE_SLAB));
        addDrop(ModBlocks.LIGHT_BLUE_COBBLESTONE_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_COBBLESTONE_SLAB));
        addDrop(ModBlocks.LIGHT_GREY_COBBLESTONE_SLAB, slabDrops(ModBlocks.LIGHT_GREY_COBBLESTONE_SLAB));
        addDrop(ModBlocks.MAGENTA_COBBLESTONE_SLAB, slabDrops(ModBlocks.MAGENTA_COBBLESTONE_SLAB));
        addDrop(ModBlocks.LIME_COBBLESTONE_SLAB, slabDrops(ModBlocks.LIME_COBBLESTONE_SLAB));
        addDrop(ModBlocks.WHITE_COBBLESTONE_SLAB, slabDrops(ModBlocks.WHITE_COBBLESTONE_SLAB));
        addDrop(ModBlocks.YELLOW_COBBLESTONE_SLAB, slabDrops(ModBlocks.YELLOW_COBBLESTONE_SLAB));
        addDrop(ModBlocks.PURPLE_COBBLESTONE_SLAB, slabDrops(ModBlocks.PURPLE_COBBLESTONE_SLAB));
        addDrop(ModBlocks.RED_COBBLESTONE_SLAB, slabDrops(ModBlocks.RED_COBBLESTONE_SLAB));
        addDrop(ModBlocks.PINK_COBBLESTONE_SLAB, slabDrops(ModBlocks.PINK_COBBLESTONE_SLAB));

        addDrop(ModBlocks.CYAN_STONE_BRICK_SLAB, slabDrops(ModBlocks.CYAN_STONE_BRICK_SLAB));
        addDrop(ModBlocks.BLUE_STONE_BRICK_SLAB, slabDrops(ModBlocks.BLUE_STONE_BRICK_SLAB));
        addDrop(ModBlocks.BLACK_STONE_BRICK_SLAB, slabDrops(ModBlocks.BLACK_STONE_BRICK_SLAB));
        addDrop(ModBlocks.BROWN_STONE_BRICK_SLAB, slabDrops(ModBlocks.BROWN_STONE_BRICK_SLAB));
        addDrop(ModBlocks.GREEN_STONE_BRICK_SLAB, slabDrops(ModBlocks.GREEN_STONE_BRICK_SLAB));
        addDrop(ModBlocks.GREY_STONE_BRICK_SLAB, slabDrops(ModBlocks.GREY_STONE_BRICK_SLAB));
        addDrop(ModBlocks.LIGHT_BLUE_STONE_BRICK_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_STONE_BRICK_SLAB));
        addDrop(ModBlocks.LIGHT_GREY_STONE_BRICK_SLAB, slabDrops(ModBlocks.LIGHT_GREY_STONE_BRICK_SLAB));
        addDrop(ModBlocks.MAGENTA_STONE_BRICK_SLAB, slabDrops(ModBlocks.MAGENTA_STONE_BRICK_SLAB));
        addDrop(ModBlocks.LIME_STONE_BRICK_SLAB, slabDrops(ModBlocks.LIME_STONE_BRICK_SLAB));
        addDrop(ModBlocks.WHITE_STONE_BRICK_SLAB, slabDrops(ModBlocks.WHITE_STONE_BRICK_SLAB));
        addDrop(ModBlocks.YELLOW_STONE_BRICK_SLAB, slabDrops(ModBlocks.YELLOW_STONE_BRICK_SLAB));
        addDrop(ModBlocks.PURPLE_STONE_BRICK_SLAB, slabDrops(ModBlocks.PURPLE_STONE_BRICK_SLAB));
        addDrop(ModBlocks.RED_STONE_BRICK_SLAB, slabDrops(ModBlocks.RED_STONE_BRICK_SLAB));
        addDrop(ModBlocks.PINK_STONE_BRICK_SLAB, slabDrops(ModBlocks.PINK_STONE_BRICK_SLAB));

        addDrop(ModBlocks.CYAN_MOSSY_STONE_BRICK_SLAB, slabDrops(ModBlocks.CYAN_MOSSY_STONE_BRICK_SLAB));
        addDrop(ModBlocks.BLUE_MOSSY_STONE_BRICK_SLAB, slabDrops(ModBlocks.BLUE_MOSSY_STONE_BRICK_SLAB));
        addDrop(ModBlocks.BLACK_MOSSY_STONE_BRICK_SLAB, slabDrops(ModBlocks.BLACK_MOSSY_STONE_BRICK_SLAB));
        addDrop(ModBlocks.BROWN_MOSSY_STONE_BRICK_SLAB, slabDrops(ModBlocks.BROWN_MOSSY_STONE_BRICK_SLAB));
        addDrop(ModBlocks.GREEN_MOSSY_STONE_BRICK_SLAB, slabDrops(ModBlocks.GREEN_MOSSY_STONE_BRICK_SLAB));
        addDrop(ModBlocks.GREY_MOSSY_STONE_BRICK_SLAB, slabDrops(ModBlocks.GREY_MOSSY_STONE_BRICK_SLAB));
        addDrop(ModBlocks.LIGHT_BLUE_MOSSY_STONE_BRICK_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_MOSSY_STONE_BRICK_SLAB));
        addDrop(ModBlocks.LIGHT_GREY_MOSSY_STONE_BRICK_SLAB, slabDrops(ModBlocks.LIGHT_GREY_MOSSY_STONE_BRICK_SLAB));
        addDrop(ModBlocks.MAGENTA_MOSSY_STONE_BRICK_SLAB, slabDrops(ModBlocks.MAGENTA_MOSSY_STONE_BRICK_SLAB));
        addDrop(ModBlocks.LIME_MOSSY_STONE_BRICK_SLAB, slabDrops(ModBlocks.LIME_MOSSY_STONE_BRICK_SLAB));
        addDrop(ModBlocks.WHITE_MOSSY_STONE_BRICK_SLAB, slabDrops(ModBlocks.WHITE_MOSSY_STONE_BRICK_SLAB));
        addDrop(ModBlocks.YELLOW_MOSSY_STONE_BRICK_SLAB, slabDrops(ModBlocks.YELLOW_MOSSY_STONE_BRICK_SLAB));
        addDrop(ModBlocks.PURPLE_MOSSY_STONE_BRICK_SLAB, slabDrops(ModBlocks.PURPLE_MOSSY_STONE_BRICK_SLAB));
        addDrop(ModBlocks.RED_MOSSY_STONE_BRICK_SLAB, slabDrops(ModBlocks.RED_MOSSY_STONE_BRICK_SLAB));
        addDrop(ModBlocks.PINK_MOSSY_STONE_BRICK_SLAB, slabDrops(ModBlocks.PINK_MOSSY_STONE_BRICK_SLAB));

//        addDrop(ModBlocks.CYAN_SMOOTH_STONE_SLAB);
//        addDrop(ModBlocks.BLUE_SMOOTH_STONE_SLAB);
//        addDrop(ModBlocks.BLACK_SMOOTH_STONE_SLAB);
//        addDrop(ModBlocks.BROWN_SMOOTH_STONE_SLAB);
//        addDrop(ModBlocks.GREEN_SMOOTH_STONE_SLAB);
//        addDrop(ModBlocks.GREY_SMOOTH_STONE_SLAB);
//        addDrop(ModBlocks.LIGHT_BLUE_SMOOTH_STONE_SLAB);
//        addDrop(ModBlocks.LIGHT_GREY_SMOOTH_STONE_SLAB);
//        addDrop(ModBlocks.MAGENTA_SMOOTH_STONE_SLAB);
//        addDrop(ModBlocks.LIME_SMOOTH_STONE_SLAB);
//        addDrop(ModBlocks.WHITE_SMOOTH_STONE_SLAB);
//        addDrop(ModBlocks.YELLOW_SMOOTH_STONE_SLAB);
//        addDrop(ModBlocks.PURPLE_SMOOTH_STONE_SLAB);
//        addDrop(ModBlocks.RED_SMOOTH_STONE_SLAB);
//        addDrop(ModBlocks.PINK_SMOOTH_STONE_SLAB);

         addDrop(ModBlocks.CYAN_STONE_BUTTON);
         addDrop(ModBlocks.BLUE_STONE_BUTTON);
         addDrop(ModBlocks.BLACK_STONE_BUTTON);
         addDrop(ModBlocks.BROWN_STONE_BUTTON);
         addDrop(ModBlocks.GREEN_STONE_BUTTON);
         addDrop(ModBlocks.GREY_STONE_BUTTON);
         addDrop(ModBlocks.LIGHT_BLUE_STONE_BUTTON);
         addDrop(ModBlocks.LIGHT_GREY_STONE_BUTTON);
         addDrop(ModBlocks.MAGENTA_STONE_BUTTON);
         addDrop(ModBlocks.LIME_STONE_BUTTON);
         addDrop(ModBlocks.WHITE_STONE_BUTTON);
         addDrop(ModBlocks.YELLOW_STONE_BUTTON);
         addDrop(ModBlocks.PURPLE_STONE_BUTTON);
         addDrop(ModBlocks.RED_STONE_BUTTON);
         addDrop(ModBlocks.PINK_STONE_BUTTON);

         addDrop(ModBlocks.CYAN_STONE_PRESSURE_PLATE);
         addDrop(ModBlocks.BLUE_STONE_PRESSURE_PLATE);
         addDrop(ModBlocks.BLACK_STONE_PRESSURE_PLATE);
         addDrop(ModBlocks.BROWN_STONE_PRESSURE_PLATE);
         addDrop(ModBlocks.GREEN_STONE_PRESSURE_PLATE);
         addDrop(ModBlocks.GREY_STONE_PRESSURE_PLATE);
         addDrop(ModBlocks.LIGHT_BLUE_STONE_PRESSURE_PLATE);
         addDrop(ModBlocks.LIGHT_GREY_STONE_PRESSURE_PLATE);
         addDrop(ModBlocks.MAGENTA_STONE_PRESSURE_PLATE);
         addDrop(ModBlocks.LIME_STONE_PRESSURE_PLATE);
         addDrop(ModBlocks.WHITE_STONE_PRESSURE_PLATE);
         addDrop(ModBlocks.YELLOW_STONE_PRESSURE_PLATE);
         addDrop(ModBlocks.PURPLE_STONE_PRESSURE_PLATE);
         addDrop(ModBlocks.RED_STONE_PRESSURE_PLATE);
         addDrop(ModBlocks.PINK_STONE_PRESSURE_PLATE);

         addDrop(ModBlocks.CYAN_STONE_BRICK_WALL);
         addDrop(ModBlocks.BLUE_STONE_BRICK_WALL);
         addDrop(ModBlocks.BLACK_STONE_BRICK_WALL);
         addDrop(ModBlocks.BROWN_STONE_BRICK_WALL);
         addDrop(ModBlocks.GREEN_STONE_BRICK_WALL);
         addDrop(ModBlocks.GREY_STONE_BRICK_WALL);
         addDrop(ModBlocks.LIGHT_BLUE_STONE_BRICK_WALL);
         addDrop(ModBlocks.LIGHT_GREY_STONE_BRICK_WALL);
         addDrop(ModBlocks.MAGENTA_STONE_BRICK_WALL);
         addDrop(ModBlocks.LIME_STONE_BRICK_WALL);
         addDrop(ModBlocks.WHITE_STONE_BRICK_WALL);
         addDrop(ModBlocks.YELLOW_STONE_BRICK_WALL);
         addDrop(ModBlocks.PURPLE_STONE_BRICK_WALL);
         addDrop(ModBlocks.RED_STONE_BRICK_WALL);
         addDrop(ModBlocks.PINK_STONE_BRICK_WALL);

         addDrop(ModBlocks.CYAN_COBBLESTONE_WALL);
         addDrop(ModBlocks.BLUE_COBBLESTONE_WALL);
         addDrop(ModBlocks.BLACK_COBBLESTONE_WALL);
         addDrop(ModBlocks.BROWN_COBBLESTONE_WALL);
         addDrop(ModBlocks.GREEN_COBBLESTONE_WALL);
         addDrop(ModBlocks.GREY_COBBLESTONE_WALL);
         addDrop(ModBlocks.LIGHT_BLUE_COBBLESTONE_WALL);
         addDrop(ModBlocks.LIGHT_GREY_COBBLESTONE_WALL);
         addDrop(ModBlocks.MAGENTA_COBBLESTONE_WALL);
         addDrop(ModBlocks.LIME_COBBLESTONE_WALL);
         addDrop(ModBlocks.WHITE_COBBLESTONE_WALL);
         addDrop(ModBlocks.YELLOW_COBBLESTONE_WALL);
         addDrop(ModBlocks.PURPLE_COBBLESTONE_WALL);
         addDrop(ModBlocks.RED_COBBLESTONE_WALL);
         addDrop(ModBlocks.PINK_COBBLESTONE_WALL);

         addDrop(ModBlocks.WHITE_MOSSY_STONE_BRICK_WALL);
         addDrop(ModBlocks.LIGHT_GREY_MOSSY_STONE_BRICK_WALL);
         addDrop(ModBlocks.GREY_MOSSY_STONE_BRICK_WALL);
         addDrop(ModBlocks.BLACK_MOSSY_STONE_BRICK_WALL);
         addDrop(ModBlocks.BROWN_MOSSY_STONE_BRICK_WALL);
         addDrop(ModBlocks.RED_MOSSY_STONE_BRICK_WALL);
         addDrop(ModBlocks.ORANGE_MOSSY_STONE_BRICK_WALL);
         addDrop(ModBlocks.YELLOW_MOSSY_STONE_BRICK_WALL);
         addDrop(ModBlocks.LIME_MOSSY_STONE_BRICK_WALL);
         addDrop(ModBlocks.GREEN_MOSSY_STONE_BRICK_WALL);
         addDrop(ModBlocks.CYAN_MOSSY_STONE_BRICK_WALL);
         addDrop(ModBlocks.LIGHT_BLUE_MOSSY_STONE_BRICK_WALL);
         addDrop(ModBlocks.BLUE_MOSSY_STONE_BRICK_WALL);
         addDrop(ModBlocks.PURPLE_MOSSY_STONE_BRICK_WALL);
         addDrop(ModBlocks.MAGENTA_MOSSY_STONE_BRICK_WALL);
         addDrop(ModBlocks.PINK_MOSSY_STONE_BRICK_WALL);






    }

    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder) this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(2.0f, 5.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
