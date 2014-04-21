package majhenriquboss.smithcraft.blocks;

import majhenriquboss.smithcraft.Smithcraft;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
*@author MajhenriquBoss
*/

public class BlockContainerSC extends BlockContainer {

    protected BlockContainerSC(Material material) {
        super(material);
        this.setCreativeTab(Smithcraft.tabSmithcraft);
    }

    @Override
    public TileEntity createNewTileEntity(World var1, int var2) {
        return null;
    }

    @Override
    public void registerBlockIcons(IIconRegister register) {
        blockIcon = register.registerIcon(Smithcraft.MODID.toLowerCase() + ":" + this.getClass().getSimpleName());
    }
}
