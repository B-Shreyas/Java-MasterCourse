package topic13_ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingItemListWithComparable {

	public static void main(String[] args) {

		List<Item> itemlist = new ArrayList<>();
		itemlist.add(new Item(111, 60000.00f, "One-Plus 9 Pro"));
		itemlist.add(new Item(92, 5000.00f, "Wireless Logitech Keyboard"));
		itemlist.add(new Item(2, 1500.50f, "Wireless Mouse"));
		itemlist.add(new Item(8522, 100000.55f, "M1-Chip Macbook-Air"));
		itemlist.add(new Item(63, 40000.00f, "Apple-iWatch"));

		System.out.println(itemlist);
		for (Item it : itemlist)
			System.out.println(it);

		System.out.println("----------------------------------------------");

		// 1. sorting by itemId in ascending order.
		Collections.sort(itemlist); // its giving error because Item class does not implements comparable
		for (Item it : itemlist)
			System.out.println(it);

		System.out.println("----------------------------------------------");

		// 2. sorting by itemPrice in ascending order.(From ItemPriceComparator class)

		Collections.sort(itemlist, new ItemPriceComparator());
		System.out.println("After sorting item list by itemPrice ");
		for (Item it : itemlist)
			System.out.println(it);

		System.out.println("----------------------------------------------");

		Collections.sort(itemlist, new FirstByPriceThenByItemNameComparator());
		System.out.println("After sorting item list by itemName in ascending order");
		for (Item it : itemlist)
			System.out.println(it);
	}

}
