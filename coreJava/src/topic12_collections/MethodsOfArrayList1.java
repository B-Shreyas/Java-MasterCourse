package topic12_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodsOfArrayList1 {

	public static void main(String[] args) {

		String h[] = { "Reading", "Music", "Dancing", "Traking" };

		List<String> hobbies = Arrays.asList(h); // to covert array to list we use Arrays.asList() methods
		System.out.println("List of hobbies by list: ");
		for (String hb : hobbies) {

			System.out.println(hb);
		}

		ArrayList<String> hobbies1 = new ArrayList<>(Arrays.asList(h)); // It is returing list only. // By parameterized const.
		System.out.println("List of hobbies1 by using ArrayList: ");
		for (String hb : hobbies1) {

			System.out.println(hb);
		}

		// To convert Array to List way 2 : Using collections.allAll()
		ArrayList<String> hobbies2 = new ArrayList<>();
		Collections.addAll(hobbies2, h); // 'h' is a String type array. // collections.addAll() is faster
		System.out.println("List of hobbies2: ");
		for (String hb : hobbies2) {
			System.out.println(hb);
		}

		// OR - we can use
		Collections.addAll(hobbies2, "Cooking", "Painting");
		System.out.println(hobbies2);

		// sort()

		Collections.sort(hobbies2);
		System.out.println("After sorting the :\n" + hobbies2);

		// convert collections toArray() way1
		Object[] newhobbies = hobbies2.toArray(); // returing type is object array
		System.out.println("ArrayList converted to Object Array: ");
		System.out.println(Arrays.toString(newhobbies));

		// Convert collection toArray() way2
		String str[] = new String[hobbies2.size()]; // to convert string type array
		hobbies2.toArray(str);
		System.out.println("Array List converted to string array:");
		System.out.println(Arrays.toString(str));

	}

}
