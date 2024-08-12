package net.maisiemarlowe.angelsascent;

import net.fabricmc.api.ModInitializer;
import net.maisiemarlowe.angelsascent.block.entity.EndPortalFrameBlockEntity;
import net.maisiemarlowe.angelsascent.block.ModBlocks;
import net.maisiemarlowe.angelsascent.block.entity.ModBlockEntities;
import net.maisiemarlowe.angelsascent.enchantments.FlashFreezeEnchantment;
import net.maisiemarlowe.angelsascent.enchantments.ModEnchantments;
import net.maisiemarlowe.angelsascent.event.BlockEventHandler;
import net.maisiemarlowe.angelsascent.item.ModItemGroups;
import net.maisiemarlowe.angelsascent.item.ModItems;
import net.maisiemarlowe.angelsascent.recipe.ModRecipes;
import net.maisiemarlowe.angelsascent.screen.ModScreenHandlers;
import net.maisiemarlowe.angelsascent.world.gen.ModWorldGeneration;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;

public class AngelsAscent implements ModInitializer {
	public static final String MOD_ID = "angelsascent";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	public static final BlockEntityType<EndPortalFrameBlockEntity> END_PORTAL_FRAME_BLOCK_ENTITY_TYPE =
			BlockEntityType.Builder.create(EndPortalFrameBlockEntity::new, Blocks.END_PORTAL_FRAME).build(null);


	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();

		ModWorldGeneration.generateModWorldGen();
		BlockEventHandler.registerBlockEvents();

		Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(AngelsAscent.MOD_ID, "end_portal_frame_block_entity"), END_PORTAL_FRAME_BLOCK_ENTITY_TYPE);

		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();

		ModRecipes.registerRecipes();


		GeckoLib.initialize();

		ModEnchantments.registerModEnchantments();




	}
}