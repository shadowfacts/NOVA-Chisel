package net.shadowfacts.novachisel.client;

import net.shadowfacts.novachisel.NovaChisel;
import nova.core.render.RenderManager;
import nova.core.render.texture.ItemTexture;

/**
 * @author shadowfacts
 */
public class ModItemTextures {

	public static ItemTexture chiselIron;

	public static void registerItemTextures(RenderManager renderManager) {
		chiselIron = renderManager.registerTexture(new ItemTexture(NovaChisel.id, "chisel/iron"));
	}

}
