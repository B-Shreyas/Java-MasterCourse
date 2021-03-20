package day2.assignment;

import java.util.Scanner;

public class VowelAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Character to know its a Vowel or Consonants:");
		char chr = sc.next().charAt(0);

		if (chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u') {
			System.out.println("Its a vowels:");
		} else
			System.out.println("Its a Consonents:");
	}

}
