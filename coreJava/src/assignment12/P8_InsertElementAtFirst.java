package topic12.assignment;

import java.util.ArrayList;

public class P8_InsertElementAtFirst {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();

		al.add("Shreyas");
		al.add("Basutkar");
		al.add("Abc");

		System.out.println("Original list : " + al);

		al.add(0, "Shruti");

		System.out.println("Element added at first position : " + al);

	}

}
