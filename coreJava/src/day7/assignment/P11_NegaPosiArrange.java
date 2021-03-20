package day7.assignment;

import java.util.Scanner;

public class P11_NegaPosiArrange {

	public static void RearrangePosNeg(int arr[]) {
		int i = 0;
		int j = arr.length - 1;
		while (true) {
			// Loop until arr[i] < 0 and
			// still inside the array
			while (arr[i] < 0 && i < arr.length)
			 	i++;

			// Loop until arr[j] > 0 and
			// still inside the array
			while (arr[j] > 0 && j >= 0)
				j--;

			// if i is less than j
			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			} else
				break;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];

		System.out.println("The length of array: " + a.length);
		System.out.println("Enter elements " + a.length + " in array: ");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		RearrangePosNeg(a);
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		sc.close();
	}

}
