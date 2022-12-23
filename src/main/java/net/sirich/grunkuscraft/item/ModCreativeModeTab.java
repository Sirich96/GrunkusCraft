package net.sirich.grunkuscraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab
{
    public static final CreativeModeTab GRUNKUS_TAB = new CreativeModeTab("grunkustab")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ModItems.RAW_NIOBIUM.get());
        }
    };
}
