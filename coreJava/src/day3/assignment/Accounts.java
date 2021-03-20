package day3.assignment;

public class Accounts {

	public float bal;

//	public float amount, bal, withAmount;
//	public String accInfo;

//	public float getAmount() {
//		return amount;
//	}
//
//	public void setAmount(float amount) {
//		this.amount = amount;
//	}
//
	public float getBal(float amount, float withAmount) {
		return bal;
	}

//	public void setBal(float bal) {
//		this.bal = bal;
//	}

//	public float getWithAmount() {
//		return withAmount;
//	}
//
//	public void setWithAmount(float withAmount) {
//		this.withAmount = withAmount;
//	}
//
//	public String getAccInfo() {
//		return accInfo;
//	}
//
//	public void setAccInfo(String accInfo) {
//		this.accInfo = accInfo;
//	}

	public void insertAccData(String accData) {
		System.out.println("Account data inserted-->  " + accData);
	}

	public void displayAccInfo(String accInfo) {
		System.out.println("Display account info --> " + accInfo);
	}

	public void depositAmount(float amount) {
		System.out.println("Amount deposited --> " + amount);
	}

	public void withdrawAmount(float withAmount) {
		System.out.println("Amount withdrawal --> " + withAmount);
	}

	public void chkBal(float amount, float withAmount) {
		System.out.println("Remaining balance --> " + (amount - withAmount));
	}

	public static void main(String[] args) {

		Accounts ICICIBank = new Accounts();
//		ICICIBank.setAccInfo("Shreyas Basutkar");
//		ICICIBank.setAmount(1000.00f);
//		ICICIBank.setWithAmount(500.00f);

		ICICIBank.insertAccData("12212");
		ICICIBank.displayAccInfo("Shreyas Basutkar");
		ICICIBank.depositAmount(1000.00f);
		ICICIBank.withdrawAmount(600.00f);
		ICICIBank.chkBal(1000.00f, 600.00f);

	}

}
