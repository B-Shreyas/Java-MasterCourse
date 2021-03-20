package day1.assignment;

import java.util.Scanner;

public class ReportManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int english, maths, science, hindi, marathi, socialstudies;

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to New English School");
		System.out.println("To see the result enter the marks of following subjects:");
		// String subjects = sc.next();

		System.out.println("English: ");
		english = sc.nextInt();

		System.out.println("Maths : ");
		maths = sc.nextInt();

		System.out.println("Science : ");
		science = sc.nextInt();

		System.out.println("Hindi : ");
		hindi = sc.nextInt();

		System.out.println("Marathi : ");
		marathi = sc.nextInt();

		System.out.println("Social-Studies : ");
		socialstudies = sc.nextInt();

		int total = (english + maths + science + hindi + marathi + socialstudies);
		System.out.println("The total of these subjects are: " + english + " " + maths + " " + science + " " + hindi
				+ " " + marathi + " " + socialstudies + " = " + total);

		float percentage = (total * 100 / 600);
		System.out.println("The average percentage of the given subjects are : " + percentage + "%");

	}

}
