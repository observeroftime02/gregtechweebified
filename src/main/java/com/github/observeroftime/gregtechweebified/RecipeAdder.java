package com.github.observeroftime.gregtechweebified;

import gregtech.api.enums.GT_Values;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import static com.github.observeroftime.gregtechweebified.Material_Zeugs.*;
import static com.github.observeroftime.gregtechweebified.ItemRegistry.*;

public class RecipeAdder implements Runnable {


    @Override
    public void run() {
        GT_Values.RA.addExtractorRecipe(new ItemStack(Blocks.dirt, 1), Testmaterial.getIngots(64), 30,30);
        GT_Values.RA.addExtractorRecipe(new ItemStack(Testitem, 1), Testmaterial.getIngots(64), 30,30);
        GT_Values.RA.addFluidExtractionRecipe(Testmaterial.getIngots(1), GT_Values.NI, Testmaterial2.getFluid(144L), 10000, 20, 480);
    }
}

