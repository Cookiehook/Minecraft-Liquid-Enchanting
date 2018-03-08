package com.cookiehook.liquidenchanting;

import java.io.File;

import com.cookiehook.liquidenchanting.init.ModItems;
import com.cookiehook.liquidenchanting.proxy.CommonProxy;
import com.cookiehook.liquidenchanting.recipes.ModRecipes;
import com.cookiehook.liquidenchanting.util.Config;
import com.cookiehook.liquidenchanting.util.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION)
public class Main {

	@Instance(Reference.MOD_ID)
	public static Main instance;
	public static File configDir;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public void PreInit(FMLPreInitializationEvent event) {
		configDir = new File(event.getModConfigurationDirectory() + "/" + Reference.MOD_ID);
		configDir.mkdir();
		Config.init(new File(configDir.getPath(), Reference.MOD_ID + ".cfg"));
		
		ModItems.init();
		ModItems.register();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		ModRecipes.registerRecipes();
		proxy.registerRenders();
	}

	@EventHandler
	public void PostInit(FMLPostInitializationEvent event) {

	}
}
