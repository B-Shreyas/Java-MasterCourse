package day7.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class P13_StringDesc {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string in array: ");
		int arr = sc.nextInt();

		String input[] = new String[arr];

		System.out.println("The length of array: " + input.length);
		System.out.println("Enter string " + input.length + " in array: ");

		for (int i = 0; i < input.length; i++) {
			input[i] = sc.next();
		}

		System.out.println("Input : " + Arrays.toString(input));
		System.out.println("------After logic------");

		// String[] input = { "hi", "how", "are", "you", "doing" };
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i].length() == input[j].length()) {
					if (input[i].compareTo(input[j]) > 0) {
						String temp = input[i];
						input[i] = input[j];
						input[j] = temp;
					}
				}

				else if (input[i].length() < input[j].length()) { // 2 < 3
					String temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}

		System.out.println("Output : " + Arrays.toString(input));
		sc.close();

	}

}
