package com.exels.reproduction.registry;

import com.exels.reproduction.Reproduction;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemsRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Reproduction.MOD_ID);

    public static final RegistryObject<Item> LEAF = ITEMS.register("leaf",
            () -> new Item(new Item.Properties().tab(TabsRegistry.REPRODUCTION_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
