package messpace.ChildhoodToys.common;

import cpw.mods.fml.client.registry.ClientRegistry;
import messpace.ChildhoodToys.render.TileEntityGlowStickRenderer;
import messpace.ChildhoodToys.tileentity.TileEntityGlowStick;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerRenderers() {
		
	}
	
	public void registerRenderThings() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGlowStick.class, new TileEntityGlowStickRenderer());
	}
}
