package com.exels.reproduction.registry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class TabsRegistry {

    public static final CreativeModeTab REPRODUCTION_TAB = new CreativeModeTab("reproductiontab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ItemsRegistry.LEAF.get());
        }
    };
}
