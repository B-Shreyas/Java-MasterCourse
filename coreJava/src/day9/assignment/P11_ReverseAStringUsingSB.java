package day9.assignment;

public class P11_ReverseAStringUsingSB {

	public static void main(String[] args) {

		String input = "This is a test String";

		StringBuilder str = new StringBuilder();
		str.append(input);
		str.reverse();

		System.out.println("The reverse of string using 'StringBuilder' : " + str);

	}

}
