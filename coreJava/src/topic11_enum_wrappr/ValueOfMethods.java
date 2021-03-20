package topic11_enum_wrappr;

public class ValueOfMethods {

	public static void main(String[] args) {

		Integer i = Integer.valueOf(142);
		Integer i1 = Integer.valueOf("1234");
		Integer i2 = Integer.valueOf("101", 2); // Decimal representation of binary number.

		System.out.println("i: " + i);
		System.out.println("i1: " + i1);
		System.out.println("i2: " + i2);

	}

}
