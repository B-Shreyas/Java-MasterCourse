package day8.assignment;

import java.util.Scanner;

public class P8_TransposeOfMatrix {

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
		// For Transpose create another 2D array with rows number of columns and cols
		// number of rows

		int b[][] = new int[cols][rows];

		// Creating transpose of Matrix
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[j][i] = a[i][j];
			}
			System.out.println();
		}

		System.out.println("Transpose of Matrix is ...");

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
