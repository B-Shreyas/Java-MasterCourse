package day1.assignment;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ConvertDays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter days to calculate: ");
		int days = sc.nextInt();

		int years = (days / 365);
		int weeks = (days - (years * 365)) / 7;
		days = ((years * 365) + (weeks * 7));

		System.out.println("Processing.....");

		System.out.println("Years: " + years);
		System.out.println("Weeks: " + weeks);
		System.out.println("Days: " + days);

	}

}
