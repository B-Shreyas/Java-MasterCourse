package topic11.enums;

public class Nature {

	enum Season {
		RAINY, WINTER, SPRING, SUMMER, AUTUMN;
	}

	public static void enjoyClimate(Season s) {

		switch (s) {
		case WINTER:
			System.out.println("Use sweater");
			break;
		case SUMMER:
			System.out.println("Use cap");
			break;
		case RAINY:
			System.out.println("Use umbrella");
			break;
		default:
			System.out.println("No need to use anything special!");
		}
	}

	public static void main(String[] args) {

		Season s = Season.RAINY;
		enjoyClimate(s);
	}

}
