package net.shadowfacts.novachisel;

import net.shadowfacts.novachisel.client.ModItemTextures;
import net.shadowfacts.novachisel.item.ModItems;
import nova.core.block.BlockManager;
import nova.core.item.ItemManager;
import nova.core.loader.Loadable;
import nova.core.loader.NovaMod;
import nova.core.recipes.RecipeManager;
import nova.core.render.RenderManager;

/**
 * @author shadowfacts
 */
@NovaMod(id = NovaChisel.id, name = NovaChisel.name, version = NovaChisel.version, novaVersion = NovaChisel.novaVersion)
public class NovaChisel implements Loadable {

	public static final String id = "novachisel";
	public static final String name = "NOVA Chisel";
	public static final String version = "0.1.0";
	public static final String novaVersion = "0.1.0";


	public static BlockManager blockManager;
	public static ItemManager itemManager;
	public static RenderManager renderManager;
	public static RecipeManager recipeManager;

	public NovaChisel(BlockManager blockManager, ItemManager itemManager, RenderManager renderManager, RecipeManager recipeManager) {
		NovaChisel.blockManager = blockManager;
		NovaChisel.itemManager = itemManager;
		NovaChisel.renderManager = renderManager;
		NovaChisel.recipeManager = recipeManager;
	}

	@Override
	public void preInit() {
		ModItemTextures.registerItemTextures(renderManager);

		ModItems.registerAllItems(itemManager);
	}

	@Override
	public void init() {

	}

	@Override
	public void postInit() {

	}
}
