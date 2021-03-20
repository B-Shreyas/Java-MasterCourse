package day8.assignment;

public class P9_MaxNoInRow {

	public static void main(String[] args) {

		int larg;

		int arr[][] = { { 1, 100, 3 }, { 4, 101, 6 } };
		System.out.println("Given array: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Maximum number in each row : ");
		for (int i = 0; i < arr.length; i++) {
			larg = arr[i][0];
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] > larg) {
					larg = arr[i][j];
				}
			}
			System.out.println(larg);
		}

		System.out.println("Minimum number in each row : ");
		for (int i = 0; i < arr.length; i++) {
			larg = arr[i][0];
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] < larg) {
					larg = arr[i][j];
				}
			}
			System.out.println(larg);
		}
	}

}
