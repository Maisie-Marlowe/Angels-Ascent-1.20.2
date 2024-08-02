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
        //BlockStateModelGenerator.BlockTexturePool soul_ore_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SOUL_ORE);


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

        itemModelGenerator.register(ModItems.HOLY_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.HOLY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.HOLY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.HOLY_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.HOLY_SHOVEL, Models.HANDHELD);

        itemModelGenerator.register(ModItems.BLASPHEMOUS_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLASPHEMOUS_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLASPHEMOUS_DRILL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLASPHEMOUS_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLASPHEMOUS_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLASPHEMOUS_SHOVEL, Models.HANDHELD);

        itemModelGenerator.register(ModItems.ANGEL_WINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEVIL_WINGS, Models.GENERATED);


    }
}
