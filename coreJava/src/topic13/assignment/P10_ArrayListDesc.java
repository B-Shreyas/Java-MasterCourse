package topic13.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class P10_ArrayListDesc {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("Shreyas");
		list.add("Arpita");
		list.add("Krishna");
		list.add("Mazin");
		list.add("Rahul");

		System.out.println("Original list : " + list);

		Collections.sort(list);
		Collections.reverse(list);
		System.out.println("Descending order list way 1 --> " + list);

		System.out.println("--------------------------------------------------------------------------");

		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Descending order list way 2 --> " + list);

		System.out.println("--------------------------------------------------------------------------");

	}

}
