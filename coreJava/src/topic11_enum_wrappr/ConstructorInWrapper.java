package topic11_enum_wrappr;

public class ConstructorInWrapper {

	public static void main(String[] args) {

		// Integer Class Constructors. Integer has 2 types of constructors
		Integer i1 = new Integer(20);
		Integer i2 = new Integer("20");

		System.out.println("Object i1: " + i1);
		System.out.println("Object i2: " + i2);

		System.out.println("-----------------------------");

		// Float Class Constructors. Float has 3 types of constructors

		Float f1 = new Float(43.24f);
		Float f2 = new Float("40.214");
		Float f3 = new Float(34.55d);

		System.out.println("Object f1: " + f1);
		System.out.println("Object f2: " + f2);
		System.out.println("Object f3: " + f3);

		System.out.println("-----------------------------");

		// Characterx Class Constructors. Character has 1 types of constructors
		Character c1 = new Character('S');
		System.out.println("Character Object c1: " + c1);

	}

}
