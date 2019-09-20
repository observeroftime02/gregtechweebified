package com.github.observeroftime.gregtechweebified;

import gregtech.api.enums.*;
import gregtech.api.interfaces.IMaterialHandler;

public class Material_Zeugs implements IMaterialHandler {


    public static Materials Testmaterial              = new Materials( 769, TextureSet.SET_SHINY             ,  15.0F,   8192,  5, 1|2  |8      |64|128      , 255, 255, 255,   0,   "Testmaterial"              ,   "Testmaterial"                    ,    0,       0,       7200, 7200,  true, false,   1,   1,   1, Dyes.dyeLightGray   );
    public static Materials Testmaterial2             = new Materials( 777, TextureSet.SET_SHINY             ,  15.0F,   8192,  5, 1|2  |8      |64|128      , 255, 0, 255,   0,   "Testmaterial2"              ,   "Testmaterial2"                    ,    0,       0,       7200, 7200,  true, false,   1,   1,   1, Dyes.dyeLightGray   );
    public static Materials Gamergirlbathwater        = new Materials( 776, TextureSet.SET_FLUID             ,  15.0F,   8192,  5, 16                        , 255, 120, 255,   0,   "Gamergirlbathwater"              ,   "Gamer Girl Bathwater"                    ,    0,       0,       7200, 7200,  true, false,   1,   1,   1, Dyes.dyeLightGray   );



    @Override
    public void onMaterialsInit() {
        Testmaterial.add(SubTag.NO_WORKING);
    }

    @Override
    public void onComponentInit() {

    }

    @Override
    public void onComponentIteration(Materials materials) {

    }




}
