package net.maisiemarlowe.angelsascent.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {


    SOUL_INGOT(5, 0, 40f, 6f, 5,
            () -> Ingredient.ofItems(ModItems.HOLY_INGOT)),

    HOLY_INGOT(6, 0, 15f, 6f, 10,
            () -> Ingredient.ofItems(ModItems.HOLY_INGOT)),

    BLASPHEMOUS_INGOT(7, 0, 15f, 6f, 15,
                              () -> Ingredient.ofItems(ModItems.BLASPHEMOUS_INGOT)),

    BLASPHEMOUS_DRILL(7, 0, 45f, 6f, 15,
                              () -> Ingredient.ofItems(ModItems.BLASPHEMOUS_INGOT));


    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }


}