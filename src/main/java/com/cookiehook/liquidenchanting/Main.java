package com.cookiehook.liquidenchanting;

import com.cookiehook.liquidenchanting.events.LiquidEnchantingEvent;
import com.cookiehook.liquidenchanting.util.Config;
import com.cookiehook.liquidenchanting.util.Reference;
import com.google.common.collect.Lists;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.RegistryNamespaced;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.util.List;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Main {

    @Mod.Instance
    public static Main instance;

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        File configDir = new File(event.getModConfigurationDirectory() + "/" + Reference.MOD_ID);
        configDir.mkdir();
        Config.init(new File(configDir.getPath(), Reference.MOD_ID + ".cfg"));

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new LiquidEnchantingEvent());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        RegistryNamespaced<ResourceLocation, Potion> REGISTRY = net.minecraftforge.registries.GameData.getWrapper(Potion.class);
        List<Potion> potions = Lists.newArrayList(REGISTRY.iterator());
        logger.warn("Registry names for all potions");
        for (Potion potion : potions) {
            logger.info(potion.getRegistryName());
        }
    }
}
