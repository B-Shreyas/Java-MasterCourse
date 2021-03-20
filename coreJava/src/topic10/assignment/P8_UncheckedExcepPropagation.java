package topic10.assignment;

public class P8_UncheckedExcepPropagation {

	void method1() {
		int value = 50 / 1;
	}

	void method2() {
		method1();
	}

	void method3() {
		try {
			method2();
		} catch (Exception e) {
			System.out.println("exception handled successfully");
		}
	}

	public static void main(String[] args) {

		P8_UncheckedExcepPropagation obj1 = new P8_UncheckedExcepPropagation();
		obj1.method3();
		System.out.println("Output");

	}

}
