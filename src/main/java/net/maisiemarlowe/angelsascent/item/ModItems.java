package net.maisiemarlowe.angelsascent.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.maisiemarlowe.angelsascent.AngelsAscent;
import net.maisiemarlowe.angelsascent.item.custom.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PURIFIED_EYE_OF_ENDER = registerItem("purified_eye_of_ender", new Item(new FabricItemSettings()));
    public static final Item ENDER_SHARD = registerItem("ender_shard", new Item(new FabricItemSettings().maxCount(16)));
    public static final Item PURIFIED_ENDER_SHARD = registerItem("purified_ender_shard", new Item(new FabricItemSettings().maxCount(16)));
    public static final Item SOUL_POWDER = registerItem("soul_powder", new Item(new FabricItemSettings()));
    public static final Item COMPRESSED_ENDER_PEARL = registerItem("compressed_ender_pearl", new Item(new FabricItemSettings()));
    public static final Item DOUBLE_COMPRESSED_ENDER_PEARL = registerItem("double_compressed_ender_pearl", new Item(new FabricItemSettings()));
    public static final Item TRIPLE_COMPRESSED_ENDER_PEARL = registerItem("triple_compressed_ender_pearl", new Item(new FabricItemSettings()));
    public static final Item ULTRA_COMPRESSED_ENDER_PEARL = registerItem("ultra_compressed_ender_pearl", new Item(new FabricItemSettings()));
    public static final Item HOLY_INGOT = registerItem("holy_ingot", new Item(new FabricItemSettings()));
    public static final Item SOUL_FRAGMENT = registerItem("soul_fragment", new Item(new FabricItemSettings()));

    public static final Item HALO = registerItem("angelic_halo", new HaloArmorItem(ModArmorMaterials.HALO, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));

    public static final Item HOLY_AXE = registerItem("holy_axe", new ModAxeItems(ModToolMaterials.HOLY_BAR,
            4, -2.6f, true, new FabricItemSettings().fireproof())); //7 +6dmg 4 -1.8spd

    public static final Item HOLY_PICKAXE = registerItem("holy_pickaxe", new ModPickaxeItems(ModToolMaterials.HOLY_BAR,
            0, -2.4f, true, new FabricItemSettings().fireproof()));

    public static final Item HOLY_SWORD = registerItem("holy_sword", new ModSwordItems(ModToolMaterials.HOLY_BAR,
            2, -1.6f, true, new FabricItemSettings().fireproof()));

    public static final Item HOLY_HOE = registerItem("holy_hoe", new ModHoeItems(ModToolMaterials.HOLY_BAR,
            -6, 1.6f, true, new FabricItemSettings().fireproof()));

    public static final Item HOLY_SHOVEL = registerItem("holy_shovel", new ModShovelItems(ModToolMaterials.HOLY_BAR,
            .5f, -2.6f, true, new FabricItemSettings().fireproof()));

    public static final Item ANGEL_WINGS = registerItem("angel_wings", new AngelWingsItem(new FabricItemSettings()));
    public static final Item DEVIL_WINGS = registerItem("devil_wings", new AngelWingsItem(new FabricItemSettings()));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(PURIFIED_EYE_OF_ENDER);
        entries.add(ENDER_SHARD);
        entries.add(PURIFIED_ENDER_SHARD);
        entries.add(SOUL_POWDER);
        entries.add(COMPRESSED_ENDER_PEARL);
        entries.add(DOUBLE_COMPRESSED_ENDER_PEARL);
        entries.add(TRIPLE_COMPRESSED_ENDER_PEARL);
        entries.add(ULTRA_COMPRESSED_ENDER_PEARL);
        entries.add(HALO);
        entries.add(HOLY_INGOT);
        entries.add(HOLY_AXE);


    }


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(AngelsAscent.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AngelsAscent.LOGGER.info("Registering Mod Items for " + AngelsAscent.MOD_ID);
    }

}
