package day3.assignment;

public class SchoolApp {

	public void admissionDetails(int id, String name, float marks, boolean isPassed, Student std) {
		System.out.println("The Student's id: " + std.getId());
		System.out.println("The Student's name: " + std.getName());
		System.out.println("The Student's marks: " + std.getMarks());
		System.out.println("The Student's result passed: " + std.isPassed());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student obj = new Student();
		obj.studentDetails(1, "Shreyas", 75.00f, true);

		SchoolApp app = new SchoolApp();
		app.admissionDetails(1, "Shri", 80.00f, true, obj);
	}

}
