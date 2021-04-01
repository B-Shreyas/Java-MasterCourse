package topic13.assignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class P6_ArrayList {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("Sun");
		list1.add("Mon");
		list1.add("Sun");
		list1.add("Tue");
		list1.add("Wed");
		list1.add("Mon");

		System.out.println("Original list : " + list1);

		List<String> list2 = new LinkedList<>(); // here we have taken 'List' because we are taking sublist.

		for (int i = 0; i < list1.size(); i++) {

			for (int j = i + 1; j < list1.size(); j++) {
				if (list1.get(i).equals(list1.get(j)))
					list2.add(list1.get(i));

			}
		}

		System.out.println("Duplicate list : " + list2);

	}

}
