package com.grim3212.mc.pack.industry.client;

import com.grim3212.mc.pack.core.manual.IManualPart;
import com.grim3212.mc.pack.core.manual.ManualPart;
import com.grim3212.mc.pack.core.manual.ManualRegistry;
import com.grim3212.mc.pack.core.manual.pages.Page;
import com.grim3212.mc.pack.core.manual.pages.PageCrafting;
import com.grim3212.mc.pack.core.manual.pages.PageFurnace;
import com.grim3212.mc.pack.core.manual.pages.PageInfo;
import com.grim3212.mc.pack.core.util.RecipeHelper;
import com.grim3212.mc.pack.industry.block.IndustryBlocks;
import com.grim3212.mc.pack.industry.client.pages.PageMachine;
import com.grim3212.mc.pack.industry.item.IndustryItems;
import com.grim3212.mc.pack.industry.util.MachineRecipes.MachineType;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ManualIndustry implements IManualPart {

	public static ManualIndustry INSTANCE = new ManualIndustry();

	public static Page workbench_page;
	public static Page iceMaker_page;
	public static Page togglerack_page;
	public static Page fireBlock_page;
	public static Page waterBlock_page;
	public static Page lavaBlock_page;
	public static Page spike_page;
	public static Page sensor_page;
	public static Page gravityBoots_page;
	public static Page controller_page;
	public static Page attract_page;
	public static Page repulse_page;
	public static Page gravitor_page;
	public static Page uranium_page;
	public static Page radiationSuit_page;
	public static Page uraniumSmelt_page;
	public static Page refinedUranium_page;
	public static Page plutonium_page;
	public static Page refinedPlutonium_page;
	public static Page reactorCore_page;
	public static Page graphite_page;
	public static Page graphiteRod_page;
	public static Page reactorCase_page;
	public static Page ironParts_page;
	public static Page reactor_page;
	public static Page aluminum_page;
	public static Page bombShell_page;
	public static Page c4_page;
	public static Page nuclearBomb_page;
	public static Page ironStick_page;
	public static Page gate_page;
	public static Page gateTrumpet_page;
	public static Page garage_page;
	public static Page garageRemote_page;
	public static Page hLight_page;
	public static Page hTorch_page;
	public static Page sidewalk_page;
	public static Page tarball_page;
	public static Page asphalt_page;
	public static Page rways_page;
	public static Page paint_page;
	public static Page doors_page;
	public static Page others_page;
	public static Page decoration_page;
	public static Page paintTech_page;
	public static Page alumIngot_page;
	public static Page alumStuff_page;
	public static Page buckLadd_page;
	public static Page coalIron_page;
	public static Page steelIngot_page;
	public static Page steelStuff_page;
	public static Page steelTools_page;
	public static Page fuel_page;
	public static Page machineInfo_page;
	public static Page refinery_page;
	public static Page refineryRecipes_page;
	public static Page derrick_page;
	public static Page derrickRecipes_page;
	public static Page modernFurnace_page;
	public static Page modernFurnaceRecipes_page;

	@Override
	public void initPages() {
		workbench_page = new PageCrafting("recipes", IndustryBlocks.workbenches, 25);
		iceMaker_page = new PageCrafting("recipes", new ItemStack(IndustryBlocks.ice_maker));
		togglerack_page = new PageCrafting("toggle", new ItemStack(IndustryBlocks.togglerack));
		fireBlock_page = new PageCrafting("fire", new ItemStack(IndustryBlocks.fire_block));
		waterBlock_page = new PageCrafting("water", new ItemStack(IndustryBlocks.water_block));
		lavaBlock_page = new PageCrafting("lava", new ItemStack(IndustryBlocks.lava_block));
		spike_page = new PageCrafting("recipe", RecipeHelper.getAllIRecipesForItem(new ItemStack(IndustryBlocks.spike)), 30);
		sensor_page = new PageCrafting("recipes", IndustryBlocks.sensors, 20);
		gravityBoots_page = new PageCrafting("boots", new ItemStack(IndustryItems.gravity_boots));
		controller_page = new PageCrafting("control", IndustryItems.control, 25);
		attract_page = new PageCrafting("attract", IndustryBlocks.attracting, 25);
		repulse_page = new PageCrafting("repulse", IndustryBlocks.repulsing, 25);
		gravitor_page = new PageCrafting("gravitor", IndustryBlocks.gravitoring, 25);
		uranium_page = new PageCrafting("uranium", new ItemStack(IndustryBlocks.uranium_ore));
		radiationSuit_page = new PageCrafting("armor", IndustryItems.armor, 20);
		uraniumSmelt_page = new PageFurnace("uranium_smelt", new ItemStack(IndustryBlocks.uranium_ore));
		refinedUranium_page = new PageCrafting("refined_uranium", new ItemStack(IndustryItems.refined_uranium));
		plutonium_page = new PageCrafting("plutonium", new ItemStack(IndustryItems.plutonium_ingot));
		refinedPlutonium_page = new PageCrafting("refined_plutonium", new ItemStack(IndustryItems.refined_plutonium));
		reactorCore_page = new PageCrafting("reactor_core", new ItemStack(IndustryItems.reactor_core));
		graphite_page = new PageFurnace("graphite", new ItemStack(Items.FLINT));
		graphiteRod_page = new PageCrafting("graphite_rod", new ItemStack(IndustryItems.graphite_rod));
		reactorCase_page = new PageCrafting("reactor_case", new ItemStack(IndustryItems.reactor_core_case));
		ironParts_page = new PageCrafting("iron_parts", new ItemStack(IndustryItems.iron_parts));
		reactor_page = new PageCrafting("reactor", new ItemStack(IndustryBlocks.reactor));
		aluminum_page = new PageFurnace("aluminium", new ItemStack(IndustryBlocks.aluminum_ore));
		bombShell_page = new PageCrafting("bomb_shell", new ItemStack(IndustryBlocks.bomb_shell));
		c4_page = new PageCrafting("c4", new ItemStack(IndustryBlocks.c4));
		nuclearBomb_page = new PageCrafting("nuclear_bomb", new ItemStack(IndustryBlocks.nuclear_bomb));
		ironStick_page = new PageCrafting("iron_stick", new ItemStack(IndustryItems.iron_stick));
		gate_page = new PageCrafting("gate", IndustryItems.gates, 25);
		gateTrumpet_page = new PageCrafting("trumpet", new ItemStack(IndustryItems.gate_trumpet));
		garage_page = new PageCrafting("garage", IndustryItems.garages, 25);
		garageRemote_page = new PageCrafting("remote", new ItemStack(IndustryItems.garage_remote));
		hLight_page = new PageCrafting("hlight", new ItemStack(IndustryBlocks.halogen_light));
		hTorch_page = new PageCrafting("htorch", IndustryBlocks.htorches, 25);
		sidewalk_page = new PageCrafting("swalk", new ItemStack(IndustryBlocks.sidewalk));
		tarball_page = new PageCrafting("tarball", new ItemStack(IndustryItems.tarball));
		asphalt_page = new PageFurnace("asphalt", new ItemStack(IndustryItems.tarball));
		rways_page = new PageCrafting("rways", IndustryBlocks.rways, 20);
		paint_page = new PageCrafting("paint", new ItemStack(IndustryItems.paint_roller));
		doors_page = new PageCrafting("doors", IndustryItems.doors, 25);
		others_page = new PageCrafting("others", IndustryBlocks.others, 25);
		decoration_page = new PageCrafting("decoration", IndustryBlocks.decoration, 25);
		paintTech_page = new PageCrafting("paint", IndustryItems.paint, 25);
		alumIngot_page = new PageFurnace("alumingot", new ItemStack(IndustryBlocks.aluminum_ore));
		alumStuff_page = new PageCrafting("alumstuff", IndustryItems.alumstuff, 25);
		buckLadd_page = new PageCrafting("buckladd", IndustryBlocks.buckladd, 25);
		coalIron_page = new PageCrafting("coaliron", IndustryItems.coaliron, 25);
		steelIngot_page = new PageFurnace("steelingot", new ItemStack(IndustryItems.coal_iron_ingot));
		steelStuff_page = new PageCrafting("steelstuff", IndustryBlocks.steelstuff, 20);
		steelTools_page = new PageCrafting("steeltools", IndustryItems.steeltools, 20);
		fuel_page = new PageCrafting("fuel", IndustryItems.fuelstuff, 25);
		machineInfo_page = new PageInfo("info");
		refinery_page = new PageCrafting("refinery", new ItemStack(IndustryBlocks.refinery));
		refineryRecipes_page = new PageMachine("refinery_recipes", new ItemStack[] { new ItemStack(IndustryItems.crude_oil), new ItemStack(IndustryItems.super_crude_oil), new ItemStack(Blocks.LOG), new ItemStack(Blocks.LOG2), new ItemStack(Blocks.DIRT) }, 35, MachineType.REFINERY);
		derrick_page = new PageCrafting("derrick", new ItemStack(IndustryBlocks.derrick));
		derrickRecipes_page = new PageMachine("derrick_recipes", new ItemStack(IndustryItems.aluminum_can), MachineType.DERRICK);
		modernFurnace_page = new PageCrafting("mfurnace", new ItemStack(IndustryBlocks.modern_furnace));
		modernFurnaceRecipes_page = new PageMachine("mfurnace_recipes", new ItemStack[] { new ItemStack(Blocks.CLAY), new ItemStack(Blocks.GLASS) }, 35, MachineType.MODERN_FURNACE);
	}

	@Override
	public void registerChapters(ManualPart part) {
		ManualRegistry.addChapter("benches", part).addPages(workbench_page);
		ManualRegistry.addChapter("ice", part).addPages(iceMaker_page);
		ManualRegistry.addChapter("elemental", part).addPages(togglerack_page, fireBlock_page, waterBlock_page, lavaBlock_page);
		ManualRegistry.addChapter("spikes", part).addPages(spike_page);
		ManualRegistry.addChapter("sensors", part).addPages(sensor_page);
		ManualRegistry.addChapter("gravity", part).addPages(gravityBoots_page, controller_page, attract_page, gravitor_page, repulse_page);
		ManualRegistry.addChapter("refining", part).addPages(uranium_page, radiationSuit_page, uraniumSmelt_page, refinedUranium_page, plutonium_page, refinedPlutonium_page, reactorCore_page);
		ManualRegistry.addChapter("reactor", part).addPages(graphite_page, graphiteRod_page, reactorCase_page, ironParts_page, reactor_page);
		ManualRegistry.addChapter("explosives", part).addPages(aluminum_page, bombShell_page, c4_page, nuclearBomb_page);
		ManualRegistry.addChapter("gates", part).addPages(ironStick_page, gate_page, gateTrumpet_page, garage_page, garageRemote_page);
		ManualRegistry.addChapter("hlights", part).addPages(hLight_page, hTorch_page);
		ManualRegistry.addChapter("rways", part).addPages(sidewalk_page, tarball_page, asphalt_page, rways_page, paint_page);
		ManualRegistry.addChapter("moderntech", part).addPages(doors_page, others_page, decoration_page, paintTech_page);
		ManualRegistry.addChapter("metalworks", part).addPages(alumIngot_page, alumStuff_page, buckLadd_page, coalIron_page, steelIngot_page, steelStuff_page, steelTools_page, fuel_page);
		ManualRegistry.addChapter("machines", part).addPages(machineInfo_page, refinery_page, refineryRecipes_page, derrick_page, derrickRecipes_page, modernFurnace_page, modernFurnaceRecipes_page);
	}

}
