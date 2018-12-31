package com.cookiehook.liquidenchanting.util;

import com.cookiehook.liquidenchanting.Main;
import com.cookiehook.liquidenchanting.init.ModItems;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

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

}
