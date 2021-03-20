package topic10.assignment;

public class P14_ErrorExample {

	public void divide(int x, int y) {
		float ans = x / y;
		System.out.println("Division is: " + ans);
	}

	public static void main(String[] args) {

		int a = 20;
		int b = 0; // If user input 0 by mistake its return objects and object will comes
					// Arithmetic Exception

		// float c = a / b;
		// System.out.println("Division is : " + c);

//		at topic10.DivisionExample.divide(DivisionExample.java:6)
//		at topic10.DivisionExample.main(DivisionExample.java:20) (This following exception output is CallStack information.)

		P14_ErrorExample division = new P14_ErrorExample();
		division.divide(10, 0);
		System.out.println("Addition is : " + (a + b));
		System.out.println("Multiplication is : " + (a * b));
	}

	
}
