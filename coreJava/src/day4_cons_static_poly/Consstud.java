package day4_cons_static_poly;

public class Consstud {

	int roll;
	String name;
	float marks;

	Consstud() {

		int roll = 1;
		String name = "Shreyas";
		float marks = 80.5f;
	}

	Consstud(int rollNo, String nameStd, float marksstd) {

		this.roll = rollNo;
		this.name = nameStd;
		this.marks = marksstd;
	}

	void ShowDetails() {
		System.out.println("Student rollNo :" + roll);
		System.out.println("Student name :" + name);
		System.out.println("Std marks :" + marks);
	}

	public static void main(String args[]) {
		Consstud obj1 = new Consstud();
		obj1.ShowDetails();

		System.out.println("*******************");

		Consstud obj2 = new Consstud(1, "Shreyas", 52.2f);
		obj2.ShowDetails();
	}

}
