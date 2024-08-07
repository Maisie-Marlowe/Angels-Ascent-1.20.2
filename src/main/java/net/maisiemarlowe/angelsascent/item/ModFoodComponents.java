package net.maisiemarlowe.angelsascent.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent HOLY_CARROT = new FoodComponent.Builder().hunger(8).saturationModifier(1.69f)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 200), 1).statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 600), 0.25f).build();

    public static final FoodComponent BLASPHEMOUS_CARROT = new FoodComponent.Builder().hunger(12).saturationModifier(2.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 600), 1).statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 1200), 0.55f).build();




}
