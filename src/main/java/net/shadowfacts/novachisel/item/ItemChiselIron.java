package net.shadowfacts.novachisel.item;

import net.shadowfacts.novachisel.NovaChisel;
import net.shadowfacts.novachisel.client.ModItemTextures;

/**
 * @author shadowfacts
 */
public class ItemChiselIron extends ItemChisel {

	public ItemChiselIron() {
		super(ModItemTextures.chiselIron);
	}

	@Override
	public String getID() {
		return NovaChisel.id + ".chiselIron.iron";
	}
}
