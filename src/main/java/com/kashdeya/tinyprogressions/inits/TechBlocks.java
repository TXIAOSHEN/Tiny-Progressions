package com.kashdeya.tinyprogressions.inits;

import java.awt.Color;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

import com.kashdeya.tinyprogressions.blocks.bushes.BlockBerryBush;
import com.kashdeya.tinyprogressions.blocks.cobblegen.Cobblegen;
import com.kashdeya.tinyprogressions.blocks.compressed.CharcoalBlock;
import com.kashdeya.tinyprogressions.blocks.compressed.FleshBlock;
import com.kashdeya.tinyprogressions.blocks.compressed.FlintBlock;
import com.kashdeya.tinyprogressions.blocks.compressed.NetherStarBlock;
import com.kashdeya.tinyprogressions.blocks.decorations.AndesiteBrick;
import com.kashdeya.tinyprogressions.blocks.decorations.Asphalt;
import com.kashdeya.tinyprogressions.blocks.decorations.DioriteBrick;
import com.kashdeya.tinyprogressions.blocks.decorations.DirtyGlass;
import com.kashdeya.tinyprogressions.blocks.decorations.GlowstoneColored;
import com.kashdeya.tinyprogressions.blocks.decorations.GlowstoneGlass;
import com.kashdeya.tinyprogressions.blocks.decorations.GraniteBrick;
import com.kashdeya.tinyprogressions.blocks.decorations.HardenedBlocks;
import com.kashdeya.tinyprogressions.blocks.decorations.Lamp;
import com.kashdeya.tinyprogressions.blocks.decorations.OldReed;
import com.kashdeya.tinyprogressions.blocks.decorations.QuickSand;
import com.kashdeya.tinyprogressions.blocks.decorations.Stairs;
import com.kashdeya.tinyprogressions.blocks.decorations.StoneTorch;
import com.kashdeya.tinyprogressions.blocks.decorations.UnhardenedBlock;
import com.kashdeya.tinyprogressions.blocks.fluids.BlockFluidVasholine;
import com.kashdeya.tinyprogressions.blocks.misc.DecoMain;
import com.kashdeya.tinyprogressions.fluids.VasholineFluid;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.block.Block;
import net.minecraft.block.Block.Properties;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.FluidAttributes.Builder;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TechBlocks {
	
	
	// Tech Blocks
	public static Block growth_block;
	public static Block growth_upgrade;
	public static Block growth_upgrade_two;
	public static RegistryObject<Block> cobblegen_block =         register("cobblegen_block",        () -> new Cobblegen(30, 32, Properties.create(Material.IRON)));
	public static RegistryObject<Block> iron_cobblegen_block =    register("cobblegen_iron_block",   () -> new Cobblegen(20, 64, Properties.create(Material.IRON)));
	public static RegistryObject<Block> diamond_cobblegen_block = register("cobblegen_diamond_block",() -> new Cobblegen(10, 64, Properties.create(Material.IRON)));
	public static RegistryObject<Block> emerald_cobblegen_block = register("cobblegen_emerald_block",() -> new Cobblegen(1, 64,  Properties.create(Material.IRON)));
	public static RegistryObject<Block> blaze_cobblegen_block =   register("cobblegen_blaze_block",  () -> new Cobblegen(5, 64,  Properties.create(Material.IRON)));
	public static RegistryObject<Block> iron_furnace_block;
	// Deco Blocks
//	public static RegistryObject<Block> charcoal_block  = register("charcoal_block", () -> new CharcoalBlock());
//	
//	public static Block reinforced_glass;
//	public static Block reinforced_obsidian;
//	public static RegistryObject<Block> dirty_glass =    register("dirty_glass", () -> new DirtyGlass());
//	public static RegistryObject<Block> diorite_brick  = register("diorite_brick", () -> new DioriteBrick());
//	public static RegistryObject<Block> granite_brick  = register("granite_brick", () -> new GraniteBrick());
//	public static RegistryObject<Block> andesite_brick = register("andesite_brick", () -> new AndesiteBrick());
//	public static RegistryObject<Block> old_reed       = register("old_reed", () -> new OldReed()); 
//	// Compressed Blocks
//	public static RegistryObject<Block> flesh_block = register("flesh_block", () -> new FleshBlock());
//	public static RegistryObject<Block> bone_block       = register("bone_block", () -> new NetherStarBlock());
//	public static RegistryObject<Block> netherstar_block = register("netherstar_block", () -> new NetherStarBlock());
//	public static RegistryObject<Block> flint_block = register("flint_block", () -> new FlintBlock());	
//	// Stone Torch
//	public static RegistryObject<Block> stone_torch = register("stone_torch", () -> new StoneTorch());
	// EnderOre
	public static Block ender_ore;
	// wub ore
	public static Block wub_ore;
	public static Block nether_wub_ore;
	// Lava Block
	public static Block lava_block;
	public static Block nether_lava_block;
	// Water Block
	public static Block water_block;
	// Hardened Stone
//	public static RegistryObject<Block> unhardened_stone            = register("unhardened_stone", () -> new UnhardenedBlock());
//	public static RegistryObject<Block> hardened_stone              = register("hardened_stone", () -> new HardenedBlocks(Properties.create(Material.ROCK), 1, 1));;
//	public static RegistryObject<Block> hardened_stone_bricks       = register("hardened_stone_bricks", () -> new HardenedBlocks(Properties.create(Material.ROCK), 1, 1));;
//	public static RegistryObject<Block> hardened_stone_smallbricks  = register("hardened_stone_smallbricks", () -> new HardenedBlocks(Properties.create(Material.ROCK), 1, 1));;
//	
//	public static RegistryObject<Block> hardened_stone_stairs =             register("hardened_stone_stairs", ()->new Stairs(hardened_stone.get()));
//	public static RegistryObject<Block> hardened_stone_bricks_stairs =      register("hardened_stone_bricks_stairs", ()->new Stairs(hardened_stone_bricks.get()));
//	public static RegistryObject<Block> hardened_stone_smallbricks_stairs = register("hardened_stone_smallbricks_stairs", ()->new Stairs(hardened_stone_smallbricks.get()));
	
	public static Block hardened_stone_slab_half;
	public static Block hardened_stone_slab_double;
	
	public static Block hardened_stone_bricks_slab_half;
	public static Block hardened_stone_bricks_slab_double;
	
	public static Block hardened_stone_smallbricks_slab_half;
    public static Block hardened_stone_smallbricks_slab_double;
    // Angel
    public static Block fmf_block;
    // Lamp Blocks
//    public static RegistryObject<Block> lamp =          register("lamp",          () -> new Lamp(Properties.create(Material.GLASS)));
//    public static RegistryObject<Block> yellow_lamp =   register("lamp_yellow",   () -> new Lamp(Properties.create(Material.GLASS, MaterialColor.YELLOW)));
//    public static RegistryObject<Block> white_lamp =    register("lamp_white",    () -> new Lamp(Properties.create(Material.GLASS, MaterialColor.WHITE_TERRACOTTA)));
//    public static RegistryObject<Block> red_lamp =      register("lamp_red",      () -> new Lamp(Properties.create(Material.GLASS, MaterialColor.RED)));
//    public static RegistryObject<Block> purple_lamp =   register("lamp_purple",   () -> new Lamp(Properties.create(Material.GLASS, MaterialColor.PURPLE)));
//    public static RegistryObject<Block> pink_lamp =     register("lamp_pink",     () -> new Lamp(Properties.create(Material.GLASS, MaterialColor.PINK)));
//    public static RegistryObject<Block> orange_lamp =   register("lamp_orange",   () -> new Lamp(Properties.create(Material.GLASS, MaterialColor.ORANGE_TERRACOTTA)));
//    public static RegistryObject<Block> magenta_lamp=   register("lamp_magenta",  () -> new Lamp(Properties.create(Material.GLASS, MaterialColor.MAGENTA)));
//    public static RegistryObject<Block> lime_lamp =     register("lamp_lime",     () -> new Lamp(Properties.create(Material.GLASS, MaterialColor.LIME)));
//    public static RegistryObject<Block> lightblue_lamp= register("lamp_lightblue",() -> new Lamp(Properties.create(Material.GLASS, MaterialColor.LIGHT_BLUE)));
//    public static RegistryObject<Block> green_lamp =    register("lamp_green",    () -> new Lamp(Properties.create(Material.GLASS, MaterialColor.GREEN)));
//    public static RegistryObject<Block> gray_lamp =     register("lamp_gray",     () -> new Lamp(Properties.create(Material.GLASS, MaterialColor.GRAY)));
//    public static RegistryObject<Block> cyan_lamp =     register("lamp_cyan",     () -> new Lamp(Properties.create(Material.GLASS, MaterialColor.CYAN)));
//    public static RegistryObject<Block> brown_lamp =    register("lamp_brown",    () -> new Lamp(Properties.create(Material.GLASS, MaterialColor.BROWN)));
//    public static RegistryObject<Block> blue_lamp =     register("lamp_blue",     () -> new Lamp(Properties.create(Material.GLASS, MaterialColor.BLUE)));
//    public static RegistryObject<Block> black_lamp =    register("lamp_black",    () -> new Lamp(Properties.create(Material.GLASS, MaterialColor.BLACK)));
//	// Glowstone Blocks
//    public static Block colored_glowstone;
//    public static RegistryObject<Block> yellow_glowstone =   register("yellow_glowstone",   () -> new GlowstoneColored(Properties.create(Material.GLASS, MaterialColor.YELLOW)));
//    public static RegistryObject<Block> white_glowstone=     register("white_glowstone",    () -> new GlowstoneColored(Properties.create(Material.GLASS, MaterialColor.WHITE_TERRACOTTA)));
//    public static RegistryObject<Block> silver_glowstone =   register("silver_glowstone",   () -> new GlowstoneColored(Properties.create(Material.GLASS, MaterialColor.GRAY)));
//    public static RegistryObject<Block> red_glowstone=       register("red_glowstone",      () -> new GlowstoneColored(Properties.create(Material.GLASS, MaterialColor.RED)));
//    public static RegistryObject<Block> purple_glowstone =   register("purple_glowstone",   () -> new GlowstoneColored(Properties.create(Material.GLASS, MaterialColor.PURPLE)));
//    public static RegistryObject<Block> pink_glowstone =     register("pink_glowstone",     () -> new GlowstoneColored(Properties.create(Material.GLASS, MaterialColor.PINK)));
//    public static RegistryObject<Block> orange_glowstone =   register("orange_glowstone",   () -> new GlowstoneColored(Properties.create(Material.GLASS, MaterialColor.ORANGE_TERRACOTTA)));
//    public static RegistryObject<Block> magenta_glowstone=   register("magenta_glowstone",  () -> new GlowstoneColored(Properties.create(Material.GLASS, MaterialColor.MAGENTA)));
//    public static RegistryObject<Block> lime_glowstone =     register("lime_glowstone",     () -> new GlowstoneColored(Properties.create(Material.GLASS, MaterialColor.LIME)));
//    public static RegistryObject<Block> lightblue_glowstone= register("lightblue_glowstone",() -> new GlowstoneColored(Properties.create(Material.GLASS, MaterialColor.LIGHT_BLUE)));
//    public static RegistryObject<Block> green_glowstone =    register("green_glowstone",    () -> new GlowstoneColored(Properties.create(Material.GLASS, MaterialColor.GREEN)));
//    public static RegistryObject<Block> gray_glowstone =     register("gray_glowstone",     () -> new GlowstoneColored(Properties.create(Material.GLASS, MaterialColor.GRAY)));
//    public static RegistryObject<Block> cyan_glowstone =     register("cyan_glowstone",     () -> new GlowstoneColored(Properties.create(Material.GLASS, MaterialColor.CYAN)));
//    public static RegistryObject<Block> brown_glowstone =    register("brown_glowstone",    () -> new GlowstoneColored(Properties.create(Material.GLASS, MaterialColor.BROWN)));
//    public static RegistryObject<Block> blue_glowstone =     register("blue_glowstone",     () -> new GlowstoneColored(Properties.create(Material.GLASS, MaterialColor.BLUE)));
//    public static RegistryObject<Block> black_glowstone =    register("black_glowstone",    () -> new GlowstoneColored(Properties.create(Material.GLASS, MaterialColor.BLACK)));
//    // Withered Block
//    public static Block withered_block;
//    // berries
//    public static RegistryObject<Block> blueberry_bush =  register("blueberry_bush",  () -> new BlockBerryBush(TechFoods.blackberry_berry.get(),Properties.create(Material.PLANTS, MaterialColor.BLACK).sound(SoundType.PLANT).hardnessAndResistance(0)));
//    public static RegistryObject<Block> blackberry_bush = register("blackberry_bush", () -> new BlockBerryBush(TechFoods.blueberry_berry.get(), Properties.create(Material.PLANTS, MaterialColor.BLUE).sound(SoundType.PLANT).hardnessAndResistance(0)));
//    public static RegistryObject<Block> maloberry_bush =  register("maloberry_bush",  () -> new BlockBerryBush(TechFoods.maloberry_berry.get(), Properties.create(Material.PLANTS, MaterialColor.ORANGE_TERRACOTTA).sound(SoundType.PLANT).hardnessAndResistance(0)));
//    public static RegistryObject<Block> raspberry_bush =  register("raspberry_bush",  () -> new BlockBerryBush(TechFoods.raspberry_berry.get(), Properties.create(Material.PLANTS, MaterialColor.RED).sound(SoundType.PLANT).hardnessAndResistance(0)));
    // bsc sugar blocks
    public static Block compressed_sugar;
    public static Block double_compressed_sugar;
    // bsc sugar cane blocks
    public static Block compressed_sugar_cane;
    public static Block double_compressed_sugar_cane;
    public static Block triple_compressed_sugar_cane;
    public static Block quadruple_compressed_sugar_cane;
    public static Block quintuple_compressed_sugar_cane;
    public static Block sextuple_compressed_sugar_cane;
    public static Block septuple_compressed_sugar_cane;
    public static Block octuple_compressed_sugar_cane;
    // nether blocks
    public static Block compressed_nether_block;
    public static Block double_compressed_nether_block;
    public static Block triple_compressed_nether_block;
    public static Block quadruple_compressed_nether_block;
    public static Block quintuple_compressed_nether_block;
    public static Block sextuple_compressed_nether_block;
    public static Block septuple_compressed_nether_block;
    public static Block octuple_compressed_nether_block;
    public static Block soul_sandstone;
    // water harvester
    public static Block water_harvester;
    // bridge
    public static Block bridge_builder;
    public static Block tower_builder;
    // vasholine
//    public static Block VASHOLINE;
	public static RegistryObject<FlowingFluid> vasholine_fluid =         TinyProgressions.FLUIDS.register("vasholine_still",   () -> new VasholineFluid.Source(TechBlocks.vasholine_fluid_properties));
	public static RegistryObject<FlowingFluid> vasholine_fluid_flowing = TinyProgressions.FLUIDS.register("vasholine_flowing", () -> new VasholineFluid.Flowing(TechBlocks.vasholine_fluid_properties));
	public static RegistryObject<FlowingFluidBlock> vasholine =          TinyProgressions.BLOCKS.register("vasholine",         () -> new BlockFluidVasholine(Block.Properties.create(Material.WATER)));
	public static RegistryObject<Item> vasholine_bucket =                TinyProgressions.ITEMS.register ("vasholine_bucket",  () -> new BucketItem(vasholine_fluid,new Item.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(TinyProgressions.TAB)));
	public static final ForgeFlowingFluid.Properties vasholine_fluid_properties = new ForgeFlowingFluid.Properties(vasholine_fluid, vasholine_fluid_flowing, fluidBuilderAttributes(new Color(182, 209, 0).getRGB(), 5000, 5000, 300, 20)).bucket(vasholine_bucket).block(vasholine);
    
//    // asphalt
//    public static RegistryObject<Block> asphalt_block = register("asphalt_block", () -> new Asphalt());
//    // Lava Infused Stone Block
//    public static Block lava_infused_stone;
//    // Steel Block
//    public static RegistryObject<Block> steel_block = register("steel_block", () -> new DecoMain());
//    // Ghost Block
//    public static Block ghost_block;
//    // quicksand
//    public static RegistryObject<Block> quick_sand = register("quick_sand", () -> new QuickSand());
//    // Glowstone Glass
//    public static RegistryObject<Block> glowstone_glass = register("glowstone_glass", () -> new GlowstoneGlass());
//    
    
    
    // Registers a block and blockItem if needed.
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup)
    {
        return register(name, sup, TechBlocks::itemDefault);
    }

