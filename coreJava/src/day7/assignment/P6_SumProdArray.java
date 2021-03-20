package day7.assignment;

import java.util.Scanner;

public class P6_SumProdArray {

	public static void main(String[] args) {

		int sum = 0;
		int product = 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];

		System.out.println("Length of array: " + a.length);
		System.out.println("Enter " + a.length + " the elements: ");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("The sum of array: ");
		for (int i = 0; i < a.length; i++) {
			sum += a[i];

		}
		System.out.println(sum);

		System.out.println("The product of array: ");
		
		for (int i = 0; i < a.length; i++) {
			product *= a[i];

		}
		System.out.println(product);

		sc.close();
	}

}
