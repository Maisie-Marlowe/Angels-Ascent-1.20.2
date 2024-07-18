package net.maisiemarlowe.angelsascent.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.maisiemarlowe.angelsascent.AngelsAscent;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ANGELS_ASCENT_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(AngelsAscent.MOD_ID, "angelsascent"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.angelsascent"))
            .icon(() -> new ItemStack(ModItems.PURIFIED_EYE_OF_ENDER)).entries(((displayContext, entries) -> {
                entries.add(ModItems.ENDER_SHARD);
                entries.add(ModItems.PURIFIED_ENDER_SHARD);
                entries.add(ModItems.SOUL_POWDER);
                entries.add(ModItems.PURIFIED_EYE_OF_ENDER);
                entries.add(ModItems.COMPRESSED_ENDER_PEARL);
                entries.add(ModItems.DOUBLE_COMPRESSED_ENDER_PEARL);
                entries.add(ModItems.TRIPLE_COMPRESSED_ENDER_PEARL);
                entries.add(ModItems.ULTRA_COMPRESSED_ENDER_PEARL);
                entries.add(ModItems.WINGS);



                    })).build());



    public static void registerItemGroups() {
        AngelsAscent.LOGGER.info("Registering Item Groups for " + AngelsAscent.MOD_ID);
    }
}
