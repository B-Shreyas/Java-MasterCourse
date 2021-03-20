package day8.assignment;

public class P5_AccessElements {

	static public void passData(int a[][]) {
		System.out.println("Elements are: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j] + "\t");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		passData(a);

	}

}
