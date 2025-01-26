package com.fairdev.sistema;

import com.fairdev.sistema.blocks.BlockDashboard;
import com.fairdev.sistema.blocks.SistemaBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
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
