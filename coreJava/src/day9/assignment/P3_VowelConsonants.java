package day9.assignment;

import java.util.Scanner;

public class P3_VowelConsonants {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String....");
		String string = sc.nextLine();

		int vowels = 0, consonants = 0, digits = 0, whiteSpaces = 0;

		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (ch == 'A' || ch == 'a' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
					|| ch == 'u' || ch == 'U') {
				vowels = vowels + 1;
			} else if (ch >= '0' && ch <= '9') {
				digits = digits + 1;
			} else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				consonants = consonants + 1;
			} else if (ch == ' ') {
				whiteSpaces = whiteSpaces + 1;
			}
		}

		System.out.println("The vowels are : " + vowels);
		System.out.println("The consonants are : " + consonants);
		System.out.println("The digits are : " + digits);
		System.out.println("The whitespaces are : " + whiteSpaces);

		sc.close();

	}

}
