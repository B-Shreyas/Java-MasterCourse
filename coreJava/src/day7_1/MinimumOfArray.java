package day7_1;

import java.util.Scanner;

public class MinimumOfArray {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of Array:");
		int size = sc.nextInt();

		int a[] = new int[size];

		System.out.println("Length of array: " + a.length);
		System.out.println("Enter the elements of array:");

		for (int i = 0; i <= a.length-1; i++) {
			a[i] = sc.nextInt();
		}

		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min)
				min = a[i];
		}
		System.out.println("Minimum value from array: " + min);

	}

}
