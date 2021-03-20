package topic10_exceptnHand;

public class UncheckedExceptionPropagation {

	public void task3() { // Task 3 is handling through the task2
		int a = 20;
		int b = 0;
		float c = a / b;
		System.out.println("The division is: " + c);
	}

	public void task2() { // task2 is also not handling any responsibility
		task3(); // Task2 is handling through the task3
	}

	public void task1() { // And task1 is handling via main method.

		try {

			task2();
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception propagated from task2 and handled here in task1");
			System.out.println("Exception type: " + e.getClass());
			System.out.println("Exception message: " + e.getMessage());
		}
	}

	public static void main(String[] args) {

		// If any exception is not handled in main method also then it automatically the
		// exception is propogated to jvm & jvm by default handled the unchecked
		// exception.

		// In main method exception is not handled and uncheck exception is propogated
		// through JVM by default
		UncheckedExceptionPropagation unchecked = new UncheckedExceptionPropagation();
		unchecked.task3();

	}

}
