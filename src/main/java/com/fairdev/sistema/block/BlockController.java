package com.fairdev.sistema.block;

import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;


/**
 * BlockController will be the main block that is important and without it your digital system will not work.
 * It will implement interface that will have essential functions to provide the system all important handlers such as: NetworkNode, EnergyNodeElement etc
 * Its important to declare that block will search for mentioned obove NetworkNodes such as: Import Nodes, Dashboards
 */
public class BlockController extends Blocks implements BlockEntityProvider {

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return null;
    }
}
