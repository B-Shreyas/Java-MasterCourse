package day4_cons_static_poly;

public class BankAccountStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccountsStatic o1 = new AccountsStatic(1231, "Shreyas", 40000.00f);
		AccountsStatic o2 = new AccountsStatic(1232, "Shruti", 50000.00f);

		o1.showAccountsDetails();

		System.out.println("*******************************************");

		o2.showAccountsDetails();

		System.out.println("*******************************************");

		AccountsStatic.changeInterestRate(7.5f);

		//System.out.println("*******************************************");

		o1.showAccountsDetails();

		System.out.println("*******************************************");

		o2.showAccountsDetails();

	}

}
