package com.github.observeroftime.gregtechweebified.adders;


import com.github.bartimaeusnek.bartworks.common.items.SimpleSubItemClass;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;


public class ItemAdder implements Runnable {
    public static final Item Testitem = new SimpleSubItemClass("Testitem1", "Testitem2");

    public void run() {
        GameRegistry.registerItem(Testitem, "Testitem");
    }
};



