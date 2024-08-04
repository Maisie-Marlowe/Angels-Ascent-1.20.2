package net.maisiemarlowe.angelsascent.client;

import net.maisiemarlowe.angelsascent.AngelsAscent;
import net.maisiemarlowe.angelsascent.item.custom.HaloArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class HaloArmorModel extends GeoModel<HaloArmorItem> {
    @Override
    public Identifier getModelResource(HaloArmorItem animatable) {
        return new Identifier(AngelsAscent.MOD_ID, "geo/halo_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(HaloArmorItem animatable) {
        return new Identifier(AngelsAscent.MOD_ID, "textures/armor/halo_armor_texture.png");
    }

    @Override
    public Identifier getAnimationResource(HaloArmorItem animatable) {
        return new Identifier(AngelsAscent.MOD_ID, "animations/halo_armor.animation.json");
    }
}
