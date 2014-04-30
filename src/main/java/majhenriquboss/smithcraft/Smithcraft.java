package majhenriquboss.smithcraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import majhenriquboss.smithcraft.blocks.*;
import majhenriquboss.smithcraft.fluids.*;
import majhenriquboss.smithcraft.fluids.blocks.*;
import majhenriquboss.smithcraft.handlers.GuiHandler;
import majhenriquboss.smithcraft.items.*;
import majhenriquboss.smithcraft.lib.Strings;
import majhenriquboss.smithcraft.proxy.ClientProxy;
import majhenriquboss.smithcraft.proxy.CommonProxy;
import majhenriquboss.smithcraft.tileentities.TileEntityForge;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.oredict.OreDictionary;

/**
*@author MajhenriquBoss
*/

@Mod(modid = Smithcraft.MODID, name = Smithcraft.NAME, version = Smithcraft.VERSION)
public class Smithcraft {

    public static final String MODID = "Smithcraft";
    public static final String NAME = "Smithcraft";
    public static final String VERSION = "dev_0.0.1";

    @Mod.Instance(MODID)
    public static Smithcraft instance;

    @SidedProxy(clientSide = "majhenriquboss.smithcraft.proxy.ClientProxy", serverSide = "majhenriquboss.smithcraft.proxy.CommonProxy", modId = MODID)
    public static CommonProxy commonProxy = new CommonProxy();
    public static ClientProxy clientProxy = new ClientProxy();

    /* ITEM OBECTS */
    public static ItemHammer hammer;
    public static ItemBlacksmithCoal blacksmithCoal;
    public static ItemIngotCopper ingotCopper;
    public static ItemIngotTin ingotTin;
    public static ItemIngotSilver ingotSilver;
    public static ItemIronPlate ironPlate;

    /* BLOCK OBJECTS */
    public static BlockForge forge;
    public static BlockOreCopper oreCopper;
    public static BlockOreTin oreTin;
    public static BlockOreSilver oreSilver;
    public static BlockMoltenCopper moltenCopper;
    public static BlockMoltenTin moltenTin;
    public static BlockMoltenSilver moltenSilver;
    public static BlockMoltenGold moltenGold;
    public static BlockMoltenIron moltenIron;
    public static BlockAnvilStone anvilStone;

    /* FLUID OBJECTS */
    public static FluidMoltenCopper fluidMoltenCopper;
    public static FluidMoltenTin fluidMoltenTin;
    public static FluidMoltenSilver fluidMoltenSilver;
    public static FluidMoltenGold fluidMoltenGold;
    public static FluidMoltenIron fluidMoltenIron;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {

        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());

        /* REGISTER ITEMS */
        hammer = new ItemHammer();
        GameRegistry.registerItem(hammer, Strings.Items.HAMMER);

        blacksmithCoal = new ItemBlacksmithCoal();
        GameRegistry.registerItem(blacksmithCoal, Strings.Items.BLACKSMITH_COAL);
        GameRegistry.registerFuelHandler(blacksmithCoal);

        ingotCopper = new ItemIngotCopper();
        GameRegistry.registerItem(ingotCopper, Strings.Items.INGOT_COPPER);
        OreDictionary.registerOre("ingotCopper", ingotCopper);

        ingotTin = new ItemIngotTin();
        GameRegistry.registerItem(ingotTin, Strings.Items.INGOT_TIN);
        OreDictionary.registerOre("ingotTin", ingotCopper);

        ingotSilver = new ItemIngotSilver();
        GameRegistry.registerItem(ingotSilver, Strings.Items.INGOT_SILVER);
        OreDictionary.registerOre("ingotSilver", ingotSilver);

        ironPlate = new ItemIronPlate();
        GameRegistry.registerItem(ironPlate, Strings.Items.PLATE_IRON);

        /* REGISTER FLUIDS */
        fluidMoltenCopper = new FluidMoltenCopper(Strings.Fluids.MOLTEN_COPPER);
        FluidRegistry.registerFluid(fluidMoltenCopper);

        fluidMoltenTin = new FluidMoltenTin(Strings.Fluids.MOLTEN_TIN);
        FluidRegistry.registerFluid(fluidMoltenTin);

        fluidMoltenSilver = new FluidMoltenSilver(Strings.Fluids.MOLTEN_SILVER);
        FluidRegistry.registerFluid(fluidMoltenSilver);

        fluidMoltenGold = new FluidMoltenGold(Strings.Fluids.MOLTEN_GOLD);
        FluidRegistry.registerFluid(fluidMoltenGold);

        fluidMoltenIron = new FluidMoltenIron(Strings.Fluids.MOLTEN_IRON);
        FluidRegistry.registerFluid(fluidMoltenIron);

        /* REGISTER BLOCKS */
        forge = new BlockForge(Material.rock);
        GameRegistry.registerBlock(forge, Strings.Blocks.FORGE);
        GameRegistry.registerTileEntity(TileEntityForge.class, Strings.Blocks.FORGE);

        oreCopper = new BlockOreCopper(Material.rock);
        GameRegistry.registerBlock(oreCopper, Strings.Blocks.ORE_COPPER);
        OreDictionary.registerOre("oreCopper", oreCopper);

        oreTin = new BlockOreTin(Material.rock);
        GameRegistry.registerBlock(oreTin, Strings.Blocks.ORE_TIN);
        OreDictionary.registerOre("oreTin", oreTin);

        oreSilver = new BlockOreSilver(Material.rock);
        GameRegistry.registerBlock(oreSilver, Strings.Blocks.ORE_SILVER);
        OreDictionary.registerOre("oreSilver", oreSilver);

        moltenCopper = new BlockMoltenCopper(fluidMoltenCopper, Material.lava);
        GameRegistry.registerBlock(moltenCopper, Strings.Fluids.MOLTEN_COPPER);

        moltenTin = new BlockMoltenTin(fluidMoltenTin, Material.lava);
        GameRegistry.registerBlock(moltenTin, Strings.Fluids.MOLTEN_TIN);

        moltenSilver = new BlockMoltenSilver(fluidMoltenSilver, Material.lava);
        GameRegistry.registerBlock(moltenSilver, Strings.Fluids.MOLTEN_SILVER);

        moltenGold = new BlockMoltenGold(fluidMoltenGold, Material.lava);
        GameRegistry.registerBlock(moltenGold, Strings.Fluids.MOLTEN_GOLD);

        moltenIron = new BlockMoltenIron(fluidMoltenIron, Material.lava);
        GameRegistry.registerBlock(moltenIron, Strings.Fluids.MOLTEN_IRON);

        anvilStone = new BlockAnvilStone(Material.rock);
        GameRegistry.registerBlock(anvilStone, Strings.Blocks.ANVIL_STONE);

    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {
        clientProxy.initRenderers();
        CraftingManager.registerRecipes();
    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) {

    }

    public static CreativeTabs tabSmithcraft = new CreativeTabs(CreativeTabs.getNextID(), "tabSmithcraft") {
        public ItemStack getIconItemStack() {
            return new ItemStack(hammer);
        }

        @Override
        public Item getTabIconItem() {
            return null;
        }
    };

}
