package majhenriquboss.smithcraft.client.interfaces;

import majhenriquboss.smithcraft.tileentities.TileEntityForge;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

/**
*@author MajhenriquBoss
*/

public class ContainerForge extends Container {

    private TileEntityForge forge;

    public ContainerForge(InventoryPlayer invPlayer, TileEntityForge forge) {
        this.forge = forge;
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return forge.isUseableByPlayer(player);
    }
}