//    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup, Supplier<Callable<ItemStackTileEntityRenderer>> renderMethod) {
//        return register(name, sup, block -> item(block, renderMethod));
//    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup, ItemGroup tab) {
        return register(name, sup, block -> item(block, tab));
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup, Function<RegistryObject<T>, Supplier<? extends Item>> itemCreator) {
        RegistryObject<T> ret = registerNoItem(name, sup);
        TinyProgressions.ITEMS.register(name, itemCreator.apply(ret));
        return ret;
    }

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<? extends T> sup) {

        return TinyProgressions.BLOCKS.register(name, sup);
    }

    private static Supplier<BlockItem> itemDefault(final RegistryObject<? extends Block> block) {
        return item(block, TinyProgressions.TAB);
    }

    private static Supplier<BlockItem> item(final RegistryObject<? extends Block> block, final Supplier<Callable<ItemStackTileEntityRenderer>> renderMethod) {
        return () -> new BlockItem(block.get(), new Item.Properties().group(TinyProgressions.TAB).setISTER(renderMethod));
    }

    private static Supplier<BlockItem> item(final RegistryObject<? extends Block> block, final ItemGroup itemGroup) {
        return () -> new BlockItem(block.get(), new Item.Properties().group(itemGroup));
    }
    
	public static Builder fluidBuilderAttributes(int fluidColor, int density, int viscosity, int temperature, int luminosity) {
		FluidAttributes.Builder fluidBuilder = FluidAttributes.builder(new ResourceLocation("block/water_still"), new ResourceLocation("block/water_flow"));
		fluidBuilder.color(fluidColor);
		fluidBuilder.density(density);
		fluidBuilder.viscosity(viscosity);
		fluidBuilder.temperature(temperature);
		fluidBuilder.luminosity(luminosity);
		return fluidBuilder;
	}
    
    //TODO
