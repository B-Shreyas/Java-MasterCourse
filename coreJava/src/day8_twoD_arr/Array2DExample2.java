package day8_twoD_arr;

public class Array2DExample2 {

	public static void main(String[] args) {

//		int a[][] = new int[3][3];

//		int a[][] = { { 4, 5 }, { 6, 8 }, { 7, 3 } };
		
		int a[][] = new int[][] { {4,5}, {6,8}, {7,3} };

		System.out.println("Length of array (no. of rows) : " + a.length); // "a.length" means it calculate how many
																			// rows are there.
		System.out.println("Array elements are: ");
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) { // here a[i] means a[0], i.e 1st row from 2d array.
//				System.out.println(a[i][j] + "  ");
//			}
//			System.out.println();
//		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				System.out.println(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
