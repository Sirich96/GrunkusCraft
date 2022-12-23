package net.sirich.grunkuscraft.world.feature;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraftforge.registries.RegistryObject;
import net.sirich.grunkuscraft.GrunkusCraft;
import net.sirich.grunkuscraft.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

import java.util.List;

public class ModConfiguredFeatures
{
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, GrunkusCraft.MOD_ID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_NIOBIUM_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.NIOBIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_NIOBIUM_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> NIOBIUM_ORE = CONFIGURED_FEATURES.register("niobium_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_NIOBIUM_ORES.get(), 9)));

    public static void register(IEventBus eventBus)
    {
        CONFIGURED_FEATURES.register(eventBus);
    }
}
