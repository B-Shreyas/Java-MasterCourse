package day9_stringBuff_buil;

import java.util.Scanner;

public class StringToCharArrayExample {

	// Make the string in reverse order
	// each character in your string in opposite case eg. take input Hundred out
	// should give -> hUNDRED

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = "All the best";
		System.out.println("The given string is: " + str);
		char arr[] = str.toCharArray();

		// Find the length of String

		System.out.println("Length of string is: " + str.length());
		System.out.println("Length of string is: " + arr.length);

		// Check wether entered character is there
		System.out.println("Enter character to be searched");
		char ch = sc.next().charAt(0);
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (ch == arr[i]) {
				cnt++;
				System.out.println("Character available at position " + (i + 1));
			}
		}

		if (cnt > 0) {
			System.out.println("Character found " + cnt + " times");
		} else {
			System.out.println("Character not found.");
		}

		System.out.println("Find a substring: ");
		System.out.println("Enter start index: ");
		int start = sc.nextInt();
		System.out.println("Enter End Index: ");
		int end = sc.nextInt();
		char subArray[] = new char[end - start + 1];
		int j = 0;
		for (int i = start; i < end; i++) {
			subArray[j] = arr[i];
			j++;
		}

		String substr = new String(subArray);
		System.out.println("Substring : " + substr);

		sc.close();

	}

}
