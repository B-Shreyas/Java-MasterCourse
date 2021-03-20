package topic11.enums.Assginments;

public class Holidays {

	public static void holidaysCounter(WeekDays wd) {

		switch (wd) {
		case MONDAY:
			System.out.println("Its office time.");
			break;

		case TUESDAY:
			System.out.println("Its office time.");
			break;

		case WEDNESDAY:
			System.out.println("Its office time.");
			break;

		case THURSDAY:
			System.out.println("Its office time.");
			break;

		case FRIDAY:
			System.out.println("Its office time.");
			break;

		case SATURDAY:
			System.out.println("Its your half day.");
			break;

		case SUNDAY:
			System.out.println("Its your holiday.");
			break;

		default:
			System.out.println("Please give correct input or No need to go office.");
		}
	}

	public static void main(String[] args) {

		WeekDays wd = WeekDays.SUNDAY;
		holidaysCounter(wd);
	}

}
