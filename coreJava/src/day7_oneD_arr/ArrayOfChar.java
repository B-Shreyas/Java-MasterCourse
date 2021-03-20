package day7_oneD_arr;

public class ArrayOfChar {

	public void convertCase(char a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 'A' && a[i] <= 'Z')
				System.out.println((char) (a[i] + 32) + " ");
			else if (a[i] >= 'a' && a[i] <= 'z')
				System.out.println((char) (a[i] - 32) + " ");
			else
				System.out.println("Its not alphabet");
		}
	}

	public static void main(String[] args) {

		char a[] = { 'a', 'S', '9' };

		ArrayOfChar obj1 = new ArrayOfChar();
		obj1.convertCase(a);

	}

}
