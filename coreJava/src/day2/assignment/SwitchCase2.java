package day2.assignment;

import java.util.Scanner;

public class SwitchCase2 {

	// Q1 print 1 to 5 no. using switch case

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the input from 1 to 5 to display the numbers:");

		int sw = sc.nextInt();

		switch (sw) {

		case 1:
			System.out.println("User wants to display no. 1");
			sw = sc.nextInt();
//			break;

		case 2:
			System.out.println("User wants to display no. 2");
			sw = sc.nextInt();
//			break;

		case 3:
			System.out.println("User wants to display no. 3");
			sw = sc.nextInt();
//			break;

		case 4:
			System.out.println("User wants to display no. 4");
			sw = sc.nextInt();
//			break;

		case 5:
			System.out.println("User wants to display no. 5");
			sw = sc.nextInt();
//			break;

		default:
			System.out.println("Invalid input from user.");

		}

	}

}
