package net.maisiemarlowe.angelsascent.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.maisiemarlowe.angelsascent.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.);
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



    }
}
