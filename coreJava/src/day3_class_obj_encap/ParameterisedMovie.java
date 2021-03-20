package day3_class_obj_encap;

public class ParameterisedMovie {

	int yearOfRel;
	float profit;
	String producerName, actorName;

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

		ParameterisedMovie titanic = new ParameterisedMovie();
		titanic.acceptable(1997, 12000.00f, "Mr.James", "Leonardo");
		titanic.showDetails();
		
		System.out.println("******************************************");

		ParameterisedMovie uri = new ParameterisedMovie();
		titanic.acceptable(2018, 12000.00f, "V.Chopra", "Vicky Kaushal");
		titanic.showDetails();

	}

}
