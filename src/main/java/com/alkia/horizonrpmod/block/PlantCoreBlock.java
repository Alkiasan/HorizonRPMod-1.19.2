
package com.alkia.horizonrpmod.block;

import net.minecraft.world.BlockView;
import net.minecraft.util.math.BlockPos;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.loot.context.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Material;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import java.util.List;
import java.util.Collections;

public class PlantCoreBlock extends Block {
	private static boolean always(BlockState state, BlockView world, BlockPos pos) {
		return true;
	}

	public PlantCoreBlock() {
		super(FabricBlockSettings.of(Material.LEAVES).sounds(BlockSoundGroup.CROP).strength(1F, 10F).luminance(0)
				.emissiveLighting(PlantCoreBlock::always));
	}

	@Override
	public boolean isTranslucent(BlockState state, BlockView world, BlockPos pos) {
		return true;
	}

	@Override
	public List<ItemStack> getDroppedStacks(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDroppedStacks(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
