package topic10.assignment;

import java.util.Scanner;

public class UniversalExceptionHandler {

	public static void main(String[] args) {

		try {
//			int num1 = 10;
//			int num2 = 0;
//			int divide = num1 / num2;
//
//			System.out.println(divide);
			
			int a[] = { 10 };
			System.out.println(a[1]);

		} catch (NullPointerException e2) {
			System.out.println(" Null Pointer exception is called");
			System.out.println(e2.getClass());
		} catch (ArithmeticException e1) {
			System.out.println(" Arithmetic exception is called");
			System.out.println(e1.getClass());
		} catch (Exception e) {
			System.out.println(" Exception is called");
			System.out.println(e.getClass());
		}
	}

}
