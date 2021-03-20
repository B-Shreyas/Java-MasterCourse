package day8_twoD_arr;

import java.util.Arrays;

class Supplier {
	int supid;
	String supName, mobileNo;
	Item it1;

	public String toString() {
		return "Supplier id :" + supid + "\nSupplier Name:" + supName + "\nMoile No:" + mobileNo;
	}

	public Supplier() {
	}

	public Supplier(int supid, String supName, String mobileNo) {
		this.supid = supid;
		this.supName = supName;
		this.mobileNo = mobileNo;
	}

}

public class SupplierArray {

	public static void main(String str[]) {
		Supplier s[];
		s = new Supplier[5];
		
		//s[0] = new Supplier();

		s[0] = new Supplier(1, "shreyas", "9011783001");
		s[1] = new Supplier(2, "rishi", "0225544");
		s[2] = new Supplier(3, "shubham", "65415451");
		s[3] = new Supplier(4, "Tom", "848488484");
		s[4] = new Supplier(5, "Akshay", "8956511511");

		/*
		 * Scanner sc; for(int i=0;i<s.length;i++) {
		 * System.out.println("Enter Supplier Record "+(i+1)); sc= new
		 * Scanner(System.in); System.out.println("Enter Supp Name :"); String supName
		 * =sc.nextLine(); System.out.println("Enter Supp Mobile :"); String mobileNo
		 * =sc.next(); System.out.println("Enter Supp ID :"); int supid =sc.nextInt();
		 * 
		 * s[i] = new Supplier(supid,supName,mobileNo); }
		 */
		System.out.println("Supplier Records are ....");
		
//		for(int i=0; i<s.length; i++) {
//			System.out.println(s[i]);
//			System.out.println("************************");
//		}

		/*
		 * for(Supplier obj :s) {   
		 * System.out.println(obj);
		 * System.out.println("_________________________"); } // We can also do this by enhanced for loop.
		 */
		
		
		System.out.println(Arrays.toString(s)); // And instead of this 2 for loop we can use this......
	}

}
