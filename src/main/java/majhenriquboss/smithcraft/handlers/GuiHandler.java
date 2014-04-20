package majhenriquboss.smithcraft.handlers;

import cpw.mods.fml.common.network.IGuiHandler;
import majhenriquboss.smithcraft.client.interfaces.ContainerForge;
import majhenriquboss.smithcraft.client.interfaces.GuiForge;
import majhenriquboss.smithcraft.tileentities.TileEntityForge;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
*@author MajhenriquBoss
*/

public class GuiHandler implements IGuiHandler {


    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        if (!world.blockExists(x, y, z)) {
            return null;
        }

        TileEntity tileEntity = world.getTileEntity(x, y, z);

        switch (ID) {
            case 0:
                if (!(tileEntity instanceof TileEntityForge)) {
                    return null;
                }
                return new ContainerForge(player.inventory, (TileEntityForge)tileEntity);
        }

        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (!world.blockExists(x, y, z)) {
            return null;
        }

        TileEntity tileEntity = world.getTileEntity(x, y, z);

        switch (ID) {
            case 0:
                if (!(tileEntity instanceof TileEntityForge))
                    return null;
                return new GuiForge(player.inventory, (TileEntityForge)tileEntity);
        }

        return null;
    }
}
