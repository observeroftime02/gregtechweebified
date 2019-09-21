package com.github.observeroftime.gregtechweebified;

        import com.github.observeroftime.gregtechweebified.adders.*;
        import cpw.mods.fml.common.event.FMLPostInitializationEvent;
        import cpw.mods.fml.common.event.FMLPreInitializationEvent;
        import cpw.mods.fml.common.Mod;
        import cpw.mods.fml.common.Mod.EventHandler;
        import cpw.mods.fml.common.event.FMLInitializationEvent;
        import gregtech.api.GregTech_API;

@Mod(modid = GregtechWeebified.MODID, version = GregtechWeebified.VERSION,
        dependencies = "required-after:IC2; "
                + "required-after:gregtech; ")
public class GregtechWeebified
{
    public static final String MODID = "gregtechweebified";
    public static final String VERSION = "0.1";

    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        new MaterialAdder();
        GregTech_API.sAfterGTPostload.add(new RecipeAdder());
        GregTech_API.sAfterGTPostload.add(new FluidAdder());
        GregTech_API.sAfterGTPostload.add(new CropAdder());
        new ItemAdder().run();
        new Beeadder();
            }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        new TestLog().run();
        new ItemPipeAdder().run();
        new FluidPipeAdder().run();
        new WireAdder().run();


    }
    @EventHandler
    public void postinit(FMLPostInitializationEvent event) {


    }

}


