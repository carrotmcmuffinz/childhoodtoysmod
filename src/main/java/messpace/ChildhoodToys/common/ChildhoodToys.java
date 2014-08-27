package messpace.ChildhoodToys.common;

import messpace.ChildhoodToys.block.AlphabetBlock;
import messpace.ChildhoodToys.block.GlowStick;
import messpace.ChildhoodToys.block.Lamp;
import messpace.ChildhoodToys.block.Mat;
import messpace.ChildhoodToys.block.NightLight;
import messpace.ChildhoodToys.block.SnowGlobe;
import messpace.ChildhoodToys.creativetab.TabAlphabetBlock;
import messpace.ChildhoodToys.creativetab.TabLighting;
import messpace.ChildhoodToys.creativetab.TabToyMaterials;
import messpace.ChildhoodToys.item.AlphabetPlaceholder;
import messpace.ChildhoodToys.item.Overlay;
import messpace.ChildhoodToys.item.Rubber;
import messpace.ChildhoodToys.tileentity.TileEntityGlowStick;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "childhoodtoys", name ="Childhood Toys Mod", version ="0.1 Alpha")


public class ChildhoodToys {
	
	@Instance(value = "ChildhoodToys")
	public static ChildhoodToys instance;
	
	@SidedProxy(clientSide="messpace.ChildhoodToys.common.ClientProxy", serverSide="messpace.ChildhoodToys.common.CommonProxy")
	public static ClientProxy proxy;
	
	
	@EventHandler
	public void preInit(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		
		proxy.registerRenderThings();
		GameRegistry.registerTileEntity(TileEntityGlowStick.class, "tileEntityGlowStick");
		
		}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	
	//Creative Tabs And Crafting Items
	public static CreativeTabs AlphabetBlocks = new TabAlphabetBlock(CreativeTabs.getNextID(), "AlphabetBlocks");
	public static CreativeTabs ToyMaterials = new TabToyMaterials(CreativeTabs.getNextID(), "ToyMaterials");
	public static CreativeTabs Lighting = new TabLighting(CreativeTabs.getNextID(), "Lighting");
	public static Item LightingPlaceholder = new AlphabetPlaceholder(997).setUnlocalizedName("LightingPlaceholder").setTextureName("ChildhoodToys:lightbulb");
	public static Item AlphabetPlaceholder = new AlphabetPlaceholder(998).setUnlocalizedName("AlphabetPlaceholder").setTextureName("ChildhoodToys:ABlock");
	public static Item Rubber = new Rubber(999).setUnlocalizedName("Rubber").setTextureName("ChildhoodToys:Rubber");
	public static Item Plastic = new Rubber(996).setUnlocalizedName("Plastic").setTextureName("ChildhoodToys:Plastic");
	
