package net.maisiemarlowe.angelsascent.item.client;

import net.maisiemarlowe.angelsascent.item.custom.CompressorBlockItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class CompressorBlockItemRenderer extends GeoItemRenderer<CompressorBlockItem> {
    public CompressorBlockItemRenderer() {
        super(new CompressorBlockItemModel());
    }
}
