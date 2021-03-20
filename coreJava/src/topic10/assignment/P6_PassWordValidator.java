package topic10.assignment;

import java.util.Scanner;

class InvalidPassword extends Exception {
	
	String string;

	InvalidPassword() {

	}

	InvalidPassword(String str) {
		this.string = str;
	}

	public String getMessage() {
		return string;
	}
}

public class P6_PassWordValidator {

	public void validatePassword(String str) throws InvalidPassword {
		boolean flag = false;

		for (int i = 0; i < str.length(); i++) {
			flag = false;
			if (!(str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
				flag = true;
			}
		}
		if (flag == true) {
			throw new InvalidPassword("PassWord must contains atleast one digit");
		} else
			System.out.println("Valid Passsword");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		P6_PassWordValidator obj = new P6_PassWordValidator();
		System.out.println("Enter Password :");
		String password = sc.nextLine();
		try {
			obj.validatePassword(password);
		} catch (InvalidPassword e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		sc.close();
	}

}
