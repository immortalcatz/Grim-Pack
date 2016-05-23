package com.grim3212.mc.pack.world.config;

import java.util.ArrayList;

import com.grim3212.mc.pack.core.config.GrimConfig;
import com.grim3212.mc.pack.world.util.KillingFungusWhitelist;

import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.registry.GameData;

public class WorldConfig extends GrimConfig {

	public static boolean fire;
	public static boolean corruption;
	public static int frequencyWheatField;
	public static int frequencySaplings;
	public static int frequencyTreeStumps;
	public static int frequencyCactusFields;
	public static int frequencySandstonePillars;
	public static int frequencySandPits;
	public static int frequencyMelons;
	
	public static int spawnrate;
	public static int sizevariancefrom7;
	public static boolean generateFI;
	
	public static boolean spawnMorePeople;

	public static String[] DIRT_EATING_BLOCKS_POSSIBLE;
	public static String[] SMOOTHSTONE_EATING_BLOCKS_POSSIBLE;
	public static String[] WATER_LEAVES_EATING_BLOCKS_POSSIBLE;
	public static String[] SAND_GRAVEL_EATING_BLOCKS_POSSIBLE;
	public static String[] ROCKS_EATING_BLOCKS_POSSIBLE;
	public static String[] ALL_EATING_BLOCKS_POSSIBLE;
	public static String[] FOREST_EATING_BLOCKS_POSSIBLE;

	@Override
	public void syncConfig() {
		fire = config.get(Configuration.CATEGORY_GENERAL, "Enable Fire", true).getBoolean();
		corruption = config.get(Configuration.CATEGORY_GENERAL, "Enable Corruption", false).getBoolean();
		spawnMorePeople = config.get(Configuration.CATEGORY_GENERAL, "Spawn more people", true).getBoolean();

		config.addCustomCategoryComment(Configuration.CATEGORY_GENERAL, "Change the values to decide how rare or common the different world gen items spawn. Larger values means rarer.");
		frequencyWheatField = config.get(Configuration.CATEGORY_GENERAL, "Frequency Wheat Field", 350).getInt();
		frequencySaplings = config.get(Configuration.CATEGORY_GENERAL, "Frequency Saplings", 200).getInt();
		frequencyTreeStumps = config.get(Configuration.CATEGORY_GENERAL, "Frequency Tree Stumps", 200).getInt();
		frequencyCactusFields = config.get(Configuration.CATEGORY_GENERAL, "Frequency Cactus Fields", 400).getInt();
		frequencySandstonePillars = config.get(Configuration.CATEGORY_GENERAL, "Frequency Sandstone Pillars", 400).getInt();
		frequencySandPits = config.get(Configuration.CATEGORY_GENERAL, "Frequency Sand Pits", 600).getInt();
		frequencyMelons = config.get(Configuration.CATEGORY_GENERAL, "Frequency Melons", 200).getInt();
		
		String floatingIslands = "floating-islands";
		config.addCustomCategoryComment(floatingIslands, "Floating Islands configuration options. Spawn rate becomes more rare as the number grows.");
		spawnrate = config.get(floatingIslands, "Spawn Rate", 100).getInt();
		sizevariancefrom7 = config.get(floatingIslands, "Size Variance", 5).getInt();
		generateFI = config.get(floatingIslands, "Generate Floating Islands", true).getBoolean();

		String fungus = "fungus";
		config.addCustomCategoryComment(fungus, "Add block !NAMES! to each of the different eating fungus's whitelists and blacklists respectively.");
		DIRT_EATING_BLOCKS_POSSIBLE = config.get(fungus, "Dirt Eating Whitelist", new String[] { "grass", "dirt", "farmland" }).getStringList();
		SMOOTHSTONE_EATING_BLOCKS_POSSIBLE = config.get(fungus, "Smooth Stone Fungus Whitelist", new String[] { "stone", "monster_egg" }).getStringList();
		WATER_LEAVES_EATING_BLOCKS_POSSIBLE = config.get(fungus, "Water and Leaves Fungus Whitelist", new String[] { "sapling", "flowing_water", "water", "leaves", "leaves2", "web", "tallgrass", "deadbush", "yellow_flower", "red_flower", "brown_mushroom", "red_mushroom", "wheat", "reeds", "melon_stem", "pumpkin_stem", "vine", "waterlily", "nether_wart", "cocoa", "carrots", "potatoes", "double_plant" }).getStringList();
		SAND_GRAVEL_EATING_BLOCKS_POSSIBLE = config.get(fungus, "Sand and Eating Fungus Whitelist", new String[] { "sand", "gravel", "soul_sand" }).getStringList();
		ROCKS_EATING_BLOCKS_POSSIBLE = config.get(fungus, "Rocks Eating Whitelist", new String[] { "cobblestone", "sandstone", "netherrack", "monster_egg", "stonebrick" }).getStringList();
		ALL_EATING_BLOCKS_POSSIBLE = config.get(fungus, "All Eating Blacklist", new String[] { "air", "bedrock", "obsidian" }).getStringList();
		FOREST_EATING_BLOCKS_POSSIBLE = config.get(fungus, "Forest Eating Whitelist", new String[] { "log", "log2", "leaves", "leaves2" }).getStringList();

		registerBlocksPossible(ALL_EATING_BLOCKS_POSSIBLE, KillingFungusWhitelist.allEating);
		registerBlocksPossible(FOREST_EATING_BLOCKS_POSSIBLE, KillingFungusWhitelist.forestEating);
		registerBlocksPossible(DIRT_EATING_BLOCKS_POSSIBLE, KillingFungusWhitelist.dirt);
		registerBlocksPossible(SMOOTHSTONE_EATING_BLOCKS_POSSIBLE, KillingFungusWhitelist.smoothstone);
		registerBlocksPossible(WATER_LEAVES_EATING_BLOCKS_POSSIBLE, KillingFungusWhitelist.waterLeaves);
		registerBlocksPossible(SAND_GRAVEL_EATING_BLOCKS_POSSIBLE, KillingFungusWhitelist.sandGravel);
		registerBlocksPossible(ROCKS_EATING_BLOCKS_POSSIBLE, KillingFungusWhitelist.rocks);

		super.syncConfig();
	}

	public static void registerBlocksPossible(String[] string, ArrayList<Block> blocklist) {
		if (string.length > 0) {
			for (String u : string) {
				try {
					blocklist.add(GameData.getBlockRegistry().getObject(new ResourceLocation(u)));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}