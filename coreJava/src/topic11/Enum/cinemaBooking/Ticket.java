package topic11.Enum.cinemaBooking;

public enum Ticket {

	SILVER(150), GOLD(250), PLATINUM(350);

	int rate;

	private Ticket(int val) {
		rate = val;
	}

	public int getRate() {
		return rate;
	}

	void showMessage() {
		System.out.println("Book your tickets through Bookmyshow.com");
	}

}
