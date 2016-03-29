package com.grim3212.mc.core.item;

import com.grim3212.mc.core.GrimCore;
import com.grim3212.mc.core.client.RenderHelper;
import com.grim3212.mc.core.manual.ItemManual;
import com.grim3212.mc.core.part.IPartItems;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class CoreItems implements IPartItems {

	public static Item instruction_manual;

	@Override
	public void initItems() {
		instruction_manual = (new ItemManual()).setUnlocalizedName("instruction_manual").setCreativeTab(GrimCore.INSTANCE.getCreativeTab());
		GameRegistry.registerItem(instruction_manual, "instruction_manual");
	}

	@Override
	public void addRecipes() {
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(instruction_manual), new Object[] { Items.book, "dyeBlack", "dyeBrown" }));
	}

	@Override
	public void renderItems() {
		RenderHelper.renderItem(instruction_manual);
	}

}