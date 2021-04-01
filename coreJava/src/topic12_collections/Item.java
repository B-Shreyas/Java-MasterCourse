package topic12_collections;

public class Item {

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

}
