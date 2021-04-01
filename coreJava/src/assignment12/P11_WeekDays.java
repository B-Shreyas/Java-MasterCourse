package topic12.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class P11_WeekDays {

	public static void main(String[] args) {

		ArrayList<String> weekdays = new ArrayList<>();

		weekdays.add("Sunday");
		weekdays.add("Monday");
		weekdays.add("Tuesday");
		weekdays.add("Wednesday");
		weekdays.add("Thursday");
		weekdays.add("Friday");
		weekdays.add("Saturday");

		// Collections.sort(weekdays);

		System.out.println("Weekdays before condition : " + weekdays);

		if (weekdays.removeIf(weeklist -> weeklist.length() > 7))
			System.out.println("Weekdays after condition  : " + weekdays);
		else
			System.out.println("No elements contains in string which length is more than : 7");

	}

}
