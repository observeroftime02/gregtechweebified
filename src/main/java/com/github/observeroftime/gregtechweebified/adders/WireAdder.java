package com.github.observeroftime.gregtechweebified.adders;

import gregtech.GT_Mod;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.metatileentity.implementations.GT_MetaPipeEntity_Cable;
import gregtech.api.metatileentity.implementations.GT_MetaPipeEntity_Item;
import gregtech.api.util.GT_LanguageManager;
import gregtech.api.util.GT_Log;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;


public class WireAdder implements Runnable {

    public final static String aTextWire1 = "wire."; private static final String aTextCable1 = "cable."; private static final String aTextWire2 = " Wire"; private static final String aTextCable2 = " Cable";
    public final static boolean aBoolConst_0 = false;



    @Override
    public void run(){
        long bits = GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.BUFFERED;
        long bitsd = GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.BUFFERED;
        boolean bEC = !GT_Mod.gregtechproxy.mHardcoreCables;

        GT_Log.out.println("REGISTERING TESTMATERIAL WIRES");

        makeWires(MaterialAdder.Testmaterial, 29000, 1L, 2L, 16, GT_Values.V[2], true, false);

    }





    private static void makeWires(Materials aMaterial, int aStartID, long aLossInsulated, long aLoss, long aAmperage, long aVoltage, boolean aInsulatable, boolean aAutoInsulated) {
        String name = GT_LanguageManager.i18nPlaceholder ? "%material" : aMaterial.mDefaultLocalName;
        GT_OreDictUnificator.registerOre(OrePrefixes.wireGt01, aMaterial, new GT_MetaPipeEntity_Cable(aStartID + 0, aTextWire1 + aMaterial.mName.toLowerCase() + ".01", "1x " + name + aTextWire2, 0.125F, aMaterial, aLoss, 1L * aAmperage, aVoltage, aBoolConst_0, !aAutoInsulated).getStackForm(1L));
        GT_OreDictUnificator.registerOre(OrePrefixes.wireGt02, aMaterial, new GT_MetaPipeEntity_Cable(aStartID + 1, aTextWire1 + aMaterial.mName.toLowerCase() + ".02", "2x " + name + aTextWire2, 0.25F, aMaterial, aLoss, 2L * aAmperage, aVoltage, aBoolConst_0, !aAutoInsulated).getStackForm(1L));
        GT_OreDictUnificator.registerOre(OrePrefixes.wireGt04, aMaterial, new GT_MetaPipeEntity_Cable(aStartID + 2, aTextWire1 + aMaterial.mName.toLowerCase() + ".04", "4x " + name + aTextWire2, 0.375F, aMaterial, aLoss, 4L * aAmperage, aVoltage, aBoolConst_0, !aAutoInsulated).getStackForm(1L));
        GT_OreDictUnificator.registerOre(OrePrefixes.wireGt08, aMaterial, new GT_MetaPipeEntity_Cable(aStartID + 3, aTextWire1 + aMaterial.mName.toLowerCase() + ".08", "8x " + name + aTextWire2, 0.5F, aMaterial, aLoss, 8L * aAmperage, aVoltage, aBoolConst_0, !aAutoInsulated).getStackForm(1L));
        GT_OreDictUnificator.registerOre(OrePrefixes.wireGt12, aMaterial, new GT_MetaPipeEntity_Cable(aStartID + 4, aTextWire1 + aMaterial.mName.toLowerCase() + ".12", "12x " + name + aTextWire2, 0.625F, aMaterial, aLoss, 12L * aAmperage, aVoltage, aBoolConst_0, !aAutoInsulated).getStackForm(1L));
        GT_OreDictUnificator.registerOre(OrePrefixes.wireGt16, aMaterial, new GT_MetaPipeEntity_Cable(aStartID + 5, aTextWire1 + aMaterial.mName.toLowerCase() + ".16", "16x " + name + aTextWire2, 0.75F, aMaterial, aLoss, 16L * aAmperage, aVoltage, aBoolConst_0, !aAutoInsulated).getStackForm(1L));
        if (aInsulatable) {
            GT_OreDictUnificator.registerOre(OrePrefixes.cableGt01, aMaterial, new GT_MetaPipeEntity_Cable(aStartID + 6, aTextCable1 + aMaterial.mName.toLowerCase() + ".01", "1x " + name + aTextCable2, 0.25F, aMaterial, aLossInsulated, 1L * aAmperage, aVoltage, true, aBoolConst_0).getStackForm(1L));
            GT_OreDictUnificator.registerOre(OrePrefixes.cableGt02, aMaterial, new GT_MetaPipeEntity_Cable(aStartID + 7, aTextCable1 + aMaterial.mName.toLowerCase() + ".02", "2x " + name + aTextCable2, 0.375F, aMaterial, aLossInsulated, 2L * aAmperage, aVoltage, true, aBoolConst_0).getStackForm(1L));
            GT_OreDictUnificator.registerOre(OrePrefixes.cableGt04, aMaterial, new GT_MetaPipeEntity_Cable(aStartID + 8, aTextCable1 + aMaterial.mName.toLowerCase() + ".04", "4x " + name + aTextCable2, 0.5F, aMaterial, aLossInsulated, 4L * aAmperage, aVoltage, true, aBoolConst_0).getStackForm(1L));
            GT_OreDictUnificator.registerOre(OrePrefixes.cableGt08, aMaterial, new GT_MetaPipeEntity_Cable(aStartID + 9, aTextCable1 + aMaterial.mName.toLowerCase() + ".08", "8x " + name + aTextCable2, 0.625F, aMaterial, aLossInsulated, 8L * aAmperage, aVoltage, true, aBoolConst_0).getStackForm(1L));
            GT_OreDictUnificator.registerOre(OrePrefixes.cableGt12, aMaterial, new GT_MetaPipeEntity_Cable(aStartID + 10, aTextCable1 + aMaterial.mName.toLowerCase() + ".12", "12x " + name + aTextCable2, 0.75F, aMaterial, aLossInsulated, 12L * aAmperage, aVoltage, true, aBoolConst_0).getStackForm(1L));
            GT_OreDictUnificator.registerOre(OrePrefixes.cableGt16, aMaterial, new GT_MetaPipeEntity_Cable(aStartID + 11, aTextCable1 + aMaterial.mName.toLowerCase() + ".16", "16x " + name + aTextCable2, 0.875F, aMaterial, aLossInsulated, 16L * aAmperage, aVoltage, true, aBoolConst_0).getStackForm(1L));
        }

    }

