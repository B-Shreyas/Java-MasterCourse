package topic12_collections;

import java.util.ArrayList;
import java.util.List;

public class MethodsOfArrayList {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();

		names.add("Shreyas");
		names.add("Shruti");
		names.add("Rishi");
		names.add("Ritu");
		names.add("Akash");

		System.out.println("First name list: " + names);

		ArrayList<String> names2 = new ArrayList<>();
		names2.add("Suraj");
		names2.add("Shreya");

		System.out.println("Second name list: " + names2);

		names2.addAll(2, names); // addAll() is a method to append the Arraylists object.

		System.out.println("After appending the name list: " + names2);

		names.add(3, "Sangita"); // added object at specifix index
		System.out.println("After adding object at specific index ");
		System.out.println(names);

		List<String> list = names.subList(3, 5); // sublist(startidx, endidx). We have take 'List' becuase we are fetching the sublist. 
		System.out.println("Sublist from names: ");
		System.out.println(list);

		// if(names.contains("Ritu")) { // Contains methods help to search whether the
		// other or that string elements is present or not
		boolean result = names.remove("Ritu");
		// }

		System.out.println("After removing object name list is: ");
		System.out.println(names);

//		String str = null;  // This for each loop will generate the exception
//		for(String s: names) {
//			if(s.equals("Shruti"))
//				str = names.remove(names.indexOf(s));
//		}
//		
//		System.out.println("removing all occurance of " + str);
//		System.out.println(names);

		ArrayList<String> l1 = new ArrayList<>();
		l1.add("Shreyas");
		l1.add("Akash");
		names.retainAll(l1);
		System.out.println("After retaining only l1, elements in names: ");
		System.out.println(names);
	}

}
