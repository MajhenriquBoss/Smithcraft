package majhenriquboss.smithcraft.fluids;

import net.minecraftforge.fluids.Fluid;

/**
*@author MajhenriquBoss
*/

public class FluidMoltenMetalSC extends Fluid {

    public FluidMoltenMetalSC(String fluidName) {
        super(fluidName);
        setDensity(55);
        setViscosity(8000);
        setLuminosity(30);
        setTemperature(300);
    }
}
