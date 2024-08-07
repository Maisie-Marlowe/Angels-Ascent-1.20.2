package net.maisiemarlowe.angelsascent.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.maisiemarlowe.angelsascent.AngelsAscent;
import net.maisiemarlowe.angelsascent.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {

    public static final BlockEntityType<CompressorBlockEntity> COMPRESSOR_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(AngelsAscent.MOD_ID, "compressor_block_entity"),
                    FabricBlockEntityTypeBuilder.create(CompressorBlockEntity::new,
                            ModBlocks.COMPRESSOR_BLOCK).build());



    public static void registerBlockEntities() {
        AngelsAscent.LOGGER.info("Registering Block Entities for " + AngelsAscent.MOD_ID);
    }
}
