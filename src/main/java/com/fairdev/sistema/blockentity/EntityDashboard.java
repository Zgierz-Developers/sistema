package com.fairdev.sistema.blockentity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;

public class EntityDashboard extends BlockEntity {
    public EntityDashboard(BlockPos pos, BlockState state) {
        super(BlockEntityType.CHEST, pos, state);
    }
}
