package topic12_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateList {

	public static void main(String[] args) {

		ArrayList<String> custList = new ArrayList<>();
		custList.add("Shreyas Basutkar");
		custList.add("Shreya kale");
		custList.add("virat singh");
		custList.add("kuldeep Rajpurohit");
		custList.add("Ramesh oza");

		Iterator<String> iterator = custList.iterator(); // Iterating list using Iterator
		while (iterator.hasNext()) { // It return true or false
			String name = iterator.next();
			System.out.println(name);
		}

		// Remove underlying collection object while iterating

		Iterator<String> itr = custList.iterator();
		while (itr.hasNext()) {
			String name = itr.next();
			if (name.equals("Shreyas Basutkar")) {
				itr.remove();
				System.out.println("Object removed: " + name);
			}
		}
		System.out.println(custList);

		// Iterating list using Iterator
		System.out.println("Using listIterator");
		ListIterator<String> litr;
		for (litr = custList.listIterator(); litr.hasNext();) {
			String name = litr.next();
			System.out.println(name);
		}

		// Iterating list in reverse using ListIterator
		System.out.println("List in reverse using ListIterator");
		ListIterator<String> litr1 = custList.listIterator(custList.size()); // It gives size to list
		while (litr1.hasPrevious()) {
			String name = litr1.previous();
			System.out.println(name);
		}

		System.out.println(custList);
	}

}
