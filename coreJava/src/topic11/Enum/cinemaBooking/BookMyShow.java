package topic11.Enum.cinemaBooking;

public class BookMyShow {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Ticket t1 = Ticket.GOLD;

		System.out.println("t1.ordinal() : " + t1.ordinal()); // It will gives order value
		System.out.println("t1.name() : " + t1.name()); // It will gives name value
		System.out.println("t1.SILVER : " + t1.SILVER); // It will shows silver only

		Ticket tickets[] = Ticket.values();
		for (int i = 0; i < tickets.length; i++) {
			System.out.println("Rate of " + tickets[i].name() + " tickets in Rs. " + tickets[i].rate);
		}

		Ticket t = Ticket.SILVER;
		t.showMessage();

	}

}
