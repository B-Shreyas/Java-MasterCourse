package day7.assignment;

import java.util.Scanner;

public class P10_AvgOfArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();

		int a[] = new int[size];

		System.out.println("The length of given array: " + a.length);
		System.out.println("Enter the " + a.length + " element of array: ");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("The sum of given array: ");

		int sum = 0;
		double avg;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}

		System.out.println(sum);

		System.out.println("The average of given array : ");

		avg = sum / a.length;
		System.out.println(avg);

		sc.close();
	}

}
