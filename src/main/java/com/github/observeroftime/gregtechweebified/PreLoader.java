package com.github.observeroftime.gregtechweebified;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = GregtechWeebified.MODID+"Preloader", version = GregtechWeebified.VERSION, dependencies = "required-after:IC2; required-before:gregtech; ")
public class PreLoader {

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        new Material_Zeugs();
    }

}