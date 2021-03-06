package com.grim3212.mc.pack.decor.block;

import com.grim3212.mc.pack.core.block.BlockManual;
import com.grim3212.mc.pack.core.manual.pages.Page;
import com.grim3212.mc.pack.decor.client.ManualDecor;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockHardenedWood extends BlockManual {

	public BlockHardenedWood() {
		super(Material.ROCK, SoundType.STONE);
	}

	@Override
	public Page getPage(IBlockState state) {
		return ManualDecor.colorizer_page;
	}
}
