package com.github.observeroftime.gregtechweebified;

import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_BaseCrop;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.loaders.postload.GT_CropLoader.*;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static  gregtech.loaders.postload.GT_CropLoader.*;

public class CropAdder implements Runnable {
    @Override
    public void run() {



        new GT_BaseCrop(129, "TestCrop", "MamiTomoe", null, 8, 4, 0, 1, 4, 2, 0, 4, 1, 3, new String[] {
                "Fire",
                "Undead",
                "Reed",
                "Coal",
                "Rotten",
                "Wither"
        }, Materials.Coal, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Coal, 1L), new ItemStack[] {
                new ItemStack(Items.coal, 1), new ItemStack(Items.coal, 1)
        });



    }
}
