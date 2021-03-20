package day4.assignment;

public class Booking {

	public void bookTicket(Bus b) {
		b.useVehicle();
	}

	public void bookTicket(Train t) {
		t.useVehicle(6);
	}

	public void bookTicket(Aeroplane a) {
		a.useVehicle("Bussiness Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Booking vehicle = new Booking();

		Bus bs = new Bus();
		vehicle.bookTicket(bs);
		vehicle.bookTicket(new Train()); // Anonymous function is used
		vehicle.bookTicket(new Aeroplane());

	}

}
