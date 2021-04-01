package topic13_ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortingListWithComparable {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(50);
		list.add(100);
		list.add(75);
		list.add(20);
		list.add(05);

		System.out.println(list);

		Collections.sort(list);
		System.out.println("List in ascending order : ");
		System.out.println(list);

		// To sort ArrayList in reverse order - way 1
		Collections.sort(list, Collections.reverseOrder()); // This 2nd parameter is camparator
		System.out.println("List in descending order : ");
		System.out.println(list);

		// To sort ArrayList in reverse order - way 2
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println("List in descending order : ");
		System.out.println(list);

	}

}
