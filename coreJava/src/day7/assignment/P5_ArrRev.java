package day7.assignment;

import java.util.Scanner;

public class P5_ArrRev {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		int a[] = new int[size];

		System.out.println("The length of array : " + a.length);
		System.out.println("Enter " + a.length + " elements" + " of array :");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Array is copied and reversed :");

		int b[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			b[i] = a[a.length - 1 - i];
			System.out.println(b[i]);
		}

		sc.close();

	}

}
