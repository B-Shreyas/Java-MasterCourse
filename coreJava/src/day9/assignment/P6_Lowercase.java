package day9.assignment;

import java.util.Scanner;

public class P6_Lowercase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string to convert to lowercase: ");
		String strInput = sc.nextLine();
		char[] ch = strInput.toCharArray();
		for (int a = 0; a < ch.length; a++) {
			if (ch[a] >= 'A' && ch[a] <= 'Z') {
				ch[a] = (char) ((int) ch[a] + 32);
			}
		}
		System.out.println("string in lowercase is: ");
		for (int a = 0; a < ch.length; a++) {
			System.out.print(ch[a]);
		}
		sc.close();
	}

}
