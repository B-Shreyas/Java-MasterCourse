package day7.assignment;

import java.util.Scanner;

public class P4_ArrayPosiNegaOddEve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array -->");
		int size = sc.nextInt();

		int a[] = new int[size];

		System.out.println("Length of the array --> " + a.length);

		System.out.println("Enter the " + a.length + " elements in array --> ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("The even numbers are --> ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				System.out.println(a[i] + " ");
		}

		System.out.println("The odd numbers are --> ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i] + " ");
			}
		}

		System.out.println("The positive numbers are --> ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				System.out.println(a[i] + " ");
			}
		}

		System.out.println("The negative numbers are --> ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				System.out.println(a[i] + " ");
			}
		}

		System.out.println("The 0's (neutral) number are --> ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				System.out.println(a[i] + " ");
			}
		}

		sc.close();

	}

}
