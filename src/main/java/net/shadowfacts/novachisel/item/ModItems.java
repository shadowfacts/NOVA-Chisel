package net.shadowfacts.novachisel.item;

import nova.core.item.ItemFactory;
import nova.core.item.ItemManager;

/**
 * @author shadowfacts
 */
public class ModItems {

	public static ItemFactory chiselIron;

	public static void registerAllItems(ItemManager itemManager) {
		chiselIron = itemManager.register(ItemChiselIron.class);
	}

}
