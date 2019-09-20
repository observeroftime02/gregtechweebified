package com.github.observeroftime.gregtechweebified;

import gregtech.GT_Mod;
import gregtech.api.GregTech_API;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.metatileentity.implementations.GT_MetaPipeEntity_Cable;
import gregtech.api.metatileentity.implementations.GT_MetaPipeEntity_Frame;
import gregtech.api.util.GT_LanguageManager;
import gregtech.api.util.GT_Log;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.loaders.preload.GT_Loader_MetaTileEntities;
import gregtech.loaders.preload.GT_Loader_MetaTileEntities.*;
import static gregtech.loaders.preload.GT_Loader_MetaTileEntities.*;
import com.github.observeroftime.gregtechweebified.Material_Zeugs.*;



public class MetaItemAdder implements Runnable {

    public final static String aTextWire1 = "wire."; private static final String aTextCable1 = "cable."; private static final String aTextWire2 = " Wire"; private static final String aTextCable2 = " Cable";
    public final static boolean aBoolConst_0 = false;



    @Override
    public void run(){
        long bits = GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.BUFFERED;
        long bitsd = GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.BUFFERED;
        boolean bEC = !GT_Mod.gregtechproxy.mHardcoreCables;

        GT_Log.out.println("REGISTERING TESTMATERIAL WIRES");

        makeWires(Material_Zeugs.Testmaterial, 29000, 1L, 2L, 16, GT_Values.V[2], true, false);


    }

    public static void makeWires(Materials aMaterial, int aStartID, long aLossInsulated, long aLoss, long aAmperage, long aVoltage, boolean aInsulatable, boolean aAutoInsulated) {
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


}


