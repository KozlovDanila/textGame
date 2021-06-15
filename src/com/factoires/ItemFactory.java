package com.factoires;

import com.model.Item;
import com.model.ItemType;
import java.util.Arrays;
import java.util.List;

public class ItemFactory {

	private final static List<Item> items = Arrays.asList(
			new Item("Шляпа", 15, 5, ItemType.HAT),
			new Item("Ботфорты ненависти", 50, 20, ItemType.BOOTS),
			new Item("Большой меч", 5, 35, ItemType.SWORD)
	);

	public static Item get() {
		int index = (int) (Math.random() * items.size());
		Item item = items.get(index);
		items.remove(item);
		return item;
	}
}
