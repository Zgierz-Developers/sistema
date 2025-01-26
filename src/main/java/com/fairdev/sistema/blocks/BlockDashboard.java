package com.fairdev.sistema.blocks;

import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class BlockDashboard extends Block {



    public BlockDashboard(Settings settings) {
        super(settings);
        this.settings.hardness(1.0F);
        this.settings.sounds(BlockSoundGroup.METAL);

    }
}
