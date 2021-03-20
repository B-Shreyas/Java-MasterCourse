package day4.assignment;

public class School {

	public int id;
	public String name;
	public double avgMarks;

	School() { // Default Constructor
		this(3, "Shreya", 85.00); // Here we called one constructor to another.
//		id = 1;
//		name = "Shreyas";
//		avgMarks = 75.00;
	}

	School(int ids, String nm, double avgmk) { // Parameterized Constructor
		id = ids;
		name = nm;
		avgMarks = avgmk;

	}

	void acceptDetails(int id, String name, double avgMarks) { // To avoiding shadowing of the Instance Variable
		this.id = id;
		this.name = name;
		this.avgMarks = avgMarks;
	}

	void showDetails() {
		System.out.println("Student's id is: " + this.id); // Referring the current object
		System.out.println("Student's name is: " + this.name);
		System.out.println("Student's marks is: " + this.avgMarks);
	}

	public static void main(String args[]) {
		School student1 = new School(); // Default Constructor
		System.out.println("Student1 objects are created and values initialized to it:");
		student1.showDetails();

		System.out.println("*****************************************************************");

		School student2 = new School(2, "Rishi", 70.00); // Parameterized Constructor
		System.out.println("Student2 objects are created and values initialized to it:");
		student2.showDetails();
	}

}
