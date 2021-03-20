package day8_twoD_arr;

import java.util.Arrays;

class Supplier1 
{
	int supid;
	String supName,mobileNo;
	Item itemssupplied[]; 
	
	public String toString() 
	{
		return "Supplier id :" + supid 
				+ "\nSupplier Name:" + supName 
				+ "\nMoile No:" + mobileNo
				+ "\nSupplies Items :"
				+ Arrays.toString(itemssupplied);
	}

	public Supplier1() {}
	public Supplier1(int supid, String supName,String mobileNo, Item[] items) 
	{
		this.supid = supid;
		this.supName = supName;
		this.mobileNo = mobileNo;
		this.itemssupplied = items;
		
	}

}

public class SupplierArrayWithContainment
{
	public static void main(String str[])
	{
			
		Item items[] = new Item[2];
		items[0] = new Item(1,"Soap");
		items[1] = new Item(2,"FaceWash");
		Supplier1 sp1 = new Supplier1(100,"Mr.Abc","9845451235",items);
		
		Item items1[] = new Item[3];
		items1[0] = new Item(1,"Vegitables");
		items1[1] = new Item(2,"Fruits");
		items1[2] = new Item(3,"GroceryItems");
		Supplier1 sp2 = new Supplier1(101,"Mr.Cbz","7345451235",items1);
		
		System.out.println("Supplier Records are ....");
		
			System.out.println(sp1);
			System.out.println("_________________________");
			System.out.println(sp2);
	}
	
}
