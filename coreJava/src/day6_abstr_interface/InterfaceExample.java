package day6_abstr_interface;

interface Moveable {
	String direction = "Forward";

	void move(int speed);

	void showObjectDetails();
}

class Ball1 implements Moveable {
	public void move(int s) {
		System.out.println("Ball is rolling with speed " + s + "meter/minute on the ground in " + Moveable.direction);
	}

	public void showObjectDetails() {
		System.out.println("This is a Tenis Ball, Green in color.");
	}
}

class Car1 implements Moveable, Washable { // Here we implemented more than one interface.
	public void move(int s) {
		System.out.println("Car is running with speed " + s + "km/hr on the road in " + Moveable.direction);
	}

	public void showObjectDetails() {
		System.out.println("This is a Sports Car, red in color.");
	}

	@Override
	public void wash() {

		System.out.println("This is a Car washing center."); // As we made new interface, new error come up that we have
																// to override the method of washable interface.

	}
}

public interface InterfaceExample {

	public static void main(String[] args) {
		Moveable m;
		m = new Car1();
		m.showObjectDetails();
		m.move(120);
		
		Washable w = new Car1();
		w.wash();

		System.out.println("***********************************************************");

		m = new Ball1();
		m.showObjectDetails();
		m.move(25);
	}
}
