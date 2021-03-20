package day9.assignment;

import java.util.Scanner;

public class P4_secondOccurance {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string..");
		String str = sc.nextLine();

		int count = 0;
		char givenChar = 's';
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == givenChar) {
				count++;
			}

			if (count == 2) {
				System.out.println("The second most character " + givenChar + " is on index " + i);
				break;
			}

		}

		sc.close();

	}

}
