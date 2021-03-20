package day2_if_loop;

import java.util.Scanner;

public class IfNestedStatement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the marks: ");

		int marks = sc.nextInt();

		if (marks >= 0 && marks <= 100) {

			if (marks >= 35) {
				System.out.println("Congratulations...! You have passed the exam:");
			} else {
				System.out.println("OOPs....! You have failed the exam:");
			}
		}

		else {
			System.out.println("Invalid Marks... Please enter the valid marks.");
		}
	}

}
