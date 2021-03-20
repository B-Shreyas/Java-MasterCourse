package day9.assignment;

public class P11_1_ReverseStringusingLoop {

	public static void main(String[] args) {

		String input = "This is a test string";

		String reverseString = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			reverseString = reverseString + input.charAt(i);
		}

		System.out.println("Original String : " + input);

		System.out.println("Reversed string : " + reverseString);
	}

}
