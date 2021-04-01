package topic13_ComparableComparator;

import java.util.Collections;
import java.util.LinkedList;

public class SortingListWithComparable1 {

	public static void main(String[] args) {

		LinkedList<String> llist = new LinkedList<>();

		llist.add("Shreyas");
		llist.add("Harshali");
		llist.add("Swapnil");
		llist.add("Aakash");
		llist.add("Shri");

		System.out.println(llist);
		Collections.sort(llist);
		System.out.println("List in ascending : ");
		System.out.println(llist);

		// To sort LinkedList in reverse order - way 1

		Collections.sort(llist, Collections.reverseOrder()); // This 2nd parameter is comparator
		System.out.println("List in descending : ");
		System.out.println(llist);

		// To sort LinkedList in reverse order - way 2

		Collections.sort(llist);
		Collections.reverse(llist);
		System.out.println("List in descending : ");
		System.out.println(llist);
	}

}
