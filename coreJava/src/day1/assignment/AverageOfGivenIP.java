package day1.assignment;

import java.util.Scanner;

public class AverageOfGivenIP {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the subjects :");
		int subjects = sc.nextInt();

		System.out.println("The subjects are : " + subjects);

		System.out.println("Enter the English marks: ");
		int eng = sc.nextInt();

		System.out.println("Enter the Maths marks: ");
		int maths = sc.nextInt();

		System.out.println("Enter the Science marks: ");
		int science = sc.nextInt();

		System.out.println("English :" + eng);
		System.out.println("Maths :" + maths);
		System.out.println("Science :" + science);

		System.out.println("The average of " + subjects + " subjects: " + (eng + maths + science) / 3);
		sc.close();
	}

}
