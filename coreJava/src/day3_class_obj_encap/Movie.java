package day3_class_obj_encap;

public class Movie {

	int yearOfRelease;
	float profit;
	String producerName, actorName;

	// return-type methodName(para list)

	Movie() { // Default Constructor

		this(2005, 50000.00f, "Mr.X", "Mr.A"); // To call one constructor to another. And the constructor should call
												// the first.
//		yearOfRelease = 1998;
//		profit = 120000.00f;
//		producerName = "Mr.James";
//		actorName = "Leonardo";
	}

	Movie(int y, float p, String pr, String ac) { // Parameterized Constructor
		yearOfRelease = y;
		profit = p;
		producerName = pr;
		actorName = ac;
	}

	void acceptDetails(int yearOfRelease, float p, String pr, String a) { // Should be the camel case
		this.yearOfRelease = yearOfRelease; // To avoid shadowing of Instance variable
		profit = p;
		producerName = pr;
		actorName = a;
	}

	void showDetails() {
		System.out.println("Movie profit is Rs. " + this.profit); // Refering to the current object
		System.out.println("Movie producer name is " + this.producerName);
		System.out.println("Movie actor name is " + this.actorName);
		System.out.println("Movie released on " + this.yearOfRelease);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movie titanic = new Movie(); // Its for default constructor
		// titanic.acceptDetails(1997, 12000.00f, "Mr.James", "Leonardo");
		// titanic.showDetails();
		System.out.println("Titanic objects are created and values initialized in it");
		titanic.showDetails();

		System.out.println("****************************************");

		Movie uri = new Movie(2019, 2500000.00f, "Mr.Chopra", "Vicky Kaushal"); // Its for parameterized constructor
		System.out.println("Uri objects are created and values initialized in it");
		uri.showDetails();
	}

}
