package day9_stringBuff_buil;

public class StringmethodsExample {

	public static void main(String[] args) {

		String str1 = new String("HelloWorld");
		String str2 = new String("helloworld");
		// Index of

		System.out.println("Index of character : " + str1.indexOf('d'));
		System.out.println("index of given string : " + str1.indexOf("Wor"));

		// Compare to

		if (str1.compareTo(str2) == 0)
			System.out.println("Strings are equal.");
		else if (str1.compareTo(str2) < 0)
			System.out.println("String 1 is less than string 2.");
		else if (str1.compareTo(str2) > 0)
			System.out.println("String 1 is greater than string 2.");

		// Strats with()

		System.out.println("StartsWith() : " + str1.startsWith("Hel")); // It return boolean type value i.e T or F

		// Ends with()

		System.out.println("EndsWith() : " + str1.endsWith("ld"));

		// Uppercase()

		System.out.println("toUppercase() : " + str2.toUpperCase());
	}

}
