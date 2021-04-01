package topic12.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class P10_ReplaceSecondElement {

	public static void main(String[] args) {

		ArrayList<String> weekdays = new ArrayList<>();

		weekdays.add("Sunday");
		weekdays.add("Monday");
		weekdays.add("Tuesday");
		weekdays.add("Wednesday");
		weekdays.add("Thursday");
		weekdays.add("Friday");
		weekdays.add("Saturday");

		System.out.println("Original list : " + weekdays);

		Collections.replaceAll(weekdays, "Monday", "Shreyas");

		System.out.println("Replaced through collections : " + weekdays);

		System.out.println("-------------------------------------");

		weekdays.set(2, "Shreyas");

		System.out.println("Replaced through Arraylist : " + weekdays);

	}

}
