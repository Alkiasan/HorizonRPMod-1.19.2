package com.alkia.horizonrpmod.block;

import com.alkia.horizonrpmod.registry.ModItems;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.loot.context.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import java.util.List;
import java.util.Collections;

public class StaticvoidBlock extends Block {
    public StaticvoidBlock() {
        super(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.WET_GRASS).strength(1F, 10F).luminance(0)
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
