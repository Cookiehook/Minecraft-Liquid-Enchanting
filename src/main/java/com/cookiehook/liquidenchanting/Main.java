package com.cookiehook.liquidenchanting;

import com.cookiehook.liquidenchanting.events.PlayerEvent;
import com.cookiehook.liquidenchanting.init.ModItems;
import com.cookiehook.liquidenchanting.proxy.CommonProxy;
import com.cookiehook.liquidenchanting.util.Config;
import com.cookiehook.liquidenchanting.util.Reference;
import com.cookiehook.liquidenchanting.util.RegistryHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import java.io.File;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Main {

    @Mod.Instance
    public static Main instance;

    private static Logger logger;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        File configDir = new File(event.getModConfigurationDirectory() + "/" + Reference.MOD_ID);
        configDir.mkdir();
        Config.init(new File(configDir.getPath(), Reference.MOD_ID + ".cfg"));

        ModItems.registerItems();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new PlayerEvent());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        RegistryHandler.printRegisteredPotions(logger);
    }
}
