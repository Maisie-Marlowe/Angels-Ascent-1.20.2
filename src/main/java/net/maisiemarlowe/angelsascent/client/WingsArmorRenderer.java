package net.maisiemarlowe.angelsascent.client;

import net.maisiemarlowe.angelsascent.item.custom.AngelWingsItem;
import net.minecraft.item.ItemStack;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class WingsArmorRenderer extends GeoArmorRenderer<AngelWingsItem> {
    public WingsArmorRenderer(ItemStack stack) {
        super(new WingsArmorModel(stack));
    }

}
