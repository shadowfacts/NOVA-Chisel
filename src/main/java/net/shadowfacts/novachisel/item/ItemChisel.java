package net.shadowfacts.novachisel.item;

import net.shadowfacts.novachisel.NovaChisel;
import nova.core.component.Category;
import nova.core.component.renderer.ItemRenderer;
import nova.core.item.Item;
import nova.core.render.texture.Texture;

/**
 * @author shadowfacts
 */
public abstract class ItemChisel extends Item {

	public ItemChisel(Texture texture) {
		add(new ItemRenderer()).setTexture(texture);
		add(new Category(NovaChisel.id + ".category.items"));
	}

}
