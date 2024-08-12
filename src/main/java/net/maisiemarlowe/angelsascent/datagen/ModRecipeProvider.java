package net.maisiemarlowe.angelsascent.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.maisiemarlowe.angelsascent.AngelsAscent;
import net.maisiemarlowe.angelsascent.block.ModBlocks;
import net.maisiemarlowe.angelsascent.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {

    private static final List<ItemConvertible> ORE_SMELTABLES = List.of(ModBlocks.SOUL_ORE, ModBlocks.HOLY_ORE, ModBlocks.BLASPHEMOUS_ORE);
    private static final List<ItemConvertible> ORE_BLASTABLES = List.of(ModBlocks.SOUL_ORE, ModBlocks.HOLY_ORE, ModBlocks.BLASPHEMOUS_ORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, ORE_SMELTABLES, RecipeCategory.MISC, ModBlocks.SOUL_ORE, 0.7f, 200, "");
        offerSmelting(exporter, ORE_SMELTABLES, RecipeCategory.MISC, ModBlocks.HOLY_ORE, 2.3f, 400, "");
        offerSmelting(exporter, ORE_SMELTABLES, RecipeCategory.MISC, ModBlocks.BLASPHEMOUS_ORE, 3.1f, 600, "");

        offerBlasting(exporter, ORE_BLASTABLES, RecipeCategory.MISC, ModBlocks.SOUL_ORE, 0.9f, 150, "");
        offerBlasting(exporter, ORE_BLASTABLES, RecipeCategory.MISC, ModBlocks.HOLY_ORE, 3f, 350, "");
        offerBlasting(exporter, ORE_BLASTABLES, RecipeCategory.MISC, ModBlocks.BLASPHEMOUS_ORE, 4f, 550, "");

        offerSmelting(exporter, List.of(ModItems.ENDER_SHARD), RecipeCategory.MISC, ModItems.PURIFIED_ENDER_SHARD, 3.3f, 469, "");
        offerBlasting(exporter, List.of(ModItems.ENDER_SHARD), RecipeCategory.MISC, ModItems.PURIFIED_ENDER_SHARD, 3.9f, 386, "");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PURIFIED_EYE_OF_ENDER, 1)
                .pattern("PPP")
                .pattern("PUS")
                .pattern("SSS")
                .input('P', ModItems.PURIFIED_ENDER_SHARD)
                .input('S', ModItems.SOUL_POWDER)
                .input('U', ModItems.ULTRA_COMPRESSED_ENDER_PEARL)
                .criterion(hasItem(ModItems.PURIFIED_ENDER_SHARD), conditionsFromItem(ModItems.PURIFIED_ENDER_SHARD))
                .criterion(hasItem(ModItems.ULTRA_COMPRESSED_ENDER_PEARL), conditionsFromItem(ModItems.ULTRA_COMPRESSED_ENDER_PEARL))
                .criterion(hasItem(ModItems.SOUL_POWDER), conditionsFromItem(ModItems.SOUL_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PURIFIED_EYE_OF_ENDER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COMPRESSED_ENDER_PEARL, 1)
                .pattern("   ")
                .pattern("EE ")
                .pattern("EE ")
                .input('E', Items.ENDER_PEARL)
                .criterion(hasItem(Items.ENDER_PEARL), conditionsFromItem(Items.ENDER_PEARL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COMPRESSED_ENDER_PEARL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DOUBLE_COMPRESSED_ENDER_PEARL, 1)
                .pattern("   ")
                .pattern("CC ")
                .pattern("CC ")
                .input('C', ModItems.COMPRESSED_ENDER_PEARL)
                .criterion(hasItem(ModItems.COMPRESSED_ENDER_PEARL), conditionsFromItem(ModItems.COMPRESSED_ENDER_PEARL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DOUBLE_COMPRESSED_ENDER_PEARL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TRIPLE_COMPRESSED_ENDER_PEARL, 1)
                .pattern("   ")
                .pattern("DD ")
                .pattern("DD ")
                .input('D', ModItems.DOUBLE_COMPRESSED_ENDER_PEARL)
                .criterion(hasItem(ModItems.DOUBLE_COMPRESSED_ENDER_PEARL), conditionsFromItem(ModItems.DOUBLE_COMPRESSED_ENDER_PEARL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TRIPLE_COMPRESSED_ENDER_PEARL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ULTRA_COMPRESSED_ENDER_PEARL, 1)
                .pattern("   ")
                .pattern("UU ")
                .pattern("UU ")
                .input('U', ModItems.TRIPLE_COMPRESSED_ENDER_PEARL)
                .criterion(hasItem(ModItems.TRIPLE_COMPRESSED_ENDER_PEARL), conditionsFromItem(ModItems.TRIPLE_COMPRESSED_ENDER_PEARL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ULTRA_COMPRESSED_ENDER_PEARL)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.HOLY_AXE, 1)
                .pattern("II ")
                .pattern("IS ")
                .pattern(" S ")
                .input('I', ModItems.HOLY_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.HOLY_INGOT), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HOLY_AXE)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.HOLY_PICKAXE, 1)
                .pattern("III")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', ModItems.HOLY_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.HOLY_INGOT), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HOLY_PICKAXE)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.HOLY_SWORD, 1)
                .pattern(" I ")
                .pattern(" I ")
                .pattern(" S ")
                .input('I', ModItems.HOLY_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.HOLY_INGOT), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HOLY_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.HOLY_HOE, 1)
                .pattern("II ")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', ModItems.HOLY_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.HOLY_INGOT), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HOLY_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.HOLY_SHOVEL, 1)
                .pattern(" I ")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', ModItems.HOLY_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.HOLY_INGOT), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HOLY_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BLASPHEMOUS_AXE, 1)
                .pattern("II ")
                .pattern("IS ")
                .pattern(" S ")
                .input('I', ModItems.BLASPHEMOUS_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.BLASPHEMOUS_INGOT), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BLASPHEMOUS_AXE)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BLASPHEMOUS_PICKAXE, 1)
                .pattern("III")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', ModItems.BLASPHEMOUS_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.BLASPHEMOUS_INGOT), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BLASPHEMOUS_PICKAXE)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BLASPHEMOUS_SWORD, 1)
                .pattern(" I ")
                .pattern(" I ")
                .pattern(" S ")
                .input('I', ModItems.BLASPHEMOUS_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.BLASPHEMOUS_INGOT), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BLASPHEMOUS_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BLASPHEMOUS_HOE, 1)
                .pattern("II ")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', ModItems.BLASPHEMOUS_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.BLASPHEMOUS_INGOT), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BLASPHEMOUS_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BLASPHEMOUS_SHOVEL, 1)
                .pattern(" I ")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', ModItems.BLASPHEMOUS_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.BLASPHEMOUS_INGOT), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BLASPHEMOUS_SHOVEL)));


        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SOUL_POWDER, 1)
                .input(ModItems.SOUL_FRAGMENT, 1)
                .criterion(hasItem(ModItems.SOUL_POWDER), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SOUL_POWDER)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, ModItems.HOLY_WINGS, 1)
                .pattern("PIP")
                .pattern("MEM")
                .pattern("I I")
                .input('I', ModItems.HOLY_INGOT)
                .input('P', ModItems.PURIFIED_EYE_OF_ENDER)
                .input('E', Items.ELYTRA)
                .input('M', Items.PHANTOM_MEMBRANE)
                .criterion(hasItem(ModItems.HOLY_INGOT), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HOLY_WINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, ModItems.BLASPHEMOUS_WINGS, 1)
                .pattern("PIP")
                .pattern("MAM")
                .pattern("I I")
                .input('I', ModItems.BLASPHEMOUS_INGOT)
                .input('P', ModItems.PURIFIED_EYE_OF_ENDER)
                .input('A', ModItems.HOLY_WINGS)
                .input('M', Items.PHANTOM_MEMBRANE)
                .criterion(hasItem(ModItems.BLASPHEMOUS_INGOT), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BLASPHEMOUS_WINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLASPHEMOUS_INGOT, 1)
                .pattern("NNN")
                .pattern("NHN")
                .pattern("NNN")
                .input('N', ModItems.BLASPHEMOUS_NUGGET)
                .input('H', ModItems.HOLY_INGOT)
                .criterion(hasItem(ModItems.HOLY_INGOT), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BLASPHEMOUS_INGOT)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HOLY_INGOT, 1)
                .pattern("NNN")
                .pattern("NPN")
                .pattern("NNN")
                .input('N', ModItems.HOLY_NUGGET)
                .input('P', ModItems.PURIFIED_EYE_OF_ENDER)
                .criterion(hasItem(ModItems.HOLY_NUGGET), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HOLY_INGOT)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SOUL_DRILL, 1)
                .pattern("  D")
                .pattern("FPF")
                .pattern("FF ")
                .input('F', ModItems.SOUL_FRAGMENT)
                .input('P', ModItems.SOUL_POWDER)
                .input('D', Items.DIAMOND)
                .criterion(hasItem(ModItems.SOUL_POWDER), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SOUL_DRILL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLASPHEMOUS_DRILL, 1)
                .pattern("  N")
                .pattern("BHB")
                .pattern("BB ")
                .input('B', ModItems.BLASPHEMOUS_INGOT)
                .input('N', ModItems.BLASPHEMOUS_NUGGET)
                .input('H', ModItems.HOLY_INGOT)
                .criterion(hasItem(ModItems.BLASPHEMOUS_INGOT), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BLASPHEMOUS_DRILL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HALO, 1)
                .pattern("HHH")
                .pattern("   ")
                .pattern("   ")
                .input('H', ModItems.HOLY_INGOT)
                .criterion(hasItem(ModItems.HOLY_INGOT), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HALO)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.COMPRESSOR_BLOCK, 1)
                .pattern("BBB")
                .pattern("FPF")
                .pattern("BEB")
                .input('B', Items.STONE_BRICKS)
                .input('P', Items.PISTON)
                .input('E', ModItems.PURIFIED_EYE_OF_ENDER)
                .input('F', Items.FURNACE)
                .criterion(hasItem(ModItems.PURIFIED_EYE_OF_ENDER), conditionsFromItem(Items.PISTON))
                .offerTo(exporter, new Identifier(AngelsAscent.MOD_ID, "compressor_block_recipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.COMPRESSOR_BLOCK, 1)
                .pattern("BBB")
                .pattern("FPF")
                .pattern("BEB")
                .input('B', Items.STONE_BRICKS)
                .input('P', Items.STICKY_PISTON)
                .input('E', ModItems.PURIFIED_EYE_OF_ENDER)
                .input('F', Items.FURNACE)
                .criterion(hasItem(ModItems.PURIFIED_EYE_OF_ENDER), conditionsFromItem(Items.STICKY_PISTON))
                .offerTo(exporter, new Identifier(AngelsAscent.MOD_ID, "compressor_block_recipe_2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HOLY_CARROT, 1)
                .pattern("NNN")
                .pattern("NCN")
                .pattern("NNN")
                .input('C', Items.CARROT)
                .input('N', ModItems.HOLY_NUGGET)
                .criterion(hasItem(ModItems.HOLY_NUGGET), conditionsFromItem(Items.CARROT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HOLY_CARROT)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLASPHEMOUS_CARROT, 1)
                .pattern("NNN")
                .pattern("NCN")
                .pattern("NNN")
                .input('C', Items.CARROT)
                .input('N', ModItems.BLASPHEMOUS_NUGGET)
                .criterion(hasItem(ModItems.BLASPHEMOUS_NUGGET), conditionsFromItem(Items.CARROT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BLASPHEMOUS_CARROT)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_COBBLESTONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE)
                .input('D', Items.WHITE_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_COBBLESTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CHISELED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.CHISELED_STONE_BRICKS)
                .input('D', Items.WHITE_DYE)
                .criterion(hasItem(Blocks.CHISELED_STONE_BRICKS), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_CHISELED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GREY_CHISELED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.CHISELED_STONE_BRICKS)
                .input('D', Items.LIGHT_GRAY_DYE)
                .criterion(hasItem(Blocks.CHISELED_STONE_BRICKS), conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_GREY_CHISELED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREY_CHISELED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.CHISELED_STONE_BRICKS)
                .input('D', Items.GRAY_DYE)
                .criterion(hasItem(Blocks.CHISELED_STONE_BRICKS), conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREY_CHISELED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CHISELED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.CHISELED_STONE_BRICKS)
                .input('D', Items.BLACK_DYE)
                .criterion(hasItem(Blocks.CHISELED_STONE_BRICKS), conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_CHISELED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CHISELED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.CHISELED_STONE_BRICKS)
                .input('D', Items.BROWN_DYE)
                .criterion(hasItem(Blocks.CHISELED_STONE_BRICKS), conditionsFromItem(Items.BROWN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BROWN_CHISELED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CHISELED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.CHISELED_STONE_BRICKS)
                .input('D', Items.RED_DYE)
                .criterion(hasItem(Blocks.CHISELED_STONE_BRICKS), conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_CHISELED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CHISELED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.CHISELED_STONE_BRICKS)
                .input('D', Items.ORANGE_DYE)
                .criterion(hasItem(Blocks.CHISELED_STONE_BRICKS), conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_CHISELED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CHISELED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.CHISELED_STONE_BRICKS)
                .input('D', Items.YELLOW_DYE)
                .criterion(hasItem(Blocks.CHISELED_STONE_BRICKS), conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOW_CHISELED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CHISELED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.CHISELED_STONE_BRICKS)
                .input('D', Items.LIME_DYE)
                .criterion(hasItem(Blocks.CHISELED_STONE_BRICKS), conditionsFromItem(Items.LIME_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_CHISELED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CHISELED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.CHISELED_STONE_BRICKS)
                .input('D', Items.GREEN_DYE)
                .criterion(hasItem(Blocks.CHISELED_STONE_BRICKS), conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_CHISELED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CHISELED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.CHISELED_STONE_BRICKS)
                .input('D', Items.CYAN_DYE)
                .criterion(hasItem(Blocks.CHISELED_STONE_BRICKS), conditionsFromItem(Items.CYAN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_CHISELED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CHISELED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.CHISELED_STONE_BRICKS)
                .input('D', Items.LIGHT_BLUE_DYE)
                .criterion(hasItem(Blocks.CHISELED_STONE_BRICKS), conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_CHISELED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CHISELED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.CHISELED_STONE_BRICKS)
                .input('D', Items.BLUE_DYE)
                .criterion(hasItem(Blocks.CHISELED_STONE_BRICKS), conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_CHISELED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CHISELED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.CHISELED_STONE_BRICKS)
                .input('D', Items.PURPLE_DYE)
                .criterion(hasItem(Blocks.CHISELED_STONE_BRICKS), conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_CHISELED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CHISELED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.CHISELED_STONE_BRICKS)
                .input('D', Items.MAGENTA_DYE)
                .criterion(hasItem(Blocks.CHISELED_STONE_BRICKS), conditionsFromItem(Items.MAGENTA_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGENTA_CHISELED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CHISELED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.CHISELED_STONE_BRICKS)
                .input('D', Items.PINK_DYE)
                .criterion(hasItem(Blocks.CHISELED_STONE_BRICKS), conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_CHISELED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_COBBLESTONE_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_SLAB)
                .input('D', Items.WHITE_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_SLAB), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_COBBLESTONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GREY_COBBLESTONE_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_SLAB)
                .input('D', Items.LIGHT_GRAY_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_SLAB), conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_GREY_COBBLESTONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREY_COBBLESTONE_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_SLAB)
                .input('D', Items.GRAY_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_SLAB), conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREY_COBBLESTONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_COBBLESTONE_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_SLAB)
                .input('D', Items.BLACK_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_SLAB), conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_COBBLESTONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_COBBLESTONE_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_SLAB)
                .input('D', Items.BROWN_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_SLAB), conditionsFromItem(Items.BROWN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BROWN_COBBLESTONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_COBBLESTONE_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_SLAB)
                .input('D', Items.RED_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_SLAB), conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_COBBLESTONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_COBBLESTONE_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_SLAB)
                .input('D', Items.ORANGE_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_SLAB), conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_COBBLESTONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_COBBLESTONE_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_SLAB)
                .input('D', Items.YELLOW_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_SLAB), conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOW_COBBLESTONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_COBBLESTONE_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_SLAB)
                .input('D', Items.LIME_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_SLAB), conditionsFromItem(Items.LIME_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_COBBLESTONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_COBBLESTONE_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_SLAB)
                .input('D', Items.GREEN_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_SLAB), conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_COBBLESTONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_COBBLESTONE_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_SLAB)
                .input('D', Items.CYAN_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_SLAB), conditionsFromItem(Items.CYAN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_COBBLESTONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_COBBLESTONE_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_SLAB)
                .input('D', Items.LIGHT_BLUE_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_SLAB), conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_COBBLESTONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_COBBLESTONE_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_SLAB)
                .input('D', Items.BLUE_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_SLAB), conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_COBBLESTONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_COBBLESTONE_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_SLAB)
                .input('D', Items.PURPLE_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_SLAB), conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_COBBLESTONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_COBBLESTONE_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_SLAB)
                .input('D', Items.MAGENTA_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_SLAB), conditionsFromItem(Items.MAGENTA_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGENTA_COBBLESTONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_COBBLESTONE_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_SLAB)
                .input('D', Items.PINK_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_SLAB), conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_COBBLESTONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_STONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE)
                .input('D', Items.WHITE_DYE)
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_STONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GREY_STONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE)
                .input('D', Items.LIGHT_GRAY_DYE)
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_GREY_STONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREY_STONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE)
                .input('D', Items.GRAY_DYE)
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREY_STONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_STONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE)
                .input('D', Items.BLACK_DYE)
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_STONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_STONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE)
                .input('D', Items.BROWN_DYE)
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Items.BROWN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BROWN_STONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_STONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE)
                .input('D', Items.RED_DYE)
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_STONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_STONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE)
                .input('D', Items.ORANGE_DYE)
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_STONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_STONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE)
                .input('D', Items.YELLOW_DYE)
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOW_STONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_STONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE)
                .input('D', Items.LIME_DYE)
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Items.LIME_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_STONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_STONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE)
                .input('D', Items.GREEN_DYE)
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_STONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_STONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE)
                .input('D', Items.CYAN_DYE)
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Items.CYAN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_STONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_STONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE)
                .input('D', Items.LIGHT_BLUE_DYE)
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_STONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_STONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE)
                .input('D', Items.BLUE_DYE)
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_STONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_STONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE)
                .input('D', Items.PURPLE_DYE)
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_STONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_STONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE)
                .input('D', Items.MAGENTA_DYE)
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Items.MAGENTA_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGENTA_STONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_STONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE)
                .input('D', Items.PINK_DYE)
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_STONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_COBBLESTONE_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_STAIRS)
                .input('D', Items.WHITE_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_STAIRS), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_COBBLESTONE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GREY_COBBLESTONE_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_STAIRS)
                .input('D', Items.LIGHT_GRAY_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_STAIRS), conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_GREY_COBBLESTONE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREY_COBBLESTONE_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_STAIRS)
                .input('D', Items.GRAY_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_STAIRS), conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREY_COBBLESTONE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_COBBLESTONE_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_STAIRS)
                .input('D', Items.BLACK_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_STAIRS), conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_COBBLESTONE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_COBBLESTONE_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_STAIRS)
                .input('D', Items.BROWN_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_STAIRS), conditionsFromItem(Items.BROWN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BROWN_COBBLESTONE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_COBBLESTONE_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_STAIRS)
                .input('D', Items.RED_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_STAIRS), conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_COBBLESTONE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_COBBLESTONE_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_STAIRS)
                .input('D', Items.ORANGE_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_STAIRS), conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_COBBLESTONE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_COBBLESTONE_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_STAIRS)
                .input('D', Items.YELLOW_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_STAIRS), conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOW_COBBLESTONE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_COBBLESTONE_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_STAIRS)
                .input('D', Items.LIME_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_STAIRS), conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_COBBLESTONE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_COBBLESTONE_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_STAIRS)
                .input('D', Items.GREEN_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_STAIRS), conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_COBBLESTONE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_COBBLESTONE_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_STAIRS)
                .input('D', Items.CYAN_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_STAIRS), conditionsFromItem(Items.CYAN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_COBBLESTONE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_COBBLESTONE_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_STAIRS)
                .input('D', Items.LIGHT_BLUE_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_STAIRS), conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_COBBLESTONE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_COBBLESTONE_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_STAIRS)
                .input('D', Items.BLUE_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_STAIRS), conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_COBBLESTONE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_COBBLESTONE_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_STAIRS)
                .input('D', Items.PURPLE_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_STAIRS), conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_COBBLESTONE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_COBBLESTONE_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_STAIRS)
                .input('D', Items.PINK_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_STAIRS), conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_COBBLESTONE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CRACKED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.CRACKED_STONE_BRICKS)
                .input('D', Items.WHITE_DYE)
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_CRACKED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GREY_CRACKED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.CRACKED_STONE_BRICKS)
                .input('D', Items.LIGHT_GRAY_DYE)
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_GREY_CRACKED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREY_CRACKED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.CRACKED_STONE_BRICKS)
                .input('D', Items.GRAY_DYE)
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREY_CRACKED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CRACKED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.CRACKED_STONE_BRICKS)
                .input('D', Items.BLACK_DYE)
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_CRACKED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CRACKED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.CRACKED_STONE_BRICKS)
                .input('D', Items.BROWN_DYE)
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Items.BROWN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BROWN_CRACKED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CRACKED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.CRACKED_STONE_BRICKS)
                .input('D', Items.RED_DYE)
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_CRACKED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CRACKED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.CRACKED_STONE_BRICKS)
                .input('D', Items.ORANGE_DYE)
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_CRACKED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CRACKED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.CRACKED_STONE_BRICKS)
                .input('D', Items.YELLOW_DYE)
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOW_CRACKED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CRACKED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.CRACKED_STONE_BRICKS)
                .input('D', Items.LIME_DYE)
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Items.LIME_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_CRACKED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CRACKED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.CRACKED_STONE_BRICKS)
                .input('D', Items.GREEN_DYE)
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_CRACKED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CRACKED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.CRACKED_STONE_BRICKS)
                .input('D', Items.CYAN_DYE)
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Items.CYAN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_CRACKED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CRACKED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.CRACKED_STONE_BRICKS)
                .input('D', Items.LIGHT_BLUE_DYE)
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_CRACKED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CRACKED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.CRACKED_STONE_BRICKS)
                .input('D', Items.BLUE_DYE)
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_CRACKED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CRACKED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.CRACKED_STONE_BRICKS)
                .input('D', Items.PURPLE_DYE)
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_CRACKED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CRACKED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.CRACKED_STONE_BRICKS)
                .input('D', Items.MAGENTA_DYE)
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Items.MAGENTA_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGENTA_CRACKED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CRACKED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.CRACKED_STONE_BRICKS)
                .input('D', Items.PINK_DYE)
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_CRACKED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_SMOOTH_STONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.SMOOTH_STONE)
                .input('D', Items.WHITE_DYE)
                .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_SMOOTH_STONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GREY_SMOOTH_STONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.SMOOTH_STONE)
                .input('D', Items.LIGHT_GRAY_DYE)
                .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_GREY_SMOOTH_STONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREY_SMOOTH_STONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.SMOOTH_STONE)
                .input('D', Items.GRAY_DYE)
                .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREY_SMOOTH_STONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_SMOOTH_STONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.SMOOTH_STONE)
                .input('D', Items.BLACK_DYE)
                .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_SMOOTH_STONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SMOOTH_STONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.SMOOTH_STONE)
                .input('D', Items.RED_DYE)
                .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_SMOOTH_STONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_SMOOTH_STONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.SMOOTH_STONE)
                .input('D', Items.ORANGE_DYE)
                .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_SMOOTH_STONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_SMOOTH_STONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.SMOOTH_STONE)
                .input('D', Items.YELLOW_DYE)
                .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOW_SMOOTH_STONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_SMOOTH_STONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.SMOOTH_STONE)
                .input('D', Items.LIME_DYE)
                .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Items.LIME_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_SMOOTH_STONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_SMOOTH_STONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.SMOOTH_STONE)
                .input('D', Items.GREEN_DYE)
                .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_SMOOTH_STONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_SMOOTH_STONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.SMOOTH_STONE)
                .input('D', Items.CYAN_DYE)
                .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Items.CYAN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_SMOOTH_STONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_SMOOTH_STONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.SMOOTH_STONE)
                .input('D', Items.LIGHT_BLUE_DYE)
                .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_SMOOTH_STONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_SMOOTH_STONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.SMOOTH_STONE)
                .input('D', Items.BLUE_DYE)
                .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_SMOOTH_STONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_SMOOTH_STONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.SMOOTH_STONE)
                .input('D', Items.PURPLE_DYE)
                .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_SMOOTH_STONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_SMOOTH_STONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.SMOOTH_STONE)
                .input('D', Items.MAGENTA_DYE)
                .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Items.MAGENTA_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGENTA_SMOOTH_STONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_SMOOTH_STONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.SMOOTH_STONE)
                .input('D', Items.PINK_DYE)
                .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_SMOOTH_STONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_COBBLESTONE_WALL, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_WALL)
                .input('D', Items.WHITE_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_WALL), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_COBBLESTONE_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GREY_COBBLESTONE_WALL, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_WALL)
                .input('D', Items.LIGHT_GRAY_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_WALL), conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_GREY_COBBLESTONE_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREY_COBBLESTONE_WALL, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_WALL)
                .input('D', Items.GRAY_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_WALL), conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREY_COBBLESTONE_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_COBBLESTONE_WALL, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_WALL)
                .input('D', Items.BLACK_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_WALL), conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_COBBLESTONE_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_COBBLESTONE_WALL, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_WALL)
                .input('D', Items.BROWN_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_WALL), conditionsFromItem(Items.BROWN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BROWN_COBBLESTONE_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_COBBLESTONE_WALL, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_WALL)
                .input('D', Items.RED_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_WALL), conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_COBBLESTONE_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_COBBLESTONE_WALL, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_WALL)
                .input('D', Items.ORANGE_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_WALL), conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_COBBLESTONE_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_COBBLESTONE_WALL, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_WALL)
                .input('D', Items.YELLOW_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_WALL), conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOW_COBBLESTONE_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_COBBLESTONE_WALL, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_WALL)
                .input('D', Items.LIME_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_WALL), conditionsFromItem(Items.LIME_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_COBBLESTONE_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_COBBLESTONE_WALL, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_WALL)
                .input('D', Items.GREEN_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_WALL), conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_COBBLESTONE_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_COBBLESTONE_WALL, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_WALL)
                .input('D', Items.CYAN_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_WALL), conditionsFromItem(Items.CYAN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_COBBLESTONE_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_COBBLESTONE_WALL, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_WALL)
                .input('D', Items.LIGHT_BLUE_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_WALL), conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_COBBLESTONE_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_COBBLESTONE_WALL, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_WALL)
                .input('D', Items.BLUE_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_WALL), conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_COBBLESTONE_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_COBBLESTONE_WALL, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_WALL)
                .input('D', Items.PURPLE_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_WALL), conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_COBBLESTONE_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_COBBLESTONE_WALL, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_WALL)
                .input('D', Items.MAGENTA_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_WALL), conditionsFromItem(Items.MAGENTA_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGENTA_COBBLESTONE_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_COBBLESTONE_WALL, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE_WALL)
                .input('D', Items.PINK_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE_WALL), conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_COBBLESTONE_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_MOSSY_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICKS)
                .input('D', Items.WHITE_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICKS), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_MOSSY_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GREY_MOSSY_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICKS)
                .input('D', Items.LIGHT_GRAY_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICKS), conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_GREY_MOSSY_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREY_MOSSY_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICKS)
                .input('D', Items.GRAY_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICKS), conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREY_MOSSY_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_MOSSY_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICKS)
                .input('D', Items.BLACK_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICKS), conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_MOSSY_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_MOSSY_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICKS)
                .input('D', Items.BROWN_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICKS), conditionsFromItem(Items.BROWN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BROWN_MOSSY_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_MOSSY_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICKS)
                .input('D', Items.RED_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICKS), conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_MOSSY_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_MOSSY_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICKS)
                .input('D', Items.ORANGE_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICKS), conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_MOSSY_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_MOSSY_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICKS)
                .input('D', Items.YELLOW_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICKS), conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOW_MOSSY_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_MOSSY_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICKS)
                .input('D', Items.LIME_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICKS), conditionsFromItem(Items.LIME_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_MOSSY_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_MOSSY_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICKS)
                .input('D', Items.GREEN_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICKS), conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_MOSSY_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_MOSSY_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICKS)
                .input('D', Items.CYAN_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICKS), conditionsFromItem(Items.CYAN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_MOSSY_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_MOSSY_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICKS)
                .input('D', Items.LIGHT_BLUE_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICKS), conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_MOSSY_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_MOSSY_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICKS)
                .input('D', Items.BLUE_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICKS), conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_MOSSY_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_MOSSY_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICKS)
                .input('D', Items.PURPLE_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICKS), conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_MOSSY_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_MOSSY_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICKS)
                .input('D', Items.MAGENTA_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICKS), conditionsFromItem(Items.MAGENTA_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGENTA_MOSSY_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_MOSSY_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICKS)
                .input('D', Items.PINK_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICKS), conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_MOSSY_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_STONE_BRICK_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_STAIRS)
                .input('D', Items.WHITE_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_STAIRS), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_STONE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GREY_STONE_BRICK_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_STAIRS)
                .input('D', Items.LIGHT_GRAY_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_STAIRS), conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_GREY_STONE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREY_STONE_BRICK_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_STAIRS)
                .input('D', Items.GRAY_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_STAIRS), conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREY_STONE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_STONE_BRICK_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_STAIRS)
                .input('D', Items.BLACK_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_STAIRS), conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_STONE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_STONE_BRICK_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_STAIRS)
                .input('D', Items.BROWN_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_STAIRS), conditionsFromItem(Items.BROWN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BROWN_STONE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_STONE_BRICK_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_STAIRS)
                .input('D', Items.RED_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_STAIRS), conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_STONE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_STONE_BRICK_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_STAIRS)
                .input('D', Items.ORANGE_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_STAIRS), conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_STONE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_STONE_BRICK_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_STAIRS)
                .input('D', Items.YELLOW_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_STAIRS), conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOW_STONE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_STONE_BRICK_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_STAIRS)
                .input('D', Items.LIME_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_STAIRS), conditionsFromItem(Items.LIME_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_STONE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_STONE_BRICK_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_STAIRS)
                .input('D', Items.GREEN_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_STAIRS), conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_STONE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_STONE_BRICK_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_STAIRS)
                .input('D', Items.CYAN_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_STAIRS), conditionsFromItem(Items.CYAN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_STONE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_STONE_BRICK_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_STAIRS)
                .input('D', Items.LIGHT_BLUE_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_STAIRS), conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_STONE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_STONE_BRICK_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_STAIRS)
                .input('D', Items.BLUE_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_STAIRS), conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_STONE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_STONE_BRICK_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_STAIRS)
                .input('D', Items.PURPLE_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_STAIRS), conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_STONE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_STONE_BRICK_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_STAIRS)
                .input('D', Items.MAGENTA_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_STAIRS), conditionsFromItem(Items.MAGENTA_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGENTA_STONE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_STONE_BRICK_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_STAIRS)
                .input('D', Items.PINK_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_STAIRS), conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_STONE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_STONE_BRICK_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_SLAB)
                .input('D', Items.WHITE_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_SLAB), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_STONE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GREY_STONE_BRICK_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_SLAB)
                .input('D', Items.LIGHT_GRAY_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_SLAB), conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_GREY_STONE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREY_STONE_BRICK_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_SLAB)
                .input('D', Items.GRAY_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_SLAB), conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREY_STONE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_STONE_BRICK_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_SLAB)
                .input('D', Items.BLACK_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_SLAB), conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_STONE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_STONE_BRICK_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_SLAB)
                .input('D', Items.BROWN_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_SLAB), conditionsFromItem(Items.BROWN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BROWN_STONE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_STONE_BRICK_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_SLAB)
                .input('D', Items.RED_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_SLAB), conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_STONE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_STONE_BRICK_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_SLAB)
                .input('D', Items.ORANGE_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_SLAB), conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_STONE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_STONE_BRICK_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_SLAB)
                .input('D', Items.YELLOW_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_SLAB), conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOW_STONE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_STONE_BRICK_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_SLAB)
                .input('D', Items.LIME_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_SLAB), conditionsFromItem(Items.LIME_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_STONE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_STONE_BRICK_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_SLAB)
                .input('D', Items.GREEN_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_SLAB), conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_STONE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_STONE_BRICK_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_SLAB)
                .input('D', Items.CYAN_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_SLAB), conditionsFromItem(Items.CYAN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_STONE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_STONE_BRICK_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_SLAB)
                .input('D', Items.LIGHT_BLUE_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_SLAB), conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_STONE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_STONE_BRICK_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_SLAB)
                .input('D', Items.BLUE_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_SLAB), conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_STONE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_STONE_BRICK_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_SLAB)
                .input('D', Items.PURPLE_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_SLAB), conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_STONE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_STONE_BRICK_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_SLAB)
                .input('D', Items.MAGENTA_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_SLAB), conditionsFromItem(Items.MAGENTA_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGENTA_STONE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_STONE_BRICK_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_SLAB)
                .input('D', Items.PINK_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_SLAB), conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_STONE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_STONE_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_SLAB)
                .input('D', Items.WHITE_DYE)
                .criterion(hasItem(Blocks.STONE_SLAB), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_STONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GREY_STONE_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_SLAB)
                .input('D', Items.LIGHT_GRAY_DYE)
                .criterion(hasItem(Blocks.STONE_SLAB), conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_GREY_STONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREY_STONE_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_SLAB)
                .input('D', Items.GRAY_DYE)
                .criterion(hasItem(Blocks.STONE_SLAB), conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREY_STONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_STONE_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_SLAB)
                .input('D', Items.BLACK_DYE)
                .criterion(hasItem(Blocks.STONE_SLAB), conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_STONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_STONE_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_SLAB)
                .input('D', Items.BROWN_DYE)
                .criterion(hasItem(Blocks.STONE_SLAB), conditionsFromItem(Items.BROWN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BROWN_STONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_STONE_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_SLAB)
                .input('D', Items.RED_DYE)
                .criterion(hasItem(Blocks.STONE_SLAB), conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_STONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_STONE_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_SLAB)
                .input('D', Items.ORANGE_DYE)
                .criterion(hasItem(Blocks.STONE_SLAB), conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_STONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_STONE_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_SLAB)
                .input('D', Items.YELLOW_DYE)
                .criterion(hasItem(Blocks.STONE_SLAB), conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOW_STONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_STONE_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_SLAB)
                .input('D', Items.LIME_DYE)
                .criterion(hasItem(Blocks.STONE_SLAB), conditionsFromItem(Items.LIME_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_STONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_STONE_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_SLAB)
                .input('D', Items.GREEN_DYE)
                .criterion(hasItem(Blocks.STONE_SLAB), conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_STONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_STONE_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_SLAB)
                .input('D', Items.CYAN_DYE)
                .criterion(hasItem(Blocks.STONE_SLAB), conditionsFromItem(Items.CYAN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_STONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_STONE_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_SLAB)
                .input('D', Items.LIGHT_BLUE_DYE)
                .criterion(hasItem(Blocks.STONE_SLAB), conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_STONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_STONE_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_SLAB)
                .input('D', Items.BLUE_DYE)
                .criterion(hasItem(Blocks.STONE_SLAB), conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_STONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_STONE_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_SLAB)
                .input('D', Items.PURPLE_DYE)
                .criterion(hasItem(Blocks.STONE_SLAB), conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_STONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_STONE_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_SLAB)
                .input('D', Items.MAGENTA_DYE)
                .criterion(hasItem(Blocks.STONE_SLAB), conditionsFromItem(Items.MAGENTA_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGENTA_STONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_STONE_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_SLAB)
                .input('D', Items.PINK_DYE)
                .criterion(hasItem(Blocks.STONE_SLAB), conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_STONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_STONE_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_STAIRS)
                .input('D', Items.WHITE_DYE)
                .criterion(hasItem(Blocks.STONE_STAIRS), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_STONE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GREY_STONE_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_STAIRS)
                .input('D', Items.LIGHT_GRAY_DYE)
                .criterion(hasItem(Blocks.STONE_STAIRS), conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_GREY_STONE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREY_STONE_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_STAIRS)
                .input('D', Items.GRAY_DYE)
                .criterion(hasItem(Blocks.STONE_STAIRS), conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREY_STONE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_STONE_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_STAIRS)
                .input('D', Items.BLACK_DYE)
                .criterion(hasItem(Blocks.STONE_STAIRS), conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_STONE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_STONE_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_STAIRS)
                .input('D', Items.BROWN_DYE)
                .criterion(hasItem(Blocks.STONE_STAIRS), conditionsFromItem(Items.BROWN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BROWN_STONE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_STONE_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_STAIRS)
                .input('D', Items.RED_DYE)
                .criterion(hasItem(Blocks.STONE_STAIRS), conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_STONE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_STONE_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_STAIRS)
                .input('D', Items.ORANGE_DYE)
                .criterion(hasItem(Blocks.STONE_STAIRS), conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_STONE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_STONE_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_STAIRS)
                .input('D', Items.YELLOW_DYE)
                .criterion(hasItem(Blocks.STONE_STAIRS), conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOW_STONE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_STONE_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_STAIRS)
                .input('D', Items.LIME_DYE)
                .criterion(hasItem(Blocks.STONE_STAIRS), conditionsFromItem(Items.LIME_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_STONE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_STONE_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_STAIRS)
                .input('D', Items.GREEN_DYE)
                .criterion(hasItem(Blocks.STONE_STAIRS), conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_STONE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_STONE_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_STAIRS)
                .input('D', Items.CYAN_DYE)
                .criterion(hasItem(Blocks.STONE_STAIRS), conditionsFromItem(Items.CYAN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_STONE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_STONE_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_STAIRS)
                .input('D', Items.LIGHT_BLUE_DYE)
                .criterion(hasItem(Blocks.STONE_STAIRS), conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_STONE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_STONE_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_STAIRS)
                .input('D', Items.BLUE_DYE)
                .criterion(hasItem(Blocks.STONE_STAIRS), conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_STONE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_STONE_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_STAIRS)
                .input('D', Items.PURPLE_DYE)
                .criterion(hasItem(Blocks.STONE_STAIRS), conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_STONE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_STONE_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_STAIRS)
                .input('D', Items.MAGENTA_DYE)
                .criterion(hasItem(Blocks.STONE_STAIRS), conditionsFromItem(Items.MAGENTA_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGENTA_STONE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_STONE_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_STAIRS)
                .input('D', Items.PINK_DYE)
                .criterion(hasItem(Blocks.STONE_STAIRS), conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_STONE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_STONE_BUTTON, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BUTTON)
                .input('D', Items.WHITE_DYE)
                .criterion(hasItem(Blocks.STONE_BUTTON), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_STONE_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GREY_STONE_BUTTON, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BUTTON)
                .input('D', Items.LIGHT_GRAY_DYE)
                .criterion(hasItem(Blocks.STONE_BUTTON), conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_GREY_STONE_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREY_STONE_BUTTON, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BUTTON)
                .input('D', Items.GRAY_DYE)
                .criterion(hasItem(Blocks.STONE_BUTTON), conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREY_STONE_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_STONE_BUTTON, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BUTTON)
                .input('D', Items.BLACK_DYE)
                .criterion(hasItem(Blocks.STONE_BUTTON), conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_STONE_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_STONE_BUTTON, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BUTTON)
                .input('D', Items.RED_DYE)
                .criterion(hasItem(Blocks.STONE_BUTTON), conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_STONE_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_STONE_BUTTON, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BUTTON)
                .input('D', Items.ORANGE_DYE)
                .criterion(hasItem(Blocks.STONE_BUTTON), conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_STONE_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_STONE_BUTTON, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BUTTON)
                .input('D', Items.YELLOW_DYE)
                .criterion(hasItem(Blocks.STONE_BUTTON), conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOW_STONE_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_STONE_BUTTON, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BUTTON)
                .input('D', Items.LIME_DYE)
                .criterion(hasItem(Blocks.STONE_BUTTON), conditionsFromItem(Items.LIME_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_STONE_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_STONE_BUTTON, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BUTTON)
                .input('D', Items.GREEN_DYE)
                .criterion(hasItem(Blocks.STONE_BUTTON), conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_STONE_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_STONE_BUTTON, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BUTTON)
                .input('D', Items.CYAN_DYE)
                .criterion(hasItem(Blocks.STONE_BUTTON), conditionsFromItem(Items.CYAN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_STONE_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_STONE_BUTTON, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BUTTON)
                .input('D', Items.LIGHT_BLUE_DYE)
                .criterion(hasItem(Blocks.STONE_BUTTON), conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_STONE_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_STONE_BUTTON, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BUTTON)
                .input('D', Items.BLUE_DYE)
                .criterion(hasItem(Blocks.STONE_BUTTON), conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_STONE_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_STONE_BUTTON, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BUTTON)
                .input('D', Items.PURPLE_DYE)
                .criterion(hasItem(Blocks.STONE_BUTTON), conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_STONE_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_STONE_BUTTON, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BUTTON)
                .input('D', Items.MAGENTA_DYE)
                .criterion(hasItem(Blocks.STONE_BUTTON), conditionsFromItem(Items.MAGENTA_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGENTA_STONE_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_STONE_BUTTON, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BUTTON)
                .input('D', Items.PINK_DYE)
                .criterion(hasItem(Blocks.STONE_BUTTON), conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_STONE_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_STONE_PRESSURE_PLATE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_PRESSURE_PLATE)
                .input('D', Items.WHITE_DYE)
                .criterion(hasItem(Blocks.STONE_PRESSURE_PLATE), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_STONE_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GREY_STONE_PRESSURE_PLATE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_PRESSURE_PLATE)
                .input('D', Items.LIGHT_GRAY_DYE)
                .criterion(hasItem(Blocks.STONE_PRESSURE_PLATE), conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_GREY_STONE_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREY_STONE_PRESSURE_PLATE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_PRESSURE_PLATE)
                .input('D', Items.GRAY_DYE)
                .criterion(hasItem(Blocks.STONE_PRESSURE_PLATE), conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREY_STONE_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_STONE_PRESSURE_PLATE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_PRESSURE_PLATE)
                .input('D', Items.BLACK_DYE)
                .criterion(hasItem(Blocks.STONE_PRESSURE_PLATE), conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_STONE_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_STONE_PRESSURE_PLATE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_PRESSURE_PLATE)
                .input('D', Items.RED_DYE)
                .criterion(hasItem(Blocks.STONE_PRESSURE_PLATE), conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_STONE_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_STONE_PRESSURE_PLATE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_PRESSURE_PLATE)
                .input('D', Items.ORANGE_DYE)
                .criterion(hasItem(Blocks.STONE_PRESSURE_PLATE), conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_STONE_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_STONE_PRESSURE_PLATE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_PRESSURE_PLATE)
                .input('D', Items.YELLOW_DYE)
                .criterion(hasItem(Blocks.STONE_PRESSURE_PLATE), conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOW_STONE_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_STONE_PRESSURE_PLATE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_PRESSURE_PLATE)
                .input('D', Items.LIME_DYE)
                .criterion(hasItem(Blocks.STONE_PRESSURE_PLATE), conditionsFromItem(Items.LIME_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_STONE_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_STONE_PRESSURE_PLATE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_PRESSURE_PLATE)
                .input('D', Items.GREEN_DYE)
                .criterion(hasItem(Blocks.STONE_PRESSURE_PLATE), conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_STONE_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_STONE_PRESSURE_PLATE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_PRESSURE_PLATE)
                .input('D', Items.CYAN_DYE)
                .criterion(hasItem(Blocks.STONE_PRESSURE_PLATE), conditionsFromItem(Items.CYAN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_STONE_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_STONE_PRESSURE_PLATE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_PRESSURE_PLATE)
                .input('D', Items.LIGHT_BLUE_DYE)
                .criterion(hasItem(Blocks.STONE_PRESSURE_PLATE), conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_STONE_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_STONE_PRESSURE_PLATE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_PRESSURE_PLATE)
                .input('D', Items.BLUE_DYE)
                .criterion(hasItem(Blocks.STONE_PRESSURE_PLATE), conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_STONE_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_STONE_PRESSURE_PLATE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_PRESSURE_PLATE)
                .input('D', Items.PURPLE_DYE)
                .criterion(hasItem(Blocks.STONE_PRESSURE_PLATE), conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_STONE_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_STONE_PRESSURE_PLATE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_PRESSURE_PLATE)
                .input('D', Items.MAGENTA_DYE)
                .criterion(hasItem(Blocks.STONE_PRESSURE_PLATE), conditionsFromItem(Items.MAGENTA_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGENTA_STONE_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_STONE_PRESSURE_PLATE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_PRESSURE_PLATE)
                .input('D', Items.PINK_DYE)
                .criterion(hasItem(Blocks.STONE_PRESSURE_PLATE), conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_STONE_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICKS)
                .input('D', Items.WHITE_DYE)
                .criterion(hasItem(Blocks.STONE_BRICKS), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GREY_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICKS)
                .input('D', Items.LIGHT_GRAY_DYE)
                .criterion(hasItem(Blocks.STONE_BRICKS), conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_GREY_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREY_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICKS)
                .input('D', Items.GRAY_DYE)
                .criterion(hasItem(Blocks.STONE_BRICKS), conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREY_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICKS)
                .input('D', Items.BLACK_DYE)
                .criterion(hasItem(Blocks.STONE_BRICKS), conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICKS)
                .input('D', Items.RED_DYE)
                .criterion(hasItem(Blocks.STONE_BRICKS), conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICKS)
                .input('D', Items.ORANGE_DYE)
                .criterion(hasItem(Blocks.STONE_BRICKS), conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICKS)
                .input('D', Items.YELLOW_DYE)
                .criterion(hasItem(Blocks.STONE_BRICKS), conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOW_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICKS)
                .input('D', Items.LIME_DYE)
                .criterion(hasItem(Blocks.STONE_BRICKS), conditionsFromItem(Items.LIME_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICKS)
                .input('D', Items.GREEN_DYE)
                .criterion(hasItem(Blocks.STONE_BRICKS), conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICKS)
                .input('D', Items.CYAN_DYE)
                .criterion(hasItem(Blocks.STONE_BRICKS), conditionsFromItem(Items.CYAN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICKS)
                .input('D', Items.LIGHT_BLUE_DYE)
                .criterion(hasItem(Blocks.STONE_BRICKS), conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICKS)
                .input('D', Items.BLUE_DYE)
                .criterion(hasItem(Blocks.STONE_BRICKS), conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICKS)
                .input('D', Items.PURPLE_DYE)
                .criterion(hasItem(Blocks.STONE_BRICKS), conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICKS)
                .input('D', Items.MAGENTA_DYE)
                .criterion(hasItem(Blocks.STONE_BRICKS), conditionsFromItem(Items.MAGENTA_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGENTA_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICKS)
                .input('D', Items.PINK_DYE)
                .criterion(hasItem(Blocks.STONE_BRICKS), conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_STONE_BRICK_WALL, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_WALL)
                .input('D', Items.WHITE_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_WALL), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_STONE_BRICK_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GREY_STONE_BRICK_WALL, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_WALL)
                .input('D', Items.LIGHT_GRAY_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_WALL), conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_GREY_STONE_BRICK_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREY_STONE_BRICK_WALL, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_WALL)
                .input('D', Items.GRAY_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_WALL), conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREY_STONE_BRICK_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_STONE_BRICK_WALL, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_WALL)
                .input('D', Items.BLACK_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_WALL), conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_STONE_BRICK_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_STONE_BRICK_WALL, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_WALL)
                .input('D', Items.BROWN_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_WALL), conditionsFromItem(Items.BROWN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BROWN_STONE_BRICK_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_STONE_BRICK_WALL, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_WALL)
                .input('D', Items.RED_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_WALL), conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_STONE_BRICK_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_STONE_BRICK_WALL, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_WALL)
                .input('D', Items.ORANGE_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_WALL), conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_STONE_BRICK_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_STONE_BRICK_WALL, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_WALL)
                .input('D', Items.YELLOW_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_WALL), conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOW_STONE_BRICK_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_STONE_BRICK_WALL, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_WALL)
                .input('D', Items.LIME_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_WALL), conditionsFromItem(Items.LIME_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_STONE_BRICK_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_STONE_BRICK_WALL, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_WALL)
                .input('D', Items.GREEN_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_WALL), conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_STONE_BRICK_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_STONE_BRICK_WALL, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_WALL)
                .input('D', Items.CYAN_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_WALL), conditionsFromItem(Items.CYAN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_STONE_BRICK_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_STONE_BRICK_WALL, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_WALL)
                .input('D', Items.LIGHT_BLUE_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_WALL), conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_STONE_BRICK_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_STONE_BRICK_WALL, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_WALL)
                .input('D', Items.BLUE_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_WALL), conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_STONE_BRICK_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_STONE_BRICK_WALL, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_WALL)
                .input('D', Items.PURPLE_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_WALL), conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_STONE_BRICK_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_STONE_BRICK_WALL, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_WALL)
                .input('D', Items.MAGENTA_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_WALL), conditionsFromItem(Items.MAGENTA_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGENTA_STONE_BRICK_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_STONE_BRICK_WALL, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.STONE_BRICK_WALL)
                .input('D', Items.PINK_DYE)
                .criterion(hasItem(Blocks.STONE_BRICK_WALL), conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_STONE_BRICK_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_MOSSY_STONE_BRICK_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICK_STAIRS)
                .input('D', Items.WHITE_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICK_STAIRS), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_MOSSY_STONE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GREY_MOSSY_STONE_BRICK_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICK_STAIRS)
                .input('D', Items.LIGHT_GRAY_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICK_STAIRS), conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_GREY_MOSSY_STONE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREY_MOSSY_STONE_BRICK_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICK_STAIRS)
                .input('D', Items.GRAY_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICK_STAIRS), conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREY_MOSSY_STONE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_MOSSY_STONE_BRICK_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICK_STAIRS)
                .input('D', Items.BLACK_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICK_STAIRS), conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_MOSSY_STONE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_MOSSY_STONE_BRICK_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICK_STAIRS)
                .input('D', Items.BROWN_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICK_STAIRS), conditionsFromItem(Items.BROWN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BROWN_MOSSY_STONE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_MOSSY_STONE_BRICK_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICK_STAIRS)
                .input('D', Items.RED_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICK_STAIRS), conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_MOSSY_STONE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_MOSSY_STONE_BRICK_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICK_STAIRS)
                .input('D', Items.ORANGE_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICK_STAIRS), conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_MOSSY_STONE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_MOSSY_STONE_BRICK_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICK_STAIRS)
                .input('D', Items.YELLOW_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICK_STAIRS), conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOW_MOSSY_STONE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_MOSSY_STONE_BRICK_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICK_STAIRS)
                .input('D', Items.LIME_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICK_STAIRS), conditionsFromItem(Items.LIME_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_MOSSY_STONE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_MOSSY_STONE_BRICK_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICK_STAIRS)
                .input('D', Items.GREEN_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICK_STAIRS), conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_MOSSY_STONE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_MOSSY_STONE_BRICK_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICK_STAIRS)
                .input('D', Items.CYAN_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICK_STAIRS), conditionsFromItem(Items.CYAN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_MOSSY_STONE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_MOSSY_STONE_BRICK_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICK_STAIRS)
                .input('D', Items.LIGHT_BLUE_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICK_STAIRS), conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_MOSSY_STONE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_MOSSY_STONE_BRICK_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICK_STAIRS)
                .input('D', Items.BLUE_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICK_STAIRS), conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_MOSSY_STONE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_MOSSY_STONE_BRICK_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICK_STAIRS)
                .input('D', Items.PURPLE_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICK_STAIRS), conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_MOSSY_STONE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_MOSSY_STONE_BRICK_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICK_STAIRS)
                .input('D', Items.MAGENTA_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICK_STAIRS), conditionsFromItem(Items.MAGENTA_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGENTA_MOSSY_STONE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_MOSSY_STONE_BRICK_STAIRS, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICK_STAIRS)
                .input('D', Items.PINK_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICK_STAIRS), conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_MOSSY_STONE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_MOSSY_STONE_BRICK_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICK_SLAB)
                .input('D', Items.WHITE_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICK_SLAB), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_MOSSY_STONE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GREY_MOSSY_STONE_BRICK_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICK_SLAB)
                .input('D', Items.LIGHT_GRAY_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICK_SLAB), conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_GREY_MOSSY_STONE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREY_MOSSY_STONE_BRICK_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICK_SLAB)
                .input('D', Items.GRAY_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICK_SLAB), conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREY_MOSSY_STONE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_MOSSY_STONE_BRICK_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICK_SLAB)
                .input('D', Items.BLACK_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICK_SLAB), conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_MOSSY_STONE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_MOSSY_STONE_BRICK_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICK_SLAB)
                .input('D', Items.BROWN_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICK_SLAB), conditionsFromItem(Items.BROWN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BROWN_MOSSY_STONE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_MOSSY_STONE_BRICK_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICK_SLAB)
                .input('D', Items.RED_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICK_SLAB), conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_MOSSY_STONE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_MOSSY_STONE_BRICK_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICK_SLAB)
                .input('D', Items.ORANGE_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICK_SLAB), conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_MOSSY_STONE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_MOSSY_STONE_BRICK_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICK_SLAB)
                .input('D', Items.YELLOW_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICK_SLAB), conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOW_MOSSY_STONE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_MOSSY_STONE_BRICK_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICK_SLAB)
                .input('D', Items.LIME_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICK_SLAB), conditionsFromItem(Items.LIME_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_MOSSY_STONE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_MOSSY_STONE_BRICK_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICK_SLAB)
                .input('D', Items.GREEN_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICK_SLAB), conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_MOSSY_STONE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_MOSSY_STONE_BRICK_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICK_SLAB)
                .input('D', Items.CYAN_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICK_SLAB), conditionsFromItem(Items.CYAN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_MOSSY_STONE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_MOSSY_STONE_BRICK_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICK_SLAB)
                .input('D', Items.LIGHT_BLUE_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICK_SLAB), conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_MOSSY_STONE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_MOSSY_STONE_BRICK_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICK_SLAB)
                .input('D', Items.BLUE_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICK_SLAB), conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_MOSSY_STONE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_MOSSY_STONE_BRICK_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICK_SLAB)
                .input('D', Items.PURPLE_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICK_SLAB), conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_MOSSY_STONE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_MOSSY_STONE_BRICK_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICK_SLAB)
                .input('D', Items.MAGENTA_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICK_SLAB), conditionsFromItem(Items.MAGENTA_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGENTA_MOSSY_STONE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_MOSSY_STONE_BRICK_SLAB, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.MOSSY_STONE_BRICK_SLAB)
                .input('D', Items.PINK_DYE)
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICK_SLAB), conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_MOSSY_STONE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GREY_COBBLESTONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE)
                .input('D', Items.LIGHT_GRAY_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_GREY_COBBLESTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREY_COBBLESTONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE)
                .input('D', Items.GRAY_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREY_COBBLESTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_COBBLESTONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE)
                .input('D', Items.BLACK_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_COBBLESTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_COBBLESTONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE)
                .input('D', Items.BROWN_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Items.BROWN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BROWN_COBBLESTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_COBBLESTONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE)
                .input('D', Items.RED_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_COBBLESTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_COBBLESTONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE)
                .input('D', Items.ORANGE_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_COBBLESTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_COBBLESTONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE)
                .input('D', Items.LIME_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Items.LIME_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_COBBLESTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_COBBLESTONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE)
                .input('D', Items.GREEN_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_COBBLESTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_COBBLESTONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE)
                .input('D', Items.CYAN_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Items.CYAN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_COBBLESTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_COBBLESTONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE)
                .input('D', Items.LIGHT_BLUE_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_COBBLESTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_COBBLESTONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE)
                .input('D', Items.BLUE_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_COBBLESTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_COBBLESTONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE)
                .input('D', Items.PURPLE_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_COBBLESTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_COBBLESTONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE)
                .input('D', Items.MAGENTA_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Items.MAGENTA_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGENTA_COBBLESTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_COBBLESTONE, 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', Blocks.COBBLESTONE)
                .input('D', Items.PINK_DYE)
                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_COBBLESTONE)));







    }
}
