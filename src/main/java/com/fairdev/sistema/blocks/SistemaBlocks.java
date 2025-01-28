package com.fairdev.sistema.blocks;

import com.fairdev.sistema.Sistema;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class SistemaBlocks {

    public static final Block DASHBOARD = registerBlock("dashboard",
            new BlockDashboard(AbstractBlock.Settings.create().registryKey( // AbstractBlock.Settings
                    RegistryKey.of(RegistryKeys.BLOCK, // RegistryKey
                            Identifier.of(Sistema.MOD_ID, "dashboard"))).sounds(BlockSoundGroup.METAL)), new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Sistema.MOD_ID, "dashboard"))));


    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(Sistema.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block, Item.Settings settings) {
        registerBlockItem(name, block, settings);
        return Registry.register(Registries.BLOCK, Identifier.of(Sistema.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block, Item.Settings settings) {
        Registry.register(Registries.ITEM, Identifier.of(Sistema.MOD_ID, name),
                new BlockItem(block, settings));
    }

    public static void InitializeSistemaBlocks() {
        Sistema.LOGGER.info("Registering Mod Blocks for " + Sistema.MOD_ID);
    }
}
