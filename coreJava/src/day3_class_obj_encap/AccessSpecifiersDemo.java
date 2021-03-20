package day3_class_obj_encap;

public class AccessSpecifiersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		AccountDemo newAcc = new AccountDemo();
		//newAcc.acno = 123;
		newAcc.name = "Shreyas";
		//newAcc.balance = 15000f;

		newAcc.openAccount();
		newAcc.showAccountDetails();


	}

}
