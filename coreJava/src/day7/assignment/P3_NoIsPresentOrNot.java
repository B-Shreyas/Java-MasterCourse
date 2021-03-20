package day7.assignment;

import java.util.Scanner;

public class P3_NoIsPresentOrNot {

	public static void checkValue(int[] a, int[] b) {

		int[] input = a;
		int[] elements = b;

		for (int i = 0; i < input.length; i++) {

			if (input[i] == elements[i]) {
				System.out.println("The elements " + elements[i] + " is present ");
			}
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();

		int a[] = new int[size];

		System.out.println("The length of array: " + a.length);
		System.out.println("Enter " + a.length + " elements of array: ");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		int[] b = {1,2,3,4,5,6};

		P3_NoIsPresentOrNot.checkValue(a, b);

		sc.close();

	}

}
