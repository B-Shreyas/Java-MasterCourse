package day7_oneD_arr;

public class VarArgExample {

	public void show(int... a) {
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}

	}

	public static void main(String[] args) {

		VarArgExample o = new VarArgExample();
		int arr[] = { 45, 8, 3, 7, 3, 76 };
		o.show(34, 77, 89, 76);
		o.show(34, 77, 89, 76, 676, 2, 45, 71);
		o.show(arr);

	}

}
