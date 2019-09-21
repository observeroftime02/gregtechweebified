package com.github.observeroftime.gregtechweebified.adders;

import gregtech.api.util.GT_BaseCrop;
import net.minecraft.item.ItemStack;

import static com.github.observeroftime.gregtechweebified.adders.ItemAdder.*;

public class CropAdder implements Runnable {
    @Override
    public void run() {



        new GT_BaseCrop(135, "Testcrop", "Shizuki", null, 1, 4, 0, 3, 4, 5, 0, 2, 1, 6, new String[] {
                "Ender",
                "Flower",
                "Shiny"
        }, new ItemStack(Testitem, 1), null);



    }
}
