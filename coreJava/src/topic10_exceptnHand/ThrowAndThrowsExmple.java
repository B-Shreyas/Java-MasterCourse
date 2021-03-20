package topic10_exceptnHand;

import java.util.InputMismatchException;
import java.util.Scanner;

class Student {
	String name;
	Scanner sc = new Scanner(System.in);

	public void showDetails() throws InputMismatchException {

		try {
			System.out.println("Enter the Student name: ");
			name = sc.nextLine();
			if (name.length() < 3) {
				throw new InputMismatchException("Enter the character which length is more than 3.");
			}
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally block executed");
		}

		System.out.println("You have entered :" + name);
	}
}

public class ThrowAndThrowsExmple {

	public static void main(String args[]) {
		Student std = new Student();
		try {
			std.showDetails();
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}

}
