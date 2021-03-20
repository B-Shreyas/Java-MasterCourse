package day8_twoD_arr;

import java.util.Scanner;

public class SumOfEachRow {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter How many rows and columns to have in 2D Array");
		System.out.println("Enter Rows no");
		int rows = sc.nextInt();
		System.out.println("Enter Columns no");
		int cols = sc.nextInt();
		int a[][] = new int[rows][cols];

		System.out.println("Length of arry (No of Rows) :" + a.length);

		System.out.println("Enter Array Elements :");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		/*
		 * for(int i=0;i<a.length;i++) { for(int j=0;j<a[i].length;j++) { a[i][j] =
		 * sc.nextInt(); } }
		 */

		System.out.println("Sum of Each Row Elements ...");
		// Accessing Array
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = 0; j < a[i].length; j++) {
				sum += a[i][j];
			}
			System.out.println("Row" + (i + 1) + " Elements sum is " + sum);
		}

		sc.close();

	}

}
