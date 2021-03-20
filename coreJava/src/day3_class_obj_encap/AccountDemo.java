package day3_class_obj_encap;

public class AccountDemo {

	private int acno;
	protected String name; // Neither private nor public
	private float balance;

	public void openAccount() {
		fillCustomerDetails(12345, "Shreyas", 20000f);
	}

	private void fillCustomerDetails(int ano, String n, float bal) {
		acno = ano;
		name = n;
		balance = bal;

	}

	void showAccountDetails() { // Its default access specifiers.
		System.out.println("Customer Name : " + name);
		System.out.println("Customer acc. no. : " + acno);
		System.out.println("Customer acc. bal. : " + balance);
	}

}
