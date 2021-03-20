package day7.assignment;

import java.util.Scanner;

public class P9_CheckDupArr {

	void printRepeating(int a[], int size) {
		int i, j;
		System.out.println("Duplicate elements in array :");
		for (i = 0; i < size; i++) {
			for (j = i + 1; j < size; j++) {
				if (a[i] == a[j])
					System.out.print(a[i] + " ");
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];

		System.out.println("Length of array: " + a.length);
		System.out.println("Element " + a.length + " in array: ");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		P9_CheckDupArr dub = new P9_CheckDupArr();
		int arr_size = a.length;
		dub.printRepeating(a, arr_size);
		sc.close();

	}

}
