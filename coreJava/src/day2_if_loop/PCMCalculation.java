package day2_if_loop;

import java.util.Scanner;

public class PCMCalculation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the marks of Physics:");
		int physics = sc.nextInt();

		System.out.println("Enter the marks of Chemistry:");
		int chemistry = sc.nextInt();

		System.out.println("Enter the marks of Maths:");
		int maths = sc.nextInt();

		int total = maths + chemistry + physics;
		float perc = (100 * total) / 300;

		System.out.println("Percentage in PCM group is: " + perc + "%");

		if (perc >= 90.00f) {
			System.out.println("Student passed with A+ grade.");
		}

		else if (perc >= 75) {
			System.out.println("Student passed with A grade.");
		}

		else if (perc >= 65) {
			System.out.println("Student passed with B grade.");
		}

		else if (perc >= 35) {
			System.out.println("Student passed with C grade.");
		}

		else
			System.out.println("Student has been failed in exam.");
	}

}
