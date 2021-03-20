package day4_cons_static_poly;

public class CalculatorApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberOperations oprtn = new NumberOperations();
		oprtn.addNumbers(5, 10, 20.00f);
		System.out.println("The addition is : " + oprtn.addNumbers(10, 20));
		oprtn.addNumbers(15, 20.00f);

	}

}
