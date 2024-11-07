package com.raptormm4.palegardenplus;

import com.raptormm4.palegardenplus.block.ModBlocks;
import com.raptormm4.palegardenplus.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PaleGardenPlus implements ModInitializer {
	public static final String MOD_ID = "palegardenplus";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Now Loading Pale Garden+");
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}