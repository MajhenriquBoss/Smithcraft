package majhenriquboss.smithcraft.items;

import majhenriquboss.smithcraft.api.IForgeable;
import majhenriquboss.smithcraft.lib.Strings;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

/**
*@author MajhenriquBoss
*/

public class ItemIronPlate extends ItemSC implements IForgeable {

    public ItemIronPlate() {
        this.setUnlocalizedName(Strings.Items.PLATE_IRON);
    }

    private int temperature = 25;
    private int[] thickness = {5, 5, 5, 5, 5, 5, 5, 5};
    private double bending = 0;

    private final int baseHardness = 20;
    private final int baseMaxBendability = 45;
    private final int baseBreakability = 70;

    @Override
    public void onCreated(ItemStack itemStack, World world, EntityPlayer player) {
        itemStack.stackTagCompound = new NBTTagCompound();
        itemStack.stackTagCompound.setInteger("temperature", temperature);
        itemStack.stackTagCompound.setDouble("bending", bending);
        itemStack.stackTagCompound.setIntArray("thickness", thickness);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List info, boolean par1) {
        info.add("§l§7Bending: " + bending);
        info.add("§l§cTemperature: " + temperature + "°C");
        info.add("§l§eAverage Thickness: " + thickness[1]);
    }


    /* IFORGEABLE */
    @Override
    public double getHardness(int temperature) {
        return temperature > getTemperature() ? baseHardness - ((temperature - 25) * 0.25) : baseHardness;
    }

    @Override
    public double getMalleability(int temperature) {
        return temperature > getTemperature() ? baseMaxBendability - ((temperature - 25) * 0.5) : baseMaxBendability;
    }

    @Override
    public int[] getThickness() {
        return thickness;
    }

    @Override
    public double getBreakability(int temperature) {
        return temperature > getTemperature() ? baseBreakability - ((temperature - 25) * 0.5) : baseBreakability;
    }

    @Override
    public int bend(int amount, int temperature) {
        if (amount > getMalleability(temperature)) {
            Random rand = new Random();
            int x = rand.nextInt(100);
            if (x < getBreakability(temperature) || getBreakability(temperature) == 100) {
                return 2;
            } else {
                return 1;
            }
        }
        bending += amount;
        return 0;
    }

    @Override
    public boolean hit(int amount, int place, int temperature) {
//        if (amount > getThickness()[place]) {
//            Random rand = new Random();
//            int x = rand.nextInt(100);
//            if (x < getBreakability(temperature) + 20 || getBreakability(temperature) == 100) {
//                return false;
//            } else {
//                thickness[place] = 1;
//                return true;
//            }
//        }
        thickness[place] -= amount;
        return true;
    }

    /* IHEATMANAGEABLE */
    @Override
    public int getTemperature() {
        return temperature;
    }
}
