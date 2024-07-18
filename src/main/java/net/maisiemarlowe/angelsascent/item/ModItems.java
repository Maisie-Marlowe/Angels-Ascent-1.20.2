package net.maisiemarlowe.angelsascent.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.maisiemarlowe.angelsascent.AngelsAscent;
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

    public static final Item WINGS = registerItem("Angellic Wings", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(PURIFIED_EYE_OF_ENDER);
        entries.add(ENDER_SHARD);
        entries.add(PURIFIED_ENDER_SHARD);
        entries.add(SOUL_POWDER);
        entries.add(COMPRESSED_ENDER_PEARL);
        entries.add(DOUBLE_COMPRESSED_ENDER_PEARL);
        entries.add(TRIPLE_COMPRESSED_ENDER_PEARL);
        entries.add(ULTRA_COMPRESSED_ENDER_PEARL);
        entries.add(WINGS);
    }


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(AngelsAscent.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AngelsAscent.LOGGER.info("Registering Mod Items for " + AngelsAscent.MOD_ID);
    }

}
