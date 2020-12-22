package com.shveed.reproduction.data.client;

import com.shveed.reproduction.ReproductionMod;
import com.shveed.reproduction.setup.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockStateProvider extends net.minecraftforge.client.model.generators.BlockStateProvider {
    public BlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, ReproductionMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.COPPER_BLOCK.get());
        simpleBlock(ModBlocks.COPPER_ORE.get());
    }
}
