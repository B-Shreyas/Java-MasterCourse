package hackerankQuestions;

import java.util.Scanner;

public class TableOf2UsingLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number which yoyu want the table:");

		int num = sc.nextInt();

		System.out.println("The table of " + num + " is processing.....");

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + num * i);
		}
	}

}
