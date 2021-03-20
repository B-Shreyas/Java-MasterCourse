package day9.assignment;

public class P1_CreateString {

	public static void main(String[] args) {

//		Create 2 string using literal and Compare string using == see same
//				reference is there.

		String Str1 = "Shreyas";
		String Str2 = "Basutkar";

		// System.out.println(str);

		String str3 = new String("Hello");
		String str4 = new String("Hello"); 

		System.out.println(str3 == str4);

	}

}
