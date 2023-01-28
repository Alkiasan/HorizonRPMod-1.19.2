
package com.alkia.horizonrpmod.block;

import com.alkia.horizonrpmod.registry.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.context.LootContext;
import net.minecraft.sound.BlockSoundGroup;

import java.util.Collections;
import java.util.List;

public class CrystalizedVoidBlock extends Block {
	public CrystalizedVoidBlock() {
		super(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.GLASS).strength(1F, 1.6F).luminance(15)
				.materialColor(MapColor.BLACK));
	}

	@Override
	public List<ItemStack> getDroppedStacks(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDroppedStacks(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(ModItems.VoidChunk));
	}
}
