package day8_twoD_arr;

public class Item {

	int itemID;
	String itemName;

	public String toString() {
		return "\nItem ID :" + itemID + " Item Name=" + itemName;
	}

	public Item() {
	}

	public Item(int itemID, String itemName) {

		this.itemID = itemID;
		this.itemName = itemName;
	}

}
