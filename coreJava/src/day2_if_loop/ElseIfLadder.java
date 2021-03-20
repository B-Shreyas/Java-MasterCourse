package day2_if_loop;

import java.util.Scanner;

public class ElseIfLadder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the marks to get the grade:");

		int marks = sc.nextInt();
		//char ctz = sc.next().charAt(0);

		if (marks >= 0 && marks <= 100) {

			if (marks >= 85 && marks <= 100) {
				System.out.println("Congrats! You have passed the exam with 'A' grade.");
			}

			else if (marks >= 65 && marks <= 84) {
				System.out.println("Congrats! You have passed the exam with 'B' grade.");
			}

			else if (marks >= 35 && marks <= 64) {
				System.out.println("Congrats! You have passed the exam with 'C' grade.");
			}

			else {
				System.out.println("Opps! You have failed the exam.");
			}
		}

		else {
			System.out.println("Enter the valid the marks.");
		}
	}

}
