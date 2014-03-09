package lycanite.lycanitesmobs.mountainmobs;

import lycanite.lycanitesmobs.AssetManager;
import lycanite.lycanitesmobs.mountainmobs.model.ModelJabberwock;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientSubProxy extends CommonSubProxy {
	
	// ========== Render ID ==========
	public static int RENDER_ID = RenderingRegistry.getNextAvailableRenderId();
	
	
	// ========== Register Models ==========
	@Override
    public void registerModels() {
		AssetManager.addModel("Jabberwock", new ModelJabberwock());
	}
}