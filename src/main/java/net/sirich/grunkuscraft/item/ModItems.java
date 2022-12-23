package net.sirich.grunkuscraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sirich.grunkuscraft.GrunkusCraft;


public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GrunkusCraft.MOD_ID);

    public static final RegistryObject<Item> NIOBIUM = ITEMS.register("niobium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GRUNKUS_TAB)));

    public static final RegistryObject<Item> RAW_NIOBIUM = ITEMS.register("raw_niobium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GRUNKUS_TAB)));

    public static final RegistryObject<Item> NIOBIUM_NUGGET = ITEMS.register("niobium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GRUNKUS_TAB)));


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
