package com.ridanisaurus.felinium;

import com.ridanisaurus.felinium.registries.ItemHandler;
import com.ridanisaurus.felinium.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Reference.MOD_ID)
public class Felinium {
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public Felinium() {
        ItemHandler.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::init);
    }

    private void init(final FMLConstructModEvent event) {
        ItemHandler.itemInit();
    }

    public static final ItemGroup TAB = new ItemGroup("felinium") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.IRON_INGOT);
        }
    };
}
