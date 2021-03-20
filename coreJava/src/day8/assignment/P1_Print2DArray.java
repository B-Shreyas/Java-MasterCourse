package day8.assignment;

import java.util.Scanner;

public class P1_Print2DArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many rows and columns to have in 2D array");
		System.out.println("Enter no. of rows");
		int rows = sc.nextInt();
		System.out.println("Enter no. of columns");
		int cols = sc.nextInt();

		int a[][] = new int[rows][cols];

		System.out.println("Length of array (no. of rows: " + a.length);
		System.out.println("Enter " + a.length + " elements");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("Array elements are: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j] + "\t");
			}
			System.out.println();
		}
		sc.close();
	}

}
