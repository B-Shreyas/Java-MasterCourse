package day7_1;

import java.util.Scanner;

public class MaximumOfArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];
		System.out.println("Length of Array :" + a.length);
		System.out.println("Enter the " + a.length + " elements of Array: ");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}

		}
		System.out.println("Maximum of given Array: " + max);

		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}

		}
		System.out.println("Maximum of given Array: " + min);
	}

}
