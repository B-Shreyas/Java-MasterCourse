package topic10_exceptnHand;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchHandlerExample {

	public static void main(String[] args) {

		int arr[];
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of Array: ");
			int size = sc.nextInt(); // This exception is called as "InputMissMatchException"

			arr = new int[size];
			int sum = 0;
			System.out.println("Enter the Array Elements: ");
			for (int i = 0; i <= arr.length; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			System.out.println("Sum of all elements in array is: " + sum);
			System.out.println("Average of elements in array is: " + (sum / arr.length));

			sc.close();

		} catch (ArithmeticException e) {
			System.out.println("Error type is: " + e.getMessage());
			System.out.println("Error message is: " + e.getClass());
		} catch (InputMismatchException e1) { // This program is all about input miss match type exceptions. This
												// exception will applicable for this type of application or program.
			System.out.println("Error type is: " + e1.getMessage());
			System.out.println("Error message is: " + e1.getClass());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error type is: " + e.getMessage());
			System.out.println("Error message is: " + e.getClass());
		} catch (Exception e) { // Its a parent of all exceptions. This is generic catch handler. Keep it at
								// alst ones. if it keep at first position no problem but least exceptions will
								// give the errors.
								// It means instead of above mention exception occurs then it will execute this
								// exception.
			System.out.println("Error type is: " + e.getMessage());
			System.out.println("Error message is: " + e.getClass());
		}
	}

}
