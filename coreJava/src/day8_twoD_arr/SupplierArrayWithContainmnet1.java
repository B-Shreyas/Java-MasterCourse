package day8_twoD_arr;

import java.util.Arrays;

class SupplierClass {
	int supid;
	String supName, mobileNo;
	Item itemssupplied[];

	public String toString() {
		return "Supplier id :" + supid + "\nSupplier Name:" + supName + "\nMoile No:" + mobileNo + "\nSupplies Items :"
				+ Arrays.toString(itemssupplied);
	}

	public SupplierClass() {
	}

	public SupplierClass(int supid, String supName, String mobileNo, Item[] items) {
		this.supid = supid;
		this.supName = supName;
		this.mobileNo = mobileNo;
		this.itemssupplied = items;

	}

}

public class SupplierArrayWithContainmnet1 {

	public static void main(String str[]) {
		SupplierClass s[];
		s = new SupplierClass[3];

		Item items[] = new Item[2];
		items[0] = new Item(1, "Soap");
		items[1] = new Item(2, "Fruits");
		s[0] = new SupplierClass(100, "Mr.Abc", "9845451235", items);

		Item items1[] = new Item[3];
		items1[0] = new Item(1, "Vegitables");
		items1[1] = new Item(2, "Fruits");
		items1[2] = new Item(3, "GroceryItems");
		s[1] = new SupplierClass(101, "Mr.Cbz", "7345451235", items1);

		Item items2[] = new Item[4];
		items2[0] = new Item(1, "Bread");
		items2[1] = new Item(2, "Milk");
		items2[2] = new Item(1, "Eggs");
		items2[3] = new Item(2, "Biscuits");
		s[2] = new SupplierClass(102, "Mr.Xyz", "9881451710", items2);

		System.out.println("Supplier Records are ....");

		/*
		 * for(int i=0;i<s.length;i++) { System.out.println(s[i]);
		 * System.out.println("_________________________"); }
		 */

		for (SupplierClass sup : s) {
			/*
			 * if(sup.supName.equals( "Mr.Abc")) { System.out.println("Supplier Name is " +
			 * sup.supName); System.out.println(Arrays.toString(sup.itemssupplied));
			 * System.out.println("_________________________"); }
			 */
			for (Item i : sup.itemssupplied) {
				if (i.itemName.equals("Fruits"))
					System.out.println("Supplier Name is " + sup.supName);

			}

		}
	}

}
