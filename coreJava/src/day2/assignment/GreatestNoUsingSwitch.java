package day2.assignment;

import java.util.Scanner;

public class GreatestNoUsingSwitch {

//	Q2. Check the greatest no btw 2 no using switch case

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number to compare with another no.");

		int num1 = sc.nextInt();

		System.out.println("Enter the 2nd no. to compare with 1st no.");

		int num2 = sc.nextInt();

		int cmp = Math.max(num1, num2);

		switch (cmp) {

		case 0:
			System.out.println("maximum = " + cmp);
			break;

		default:
			System.out.println("Maximum = " + cmp);
		}

	}

}