	//Alphabet Blocks and Alphabet Block Crafting Items
	public static Block ABlock = new AlphabetBlock(1000, Material.wood).setBlockName("ABlock").setBlockTextureName("ChildhoodToys:ABlock");
	public static Block BBlock = new AlphabetBlock(1001, Material.wood).setBlockName("BBlock").setBlockTextureName("ChildhoodToys:BBlock");
	public static Block CBlock = new AlphabetBlock(1002, Material.wood).setBlockName("CBlock").setBlockTextureName("ChildhoodToys:CBlock");
	public static Block DBlock = new AlphabetBlock(1003, Material.wood).setBlockName("DBlock").setBlockTextureName("ChildhoodToys:DBlock");
	public static Block EBlock = new AlphabetBlock(1004, Material.wood).setBlockName("EBlock").setBlockTextureName("ChildhoodToys:EBlock");
	public static Block FBlock = new AlphabetBlock(1005, Material.wood).setBlockName("FBlock").setBlockTextureName("ChildhoodToys:FBlock");
	public static Block GBlock = new AlphabetBlock(1006, Material.wood).setBlockName("GBlock").setBlockTextureName("ChildhoodToys:GBlock");
	public static Block HBlock = new AlphabetBlock(1007, Material.wood).setBlockName("HBlock").setBlockTextureName("ChildhoodToys:HBlock");
	public static Block IBlock = new AlphabetBlock(1008, Material.wood).setBlockName("IBlock").setBlockTextureName("ChildhoodToys:IBlock");
	public static Block JBlock = new AlphabetBlock(1009, Material.wood).setBlockName("JBlock").setBlockTextureName("ChildhoodToys:JBlock");
	public static Block KBlock = new AlphabetBlock(1010, Material.wood).setBlockName("KBlock").setBlockTextureName("ChildhoodToys:KBlock");
	public static Block LBlock = new AlphabetBlock(1011, Material.wood).setBlockName("LBlock").setBlockTextureName("ChildhoodToys:LBlock");
	public static Block MBlock = new AlphabetBlock(1012, Material.wood).setBlockName("MBlock").setBlockTextureName("ChildhoodToys:MBlock");
	public static Block NBlock = new AlphabetBlock(1013, Material.wood).setBlockName("NBlock").setBlockTextureName("ChildhoodToys:NBlock");
	public static Block OBlock = new AlphabetBlock(1014, Material.wood).setBlockName("OBlock").setBlockTextureName("ChildhoodToys:OBlock");
	public static Block PBlock = new AlphabetBlock(1015, Material.wood).setBlockName("PBlock").setBlockTextureName("ChildhoodToys:PBlock");
	public static Block QBlock = new AlphabetBlock(1016, Material.wood).setBlockName("QBlock").setBlockTextureName("ChildhoodToys:QBlock");
	public static Block RBlock = new AlphabetBlock(1017, Material.wood).setBlockName("RBlock").setBlockTextureName("ChildhoodToys:RBlock");
	public static Block SBlock = new AlphabetBlock(1018, Material.wood).setBlockName("SBlock").setBlockTextureName("ChildhoodToys:SBlock");
	public static Block TBlock = new AlphabetBlock(1019, Material.wood).setBlockName("TBlock").setBlockTextureName("ChildhoodToys:TBlock");
	public static Block UBlock = new AlphabetBlock(1020, Material.wood).setBlockName("UBlock").setBlockTextureName("ChildhoodToys:UBlock");
	public static Block VBlock = new AlphabetBlock(1021, Material.wood).setBlockName("VBlock").setBlockTextureName("ChildhoodToys:VBlock");
	public static Block WBlock = new AlphabetBlock(1022, Material.wood).setBlockName("WBlock").setBlockTextureName("ChildhoodToys:WBlock");
	public static Block XBlock = new AlphabetBlock(1023, Material.wood).setBlockName("XBlock").setBlockTextureName("ChildhoodToys:XBlock");
	public static Block YBlock = new AlphabetBlock(1024, Material.wood).setBlockName("YBlock").setBlockTextureName("ChildhoodToys:YBlock");
	public static Block ZBlock = new AlphabetBlock(1025, Material.wood).setBlockName("ZBlock").setBlockTextureName("ChildhoodToys:ZBlock");	public static Item LetterAOverlay = new Overlay(1036).setUnlocalizedName("LetterAOverlay").setTextureName("ChildhoodToys:AOverlay");
	public static Item LetterBOverlay = new Overlay(1026).setUnlocalizedName("LetterBOverlay").setTextureName("ChildhoodToys:BOverlay");
	public static Item LetterCOverlay = new Overlay(1027).setUnlocalizedName("LetterCOverlay").setTextureName("ChildhoodToys:COverlay");
	public static Item LetterDOverlay = new Overlay(1028).setUnlocalizedName("LetterDOverlay").setTextureName("ChildhoodToys:DOverlay");
	public static Item LetterEOverlay = new Overlay(1029).setUnlocalizedName("LetterEOverlay").setTextureName("ChildhoodToys:EOverlay");
	public static Item LetterFOverlay = new Overlay(1030).setUnlocalizedName("LetterFOverlay").setTextureName("ChildhoodToys:FOverlay");
	public static Item LetterGOverlay = new Overlay(1031).setUnlocalizedName("LetterGOverlay").setTextureName("ChildhoodToys:GOverlay");
	public static Item LetterHOverlay = new Overlay(1032).setUnlocalizedName("LetterHOverlay").setTextureName("ChildhoodToys:HOverlay");
	public static Item LetterIOverlay = new Overlay(1033).setUnlocalizedName("LetterIOverlay").setTextureName("ChildhoodToys:IOverlay");
	public static Item LetterJOverlay = new Overlay(1034).setUnlocalizedName("LetterJOverlay").setTextureName("ChildhoodToys:JOverlay");
	public static Item LetterKOverlay = new Overlay(1035).setUnlocalizedName("LetterKOverlay").setTextureName("ChildhoodToys:KOverlay");
	public static Item LetterLOverlay = new Overlay(1036).setUnlocalizedName("LetterLOverlay").setTextureName("ChildhoodToys:LOverlay");
	public static Item LetterMOverlay = new Overlay(1037).setUnlocalizedName("LetterMOverlay").setTextureName("ChildhoodToys:MOverlay");
	public static Item LetterNOverlay = new Overlay(1038).setUnlocalizedName("LetterNOverlay").setTextureName("ChildhoodToys:NOverlay");
	public static Item LetterOOverlay = new Overlay(1039).setUnlocalizedName("LetterOOverlay").setTextureName("ChildhoodToys:OOverlay");
	public static Item LetterPOverlay = new Overlay(1040).setUnlocalizedName("LetterPOverlay").setTextureName("ChildhoodToys:POverlay");
	public static Item LetterQOverlay = new Overlay(1041).setUnlocalizedName("LetterQOverlay").setTextureName("ChildhoodToys:QOverlay");
	public static Item LetterROverlay = new Overlay(1042).setUnlocalizedName("LetterROverlay").setTextureName("ChildhoodToys:ROverlay");
	public static Item LetterSOverlay = new Overlay(1043).setUnlocalizedName("LetterSOverlay").setTextureName("ChildhoodToys:SOverlay");
	public static Item LetterTOverlay = new Overlay(1044).setUnlocalizedName("LetterTOverlay").setTextureName("ChildhoodToys:TOverlay");
	public static Item LetterUOverlay = new Overlay(1045).setUnlocalizedName("LetterUOverlay").setTextureName("ChildhoodToys:UOverlay");
	public static Item LetterVOverlay = new Overlay(1046).setUnlocalizedName("LetterVOverlay").setTextureName("ChildhoodToys:VOverlay");
	public static Item LetterWOverlay = new Overlay(1047).setUnlocalizedName("LetterWOverlay").setTextureName("ChildhoodToys:WOverlay");
	public static Item LetterXOverlay = new Overlay(1048).setUnlocalizedName("LetterXOverlay").setTextureName("ChildhoodToys:XOverlay");
	public static Item LetterYOverlay = new Overlay(1049).setUnlocalizedName("LetterYOverlay").setTextureName("ChildhoodToys:YOverlay");
	public static Item LetterZOverlay = new Overlay(1050).setUnlocalizedName("LetterZOverlay").setTextureName("ChildhoodToys:ZOverlay");
	
