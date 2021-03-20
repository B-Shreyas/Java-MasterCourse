package mock;

public class ConstrSchool {

	public int roll, age;
	public String name;
	public float marks;

	ConstrSchool() { // Default constructor
		roll = 01;
		name = "Shreyas";
		marks = 82.5f;
		age = 20;
	}

	public ConstrSchool(int roll, int age, String name, float marks) {
		this.roll = roll;
		this.age = age;
		this.name = name;
		this.marks = marks;
	}

	void showDetails() {
		System.out.println("The roll no of student : " + this.roll);
		System.out.println("The name of student : " + this.name);
		System.out.println("The age of student : " + this.age);
		System.out.println("The marks of student : " + this.marks);
	}

	public static void main(String[] args) {

		ConstrSchool newEnglishSchool = new ConstrSchool();
		newEnglishSchool.showDetails();

		System.out.println("**********************************");

		ConstrSchool mountMarySchool = new ConstrSchool(02, 21, "shreyas", 87.52f);
		mountMarySchool.showDetails();

	}

}
