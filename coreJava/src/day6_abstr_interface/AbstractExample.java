package day6_abstr_interface;

abstract class ObjectMovement { // Abstract class will be extends to subclasses. Its hiding the complexity with
								// no perfection.

	int speed;
	static String direction = "Forward";

	abstract public void move(int newspeed);

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}

class Ball extends ObjectMovement { // So in this way Class Ball is extends to Parent class its hiding the data
									// which is not in use.
	public void move(int s) {
		speed = s;
		System.out.println("Now ball is rolling with speed " + speed + "meter/minute on the ground in "
				+ ObjectMovement.direction);
	}

	public void showColor() {
		System.out.println("Ball is red");
	}
}

class Car extends ObjectMovement implements Washable { // This is a multiple inheritance structure
	public void move(int s) {
		speed = s;
		System.out
				.println("Now car is running with speed " + speed + "km/hr on the road in " + ObjectMovement.direction);
	}

	public void showColor() {
		System.out.println("Car is red");
	}

	public void wash() {
		System.out.println("Car Washing");
	}
}

public class AbstractExample {

	// ObjectMovement obj = new ObjectMovement(); // It cannot create its instance
	// type

	public static void main(String[] args) {

		ObjectMovement objmove;
		objmove = new Car();
		objmove.setSpeed(120);
		System.out.println("Initial speed of car : " + objmove.getSpeed() + " km/hr");
		objmove.move(80);

		System.out.println("*************************************************************");

		objmove = new Ball();
		objmove.setSpeed(20);
		System.out.println("Initial speed of ball : " + objmove.getSpeed() + " km/hr");
		objmove.move(12);
	}
}

// Explaination:- 
// What is Abstract class?

//Abstract classes cannot be instantiated and are designed to be subclassed. 
//They are used to provide some common functionality across a set of related classes while also allowing 
//default method implementations.

// Ans: It is mechanism of extracting only essential details of objects by ignoring the rest and in the way hiding data complexity
// Hiding of implementation details and only showing essential functionality to user

// Why to acheive Abstraction:
// Ans:-1.  It reduces complexity of viewing and accessing the data.
// 2. increaes code re-usability. Helps in generalization
// 3. Makes application secure as only require data will be accessible to user.

// How to achieve Abstraction:
// Ans:- With the Abstract class - It is not complete abstraction. It would be the use is less than 100 %.
// With Interface - It is 100% of Abstraction.

// Abstract is keyword and access modifier is called Abstract Method.
// Abstract Method means - (No method body only signature).
