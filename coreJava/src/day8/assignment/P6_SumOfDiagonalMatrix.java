package day8.assignment;

import java.util.Scanner;

public class P6_SumOfDiagonalMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int row, col, sum = 0;
		System.out.println("Enter how many rows and columns to have in 2D array");
		System.out.println("Enter the number of rows:");
		row = sc.nextInt();
		System.out.println("Enter the number of columns:");
		col = sc.nextInt();

		int[][] mat = new int[row][col];

		System.out.println("Length of matrix is :" + mat.length);

		System.out.println("Enter the elements of the matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("The elements of the matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println("");
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i == j) // this condition checks for diagonal
				{
					sum = sum + mat[i][j];
				}
			}
		}

		System.out.printf("SUM of diagonal elements of the matrix = " + sum);
		sc.close();

	}

}
