package day9.assignment;

public class P8_ToReplaceFirstAndLast {

	public static void main(String[] args) {

		String s = "Dhoni is cricket player and he is captain of indian cricket team";
		char arr[] = s.toCharArray();
		String s1[] = s.split(" ");

		String ch = "is";

		// to remove first and last word
		String s2 = s.replaceFirst("Dhoni", " ");
		System.out.println(s2);

	}

}
