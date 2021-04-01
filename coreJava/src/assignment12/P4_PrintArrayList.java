package topic12.assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class P4_PrintArrayList {

	public static void main(String[] args) {
		
		// array - interger -10
		// 10 data [1... 10]
		// 15 [1... 10, 11]

		ArrayList<String> list = new ArrayList<>();

		list.add("Shreyas");
		list.add("Harish");
		list.add("Varad");
		list.add("Naresh");
		list.add("Sarfaraz");
		list.add("Rishi");

		System.out.println("-------Using for loop-------");

		for (int i = 0; i < list.size(); i++) { // Printed all elements of array using for loop.
			System.out.println(list.get(i));
		}

		System.out.println(list);

		System.out.println("-------Using for-each loop-------"); // Printed all elements of array using for-each loop.

		for (String al : list) {
			System.out.println(al);
		}

		System.out.println("Using for-each loop : " + list);

		System.out.println("-------Using Iterator-------"); // Printed all elements of array using Iterator.

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}

	}

}
