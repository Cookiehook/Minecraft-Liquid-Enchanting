package com.cookiehook.liquidenchanting.util;

import com.cookiehook.liquidenchanting.Main;
import com.cookiehook.liquidenchanting.init.ModItems;
import com.google.common.collect.Lists;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.RegistryNamespaced;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.Logger;

import java.util.List;

@Mod.EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegsiter(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ModItems.itemList.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onModelRegsiter(ModelRegistryEvent event) {
        for (Item item : ModItems.itemList) {
            Main.proxy.registerItemRenderer(item, 0, "inventory");
        }
    }


    public static void printRegisteredPotions(Logger logger) {
        RegistryNamespaced<ResourceLocation, Potion> REGISTRY = net.minecraftforge.registries.GameData.getWrapper(Potion.class);
        List<Potion> potions = Lists.newArrayList(REGISTRY.iterator());
        logger.warn("Registry names for all potions");
        for (Potion potion : potions) {
            logger.info(potion.getRegistryName());
        }
    }

}
