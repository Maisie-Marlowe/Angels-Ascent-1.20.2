package net.maisiemarlowe.angelsascent.client;

import net.maisiemarlowe.angelsascent.AngelsAscent;
import net.maisiemarlowe.angelsascent.item.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.model.GeoModel;

public class WingsArmorModel extends GeoModel {

    private ItemStack currentItemStack;

    public WingsArmorModel(ItemStack itemStack) {
        this.currentItemStack = itemStack;
    }

    @Override
    public Identifier getModelResource(GeoAnimatable animatable) {
        return new Identifier(AngelsAscent.MOD_ID, "geo/wings_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(GeoAnimatable animatable) {
        if(currentItemStack.isOf(ModItems.HOLY_WINGS)) {
            return new Identifier(AngelsAscent.MOD_ID, "textures/armor/angel_wings_texture.png");
        } else if (currentItemStack.isOf(ModItems.BLASPHEMOUS_WINGS)) {
            return  new Identifier(AngelsAscent.MOD_ID, "textures/armor/devil_wings_texture.png");
        }

        //default texture
        return new Identifier(AngelsAscent.MOD_ID, "textures/armor/angel_wings_texture.png");

    }

    @Override
    public Identifier getAnimationResource(GeoAnimatable animatable) {
        return new Identifier(AngelsAscent.MOD_ID, "animations/wings_armor.animation.json");
    }
}
