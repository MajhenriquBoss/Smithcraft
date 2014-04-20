package majhenriquboss.smithcraft.fluids.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import majhenriquboss.smithcraft.Smithcraft;
import majhenriquboss.smithcraft.lib.Strings;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

/**
*@author MajhenriquBoss
*/

public class BlockMoltenGold extends BlockFluidClassic {


    public BlockMoltenGold(Fluid fluid, Material material) {
        super(fluid, material);
        this.setBlockName(Strings.Fluids.MOLTEN_GOLD);
        this.setCreativeTab(Smithcraft.tabSmithcraft);
    }

    @Override
    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
        if (entity instanceof EntityPlayer) {
            return;
        }
        return;
    }

    @SideOnly(Side.CLIENT)
    private IIcon still;
    @SideOnly(Side.CLIENT)
    private IIcon flowing;

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {
        still = register.registerIcon(Smithcraft.MODID.toLowerCase() + ":" + this.getClass().getSimpleName() + "_still");
        flowing = register.registerIcon(Smithcraft.MODID.toLowerCase() + ":" + this.getClass().getSimpleName() + "_flowing");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if (side <= 1)
            return still;
        else
            return flowing;
    }

}
