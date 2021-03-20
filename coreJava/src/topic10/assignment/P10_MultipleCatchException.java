package topic10.assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P10_MultipleCatchException {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("-----------Welcome to Employee Management System-------------");
			System.out.println("******Enter the record of how many employees do you want to display*******");

			int size = sc.nextInt();
			int a[] = new int[size];

			System.out.println("-------Enter the " + a.length + " Employee records-------");

			for (int i = 0; i < a.length; i++) {

				System.out.println("Enter employee ID : ");
				int id = sc.nextInt();
				System.out.println("Enter employee Name : ");
				String name = sc.next();
				System.out.println("Enter employee salary : ");
				float salary = sc.nextFloat();

				System.out.println("----------Displaying Employee Records----------");

				System.out.println("Employee ID : " + id);
				System.out.println("Employee Name : " + name);
				System.out.println("Employee salary : " + salary);

				System.out.println("-----------------------------------------------");
			}

			sc.close();
		} catch (ArithmeticException | InputMismatchException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Error type : " + e.getClass());
			System.out.println("Error message : " + "Please give valid input :-");
		} catch (Exception e1) {
			System.out.println("Error type : " + e1.getClass());
			System.out.println("Error message : " + e1.getMessage());
		}

	}
}
