package topic12.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P9_ConvertALtoArrViceVersa {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("One");
		al.add("Two");
		al.add("Three");
		al.add("Four");
		al.add("Five");

		System.out.println("Original ArrayList : " + al);

		Object[] obj = al.toArray();

		System.out.println("-------------------------------------------------------");

		System.out.println("Converted as ArrayList to Array : " + Arrays.toString(obj));

		System.out.println("-------------------------------------------------------");

		String[] arr = new String[al.size()];

		for (int i = 0; i < al.size(); i++) {
			arr[i] = al.get(i);
		}

		System.out.println("Using get() method ");
		for (String x : arr)

			System.out.print(x + " ");

		System.out.println("\n-------------------------------------------------------");

		String names[] = { "Shreyas", "Shruti", "Anjali", "Riya" };

		List<String> al3 = new ArrayList<>();
		Collections.addAll(al3, "Shri");
		System.out.println("Using Array to ArrayList : " + Arrays.toString(names));

		System.out.println("-------------------------------------------------------");

		String names2[] = { "Shreyas", "Shruti", "Anjali", "Ritesh" };

		List<String> al4 = new ArrayList<>();

		for (String outp : names2)
			al4.add(outp);
		System.out.println("Using Array to ArrayList : " + Arrays.toString(names2));

	}

}
