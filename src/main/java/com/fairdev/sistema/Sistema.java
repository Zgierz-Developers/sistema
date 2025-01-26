package com.fairdev.sistema;

import com.fairdev.sistema.blocks.BlockDashboard;
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
		Identifier id = Identifier.of(MOD_ID, "test_block");
		RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, id);
		RegistryKey<Item> keyItem = RegistryKey.of(RegistryKeys.ITEM, id);

		Block.Settings settings = AbstractBlock.Settings.create().registryKey(key);

		Block block = new BlockDashboard(settings);


		Registry.register(Registries.BLOCK, key, block);
		Registry.register(Registries.ITEM, keyItem, new BlockItem(block, new Item.Settings().registryKey(keyItem)));
	}
}
