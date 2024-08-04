package net.maisiemarlowe.angelsascent.client;

import net.maisiemarlowe.angelsascent.item.custom.HaloArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class HaloArmorRenderer extends GeoArmorRenderer<HaloArmorItem> {
    public HaloArmorRenderer() {
        super(new HaloArmorModel());
    }
}
