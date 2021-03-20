package topic11_enum_wrappr;

public class BoxingAndUnboxing {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		byte b = 10; // Primitive byte data
		@SuppressWarnings("deprecation")
		Byte bobj = new Byte(b); // Boxing
		System.out.println("byte data boxed/wrapped : " + bobj);
		Byte bobj1 = b; // Auto-Boxing
		System.out.println("Byte data AutoBoxed: " + bobj1);

		byte b1 = bobj.byteValue(); // UnBoxing
		System.out.println("After unboxing Byte Object " + "byte value is: " + b1);

		byte b2 = bobj; // Auto Unboxing
		System.out.println("After Auto-Unboxing byte object " + "byte value is: " + b2);

		System.out.println("--------------------------------------------------------------------");

		int a = 20; // Primitive

		Integer i = new Integer(a); // Boxing
		System.out.println("int data boxed/wrapped: " + i);

		Integer i2 = a; // Auto-Boxing;
		System.out.println("Int data when autoboxed: " + i2);

		Integer i3 = i2.intValue(); // Unboxed
		System.out.println("Int data when unboxed: " + i3);

		Integer i4 = i3; // Auto-unboxed
		System.out.println("Int data when auto-unboxed: " + i4);
	}

}
