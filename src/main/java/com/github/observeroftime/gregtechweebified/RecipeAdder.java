package com.github.observeroftime.gregtechweebified;

import gregtech.api.enums.GT_Values;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_OreDictUnificator;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import com.github.observeroftime.gregtechweebified.ItemRegistry.*;

import static com.github.observeroftime.gregtechweebified.Material_Zeugs.*;
import static com.github.observeroftime.gregtechweebified.ItemRegistry.*;

public class RecipeAdder implements Runnable {


    @Override
    public void run() {
        GT_Values.RA.addExtractorRecipe(new ItemStack(Blocks.dirt, 1), Testmaterial.getIngots(64), 30,30);
        GT_Values.RA.addExtractorRecipe(new ItemStack(Testitem, 1), Testmaterial.getIngots(64), 30,30);
        GT_Values.RA.addFluidExtractionRecipe(Testmaterial.getIngots(1), GT_Values.NI, Testmaterial2.getFluid(144L), 10000, 20, 480);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Testmaterial2, 32L), new ItemStack(Testitem, 32), Materials.Helium.getPlasma(144), null, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Testmaterial2, 1L), null, 125, 125,2700);
    }
}

