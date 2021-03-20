package day3.assignment;

public class GooglePay {

	public void transferAmount(int amount, BankAccountGetSet ac1) {
		System.out.println("Please wait transaction is in processing.....:");

		float bal = ac1.getBalance();

		ac1.setBalance(bal - amount);

		System.out.println("Amount transffered successfully." + "\nUpdated balance of Account No " + ac1.getAccno()
				+ " is Rs. " + ac1.getBalance());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccountGetSet obj = new BankAccountGetSet();
		obj.acceptAccountDetails(12345, "Shreyas", 50000.00f);

		GooglePay t1 = new GooglePay();
		t1.transferAmount(40000, obj);
	}

}
