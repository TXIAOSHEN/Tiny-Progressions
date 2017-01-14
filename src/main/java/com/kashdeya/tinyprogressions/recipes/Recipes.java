package com.kashdeya.tinyprogressions.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechArmor;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;

public class Recipes {
	
	public static void registerRecipes(){
		
		if (ConfigHandler.NetherStarBlock == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.NetherStarBlock), new Object[]{"nnn", "nnn", "nnn", 'n', new ItemStack(Items.NETHER_STAR)});
		}
		
		if (ConfigHandler.MedKit == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechItems.MedKit), new Object[]{"prp", "rgr", "lrl", 'p', new ItemStack(Items.PAPER), 'r', new ItemStack(Items.DYE, 1, 1), 'g', new ItemStack(Items.SPECKLED_MELON), 'l', new ItemStack(Items.LEATHER)});
		}
		if (ConfigHandler.DiamondApple == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechItems.DiamondApple), new Object[]{"ddd", "dad", "ddd", 'd', new ItemStack(Items.DIAMOND), 'a', new ItemStack(Items.APPLE)});
		}
		
		if (ConfigHandler.AndesiteBrick == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.AndesiteBrick, 4), new Object[] {"CC", "CC", 'C', new ItemStack(Blocks.STONE, 1, 6)});
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE, 1, 6), new Object[] {new ItemStack(TechBlocks.AndesiteBrick)});
		}
		
		if (ConfigHandler.DioriteBrick == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.DioriteBrick, 4), new Object[] {"CC", "CC", 'C', new ItemStack(Blocks.STONE, 1, 4)});
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE, 1, 4), new Object[] {new ItemStack(TechBlocks.DioriteBrick)});
		}
		
		if (ConfigHandler.GraniteBrick == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.GraniteBrick, 4), new Object[] {"CC", "CC", 'C', new ItemStack(Blocks.STONE, 1, 2)});
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE, 1, 2), new Object[] {new ItemStack(TechBlocks.GraniteBrick)});
		}
		
		if (ConfigHandler.DirtyGlass == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.DirtyGlass, 8), new Object[] {"ggg", "gsg", "ggg", 'g', new ItemStack(Blocks.GLASS), 's', new ItemStack(Blocks.SOUL_SAND)});
			//GameRegistry.addSmelting(Blocks.SOUL_SAND, new ItemStack(TechBlocks.DirtyGlass), 0.5F);
		}
		
		if (ConfigHandler.BoneBlock == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.BoneBlock), new Object[] {"bbb", "bbb", "bbb", 'b', new ItemStack(Items.BONE)});
			GameRegistry.addShapelessRecipe(new ItemStack(Items.BONE, 9), new Object[] {new ItemStack(TechBlocks.BoneBlock)});
		}
		
		if (ConfigHandler.MyceliumSeeds == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechItems.MyceliumSeeds), new Object[] {"bbb", "bsb", "bbb", 'b', new ItemStack(Items.SPIDER_EYE), 's', new ItemStack(Items.WHEAT_SEEDS)});
		}
		
		if (ConfigHandler.StoneArmor == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechArmor.stoneBoots), "s s", "s s", 's', new ItemStack(Blocks.STONE, 1, 0));
			GameRegistry.addShapedRecipe(new ItemStack(TechArmor.stoneChestplate), "s s", "sss", "sss", 's', new ItemStack(Blocks.STONE, 1, 0));
			GameRegistry.addShapedRecipe(new ItemStack(TechArmor.stoneHelmet), "sss", "s s", 's', new ItemStack(Blocks.STONE, 1, 0));
			GameRegistry.addShapedRecipe(new ItemStack(TechArmor.stoneLeggings), "sss", "s s", "s s", 's', new ItemStack(Blocks.STONE, 1, 0));
		}
		
		if (ConfigHandler.QuartzDustRecipe == true && ConfigHandler.QuartzKnife == false){
			//GameRegistry.addShapelessRecipe(new ItemStack(TechItems.QuartzDust), new Object[] {"gemQuartz"});
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TechItems.QuartzDust), "gemQuartz"));
		}
		
		if (ConfigHandler.FleshBlock == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.FleshBlock), new Object[] {"CCC", "CCC", "CCC", 'C', new ItemStack(Items.ROTTEN_FLESH)});
			GameRegistry.addShapelessRecipe(new ItemStack(Items.ROTTEN_FLESH, 9), new Object[] {new ItemStack(TechBlocks.FleshBlock)});
		}
		
		if (ConfigHandler.NotchApple == true){
			GameRegistry.addShapedRecipe(new ItemStack(Items.GOLDEN_APPLE, 1, 1), new Object[] {"ggg", "gag", "ggg", 'a', new ItemStack(Items.APPLE), 'g', new ItemStack(Blocks.GOLD_BLOCK)});
		}
		
		if (ConfigHandler.CharcoalBlock == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.CharcoalBlock), new Object[] {"CCC", "CCC", "CCC", 'C', new ItemStack(Items.COAL, 1, 1)});
			GameRegistry.addShapelessRecipe(new ItemStack(Items.COAL, 9, 1), new Object[] {new ItemStack(TechBlocks.CharcoalBlock)});
		}
		
		if (ConfigHandler.BirthdayPickaxe == true){
			ItemStack BirthdayPickaxe;
			BirthdayPickaxe  = new ItemStack(TechItems.BirthdayPickaxe);
			BirthdayPickaxe.addEnchantment(Enchantments.MENDING, 1);
			GameRegistry.addShapedRecipe(BirthdayPickaxe, new Object[] {"rdr", " i ", " i ", 'd', new ItemStack(Blocks.DIAMOND_BLOCK), 'r', new ItemStack(Blocks.OBSIDIAN), 'i', new ItemStack(Items.STICK)});
		}
		
		if (ConfigHandler.ReinforcedGlass == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.ReinforcedGlass), " o ", "ogo", " o ", 'g', new ItemStack(TechBlocks.DirtyGlass), 'o', new ItemStack(Blocks.OBSIDIAN));
		}
		
		if (ConfigHandler.ReinforcedObsidian == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.ReinforcedObsidian), " i ", "ioi", " i ", 'o', new ItemStack(Blocks.OBSIDIAN), 'i', new ItemStack(Blocks.IRON_BARS));
		}
		
		if (ConfigHandler.QuartzKnife == true){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.QuartzKnife), "  s", " s ", "q  ", 's', "stickWood", 'q', "gemQuartz"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.QuartzDust), "s", "q",  's', new ItemStack(TechItems.QuartzKnife), 'q', "gemQuartz"));
		}
		
		if (ConfigHandler.WateringCan == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechItems.WateringCan), new Object[]{"ID ", "IWI", " I ", 'I', new ItemStack(Items.IRON_INGOT), 'D', new ItemStack(Items.DYE, 1, 15), 'W', new ItemStack(Items.WATER_BUCKET)});
		}
		
		if (ConfigHandler.WateringCanUpgrade == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechItems.WateringCanUpgrade), new Object[]{"ON ", "OWO", " O ", 'O', new ItemStack(Blocks.OBSIDIAN), 'W', new ItemStack(TechItems.WateringCan), 'N', new ItemStack(Items.NETHER_STAR)});
		}
		
		if (ConfigHandler.BlockGrowth == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.growth_block), new Object[] {"CBC", "BEB", "CBC", 'C', new ItemStack(Items.IRON_INGOT), 'B', new ItemStack(TechBlocks.BoneBlock), 'E', new ItemStack(Blocks.GLOWSTONE)});
		}
		
		if (ConfigHandler.BlockGrowthUpgrade == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.growth_upgrade), new Object[] {"CWC", "SES", "CWC", 'C', new ItemStack(Blocks.OBSIDIAN), 'S', new ItemStack(Blocks.SEA_LANTERN), 'E', new ItemStack(TechBlocks.growth_block), 'W', new ItemStack(Items.WATER_BUCKET)});
		}
		
		if (ConfigHandler.Cobblegen == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.cobblegen_block), new Object[] {"CCC", "WGL", "CCC", 'C', new ItemStack(Blocks.COBBLESTONE), 'G', new ItemStack(Blocks.GLASS), 'W', new ItemStack(Items.WATER_BUCKET), 'L', new ItemStack(Items.LAVA_BUCKET)});
		}
		
		if (ConfigHandler.IronCobblegen == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.iron_cobblegen_block), new Object[] {"III", "IGI", "III", 'I', new ItemStack(Items.IRON_INGOT), 'G', new ItemStack(TechBlocks.cobblegen_block)});
		}
		
		if (ConfigHandler.DiamondCobblegen == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.diamond_cobblegen_block), new Object[] {"DDD", "DGD", "DDD", 'D', new ItemStack(Items.DIAMOND), 'G', new ItemStack(TechBlocks.iron_cobblegen_block)});
		}
		
		if (ConfigHandler.BlazeCobblegen == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.blaze_cobblegen_block), new Object[] {"DDD", "DGD", "DDD", 'D', new ItemStack(Items.BLAZE_ROD), 'G', new ItemStack(TechBlocks.diamond_cobblegen_block)});
		}
		
		if (ConfigHandler.EmeraldCobblegen == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.emerald_cobblegen_block), new Object[] {"DDD", "DGD", "DDD", 'D', new ItemStack(Items.EMERALD), 'G', new ItemStack(TechBlocks.blaze_cobblegen_block)});
		}
	}

}
