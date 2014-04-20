package majhenriquboss.smithcraft.blocks;

import majhenriquboss.smithcraft.Smithcraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
*@author MajhenriquBoss
*/

public class BlockSC extends Block {


    protected BlockSC(Material material) {
        super(material);
        this.setCreativeTab(Smithcraft.tabSmithcraft);
    }

    @Override
    public void registerBlockIcons(IIconRegister register) {
        blockIcon = register.registerIcon(Smithcraft.MODID.toLowerCase() + ":" + this.getClass().getSimpleName());
    }
}
