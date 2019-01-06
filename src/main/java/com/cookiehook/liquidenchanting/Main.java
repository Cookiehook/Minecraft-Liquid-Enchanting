package com.cookiehook.liquidenchanting;

import com.cookiehook.liquidenchanting.events.PlayerEvent;
import com.cookiehook.liquidenchanting.init.ModItems;
import com.cookiehook.liquidenchanting.proxy.CommonProxy;
import com.cookiehook.liquidenchanting.util.Reference;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Main {

    @Mod.Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.registerItems();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.registerItemColor();
        MinecraftForge.EVENT_BUS.register(new PlayerEvent());
    }

}
