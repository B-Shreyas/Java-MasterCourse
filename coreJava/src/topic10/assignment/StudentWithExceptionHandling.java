package topic10.assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentWithExceptionHandling {

	// Create Student class name, roll, and 5 diff. subject marks. To display
	// average of all marks and implement all possible exceptions try to manage.

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter students RollNo: ");
			int rollNo = sc.nextInt();
			System.out.println("Enter the stdent name: ");
			String name = sc.next();
			System.out.println("Enter the Marks: ");
			System.out.println("English: ");
			float english = sc.nextFloat();
			System.out.println("Maths: ");
			float maths = sc.nextFloat();
			System.out.println("Science: ");
			float science = sc.nextFloat();
			System.out.println("Student rollno is: " + rollNo);
			System.out.println("Student name is : " + name);
			System.out.println(
					"Student subject marks = " + "English: " + english + " maths: " + maths + " science: " + science);
			System.out.println("The average of the following marks is: " + (english + maths + science) / 0);

			sc.close();
		} catch (ArithmeticException | InputMismatchException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Error type: " + e.getClass());
			System.out.println("Error message: " + " Please give the correct input");

		} catch (Exception e1) {
			System.out.println("Error type: " + e1.getClass());
			System.out.println("Error message: " + e1.getMessage());
			
		}
	}

}
