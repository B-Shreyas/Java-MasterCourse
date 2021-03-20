package day5.assignment;

import java.util.Scanner;

import day5_inher_poly.Address;
import day5_inher_poly.Emp;

public class StudentContainment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the School name: ");
		String name = sc.nextLine();
		System.out.println("Enter the school location: ");
		String address = sc.nextLine();
		System.out.println("Enter the Student Details: ");
		System.out.println("Enter the student name: ");
		String stdname = sc.nextLine();
		System.out.println("Enter the student Id: ");
		int stdId = sc.nextInt();
		System.out.println("Enter student course :");
		String stdCourse = sc.next();
		System.out.println("Enter student course content");
		String stdcourseContent = sc.next();

		Student sd1 = new Student(stdId, stdname, stdCourse, stdcourseContent);
		School s1 = new School(name, address, sd1);
		s1.showEmpRecord();

	}

}
