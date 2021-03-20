package day9_stringBuff_buil;

public class EqualsMethod {

	public static void main(String[] args) {

		/*
		 * String str1 = "Progress"; // It will store in SCP String str2 =
		 * "ProgressPerday"; // Next time this literal will not able to store. if (str1
		 * == str2) { System.out.println("Both strings are equal."); } else
		 * System.out.println("Both strings are not equal.");
		 * 
		 * if (str1.equals(str2)) System.out.println("Both strings are equal.");
		 * 
		 * else System.out.println("Both strings are not equal.");
		 */

		String str3 = new String("Progress"); // Because of new keyword 1st word or object can store in heap as well as
												// SCP. But second object cant able to store in the SCP.
		String str4 = new String("Progress"); // Thats why the output will show the not are wqual.

		if (str3.equals(str4))
			System.out.println("Both strings are equal.");
		else
			System.out.println("Both strings are not equal.");

		if (str3 == str4)
			System.out.println("Both strings are equal.");
		else
			System.out.println("Both strings are not equal.");
	}

}
