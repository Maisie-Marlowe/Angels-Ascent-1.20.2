package net.maisiemarlowe.angelsascent.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.maisiemarlowe.angelsascent.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

public class ModRecipeProvider extends FabricRecipeProvider {

    //private static final List<ItemConvertible> xxx_SMELTABLES = List.of(ModItems/ModBlocks,);
    //private static final List<ItemConvertible> xxx_BLASTABLES = List.of(ModItems/ModBlocks,);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        //offerSmelting(exporter, xxx_SMELTABLES, RecipeCategory.MISC, ModItems., 0.7f, 200, "");
        //offerBlasting(exporter, xxx_SMELTABLES, RecipeCategory.MISC, ModItems., 0.7f, 100, "");

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
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .input('E', Items.ENDER_PEARL)
                .criterion(hasItem(Items.ENDER_PEARL), conditionsFromItem(Items.ENDER_PEARL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COMPRESSED_ENDER_PEARL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DOUBLE_COMPRESSED_ENDER_PEARL, 1)
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', ModItems.COMPRESSED_ENDER_PEARL)
                .criterion(hasItem(ModItems.COMPRESSED_ENDER_PEARL), conditionsFromItem(ModItems.COMPRESSED_ENDER_PEARL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DOUBLE_COMPRESSED_ENDER_PEARL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TRIPLE_COMPRESSED_ENDER_PEARL, 1)
                .pattern("DDD")
                .pattern("DDD")
                .pattern("DDD")
                .input('D', ModItems.DOUBLE_COMPRESSED_ENDER_PEARL)
                .criterion(hasItem(ModItems.DOUBLE_COMPRESSED_ENDER_PEARL), conditionsFromItem(ModItems.DOUBLE_COMPRESSED_ENDER_PEARL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TRIPLE_COMPRESSED_ENDER_PEARL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ULTRA_COMPRESSED_ENDER_PEARL, 1)
                .pattern("UUU")
                .pattern("UUU")
                .pattern("UUU")
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


        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SOUL_POWDER, 1)
                .input(ModItems.SOUL_FRAGMENT, 1)
                .criterion(hasItem(ModItems.SOUL_POWDER), conditionsFromItem(ModItems.SOUL_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SOUL_POWDER)));
    }
}
