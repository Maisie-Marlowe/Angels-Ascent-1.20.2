package net.maisiemarlowe.angelsascent.item.client;

import net.maisiemarlowe.angelsascent.AngelsAscent;
import net.maisiemarlowe.angelsascent.item.custom.CompressorBlockItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class CompressorBlockItemModel extends GeoModel<CompressorBlockItem> {
    @Override
    public Identifier getModelResource(CompressorBlockItem animatable) {
        return new Identifier(AngelsAscent.MOD_ID, "geo/compressor_block.geo.json");
    }

    @Override
    public Identifier getTextureResource(CompressorBlockItem animatable) {
        return new Identifier(AngelsAscent.MOD_ID, "textures/block/compressor_block.png");
    }

    @Override
    public Identifier getAnimationResource(CompressorBlockItem animatable) {
        return null;
    }
}
