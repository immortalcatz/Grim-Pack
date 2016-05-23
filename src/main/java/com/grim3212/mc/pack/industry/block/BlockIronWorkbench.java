package com.grim3212.mc.pack.industry.block;

import com.grim3212.mc.pack.industry.GrimIndustry;
import com.grim3212.mc.pack.industry.client.gui.IndustryGuiHandler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class BlockIronWorkbench extends Block {

	protected BlockIronWorkbench() {
		super(Material.iron);
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
		if (worldIn.isRemote)
			return true;

		playerIn.openGui(GrimIndustry.INSTANCE, IndustryGuiHandler.ironGUI, worldIn, pos.getX(), pos.getY(), pos.getZ());
		return true;
	}
}