package topic12_collections;

import java.util.ArrayList;

public class GenericArrayListEx {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>(20); // Now obj list1 is a generic type Integer. newCapa = oldCapa + (oldCapa >> 1)
		System.out.println(list1);

//		list1.add("Shreyas"); // This is string not available in generic or int val are allowed.

		list1.add(23);
		list1.add(new Integer(45));
		list1.add((int) 453.22f); // Casting type integer.
		list1.add(5);

		System.out.println(list1);

		for (int i = 0; i < list1.size(); i++) {
			int data = list1.get(i);
			list1.set(i, data + 5);
		}

		System.out.println(list1);

		System.out.println("Using enhanced for loop");
		for (Integer o : list1) {
			System.out.println("Object is " + o);
		}
	}

}
