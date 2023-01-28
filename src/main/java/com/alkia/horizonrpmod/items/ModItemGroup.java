package com.alkia.horizonrpmod.items;

import com.alkia.horizonrpmod.HorizonRPMod;
import com.alkia.horizonrpmod.registry.ModItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
	public static final ItemGroup Horizon = FabricItemGroupBuilder.build(new Identifier(HorizonRPMod.MOD_ID, "horizonrpmod"), () -> new ItemStack(ModItems.RiCoin));
	public static final ItemGroup HorizonDiscs = FabricItemGroupBuilder.build(new Identifier(HorizonRPMod.MOD_ID, "horizonrpmoddiscs"), () -> new ItemStack(ModItems.cardinalbox_disc));

}
