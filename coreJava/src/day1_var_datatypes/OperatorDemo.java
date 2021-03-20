package day1_var_datatypes;

public class OperatorDemo {

	public static void main(String[] args) {

		int a = 10, b = 5, c = 2;
		int ans = (c + a) / b;

		System.out.println("Answer : " + ans);

		// a = a + 5;

		a += 5;

		System.out.println("Modified value of a : " + a);

		// Relational Operator
		int age = 30;
		char ctz = 'I';
		boolean ans1 = (age > 18) && (ctz == 'I'); // Is called 'Short Circuit' Operator as well.
		System.out.println("Allowed to open the account : " + ans1);

		// Unary Operator
		// ++a pre increment Unary Operator / prefix
		// a++ post increment Unary Operator / postfix

//		int x = 10;
//		int y = ++x; // Increment available value of x first then use that value for your purpose.
//		System.out.println("X : " + x);
//		System.out.println("Y : " + y);

		int i = 4;
		int j = 21;
		 int k = ++i * 7 + 2 - j--;
		 System.out.println("k = " + k);
		
	}

}
