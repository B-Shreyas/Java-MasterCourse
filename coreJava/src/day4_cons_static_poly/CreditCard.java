package day4_cons_static_poly;

public class CreditCard {

	public void useCard() {
		System.out.println("The credit card is used:");
	}

	class DebitCard {

		public void useCard(int amt) {
			System.out.println("The debit card is used: " + amt);
		}

	}

}
