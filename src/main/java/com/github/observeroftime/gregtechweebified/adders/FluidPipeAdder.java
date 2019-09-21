package com.github.observeroftime.gregtechweebified.adders;

import gregtech.GT_Mod;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.metatileentity.implementations.GT_MetaPipeEntity_Fluid;
import gregtech.api.util.GT_LanguageManager;
import gregtech.api.util.GT_Log;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;


public class FluidPipeAdder implements Runnable {

    public final static String aTextWire1 = "wire."; private static final String aTextCable1 = "cable."; private static final String aTextWire2 = " Wire"; private static final String aTextCable2 = " Cable";
    public final static boolean aBoolConst_0 = false;



    @Override
    public void run(){
        long bits = GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.BUFFERED;
        long bitsd = GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.BUFFERED;
        boolean bEC = !GT_Mod.gregtechproxy.mHardcoreCables;

        GT_Log.out.println("REGISTERING TESTMATERIAL FLUID PIPES");


        generateFluidPipes(MaterialAdder.Testmaterial, MaterialAdder.Testmaterial.mName, 29030, 9500, 2500, true);
    }

    private static void generateFluidPipes(Materials aMaterial, String name, int startID, int baseCapacity, int heatCapacity, boolean gasProof){
        generateFluidPipes(aMaterial, name, GT_LanguageManager.i18nPlaceholder ? "%material" : aMaterial.mDefaultLocalName, startID, baseCapacity, heatCapacity, gasProof);
    }


    private static void generateFluidPipes(Materials aMaterial, String fname, String displayName, int startID, int baseCapacity, int heatCapacity, boolean gasProof){
        GT_OreDictUnificator.registerOre(OrePrefixes.pipeTiny.get(aMaterial), 	new GT_MetaPipeEntity_Fluid(startID, 		"GT_Pipe_" + fname + "_Tiny", 	"Tiny " + displayName + " Fluid Pipe", 	0.25F, 	aMaterial, baseCapacity / 6, 	heatCapacity, gasProof).getStackForm(1L));
        GT_OreDictUnificator.registerOre(OrePrefixes.pipeSmall.get(aMaterial), 	new GT_MetaPipeEntity_Fluid(startID + 1, 	"GT_Pipe_" +fname + "_Small", 	"Small " + displayName + " Fluid Pipe", 0.375F, aMaterial, baseCapacity / 3, 	heatCapacity, gasProof).getStackForm(1L));
        GT_OreDictUnificator.registerOre(OrePrefixes.pipeMedium.get(aMaterial), new GT_MetaPipeEntity_Fluid(startID + 2, 	"GT_Pipe_" + fname, 				displayName + " Fluid Pipe", 			0.5F, 	aMaterial, baseCapacity, 		heatCapacity, gasProof).getStackForm(1L));
        GT_OreDictUnificator.registerOre(OrePrefixes.pipeLarge.get(aMaterial), 	new GT_MetaPipeEntity_Fluid(startID + 3, 	"GT_Pipe_" + fname + "_Large", 	"Large " + displayName + " Fluid Pipe", 0.75F, 	aMaterial, baseCapacity * 2, 	heatCapacity, gasProof).getStackForm(1L));
        GT_OreDictUnificator.registerOre(OrePrefixes.pipeHuge.get(aMaterial), 	new GT_MetaPipeEntity_Fluid(startID + 4, 	"GT_Pipe_" + fname + "_Huge", 	"Huge " + displayName + " Fluid Pipe", 	0.875F, 	aMaterial, baseCapacity * 4, 	heatCapacity, gasProof).getStackForm(1L));

    }

}


