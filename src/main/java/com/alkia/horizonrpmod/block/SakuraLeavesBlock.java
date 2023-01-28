
package com.alkia.horizonrpmod.block;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.loot.context.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.BlockState;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import java.util.List;
import java.util.Collections;

public class SakuraLeavesBlock extends LeavesBlock {
	public SakuraLeavesBlock() {
		super(FabricBlockSettings.of(Material.LEAVES).sounds(BlockSoundGroup.VINE).strength(1F, 10F).luminance(0).nonOpaque()
				.materialColor(MapColor.PINK));
	}

	@Override
	public List<ItemStack> getDroppedStacks(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDroppedStacks(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
