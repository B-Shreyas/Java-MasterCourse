package day7.assignment;

import java.util.Scanner;

public class P2_AlternateArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array -->");
		int size = sc.nextInt();
		int a[] = new int[size];

		System.out.println("Length of array is --> " + a.length);
		System.out.println("Enter the " + a.length + " elements in array -->");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Alternate array of given elements are --> ");
		for (int i = 0; i <  a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i] + " ");
			}

		}
		sc.close();

	}

}
