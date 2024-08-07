package net.maisiemarlowe.angelsascent.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.maisiemarlowe.angelsascent.AngelsAscent;
import net.maisiemarlowe.angelsascent.block.ModBlocks;
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
                entries.add(ModBlocks.SOUL_ORE);
                entries.add(ModBlocks.HOLY_ORE);
                entries.add(ModBlocks.BLASPHEMOUS_ORE);


                entries.add(ModItems.ENDER_SHARD);
                entries.add(ModItems.PURIFIED_ENDER_SHARD);

                entries.add(ModItems.SOUL_FRAGMENT);
                entries.add(ModItems.SOUL_POWDER);

                entries.add(ModItems.PURIFIED_EYE_OF_ENDER);

                entries.add(ModBlocks.COMPRESSOR_BLOCK);

                entries.add(ModItems.COMPRESSED_ENDER_PEARL);
                entries.add(ModItems.DOUBLE_COMPRESSED_ENDER_PEARL);
                entries.add(ModItems.TRIPLE_COMPRESSED_ENDER_PEARL);
                entries.add(ModItems.ULTRA_COMPRESSED_ENDER_PEARL);

                entries.add(ModItems.HOLY_NUGGET);
                entries.add(ModItems.HOLY_INGOT);
                entries.add(ModItems.BLASPHEMOUS_NUGGET);
                entries.add(ModItems.BLASPHEMOUS_INGOT);

                entries.add(ModItems.SOUL_DRILL);

                entries.add(ModItems.HOLY_CARROT);
                entries.add(ModItems.HOLY_SHOVEL);
                entries.add(ModItems.HOLY_PICKAXE);
                entries.add(ModItems.HOLY_AXE);
                entries.add(ModItems.HOLY_HOE);
                entries.add(ModItems.HOLY_SWORD);

                entries.add(ModItems.BLASPHEMOUS_CARROT);
                entries.add(ModItems.BLASPHEMOUS_SHOVEL);
                entries.add(ModItems.BLASPHEMOUS_PICKAXE);
                entries.add(ModItems.BLASPHEMOUS_AXE);
                entries.add(ModItems.BLASPHEMOUS_HOE);
                entries.add(ModItems.BLASPHEMOUS_SWORD);

                entries.add(ModItems.BLASPHEMOUS_DRILL);

                entries.add(ModItems.HALO);

                entries.add(ModItems.HOLY_WINGS);
                entries.add(ModItems.BLASPHEMOUS_WINGS);



                    })).build());



    public static void registerItemGroups() {
        AngelsAscent.LOGGER.info("Registering Item Groups for " + AngelsAscent.MOD_ID);
    }
}
