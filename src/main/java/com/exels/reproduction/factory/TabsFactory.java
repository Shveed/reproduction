package com.exels.reproduction.factory;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class TabsFactory {

    public static final CreativeModeTab REPRODUCTION_TAB = new CreativeModeTab("reproductiontab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ItemsFactory.LEAF.get());
        }
    };
}
