package majhenriquboss.smithcraft.items;

import majhenriquboss.smithcraft.Smithcraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

/**
*@author MajhenriquBoss
*/

public class ItemSC extends Item {

    public ItemSC() {
        this.setCreativeTab(Smithcraft.tabSmithcraft);
    }

    @Override
    public void registerIcons(IIconRegister register) {
        itemIcon = register.registerIcon(Smithcraft.MODID.toLowerCase() + ":" + this.getClass().getSimpleName());
    }
}
