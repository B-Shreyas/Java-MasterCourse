package day7.assignment;

import java.util.Scanner;

public class P14_Sep_Zeros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		int len = a.length;
		int b[] = new int[size];

		System.out.println("Length of array : " + a.length);
		System.out.println("Enter " + a.length + " elements :");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("The zero's elements shifted to right side.....");
		int count = 0;
		for (int i = 0; i < len; i++) // [ 2, 0, 0, 4, 3]
		{
			if (a[i] != 0) {
				b[count++] = a[i]; // [2, 4, 3 ]
			}
		}

		for (int j = 0; j < len; j++) {
			System.out.println(b[j]);
		}
		sc.close();

	}

}
