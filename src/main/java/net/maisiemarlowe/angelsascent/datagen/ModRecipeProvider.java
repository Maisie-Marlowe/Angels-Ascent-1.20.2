package net.maisiemarlowe.angelsascent.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.maisiemarlowe.angelsascent.block.ModBlocks;
import net.maisiemarlowe.angelsascent.item.ModItems;
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



        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, ModItems.ANGEL_WINGS, 1)
                .pattern("PIP")
                .pattern("MEM")
                .pattern("I I")
                .input('I', ModItems.HOLY_INGOT)
                .input('P', ModItems.PURIFIED_EYE_OF_ENDER)
                .input('E', Items.ELYTRA)
                .input('M', Items.PHANTOM_MEMBRANE)
                .criterion(hasItem(ModItems.HOLY_INGOT), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ANGEL_WINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, ModItems.DEVIL_WINGS, 1)
                .pattern("PIP")
                .pattern("MAM")
                .pattern("I I")
                .input('I', ModItems.BLASPHEMOUS_INGOT)
                .input('P', ModItems.PURIFIED_EYE_OF_ENDER)
                .input('A', ModItems.ANGEL_WINGS)
                .input('M', Items.PHANTOM_MEMBRANE)
                .criterion(hasItem(ModItems.BLASPHEMOUS_INGOT), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DEVIL_WINGS)));

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






    }
}