//	public static void init() {
//		// glowstone glass
//		if (ConfigHandler.glowstone_glass) {
//			glowstone_glass = new GlowstoneGlass().setTranslationKey("glowstone_glass");
//		}
//		// quicksand
//		if (ConfigHandler.quick_sand){
//			quick_sand = new QuickSand().setTranslationKey("quick_sand");
//		}
//		// wub ore
//		if (ConfigHandler.vasholine){
//			wub_ore = new WubOre().setTranslationKey("wub_ore");
//			nether_wub_ore = new NetherWubOre().setTranslationKey("nether_wub_ore");
//		}
//		// Steel Block
//		if (ConfigHandler.steel_ingot){
//			steel_block = new DecoMain().setOreDictName("blockSteel").setTranslationKey("steel_block");
//		}
//		// Lava Infused Stone Block
//		if (ConfigHandler.lava_infused_stone){
//			lava_infused_stone = new Infused();
//		}
//		// asphalt
//		if (ConfigHandler.asphalt){
//			asphalt_block = new Asphalt();
//		}
//		// Compressed Blocks
//		if (ConfigHandler.nether_compressed_blocks){
//			compressed_nether_block = new CompressedBlocks("compressed_nether_block", Material.ROCK, SoundType.STONE, TechBlocks.compressed_nether_block, 1, 1).setHardness(0.4F).setResistance(10.0F);
//			double_compressed_nether_block = new CompressedBlocks("double_compressed_nether_block", Material.ROCK, SoundType.STONE, TechBlocks.double_compressed_nether_block, 1, 1).setHardness(0.8F).setResistance(20.0F);
//			triple_compressed_nether_block = new CompressedBlocks("triple_compressed_nether_block", Material.ROCK, SoundType.STONE, TechBlocks.triple_compressed_nether_block, 1, 1).setHardness(1.2F).setResistance(30.0F);
//			quadruple_compressed_nether_block = new CompressedBlocks("quadruple_compressed_nether_block", Material.ROCK, SoundType.STONE, TechBlocks.quadruple_compressed_nether_block, 1, 1).setHardness(1.6F).setResistance(40.0F);
//			quintuple_compressed_nether_block = new CompressedBlocks("quintuple_compressed_nether_block", Material.ROCK, SoundType.STONE, TechBlocks.quintuple_compressed_nether_block, 1, 1).setHardness(2.0F).setResistance(50.0F);
//			sextuple_compressed_nether_block = new CompressedBlocks("sextuple_compressed_nether_block", Material.ROCK, SoundType.STONE, TechBlocks.sextuple_compressed_nether_block, 1, 1).setHardness(2.4F).setResistance(60.0F);
//			septuple_compressed_nether_block = new CompressedBlocks("septuple_compressed_nether_block", Material.ROCK, SoundType.STONE, TechBlocks.septuple_compressed_nether_block, 1, 1).setHardness(2.8F).setResistance(70.0F);
//			octuple_compressed_nether_block = new CompressedBlocks("octuple_compressed_nether_block", Material.ROCK, SoundType.STONE, TechBlocks.octuple_compressed_nether_block, 1, 1).setHardness(3.2F).setResistance(80.0F);
//		}
//		
//		// water harvester
//		if (ConfigHandler.water_harvester){
//			water_harvester = new WaterHarvester();
//		}
//		
//		// bridge
//		if (ConfigHandler.bridge_builder){
//			bridge_builder = new BridgeBuilder();
//		}
//		
//		// tower
//		if (ConfigHandler.tower_builder){
//			tower_builder = new TowerBuilder();
//		}
//		
//		// bsc sugar blocks
//		if (ConfigHandler.bsc_sugar_compressed_blocks){
//			compressed_sugar = new CompressedBlocks("compressed_sugar", Material.CLAY, SoundType.SNOW, TechBlocks.compressed_sugar, 1, 1).setHardness(0.6F).setResistance(0.6F);			
//			double_compressed_sugar = new CompressedBlocks("double_compressed_sugar", Material.CLAY, SoundType.SNOW, TechBlocks.double_compressed_sugar, 1, 1).setHardness(1.0F).setResistance(1.2F);
//		}
//		
//		// bsc sugar cane blocks
//		if (ConfigHandler.bsc_sugarcane_compressed_blocks){
//			compressed_sugar_cane = new CompressedBlocks("compressed_sugar_cane", Material.GROUND, SoundType.GROUND, TechBlocks.compressed_sugar_cane, 1, 1).setHardness(1.0F).setResistance(1.0F);
//			double_compressed_sugar_cane = new CompressedBlocks("double_compressed_sugar_cane", Material.GROUND, SoundType.GROUND, TechBlocks.double_compressed_sugar_cane, 1, 1).setHardness(1.2F).setResistance(1.2F);
//			triple_compressed_sugar_cane = new CompressedBlocks("triple_compressed_sugar_cane", Material.GROUND, SoundType.GROUND, TechBlocks.triple_compressed_sugar_cane, 1, 1).setHardness(1.4F).setResistance(1.4F);
//			quadruple_compressed_sugar_cane = new CompressedBlocks("quadruple_compressed_sugar_cane", Material.GROUND, SoundType.GROUND, TechBlocks.quadruple_compressed_sugar_cane, 1, 1).setHardness(1.6F).setResistance(1.6F);
//			quintuple_compressed_sugar_cane = new CompressedBlocks("quintuple_compressed_sugar_cane", Material.GROUND, SoundType.GROUND, TechBlocks.quintuple_compressed_sugar_cane, 1, 1).setHardness(1.8F).setResistance(1.8F);
//			sextuple_compressed_sugar_cane = new CompressedBlocks("sextuple_compressed_sugar_cane", Material.GROUND, SoundType.GROUND, TechBlocks.sextuple_compressed_sugar_cane, 1, 1).setHardness(2.0F).setResistance(2.0F);
//			septuple_compressed_sugar_cane = new CompressedBlocks("septuple_compressed_sugar_cane", Material.GROUND, SoundType.GROUND, TechBlocks.septuple_compressed_sugar_cane, 1, 1).setHardness(2.2F).setResistance(2.2F);
//			octuple_compressed_sugar_cane = new CompressedBlocks("octuple_compressed_sugar_cane", Material.GROUND, SoundType.GROUND, TechBlocks.octuple_compressed_sugar_cane, 1, 1).setHardness(2.4F).setResistance(2.4F);
//		}
//		
//		// Berry Bushes
//		if (ConfigHandler.ExtraJuices || ConfigHandler.ExtraJuicesBottles){
//			blueberry_bush = new BlueberryBush();
//			blackberry_bush = new BlackberryBush();
//			maloberry_bush = new MaloberryBush();
//			raspberry_bush = new RaspberryBush();
//		}
//		
//		// Tech Blocks
//		if (ConfigHandler.BlockGrowth) {
//			growth_block = new BlockGrowth();
//		}
//		if (ConfigHandler.BlockGrowthUpgrade) {
//			growth_upgrade = new BlockGrowthUpgrade();
//		}
//		if (ConfigHandler.BlockGrowthUpgradeTwo) {
//			growth_upgrade_two = new BlockGrowthUpgradeTwo();
//		}
//		if (ConfigHandler.Cobblegen) {
//			cobblegen_block = new Cobblegen();
//		}
//		if (ConfigHandler.IronCobblegen) {
//			iron_cobblegen_block = new IronCobblegen();
//		}
//		if (ConfigHandler.DiamondCobblegen) {
//			diamond_cobblegen_block = new DiamondCobblegen();
//		}
//		if (ConfigHandler.BlazeCobblegen) {
//			blaze_cobblegen_block = new BlazeCobblegen();
//		}
//		if (ConfigHandler.EmeraldCobblegen) {
//			emerald_cobblegen_block = new EmeraldCobblegen();
//		}
//		if(ConfigHandler.iron_furnace)
//			iron_furnace_block = new IronFurnaceBlock(100); // 200 is vanilla furnace speed
//
//		// Deco Blocks
//		if (ConfigHandler.StoneTorch) {
//			stone_torch = new StoneTorch();
//		}
//		if (ConfigHandler.CharcoalBlock) {
//			charcoal_block = new CharcoalBlock();
//		}
//		if (ConfigHandler.ReinforcedGlass) {
//			reinforced_glass = new ReinforcedGlass();
//		}
//		if (ConfigHandler.ReinforcedObsidian) {
//			reinforced_obsidian = new ReinforcedObsidian();
//		}
//		if (ConfigHandler.DirtyGlass) {
//			dirty_glass = new DirtyGlass();
//		}
//		if (ConfigHandler.hardened_stone) {
//			unhardened_stone = new UnhardenedBlock();
//			hardened_stone = new HardenedBlocks("hardened_stone", Material.ROCK, TechBlocks.hardened_stone, 1, 1);
//			hardened_stone_bricks = new HardenedBlocks("hardened_stone_bricks", Material.ROCK, TechBlocks.hardened_stone_bricks, 1, 1);
//			hardened_stone_smallbricks = new HardenedBlocks("hardened_stone_smallbricks", Material.ROCK, TechBlocks.hardened_stone_smallbricks, 1, 1);
//			
//			hardened_stone_stairs = new Stairs(hardened_stone).setTranslationKey("hardened_stone_stairs");
//            hardened_stone_bricks_stairs = new Stairs(hardened_stone_bricks).setTranslationKey("hardened_stone_bricks_stairs");
//            hardened_stone_smallbricks_stairs = new Stairs(hardened_stone_smallbricks).setTranslationKey("hardened_stone_smallbricks_stairs");
//            
//            hardened_stone_slab_double = new Slabs().setDropped(hardened_stone_slab_half).setTranslationKey("hardened_stone_slab_double");
//            hardened_stone_slab_half = new Slabs((BlockSlab)hardened_stone_slab_double).setTranslationKey("hardened_stone_slab_half");
//
//            hardened_stone_bricks_slab_double = new Slabs().setDropped(hardened_stone_bricks_slab_half).setTranslationKey("hardened_stone_bricks_slab_double");
//            hardened_stone_bricks_slab_half = new Slabs((BlockSlab)hardened_stone_bricks_slab_double).setTranslationKey("hardened_stone_bricks_slab_half");
//            
//            hardened_stone_smallbricks_slab_double = new Slabs().setDropped(hardened_stone_smallbricks_slab_half).setTranslationKey("hardened_stone_smallbricks_slab_double");
//            hardened_stone_smallbricks_slab_half = new Slabs((BlockSlab)hardened_stone_smallbricks_slab_double).setTranslationKey("hardened_stone_smallbricks_slab_half");
//		}
//		if (ConfigHandler.old_reed) {
//			old_reed = new OldReed();
//		}
//		// Lamps
//		if (ConfigHandler.ColorLamps){
//			lamp = new Lamp().setTranslationKey("lamp");
//			colored_lamp = new LampColored();
//		}
//		// Glowstone
//		if (ConfigHandler.ColorGlowstone){
//			colored_glowstone = new GlowstoneColored();
//		}
//		
//
//		// Compressed Blocks
//		if (ConfigHandler.FleshBlock) {
//			flesh_block = new FleshBlock();
//		}
//		if (ConfigHandler.BoneBlock) {
//			bone_block = new BoneBlock();
//		}
//		if (ConfigHandler.NetherStarBlock) {
//			netherstar_block = new NetherStarBlock();
//		}
//		if (ConfigHandler.DioriteBrick) {
//			diorite_brick = new DioriteBrick();
//		}
//		if (ConfigHandler.GraniteBrick) {
//			granite_brick = new GraniteBrick();
//		}
//		if (ConfigHandler.AndesiteBrick) {
//			andesite_brick = new AndesiteBrick();
//		}
//
//		// Flint Block
//		if (ConfigHandler.FlintBlock) {
//			flint_block = new FlintBlock();
//		}
//
//		// Ore
//		if (ConfigHandler.ender_ore) {
//			ender_ore = new EnderOre();
//		}
//		
//		// FMF Block
//		if(ConfigHandler.angel_block) {
//			fmf_block = new StandardBlock(Material.GROUND).setUnlocalName("fmf_block")
//					.setSound(SoundType.STONE).setHarvestLvl("pickaxe", 0)
//					.setItemBlock(AngelItemBlock.class).setBlockRenderLayer(BlockRenderLayer.CUTOUT)
//					.setHardness(1.5F).setResistance(1000F);
//		}
//		
//		// Lava & Water Blocks
//		if (ConfigHandler.lava_block) {
//			lava_block = new LavaBlock();
//		}
//		if (ConfigHandler.nether_lava_block) {
//			nether_lava_block = new NetherLavaBlock();
//		}
//		if (ConfigHandler.water_block) {
//			water_block = new WaterBlock();
//		}
//		
//		// Withered Block
//		if (ConfigHandler.WitheredBlock){
//			withered_block = new WitheredBlock();
//		}
//		if (ConfigHandler.vasholine){
//			VASHOLINE = new BlockFluidVasholine();
//		}
//		
//		// Can not turn off
//			ghost_block = new GhostBlock();
//			soul_sandstone = new CompressedBlocks("soul_sandstone", Material.ROCK, SoundType.STONE, TechBlocks.soul_sandstone, 1, 1).setHardness(0.4F).setResistance(10.0F);
//	}
}
