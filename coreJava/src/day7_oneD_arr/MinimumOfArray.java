package day7_oneD_arr;

import java.util.Scanner;

public class MinimumOfArray {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];

		System.out.println("Enter the array elements: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		int min = a[0]; 
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min)
				min = a[i];
		}
		System.out.println("Minimum value of array is: " + min);
		sc.close(); // Close method.
	}

}
