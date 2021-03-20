package day4.assignment;

public class AssignmStatic {

//	public int id;
//	public String name;

	public static float marks;

	public static void staticMethod() {
//		id = 1;
//		name = "Shreyas";

		marks = 80.00f;
		AssignmStatic s = new AssignmStatic();
		s.nonStatic();

	}

	public void nonStatic() {
		marks = 75.00f;
		System.out.println("Called from non-static method -> Marks = " + marks);
		//// staticMethod(); // static method called here in non static
	}

	public static void main(String args[]) {
		AssignmStatic obj = new AssignmStatic();
		staticMethod();
		// obj.nonStatic();
		System.out.println("Called from static method to non static method -> Marks = " + marks);
	}

}
