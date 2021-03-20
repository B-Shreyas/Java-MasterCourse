package day5_inher_poly;

class Banking {
	protected void doTransaction() {
		System.out.println("Transaction done by being in queue in Bank");

	}
}

class OnlineBanking extends Banking {
	public void doTransaction() {
		System.out.println("Transaction done Online");
//		super.doTransaction();
		

	}

	public void display() {
		super.doTransaction();
		System.out.println("Displayed Passbook");
	}
}

public class OvverridingExample {

	public static void main(String[] args) {
		OnlineBanking ob = new OnlineBanking();
		ob.doTransaction();
		ob.display();

	}

}
