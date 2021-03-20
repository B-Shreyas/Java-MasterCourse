package topic10.assignment;

public class P9_TryFinallyExample {

	public static void main(String[] args) {

		try {
			String str = "Hi Shreyas Basutkar";
			System.out.println(str);
			throw new ArithmeticException();

		} finally {
			System.out.println("This is a finally block");
		}

	}
}
