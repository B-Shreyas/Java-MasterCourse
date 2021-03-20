package day8_twoD_arr;

import java.util.Arrays;

public class Student {

	int roll;
	String name;
	int marks[];

	Student() {

	}

	Student(int r, String nm, int[] mrks) {
		roll = r;
		marks = mrks;
		name = nm;
	}

	public void displayDetails() {
		System.out.println("Student rollNo : " + roll);
		System.out.println("Student name :" + name);

		System.out.println("Marks achieved in different subjects....");
		System.out.println(Arrays.toString(marks)); // It has give to display in array format.
//		
//		for(int i=0; i<marks.length; i++) {
//			System.out.println(marks[i] + " ");
//		}
	}

	public static void main(String args[]) {

		int marksRecord1[] = { 100, 54, 85, 80, 90, 99 };
		int marksRecord2[] = { 100, 82, 64, 78, 90, 36 };

		Student shri = new Student(01, "Shri", marksRecord1);
		shri.displayDetails();

		System.out.println("*************************************");

		Student atul = new Student(02, "Shreyas", marksRecord2);
		atul.displayDetails();
	}

}
