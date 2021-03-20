package day1.assignment;

import java.util.Scanner;

public class ArithmeticOpr {
	
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the First num: ");

		int num1 = scanner.nextInt();

		System.out.println("Enter the Second num: ");

		int num2 = scanner.nextInt();

		System.out.println("The addition of " + num1 + " + " + num2 + " = " + (num1 + num2));

		System.out.println("The substraction of " + num1 + " - " + num2 + " = " + (num1 - num2));

		System.out.println("The multiplication of " + num1 + " * " + num2 + " = " + (num1 * num2));

		System.out.println("The division of " + num1 + " / " + num2 + " = " + (num1 / num2));
	}

}
