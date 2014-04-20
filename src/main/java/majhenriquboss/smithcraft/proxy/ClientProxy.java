package majhenriquboss.smithcraft.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import majhenriquboss.smithcraft.client.renderers.ForgeRenderer;
import majhenriquboss.smithcraft.tileentities.TileEntityForge;

/**
*@author MajhenriquBoss
*/

public class ClientProxy extends CommonProxy {

    @Override
    public void initSounds() {

    }

    @Override
    public void initRenderers() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityForge.class, new ForgeRenderer());
    }

}
