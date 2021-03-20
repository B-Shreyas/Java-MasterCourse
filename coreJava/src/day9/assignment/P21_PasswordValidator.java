package day9.assignment;

import java.util.Scanner;

public class P21_PasswordValidator {

	public static boolean isSpecialCharPresent(String PassWord) {
		StringBuilder sb = new StringBuilder(PassWord);
		for (int i = 0; i < PassWord.length(); i++) {
			if (sb.charAt(i) == '@' || sb.charAt(i) == '#') {
				return true;
			}
		}
		return false;

	}

	public static boolean isDigitPresent(String PassWord) {
		StringBuilder sb = new StringBuilder(PassWord);
		for (int i = 0; i < PassWord.length(); i++) {
			if (sb.charAt(i) == '0' || sb.charAt(i) == '9') {
				return true;
			}
		}
		return false;

	}

	public static boolean isSpacePresent(String PassWord) {
		StringBuilder sb = new StringBuilder(PassWord);
		for (int i = 0; i < PassWord.length(); i++) {
			if (sb.charAt(i) == ' ') {
				return false;
			}
		}
		return true;

	}

	public static boolean isUpperCasePresent(String PassWord) {
		StringBuilder sb = new StringBuilder(PassWord);
		for (int i = 0; i < PassWord.length(); i++) {
			if (Character.isUpperCase(sb.charAt(i))) {
				return true;
			}
		}
		return false;

	}

	public static boolean isLastConditionPresent(String PassWord) {
		StringBuilder sb = new StringBuilder(PassWord);
		for (int i = 0; i < PassWord.length(); i++) {
			if (sb.charAt(i) == '@' || sb.charAt(i) == '#' || PassWord.length() <= 8) {
				return true;
			}
		}
		return false;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean isValid;

		System.out.println("Enter the UserName : ");
		String UserName = sc.nextLine();

		System.out.println("Enter the PassWord : ");
		String PassWord = sc.nextLine();

		// StringBuilder sb = new StringBuilder(PassWord);

		if (PassWord.length() <= 8) {
			System.out.println("PassWord must be 8 characters long.");
			System.out.println("......Access Granted....");
			System.out.println("------------------------------------");
		}

		isValid = isSpecialCharPresent(PassWord);
		if (!isValid) {
			System.out.println("at least one special @ or\n" + "# character must be present	");
			System.out.println("------------------------------------");
		}

		isValid = isDigitPresent(PassWord);
		if (!isValid) {
			System.out.println("Password must\n" + "contain at least one digit.");
			System.out.println("------------------------------------");
		}

		isValid = isSpacePresent(PassWord);
		if (!isValid) {
			System.out.println("Password must not have space.");
			System.out.println("------------------------------------");
		}

		isValid = isUpperCasePresent(PassWord);
		if (!isValid) {
			System.out.println("password must\n" + "have at least one uppercase letter.");
			System.out.println("------------------------------------");

		}

		isValid = isLastConditionPresent(PassWord);
		if (!isValid) {
			System.out.println("password\n" + "must be 8 chars long. At least one special @ or # character\n"
					+ "must be present.");
			System.out.println("------------------------------------");

		}

		System.out.println("***********************************************");

		System.out.println("Username you have entered : " + UserName);
		System.out.println("PassWord you have entered : " + PassWord);

		System.out.println("***********************************************");

		sc.close();

	}

}
