package day2_if_loop;

import java.util.Scanner;

public class AccountOpeningNested {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the account holder's age to opening the account:");

		int age = sc.nextInt();

		if (age >= 0 && age <= 100) {

			if (age >= 18) {
				System.out.println("Congrats! You are allowed to open your account in bank.");
			}

			else {
				System.out.println("Opps! You are not allowed to open your account in bank.");
			}
		}

		else {
			System.out.println("Please enter the valid age.");
		}

	}

}
