package com.alkia.horizonrpmod;

import com.alkia.horizonrpmod.registry.ModItems;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class HorizonRPMod implements ModInitializer {
	public static final String MOD_ID = "horizonrpmod";
	@Override
	public void onInitialize(ModContainer mod) {
		System.out.println("HorizonRPMod exists!");
		ModItems.registerItems();
	}
}
