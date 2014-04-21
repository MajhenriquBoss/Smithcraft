package majhenriquboss.smithcraft.items;

import cpw.mods.fml.common.IFuelHandler;
import majhenriquboss.smithcraft.Smithcraft;
import majhenriquboss.smithcraft.lib.Strings;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
*@author MajhenriquBoss
*/

public class ItemBlacksmithCoal extends ItemSC implements IFuelHandler {

    public ItemBlacksmithCoal() {
        this.setUnlocalizedName(Strings.Items.BLACKSMITH_COAL);
        this.setMaxStackSize(64);
    }

    @Override
    public int getBurnTime(ItemStack itemStack) {
        return 6400;
    }

    @Override
    public void registerIcons(IIconRegister register) {
        itemIcon = register.registerIcon("minecraft:coal");
    }
}
