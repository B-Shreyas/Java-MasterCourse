package day7.assignment;

import java.util.Scanner;

public class P8_MinMaxArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();

		int a[] = new int[size];

		System.out.println("The length of an array :" + a.length);
		System.out.println("Enter the " + a.length + " of elements");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("The maximum no. in array : ");
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];

		}
		System.out.println(max + " ");

		System.out.println("The minimum no. in array : ");
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min)
				min = a[i];

		}
		System.out.println(min + " ");

		sc.close();
	}

}
