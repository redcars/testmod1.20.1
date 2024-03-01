package net.henrik.testmod;

import net.fabricmc.api.ModInitializer;

import net.henrik.testmod.block.ModBlocks;
import net.henrik.testmod.item.ModItemGroups;
import net.henrik.testmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	public static final String MOD_ID = "testmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemsGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}