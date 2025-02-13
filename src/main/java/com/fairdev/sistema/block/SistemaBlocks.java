package com.fairdev.sistema.block;

import com.fairdev.sistema.Sistema;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

public class SistemaBlocks {

    public static final Block DASHBOARD = registerBlock("dashboard",
            new BlockDashboard(
                    AbstractBlock.Settings.create().registryKey( // AbstractBlock.Settings
                    RegistryKey.of(RegistryKeys.BLOCK, // RegistryKey
                            Identifier.of(Sistema.MOD_ID, "dashboard")))
                            .sounds(BlockSoundGroup.METAL)),
            new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Sistema.MOD_ID, "dashboard"))));


    /**
        * Register a block without a block item
        *
        * @param name  The name of the block
        * @param block The block
        * @return The block
     */
    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(Sistema.MOD_ID, name), block);
    }

    /**
     * Register a block without a block item
     * @param block - The actual block you will pass into the method and via generic type
     */
    @Nullable
    private <T extends Block> Block registerBlockAndItem(T block) {
        return null;
    }

    /**
     * Register a block with a block item
     * @param name - The name of the block (modname:blockname)
     * @param block - The block to register
     * @param settings - The settings for the block item
     */
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
