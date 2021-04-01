package topic12.assignment;

import java.util.ArrayList;
import java.util.List;

public class P5_DupArrayList {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();

		al.add("Sun");
		al.add("Mon");
		al.add("Sun");
		al.add("Tue");
		al.add("Wed");
		al.add("Mon");

		System.out.println("Original list : " + al);

		List<String> duplist = new ArrayList<>(); // here we have taken 'List' because we are taking sublist.

		for (String days : al) {
			if (!duplist.contains(days)) {
				duplist.add(days);
			}
		}

		System.out.println("Duplicate list : " + duplist);
	}

}
