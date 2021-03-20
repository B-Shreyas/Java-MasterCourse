package day9.assignment;

public class P14_FindTheAvgOfDigitString {

	public static void main(String[] args) {

		String input = "a5ibg9jct4bc";
		String num = "";
		int sum = 0;

		int n = 3;
		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) {
				num = num + input.charAt(i);
			} else {
				if (!num.equals("")) {
					sum = sum + Integer.parseInt(num);
					num = "";
				}
			}
		}

		System.out.println(sum / n);

	}

}
