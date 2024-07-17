package net.maisiemarlowe.angelsascent;

import net.fabricmc.api.ModInitializer;

import net.maisiemarlowe.angelsascent.item.ModItemGroups;
import net.maisiemarlowe.angelsascent.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AngelsAscent implements ModInitializer {
	public static final String MOD_ID = "angelsascent";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();

	}
}