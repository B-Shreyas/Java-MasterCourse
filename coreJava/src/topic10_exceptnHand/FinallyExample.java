package topic10_exceptnHand;

import java.util.InputMismatchException;

public class FinallyExample {

	public static void main(String[] args) {
		try {

			int a = 20;
			int b = 0;
			float c = a / b;

			System.out.println("The division is: " + c);
			System.out.println("The addition is: " + (a + b));
			System.out.println("the multiplication is: " + (a * b));

		} catch (ArithmeticException | InputMismatchException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Error type: " + e.getClass());
			System.out.println(e.getMessage());
			System.out.println("Error message: " + "Please give the correct input.");
		} catch (Exception e) {
			System.out.println("Error type: " + e.getClass());
			System.out.println("Error message: " + "Please give the correct input.");
		} finally {
			System.out.println("Division operation ends.");
		}
	}

}
