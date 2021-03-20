package day4_cons_static_poly;

public class AccountsStatic {

	private int accNo;
	protected String name;
	private float balance;

	public static String bankName = "ICICI Bank";
	public static float iRate = 7.2f;

	public static void changeInterestRate(float newRate) {
		iRate = newRate;

	}

	AccountsStatic() {

	}

	AccountsStatic(int a, String n, float b) {
		accNo = a;
		name = n;
		balance = b;
	}

	void showAccountsDetails() {
		System.out.println("Customer name : " + name);
		System.out.println("Account No : " + accNo + " is with " + AccountsStatic.bankName); // Here we called static
																								// method "BankName".s
		System.out.println("Accounts balance id Rs." + balance);
		System.out.println("Interest rate applicable : " + iRate);
	}

}
