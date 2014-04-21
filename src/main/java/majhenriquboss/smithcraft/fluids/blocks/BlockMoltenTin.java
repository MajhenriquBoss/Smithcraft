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

public class BlockMoltenTin extends BlockFluidClassic {


    public BlockMoltenTin(Fluid fluid, Material material) {
        super(fluid, material);
        this.setBlockName(Strings.Fluids.MOLTEN_TIN);
    }

}
