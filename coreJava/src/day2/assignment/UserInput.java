package day2.assignment;

import java.util.Scanner;

public class UserInput {

//	Q3. WAP to take input from user till the user not enter negative value
//	and count how many times user input count it.

	public static void main(String[] args) {

//		int count=0;
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter the numbers:");
//
//		int input = sc.nextInt();
//
//		while (input > 0) {
//			count++;
//		}

		int sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the positive numbers:");

		int input = sc.nextInt();

		while (input >= 0) {
			// sum++;
			// int addition = sum +=input;
			input = sc.nextInt();
		}

		System.out.println("The user has entered negative numbers, thats why terminal exited");
		// System.out.println("This is the addition of given numbers: " + addition);
	}

}
