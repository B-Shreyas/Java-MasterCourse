package day7_oneD_arr;

import java.util.Scanner;

public class ArrayExampleEnhancedForLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();

		int a[] = new int[size];
		System.out.println("Length of array: " + a.length);

		System.out.println("Enter the array elements: ");
		for (int i = 0; i <= a.length - 1; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Array elements are: ");

		// Accessing Array

		for (int x : a) {
			System.out.println(x + " ");
		}
		sc.close();
	}

}
