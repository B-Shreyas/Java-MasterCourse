package day9.assignment;

import java.util.Scanner;

public class P22_PalindromesOrSpecialWords {

	public static void main(String[] args) {

		String word1, word2 = "";

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the word to check whether it is Palindrome or Special : \n");

		word1 = sc.nextLine();

		int n = word1.length();

		for (int i = n - 1; i >= 0; i--) {
			word2 = word2 + word1.charAt(i);
		}

		if (word1.equalsIgnoreCase(word2)) {
			System.out.println("The word is PALINDROME.");
		} else {
			System.out.println("The word is SPECIAL.");

		}

		sc.close();
	}

}
