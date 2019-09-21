package com.github.observeroftime.gregtechweebified.adders;

import gregtech.GT_Mod;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.metatileentity.implementations.GT_MetaPipeEntity_Item;
import gregtech.api.util.GT_LanguageManager;
import gregtech.api.util.GT_Log;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;


public final class ItemPipeAdder implements Runnable {

    public final static String aTextWire1 = "wire."; private static final String aTextCable1 = "cable."; private static final String aTextWire2 = " Wire"; private static final String aTextCable2 = " Cable";
    public final static boolean aBoolConst_0 = false;



    @Override
    public void run(){
        long bits = GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.BUFFERED;
        long bitsd = GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.BUFFERED;
        boolean bEC = !GT_Mod.gregtechproxy.mHardcoreCables;

        GT_Log.out.println("REGISTERING TESTMATERIAL ITEM PIPES");

        generateItemPipes(MaterialAdder.Testmaterial, MaterialAdder.Testmaterial.mName, 29015, 16);

    }

    private static void generateItemPipes(Materials aMaterial, String name, int startID, int baseInvSlots){
        generateItemPipes(aMaterial, name, GT_LanguageManager.i18nPlaceholder ? "%material" : aMaterial.mDefaultLocalName, startID, baseInvSlots);
    }



    private static void generateItemPipes(Materials aMaterial, String name, String displayName, int startID, int baseInvSlots){
        GT_OreDictUnificator.registerOre(OrePrefixes.pipeTiny.get(aMaterial), 				new GT_MetaPipeEntity_Item(startID,		"GT_IPipe_" + name + "_Tiny", 			"Tiny " 	+ displayName + " Item Pipe", 			0.25F, aMaterial, baseInvSlots / 4, 131072  / baseInvSlots, false).getStackForm(1L));
        GT_OreDictUnificator.registerOre(OrePrefixes.pipeSmall.get(aMaterial), 				new GT_MetaPipeEntity_Item(startID + 1, "GT_IPipe_" + name + "_Small", 			"Small "	+ displayName + " Item Pipe",			0.375F,aMaterial, baseInvSlots / 2,	65536   / baseInvSlots, false).getStackForm(1L));
        GT_OreDictUnificator.registerOre(OrePrefixes.pipeMedium.get(aMaterial), 			new GT_MetaPipeEntity_Item(startID + 2,	"GT_IPipe_" + name, 									  displayName + " Item Pipe", 			0.50F, aMaterial, baseInvSlots, 	32768   / baseInvSlots, false).getStackForm(1L));
        GT_OreDictUnificator.registerOre(OrePrefixes.pipeLarge.get(aMaterial), 				new GT_MetaPipeEntity_Item(startID + 3, "GT_IPipe_" + name + "_Large", 			"Large " 	+ displayName + " Item Pipe", 			0.75F, aMaterial, baseInvSlots * 2, 16384   / baseInvSlots, false).getStackForm(1L));
        GT_OreDictUnificator.registerOre(OrePrefixes.pipeHuge.get(aMaterial), 				new GT_MetaPipeEntity_Item(startID + 4, "GT_IPipe_" + name + "_Huge", 			"Huge " 	+ displayName + " Item Pipe", 			0.875F,aMaterial, baseInvSlots * 4,	8192    / baseInvSlots, false).getStackForm(1L));
        GT_OreDictUnificator.registerOre(OrePrefixes.pipeRestrictiveTiny.get(aMaterial), 	new GT_MetaPipeEntity_Item(startID + 5, "GT_Pipe_Restrictive_" + name + "_Tiny", "Tiny Restrictive "  + displayName + " Item Pipe", 	0.25F, aMaterial, baseInvSlots / 4, 13107200/ baseInvSlots, true ).getStackForm(1L));
        GT_OreDictUnificator.registerOre(OrePrefixes.pipeRestrictiveSmall.get(aMaterial), 	new GT_MetaPipeEntity_Item(startID + 6, "GT_Pipe_Restrictive_" + name + "_Small","Small Restrictive " + displayName + " Item Pipe", 	0.375F,aMaterial, baseInvSlots / 2,	6553600 / baseInvSlots, true ).getStackForm(1L));
        GT_OreDictUnificator.registerOre(OrePrefixes.pipeRestrictiveMedium.get(aMaterial), 	new GT_MetaPipeEntity_Item(startID + 7, "GT_Pipe_Restrictive_" + name, 			"Restrictive "       + displayName + " Item Pipe", 	0.50F, aMaterial, baseInvSlots, 	3276800 / baseInvSlots, true ).getStackForm(1L));
        GT_OreDictUnificator.registerOre(OrePrefixes.pipeRestrictiveLarge.get(aMaterial), 	new GT_MetaPipeEntity_Item(startID + 8, "GT_Pipe_Restrictive_" + name + "_Large","Large Restrictive " + displayName + " Item Pipe", 	0.75F, aMaterial, baseInvSlots * 2, 1638400 / baseInvSlots, true ).getStackForm(1L));
        GT_OreDictUnificator.registerOre(OrePrefixes.pipeRestrictiveHuge.get(aMaterial), 	new GT_MetaPipeEntity_Item(startID + 9, "GT_Pipe_Restrictive_" + name + "_Huge", "Huge Restrictive "  + displayName + " Item Pipe", 	0.875F,aMaterial, baseInvSlots * 4,	819200  / baseInvSlots, true ).getStackForm(1L));
    }



}


