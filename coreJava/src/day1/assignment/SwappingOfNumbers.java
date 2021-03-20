package day1.assignment;

import java.util.Scanner;

public class SwappingOfNumbers {

	public static void main(String[] args) {

		int num1, num2, swap;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first num to swap with second");
		num1 = scanner.nextInt();

		System.out.println("Enter the second num to swap with first");
		num2 = scanner.nextInt();

		System.out.println("Before swapping the numbers: " + num1 + " & " + num2);

		swap = num1;
		num1 = num2;
		num2 = swap;

		System.out.println("After swapping the numbers: " + num1 + " & " + num2);

	}

}