	//Misc I Have No Idea What I'm Going To Do With These
	public static Block RegularMat = new Mat(1051, Material.cloth).setBlockName("RegularMat").setBlockTextureName("ChildhoodToys:Mat");
	
	//Lighting Blocks
	public static Block GlowStick = new GlowStick(1052, Material.iron).setBlockName("GlowStick").setBlockTextureName("ChildhoodToys:GlowStick");
	public static Block NightLight = new NightLight(1053, Material.iron).setBlockName("NightLight").setBlockTextureName("ChildhoodToys:NightLight");
	public static Block LavaLamp = new Lamp(1054, Material.iron).setBlockName("LavaLamp").setBlockTextureName("ChildhoodToys:LavaLamp");
	public static Block SnowGlobe = new SnowGlobe(1055, Material.glass).setBlockName("SnowGlobe").setBlockTextureName("ChildhoodToys:SnowGlobe");
	
	
	//Food Items
	
	
	public ChildhoodToys() {
		
		GameRegistry.registerItem(AlphabetPlaceholder, "AlphabetBlocks");
		GameRegistry.registerItem(LightingPlaceholder, "LightingBlocks");
		GameRegistry.registerItem(Rubber, "Rubber");
		GameRegistry.registerItem(Plastic, "Plastic");
		GameRegistry.registerItem(LetterAOverlay, "LetterAOverlay");
		GameRegistry.registerItem(LetterBOverlay, "LetterBOverlay");
		GameRegistry.registerItem(LetterCOverlay, "LetterCOverlay");
		GameRegistry.registerItem(LetterDOverlay, "LetterDOverlay");
		GameRegistry.registerItem(LetterEOverlay, "LetterEOverlay");
		GameRegistry.registerItem(LetterFOverlay, "LetterFOverlay");
		GameRegistry.registerItem(LetterGOverlay, "LetterGOverlay");
		GameRegistry.registerItem(LetterHOverlay, "LetterHOverlay");
		GameRegistry.registerItem(LetterIOverlay, "LetterIOverlay");
		GameRegistry.registerItem(LetterJOverlay, "LetterJOverlay");
		GameRegistry.registerItem(LetterKOverlay, "LetterKOverlay");
		GameRegistry.registerItem(LetterLOverlay, "LetterLOverlay");
		GameRegistry.registerItem(LetterMOverlay, "LetterMOverlay");
		GameRegistry.registerItem(LetterNOverlay, "LetterNOverlay");
		GameRegistry.registerItem(LetterOOverlay, "LetterOOverlay");
		GameRegistry.registerItem(LetterPOverlay, "LetterPOverlay");
		GameRegistry.registerItem(LetterQOverlay, "LetterQOverlay");
		GameRegistry.registerItem(LetterROverlay, "LetterROverlay");
		GameRegistry.registerItem(LetterSOverlay, "LetterSOverlay");
		GameRegistry.registerItem(LetterTOverlay, "LetterTOverlay");
		GameRegistry.registerItem(LetterUOverlay, "LetterUOverlay");
		GameRegistry.registerItem(LetterVOverlay, "LetterVOverlay");
		GameRegistry.registerItem(LetterWOverlay, "LetterWOverlay");
		GameRegistry.registerItem(LetterXOverlay, "LetterXOverlay");
		GameRegistry.registerItem(LetterYOverlay, "LetterYOverlay");
		GameRegistry.registerItem(LetterZOverlay, "LetterZOverlay");
		GameRegistry.registerBlock(ABlock, "ABlock");
		GameRegistry.registerBlock(BBlock, "BBlock");
		GameRegistry.registerBlock(CBlock, "CBlock");
		GameRegistry.registerBlock(DBlock, "DBlock");
		GameRegistry.registerBlock(EBlock, "EBlock");
		GameRegistry.registerBlock(FBlock, "FBlock");
		GameRegistry.registerBlock(GBlock, "GBlock");
		GameRegistry.registerBlock(HBlock, "HBlock");
		GameRegistry.registerBlock(IBlock, "IBlock");
		GameRegistry.registerBlock(JBlock, "JBlock");
		GameRegistry.registerBlock(KBlock, "KBlock");
		GameRegistry.registerBlock(LBlock, "LBlock");
		GameRegistry.registerBlock(MBlock, "MBlock");
		GameRegistry.registerBlock(NBlock, "NBlock");
		GameRegistry.registerBlock(OBlock, "OBlock");
		GameRegistry.registerBlock(PBlock, "PBlock");
		GameRegistry.registerBlock(QBlock, "QBlock");
		GameRegistry.registerBlock(RBlock, "RBlock");
		GameRegistry.registerBlock(SBlock, "SBlock");
		GameRegistry.registerBlock(TBlock, "TBlock");
		GameRegistry.registerBlock(UBlock, "UBlock");
		GameRegistry.registerBlock(VBlock, "VBlock");
		GameRegistry.registerBlock(WBlock, "WBlock");
		GameRegistry.registerBlock(XBlock, "XBlock");
		GameRegistry.registerBlock(YBlock, "YBlock");
		GameRegistry.registerBlock(ZBlock, "ZBlock");
		GameRegistry.registerBlock(RegularMat, "RegularMat");
		GameRegistry.registerBlock(GlowStick, "GlowStick");
		GameRegistry.registerBlock(NightLight, "NightLight");
		GameRegistry.registerBlock(LavaLamp, "LavaLamp");
		GameRegistry.registerBlock(SnowGlobe, "SnowGlobe");
		
		
		
		GameRegistry.addSmelting(Items.slime_ball, new ItemStack(Rubber), 0.1f);
		GameRegistry.addSmelting(Rubber, new ItemStack(Plastic), 0.1f);
		
		GameRegistry.addRecipe(new ItemStack(GlowStick),
				"XYX", "XZX", "XYX", 'Y', Items.slime_ball, 'X', Plastic, 'Z', Items.glowstone_dust);
		
		GameRegistry.addRecipe(new ItemStack(NightLight),
				"XXX", "XYX", "ZZZ", 'X', Blocks.glass, 'Y', Items.glowstone_dust, 'Z', Blocks.stone);
		
		GameRegistry.addRecipe(new ItemStack(SnowGlobe),
				"XXX", "XYX", "ZZZ", 'X', Blocks.glass, 'Y', Blocks.snow, 'Z', Blocks.stone);
		
		GameRegistry.addRecipe(new ItemStack(RegularMat),
				"XYX", "YYY", "XYX", 'X', Blocks.planks, 'Y', Blocks.wool);
		
		GameRegistry.addRecipe(new ItemStack(LetterAOverlay),
				" X ", "XXX", "X X", 'X', Plastic);
		
		GameRegistry.addRecipe(new ItemStack(LetterBOverlay),
				"XX ", "XX ", "XX ", 'X', Plastic);
		
		GameRegistry.addRecipe(new ItemStack(LetterCOverlay),
				"XXX", "X  ", "XXX", 'X', Plastic);
		
		GameRegistry.addRecipe(new ItemStack(LetterDOverlay),
				"XX ", "X X", "XX ", 'X', Plastic);
		
		GameRegistry.addRecipe(new ItemStack(LetterEOverlay),
				"XXX", "XX ", "XXX", 'X', Plastic);
		
		GameRegistry.addRecipe(new ItemStack(LetterFOverlay),
				"XXX", "XX ", "X  ", 'X', Plastic);
		
		GameRegistry.addRecipe(new ItemStack(LetterGOverlay),
				"XX ", "X X", "XXX", 'X', Plastic);
		
		GameRegistry.addRecipe(new ItemStack(LetterHOverlay),
				"X X", "XXX", "X X", 'X', Plastic);
		
		GameRegistry.addRecipe(new ItemStack(LetterIOverlay),
				"XXX", " X ", "XXX", 'X', Plastic);
		
		GameRegistry.addRecipe(new ItemStack(LetterJOverlay),
				"XXX", " X ", "XX ", 'X', Plastic);
		
		GameRegistry.addRecipe(new ItemStack(LetterKOverlay),
				"X X", "XX ", "X X", 'X', Plastic);
		
		GameRegistry.addRecipe(new ItemStack(LetterLOverlay),
				"X  ", "X  ", "XXX", 'X', Plastic);
		
		GameRegistry.addRecipe(new ItemStack(LetterMOverlay),
				"XXX", "XXX", "X X", 'X', Plastic);
		
		GameRegistry.addRecipe(new ItemStack(LetterNOverlay),
				"XXX", "X X", "X X", 'X', Plastic);
		
		GameRegistry.addRecipe(new ItemStack(LetterOOverlay),
				"XXX", "X X", "XXX", 'X', Plastic);
		
		GameRegistry.addRecipe(new ItemStack(LetterPOverlay),
				"XXX", "XXX", "X  ", 'X', Plastic);
		
		GameRegistry.addRecipe(new ItemStack(LetterQOverlay),
				"XX ", "XX ", "  X", 'X', Plastic);
		
		GameRegistry.addRecipe(new ItemStack(LetterROverlay),
				"XX ", "XX ", "X X", 'X', Plastic);
		
		GameRegistry.addRecipe(new ItemStack(LetterSOverlay),
				"XXX", "XXX", "XXX", 'X', Plastic);
				
		
		
	}
	
	
}
