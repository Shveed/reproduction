package com.exels.reproduction.registry;

import com.exels.reproduction.Reproduction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockRegistry {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Reproduction.MOD_ID);

    public static final RegistryObject<Block> LEAF_BLOCK = registerBlock("leaf_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS).instabreak()),
            TabsRegistry.REPRODUCTION_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(
            String name,
            Supplier<T> block,
            CreativeModeTab tab
    ) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(
            String name,
            RegistryObject<T> block,
            CreativeModeTab tab
    ) {
        return ItemsRegistry.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
