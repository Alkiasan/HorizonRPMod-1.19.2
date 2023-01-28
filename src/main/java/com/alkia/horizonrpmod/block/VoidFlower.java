
package com.alkia.horizonrpmod.block;
import net.minecraft.block.MapColor;
import net.minecraft.world.BlockView;
import net.minecraft.util.math.BlockPos;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.loot.context.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.effect.StatusEffects;

import net.minecraft.block.Material;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.BlockState;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.List;
import java.util.Collections;

public class VoidFlower extends FlowerBlock {
    public VoidFlower() {
        super(StatusEffects.SATURATION, 0, FabricBlockSettings.of(Material.PLANT, MapColor.WHITE).sounds(BlockSoundGroup.CROP).strength(0F, 0F)
                .luminance(6).noCollision().nonOpaque().breakInstantly());
    }


    @Environment(EnvType.CLIENT)
    public boolean hasEmissiveLighting(BlockView world, BlockPos pos) {
        return true;
    }

    @Override
    public List<ItemStack> getDroppedStacks(BlockState state, LootContext.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDroppedStacks(state, builder);
        if (!dropsOriginal.isEmpty()) {
            return dropsOriginal;
        }
        return Collections.singletonList(new ItemStack(this, 1));
    }
}
