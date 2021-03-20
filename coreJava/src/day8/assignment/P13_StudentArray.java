package day8.assignment;

import java.util.Arrays;

public class P13_StudentArray {

	int roll, age;
	String name;
	float marks;

	P13_StudentArray() {

	}

	public P13_StudentArray(int roll, int age, String name, float marks) {
		this.roll = roll;
		this.age = age;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "P13_StudentArray [roll=" + roll + ", age=" + age + ", name=" + name + ", marks=" + marks + "]";
	}

	public static void main(String[] args) {

		P13_StudentArray std[] = new P13_StudentArray[4];
		std[0] = new P13_StudentArray(01, 21, "Shreyas", 80.5f);
		std[1] = new P13_StudentArray(02, 16, "Shreya", 60.5f);
		std[2] = new P13_StudentArray(03, 15, "Nilesh", 90.5f);
		std[3] = new P13_StudentArray(04, 12, "Rajiv", 50.5f);

//		for (int i = 0; i < std.length; i++) {
//			if (std[i].marks > 60 && std[i].age < 15) {
//
//				System.out.println(Arrays.toString(std));
//			}
//		}

		for (int i = 0; i < std.length; i++) {
			for (int j = i + 1; j < std.length; j++) {
				if (std[i].name.compareTo(std[j].name) > 0) { // Array names sorted sorting.....
					P13_StudentArray temp;
					temp = std[i];
					std[i] = std[j];
					std[j] = temp;
				}
				if (std[i].marks > 60 || std[i].age < 15) {

					// System.out.println(Arrays.toString(std));
				}

			}
		}
		System.out.println(Arrays.toString(std));
	}

}
