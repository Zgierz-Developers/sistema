package com.fairdev.sistema.blocks;

import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;


/**
    * BlockQuantumDrives will store items in the superpositions
    * Block will be represented as a block with synthetic glass and you can see the super positions of the items in the block
 */
public class BlockQuantumDrives extends Blocks implements BlockEntityProvider {

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return null;
    }
}
