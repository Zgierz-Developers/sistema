package com.fairdev.sistema;

import com.fairdev.sistema.blocks.BlockDashboard;
import com.fairdev.sistema.blocks.SistemaBlocks;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sistema implements ModInitializer {
	public static final String MOD_ID = "sistema";

	// Logger for debugging
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// Initialize the blocks
		SistemaBlocks.InitializeSistemaBlocks();
	}
}
