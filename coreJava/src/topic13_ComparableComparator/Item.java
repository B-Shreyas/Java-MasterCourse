package topic13_ComparableComparator;

public class Item implements Comparable<Item> {

	int itemId;
	float itemPrice;
	String itemName;

	Item() {

	}

	public Item(int itemId, float itemPrice, String itemName) {
		this.itemId = itemId;
		this.itemPrice = itemPrice;
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemPrice=" + itemPrice + ", itemName=" + itemName + "]";
	}

	@Override
	public int compareTo(Item o) {
		if (this.itemId < o.itemId)
			return -1;
		else if (this.itemId > o.itemId)
			return 1;
		return 0;
	}

}