    public static void generateItemPipes(Materials aMaterial, String name, String displayName, int startID, int baseInvSlots){
        GT_OreDictUnificator.registerOre(OrePrefixes.pipeTiny.get(aMaterial), 				new GT_MetaPipeEntity_Item(startID,		"GT_Pipe_" + name + "_Tiny", 			"Tiny " 	+ displayName + " Item Pipe", 			0.25F, aMaterial, baseInvSlots / 4, 131072  / baseInvSlots, false).getStackForm(1L));
        GT_OreDictUnificator.registerOre(OrePrefixes.pipeSmall.get(aMaterial), 				new GT_MetaPipeEntity_Item(startID + 1, "GT_Pipe_" + name + "_Small", 			"Small "	+ displayName + " Item Pipe",			0.375F,aMaterial, baseInvSlots / 2,	65536   / baseInvSlots, false).getStackForm(1L));
        GT_OreDictUnificator.registerOre(OrePrefixes.pipeMedium.get(aMaterial), 			new GT_MetaPipeEntity_Item(startID + 2,	"GT_Pipe_" + name, 									  displayName + " Item Pipe", 			0.50F, aMaterial, baseInvSlots, 	32768   / baseInvSlots, false).getStackForm(1L));
        GT_OreDictUnificator.registerOre(OrePrefixes.pipeLarge.get(aMaterial), 				new GT_MetaPipeEntity_Item(startID + 3, "GT_Pipe_" + name + "_Large", 			"Large " 	+ displayName + " Item Pipe", 			0.75F, aMaterial, baseInvSlots * 2, 16384   / baseInvSlots, false).getStackForm(1L));
        GT_OreDictUnificator.registerOre(OrePrefixes.pipeHuge.get(aMaterial), 				new GT_MetaPipeEntity_Item(startID + 4, "GT_Pipe_" + name + "_Huge", 			"Huge " 	+ displayName + " Item Pipe", 			0.875F,aMaterial, baseInvSlots * 4,	8192    / baseInvSlots, false).getStackForm(1L));
        GT_OreDictUnificator.registerOre(OrePrefixes.pipeRestrictiveTiny.get(aMaterial), 	new GT_MetaPipeEntity_Item(startID + 5, "GT_Pipe_Restrictive_" + name + "_Tiny", "Tiny Restrictive "  + displayName + " Item Pipe", 	0.25F, aMaterial, baseInvSlots / 4, 13107200/ baseInvSlots, true ).getStackForm(1L));
        GT_OreDictUnificator.registerOre(OrePrefixes.pipeRestrictiveSmall.get(aMaterial), 	new GT_MetaPipeEntity_Item(startID + 6, "GT_Pipe_Restrictive_" + name + "_Small","Small Restrictive " + displayName + " Item Pipe", 	0.375F,aMaterial, baseInvSlots / 2,	6553600 / baseInvSlots, true ).getStackForm(1L));
        GT_OreDictUnificator.registerOre(OrePrefixes.pipeRestrictiveMedium.get(aMaterial), 	new GT_MetaPipeEntity_Item(startID + 7, "GT_Pipe_Restrictive_" + name, 			"Restrictive "       + displayName + " Item Pipe", 	0.50F, aMaterial, baseInvSlots, 	3276800 / baseInvSlots, true ).getStackForm(1L));
        GT_OreDictUnificator.registerOre(OrePrefixes.pipeRestrictiveLarge.get(aMaterial), 	new GT_MetaPipeEntity_Item(startID + 8, "GT_Pipe_Restrictive_" + name + "_Large","Large Restrictive " + displayName + " Item Pipe", 	0.75F, aMaterial, baseInvSlots * 2, 1638400 / baseInvSlots, true ).getStackForm(1L));
        GT_OreDictUnificator.registerOre(OrePrefixes.pipeRestrictiveHuge.get(aMaterial), 	new GT_MetaPipeEntity_Item(startID + 9, "GT_Pipe_Restrictive_" + name + "_Huge", "Huge Restrictive "  + displayName + " Item Pipe", 	0.875F,aMaterial, baseInvSlots * 4,	819200  / baseInvSlots, true ).getStackForm(1L));
    }



}


