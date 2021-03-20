package day4_cons_static_poly;

import day4_cons_static_poly.CreditCard.DebitCard;

public class Shopping {

	public void doOnlineTransaction(CreditCard c) {
		c.useCard();
	}

	public void doOnlineTransaction(DebitCard d) {
		d.useCard(1000);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shopping s = new Shopping();

		CreditCard cred = new CreditCard();
		s.doOnlineTransaction(cred);
		s.doOnlineTransaction(cred.new DebitCard()); // Its called as anonymous as we calling the new object

	}

}
