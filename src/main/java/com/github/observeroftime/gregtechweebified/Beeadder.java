package com.github.observeroftime.gregtechweebified;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import forestry.api.apiculture.*;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;
import forestry.api.genetics.AlleleManager;
import forestry.api.genetics.IAllele;
import forestry.api.genetics.IAlleleFlowers;
import forestry.apiculture.genetics.Bee;
import forestry.apiculture.genetics.BeeVariation;
import forestry.apiculture.genetics.IBeeDefinition;
import forestry.apiculture.genetics.alleles.AlleleEffect;
import forestry.core.genetics.alleles.Allele;
import forestry.core.genetics.alleles.AlleleHelper;
import forestry.core.genetics.alleles.EnumAllele;
import gregtech.api.GregTech_API;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_LanguageManager;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.common.bees.GT_AlleleBeeSpecies;
import gregtech.common.bees.GT_Bee_Mutation;
import gregtech.common.items.CombType;
import gregtech.loaders.misc.GT_Bees;
import gregtech.loaders.misc.GT_BranchDefinition;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.BiomeDictionary;
import org.apache.commons.lang3.text.WordUtils;
import gregtech.common.bees.GT_AlleleBeeSpecies;
import gregtech.common.bees.GT_Bee_Mutation;
import gregtech.common.items.CombType;
import static gregtech.loaders.misc.GT_BeeDefinition.*;

import java.util.Arrays;
import java.util.Locale;


public class Beeadder implements IBeeDefinition {




    @Override
    public IAllele[] getTemplate() {
        return new IAllele[0];
    }

    @Override
    public IBeeGenome getGenome() {
        return null;
    }

    @Override
    public IBee getIndividual() {
        return null;
    }

    @Override
    public ItemStack getMemberStack(EnumBeeType enumBeeType) {
        return null;
    }
}
