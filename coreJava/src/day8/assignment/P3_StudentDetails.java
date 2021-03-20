package day8.assignment;

import java.util.Arrays;

class Course {
	String courseName;
	int fees;

	Course() {

	}

	public Course(String courseName, int fees) {
		this.courseName = courseName;
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", fees=" + fees + "]";
	}

}

public class P3_StudentDetails {

	int id;
	String name;
	Boolean isSpecial;
	Course c;

	P3_StudentDetails() {

	}

	public P3_StudentDetails(int id, String name, Boolean isSpecial, Course c) {
		this.id = id;
		this.name = name;
		this.isSpecial = isSpecial;
		this.c = c;
	}

	@Override
	public String toString() {
		return "P3_StudentDetails [id=" + id + ", name=" + name + ", isSpecial=" + isSpecial + ", c=" + c + "]";
	}

	public static void main(String[] args) {

		P3_StudentDetails std1[] = new P3_StudentDetails[3];
		std1[0] = new P3_StudentDetails(1, "Shreyas", true, new Course("Flutter Mobile App Development", 35000));
		std1[1] = new P3_StudentDetails(2, "Shri", false, new Course("Full Stack Java Development", 50000));
		std1[2] = new P3_StudentDetails(3, "Vishal", true, new Course("Full Stack Web Development", 60000));
		System.out.println(Arrays.toString(std1));

	}

}
