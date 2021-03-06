package majhenriquboss.smithcraft.blocks;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import majhenriquboss.smithcraft.Smithcraft;
import majhenriquboss.smithcraft.lib.Strings;
import majhenriquboss.smithcraft.tileentities.TileEntityForge;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.Random;

/**
*@author MajhenriquBoss
*/

public class BlockForge extends BlockContainer {


    public BlockForge(Material material) {
        super(material);
        this.setCreativeTab(Smithcraft.tabSmithcraft);
        this.setBlockName(Strings.Blocks.FORGE);
        setHardness(5F);
        setBlockBounds(0F, 0F, 0F, 1F, 2F, 1F);
        setTickRandomly(true);
        setStepSound(soundTypeStone);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register) {
        blockIcon = register.registerIcon(Smithcraft.MODID + ":" + this.getClass().getSimpleName());
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float par1, float par2, float par3) {
        if (!world.isRemote) {
            if (!player.isSneaking()) {
                FMLNetworkHandler.openGui(player, Smithcraft.instance, 0, world, x, y, z);
                return true;
            }
        }
        return false;
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack) {
        TileEntityForge tile = (TileEntityForge)world.getTileEntity(x, y, z);
        int l = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (l == 0) {
            tile.orientation = 2;
        }

        if (l == 1) {
            tile.orientation = 5;
        }

        if (l == 2) {
            tile.orientation = 3;
        }

        if (l == 3) {
            tile.orientation = 4;
        }
        if (world.isRemote) { System.out.println(tile.orientation); }
    }

    @Override
    public void randomDisplayTick(World world, int x, int y, int z, Random rand) {
        world.spawnParticle("smoke", x, y, z, 0.0D, 0.1D, 0.0D);
        world.spawnParticle("smoke", x, y+1, z, 0.0D, 0.1D, 0.0D);
        world.spawnParticle("flame", x, y, z, 0D, 0.1D, 0D);
    }

    @Override
    public int onBlockPlaced(World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int meta) {
        for (int i = 0; i<5; i++) {
            world.spawnParticle("smoke", x, y+i, z, 0D, 0.1D, 0D);
        }
        return meta;
    }

    @Override
    public int getRenderType() {
        return -1;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int i) {
        return new TileEntityForge();
    }
}
