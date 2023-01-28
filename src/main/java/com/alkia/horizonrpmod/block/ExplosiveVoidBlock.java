
package com.alkia.horizonrpmod.block;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.TntEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.BlockView;
import net.minecraft.util.math.BlockPos;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.loot.context.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import net.minecraft.world.explosion.ExplosionBehavior;

import java.util.List;
import java.util.Collections;

public class ExplosiveVoidBlock extends Block {
	private static boolean always(BlockState state, BlockView world, BlockPos pos) {
		return true;
	}

	public ExplosiveVoidBlock() {
		super(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.WET_GRASS).strength(1.5F, 4.0F).luminance(7)
				.emissiveLighting(ExplosiveVoidBlock::always).mapColor(MapColor.BLACK));
	}

	@Override
	public List<ItemStack> getDroppedStacks(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDroppedStacks(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(Blocks.AIR, (int) (1)));
	}

	@Override
	public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
		super.onBreak(world, pos, state, player);
		if (!world.isClient){
			final TntEntity tntEntity = new TntEntity(world, pos.getX(), pos.getY(), pos.getZ(), player);
			tntEntity.setFuse(-1);
			tntEntity.setInvisible(true);
			world.spawnEntity(tntEntity);
		}

	}

	@Override
	public void onDestroyedByExplosion(World world, BlockPos pos, Explosion explosion) {
		super.onDestroyedByExplosion(world, pos, explosion);
		if(!world.isClient){
			final TntEntity tntEntity = new TntEntity(world, pos.getX(), pos.getY(), pos.getZ(), null);
			tntEntity.setFuse(-1);
			tntEntity.setInvisible(true);
			world.spawnEntity(tntEntity);
		}


	}
}
