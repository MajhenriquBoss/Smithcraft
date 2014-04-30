package majhenriquboss.smithcraft.api;

/**
 * @author MajhenriquBoss
 */
public interface IForgeable extends IHeatManageable {

    /**
     *
     * @param temperature the temperature of the material {@link majhenriquboss.smithcraft.api.IHeatManageable#getTemperature()}
     * @return the hardness of the material based on its temperature; scale 0-50
     */
    double getHardness(int temperature);

    /**
     *
     * @param temperature the temperature of the material {@link majhenriquboss.smithcraft.api.IHeatManageable#getTemperature()}
     * @return the max bendability of the material on that temperature; scale 0-100
     */
    double getMalleability(int temperature);

    /**
     *
     * @return the thickness of the material in each place{@link #hit(int, int, int)} in a scale of 0-10; 0 being a sheet and 10 being a thick ingot
     */
    int[] getThickness();

    /**
     *
     * @param temperature the temperature of the material {@link IHeatManageable#getTemperature()}
     * @return how likely it is for the material to snap apart at the temperature; scale of 0-100%
     */
    double getBreakability(int temperature);

    /**
     * When called, the material should increase the bending and,
     * if over the limit, determine if it is going to break based on breakability
     * @param amount how much to bend
     * @param temperature the temperature of the material {@link IHeatManageable#getTemperature()}
     * @return 0 - Bending succesful; 1 - Over the limit, bending canceled; 2 - Over the limit, material broke
     */
    int bend(int amount, int temperature);

    /**
     * Called when a hammer or similar hits the material in a certain place
     * @param amount force of the hammer blow
     * @param place where was the hit based on the flat top surface. in a scale of 0-7 going clockwise from the left and including corners
     * @param temperature the temperature of the material {@link IHeatManageable#getTemperature()}
     * @return if it compressed or broke; going way over the thickness breaks it
     */
    boolean hit(int amount, int place, int temperature);

}
