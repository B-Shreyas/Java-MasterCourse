package day9.assignment;

public class P2_ImmutableString {

	public static void main(String[] args) {

		String str1 = new String("Hello");
		System.out.println(str1);

		String str2 = str1.concat("World");
		System.out.println("String after concatenation: " + str1);  // String are immutable
		System.out.println(str2);

	}

}
