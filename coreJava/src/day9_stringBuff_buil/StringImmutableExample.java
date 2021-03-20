package day9_stringBuff_buil;

public class StringImmutableExample {

	public static void main(String[] args) {

		String str = new String("Hello");
		System.out.println("String before concatenation: " + str);

		String str1 = str.concat("World");
		System.out.println("String after concatenation: " + str);
		System.out.println("String str1: " + str1);

		System.out.println("****************************************");

		String s1 = "Good Luck";
		String s2 = " Shri";
		String s3 = s1 + s2;
		System.out.println("String s1: " + s1);
		System.out.println("Srtring s2: " + s2);
		System.out.println("String s3: " + s3);

	}

}
