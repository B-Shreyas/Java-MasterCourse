package topic10_exceptnHand;

public class DivisionWithExceptionHandling {

	public static void main(String[] args) {

		try {

			int a = 10;
			int b = 0;

			float c = a / b;

			System.out.println("Division is: " + c);
			System.out.println("Addition is : " + (a + b));
			System.out.println("Multilication is : " + (a * b));
		}

		catch (ArithmeticException e) {
			System.out.println(e.getMessage()); // Returns String type messages.
			System.out.println("Please do not divide by ZERO");
			System.out.println(e.getClass());
		}

		System.out.println("Exception handling done successfully.");
	}

}
