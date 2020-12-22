package com.shveed.reproduction.data;

import com.shveed.reproduction.ReproductionMod;
import com.shveed.reproduction.data.client.BlockStateProvider;
import com.shveed.reproduction.data.client.ItemModelProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = ReproductionMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators {

    private DataGenerators(){}

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(new BlockStateProvider(generator, existingFileHelper));
        generator.addProvider(new ItemModelProvider(generator, existingFileHelper));
    }
}
