package day7_1;

import java.util.Scanner;

public class ArrayEg1 {

	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();

		int a[] = new int[size];
		System.out.println("Length of the array :" + a.length);
		System.out.println("Enter the " + a.length + " elements of array:");

		for (int i = 0; i <= a.length - 1; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Elements of given inputs are: ");

		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(a[i] + " ");
		}
	}

}
