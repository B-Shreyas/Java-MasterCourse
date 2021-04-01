package topic13_ComparableComparator;

import java.util.Comparator;

public class ItemPriceComparator implements Comparator<Item> {
	
	public int compare(Item o1, Item o2) {
		if(o1.itemPrice > o2.itemPrice)
			return 1;
		else if(o1.itemPrice > o2.itemPrice)
			return -1;
		else
			return 0;
	}
	

}
