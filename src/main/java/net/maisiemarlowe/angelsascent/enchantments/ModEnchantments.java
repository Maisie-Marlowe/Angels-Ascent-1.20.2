package net.maisiemarlowe.angelsascent.enchantments;

import net.maisiemarlowe.angelsascent.AngelsAscent;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantments {

    public static Enchantment HEAVENLY_THUNDER = register("heavenly_thunder",
            new LightningEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.BOW, EquipmentSlot.MAINHAND));

    public static Enchantment FLASH_FREEZE = register("flash_freeze",
            new FlashFreezeEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));

    public static Enchantment VENOMOUS = register("venomous",
            new VenomousEnchantment(Enchantment.Rarity.COMMON, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));

    public static Enchantment FROST_BITE = register("frostbite",
            new FrostbiteEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));





    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registries.ENCHANTMENT, new Identifier(AngelsAscent.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {
        AngelsAscent.LOGGER.info("Registering Mod Items for " + AngelsAscent.MOD_ID);
    }
}
