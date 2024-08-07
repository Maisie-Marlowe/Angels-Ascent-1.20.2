package net.maisiemarlowe.angelsascent.block.entity.client;

import net.maisiemarlowe.angelsascent.AngelsAscent;
import net.maisiemarlowe.angelsascent.block.entity.CompressorBlockEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class CompressorBlockModel extends GeoModel<CompressorBlockEntity> {
    @Override
    public Identifier getModelResource(CompressorBlockEntity animatable) {
        return new Identifier(AngelsAscent.MOD_ID, "geo/compressor_block.geo.json");
    }

    @Override
    public Identifier getTextureResource(CompressorBlockEntity animatable) {
        return new Identifier(AngelsAscent.MOD_ID, "textures/block/compressor_block.png");
    }

    @Override
    public Identifier getAnimationResource(CompressorBlockEntity animatable) {
        return new Identifier(AngelsAscent.MOD_ID, "animations/compressor_block.animation.json");
    }
}
