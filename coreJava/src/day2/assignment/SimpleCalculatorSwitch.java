package day2.assignment;

import java.util.Scanner;

public class SimpleCalculatorSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the num1:");
		int num1 = sc.nextInt();

		System.out.println("Enter the num2:");
		int num2 = sc.nextInt();

		System.out.println("Select the choices to perform operations:");

		System.out.println(" 1. Addition:\n 2. Substraction: \n 3. Multiplication: \n 4. Division");
		int opr = sc.nextInt();

		switch (opr) {
		case 1:
			System.out.println("Addition of " + num1 + " + " + num2 + " = " + (num1 + num2));
			break;

		case 2:
			System.out.println("Substraction of " + num1 + " - " + num2 + " = " + (num1 - num2));
			break;

		case 3:
			System.out.println("Multiplication of " + num1 + " * " + num2 + " = " + (num1 * num2));
			break;

		case 4:
			System.out.println("Division of " + num1 + " / " + num2 + " = " + (num1 / num2));
			break;

		default:
			System.out.println("Invalid Operation detected.");

		}

	}

}
