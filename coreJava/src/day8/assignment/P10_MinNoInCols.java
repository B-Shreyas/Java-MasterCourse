package day8.assignment;

public class P10_MinNoInCols {

	static void smallestInCol(int matrix[][], int n, int m) {

		System.out.print(" { ");
		for (int i = 0; i < m; i++) {

			// initialize the minimum element
			// as first element
			int min = matrix[0][i];

			// Run the inner loop for columns
			for (int j = 1; j < n; j++) {

				// check if any element is smaller
				// than the minimum element of the column
				// and replace it
				if (matrix[j][i] < min) {
					min = matrix[j][i];
				}
			}

			// print the smallest element of the row
			System.out.print(min + ", ");
		}

		System.out.print("}");
	}

	public static void main(String[] args) {

		int n = 3, m = 3;
		int matrix[][] = { { 2, 1, 7 }, { 3, 7, 2 }, { 5, 4, 9 } };

		System.out.print("\nMinimum element of each column is ");
		smallestInCol(matrix, n, m);

	}

}
