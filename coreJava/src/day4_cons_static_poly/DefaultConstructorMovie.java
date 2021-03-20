package day4_cons_static_poly;

import day3_class_obj_encap.ParameterisedMovie;

public class DefaultConstructorMovie {

	int yearOfRel;
	float profit;
	String producerName, actorName;

	DefaultConstructorMovie() { // Default Constructor
		yearOfRel = 1997;
		profit = 1200000.0f;
		producerName = "Mr.James";
		actorName = "Leonardo";
	}

	DefaultConstructorMovie(int y, float p, String pr, String a) { // Parameterized Constructor
		yearOfRel = 1997;
		profit = 1200000.0f;
		producerName = "Mr.James";
		actorName = "Leonardo";
	}

	void acceptable(int y, float p, String pr, String a) {
		yearOfRel = y;
		profit = p;
		producerName = pr;
		actorName = a;
	}

	void showDetails() {
		System.out.println("Movie profit is Rs. " + profit);
		System.out.println("Movie producer name is " + producerName);
		System.out.println("Movie actor name is " + actorName);
		System.out.println("Movie released on " + yearOfRel);
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DefaultConstructorMovie terminator = new DefaultConstructorMovie();
		System.out.println("After object creation values initialized in object :");
		terminator.showDetails();
		
		System.out.println("");

		DefaultConstructorMovie missionImpossible = new DefaultConstructorMovie(2017, 250000.0f, "Mr.James",
				"Tom Cruise");
		missionImpossible.showDetails();

//		DefaultConstructorMovie titanic = new DefaultConstructorMovie();
//		titanic.acceptable(1997, 12000.00f, "Mr.James", "Leonardo");
//		titanic.showDetails();
//		
//		System.out.println("******************************************");
//
//		DefaultConstructorMovie uri = new DefaultConstructorMovie();
//		titanic.acceptable(2018, 12000.00f, "V.Chopra", "Vicky Kaushal");
//		titanic.showDetails();

	}

}
