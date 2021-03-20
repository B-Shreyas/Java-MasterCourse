package day6_abstr_interface;

public class Students {

	int roll;
	String name;

	public Students() {

	}

	public Students(int r, String n) {
		roll = r;
		name = n;
	}

	public String toString() {
		String str = "Student roll : " + roll + " Student name: " + name;
		return str;
	}

	public void showRecord() {
		System.out.println("I am a show Record method");
	}

	public static void main(String args[]) {

		final int VALUE = 90; // After initialized it as a final. Then it wont be reinitialized it.
		// Final Value should be declared in Capitals
		Students std = new Students(02, "Shreyas");
		System.out.println("Hashcode of student :" + std.hashCode());
		System.out.println("Student details are \n" + std);
		// value = 51;
		System.out.println(VALUE);
	}

}

class College extends Students { // If Base class is final then subclass will not able to extend

	public void showRecord() {
		System.out.println("I am show record of College class");
	}
}
