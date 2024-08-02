package net.maisiemarlowe.angelsascent.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.maisiemarlowe.angelsascent.block.ModBlocks;
import net.maisiemarlowe.angelsascent.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //addDrop(ModBlocks.);

        addDrop(ModBlocks.SOUL_ORE, oreDrops(ModBlocks.SOUL_ORE, ModItems.SOUL_FRAGMENT)); //replace oreDrops with copperLikeOreDrops
        addDrop(ModBlocks.HOLY_ORE, oreDrops(ModBlocks.HOLY_ORE, ModItems.HOLY_NUGGET));
        addDrop(ModBlocks.BLASPHEMOUS_ORE, oreDrops(ModBlocks.BLASPHEMOUS_ORE, ModItems.BLASPHEMOUS_NUGGET));

    }

    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder) this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(2.0f, 5.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
