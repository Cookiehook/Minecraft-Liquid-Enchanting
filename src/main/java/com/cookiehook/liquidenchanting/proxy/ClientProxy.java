package com.cookiehook.liquidenchanting.proxy;

import com.cookiehook.liquidenchanting.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {

    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
    }

    public void registerItemColor() {
        for(Item item : ModItems.itemList) {
            ModItems.registerColor(item);
        }
    }
}
