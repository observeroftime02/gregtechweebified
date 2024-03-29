package com.github.observeroftime.gregtechweebified.adders;

import gregtech.api.enums.*;
import gregtech.api.interfaces.IMaterialHandler;
import gregtech.api.util.GT_Log;
import net.minecraft.enchantment.Enchantment;

public class MaterialAdder implements IMaterialHandler {



    public static Materials Testmaterial              = new Materials( 769, TextureSet.SET_SHINY             ,  15.0F,   8192,  5, 1|2  |8      |64|128      , 255, 255, 255,   0,   "Testmaterial"              ,   "Testmaterial"                    ,    0,       0,       7200, 7200,  true, false,   1,   1,   1, Dyes.dyeLightGray   );
    public static Materials Testmaterial2             = new Materials( 777, TextureSet.SET_SHINY             ,  15.0F,   8192,  5, 1|2|4|8|16|32|64|128      , 255, 0, 255,   0,   "Testmaterial2"              ,   "Testmaterial2"                    ,    0,       0,       7200, 7200,  true, false,   1,   1,   1, Dyes.dyeLightGray   ).disableAutoGeneratedBlastFurnaceRecipes();
    public static Materials Gamergirlbathwater        = new Materials( 776, TextureSet.SET_FLUID             ,  15.0F,   8192,  5, 16                        , 255, 120, 255,   0,   "Gamergirlbathwater"              ,   "Gamer Girl Bathwater"                    ,    0,       0,       7200, 7200,  true, false,   1,   1,   1, Dyes.dyeLightGray   );


private static void initSubTags(){

    Testmaterial.add(SubTag.NO_WORKING);
    Testmaterial2.addOreByProducts( Materials.Neodymium, Testmaterial, Materials.Cobalt, Materials.Gallium);
    Testmaterial2.mMoltenRGBa[0] = 128;
    Testmaterial2.mMoltenRGBa[1] = 255;
    Testmaterial2.mMoltenRGBa[2] = 128;
    Testmaterial2.mMoltenRGBa[3] = 0;
    Testmaterial2.mChemicalFormula = "Made from imaginary atoms";
    Testmaterial2.add(SubTag.NO_RECYCLING);

}

    static {
        initSubTags();
    }


    @Override
    public void onMaterialsInit() {
        GT_Log.out.println("Adding Weebified Materials...");
    }

    @Override
    public void onComponentInit() {

    }

    @Override
    public void onComponentIteration(Materials materials) {

    }




}
