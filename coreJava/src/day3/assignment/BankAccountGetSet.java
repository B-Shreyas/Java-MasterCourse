package day3.assignment;

public class BankAccountGetSet {

	private int accNo;
	private String name;
	private float balance;

	public int getAccno() {
		return accNo;
	}

	public String getName() {
		return name;
	}

	public float getBalance() {
		return balance;
	}

	public void setAccno(int no) {
		accNo = no;
	}

	public void setName(String nm) {
		name = nm;
	}

	public void setBalance(float bal) {
		balance = bal;
	}

	public void acceptAccountDetails(int ano, String nm, float bal) {
		accNo = ano;
		name = nm;
		balance = bal;
	}

}
