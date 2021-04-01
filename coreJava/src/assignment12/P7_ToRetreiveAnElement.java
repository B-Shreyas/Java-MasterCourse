package topic12.assignment;

import java.util.ArrayList;
import java.util.List;

public class P7_ToRetreiveAnElement {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();

		al.add("One");
		al.add("Two");
		al.add("Three");
		al.add("Four");
		al.add("Five");

		System.out.println("Original list : " + al);

		List<String> retreive = al.subList(1, 4);
		System.out.println("After specifying the index to retreive an element : " + retreive);

	}

}
