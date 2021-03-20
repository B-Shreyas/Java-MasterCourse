package day4.assignment;

public class Geometricians {

	// Overload calculate area method. If I have method with float type parameter &
	// i passed float type parameter that method should show me area of circle.
	// calculate area method which calculate 2 int type parameter it should
	// show area of rectangle. calculate area method with 1 int type which
	// shows area of square.

	public void calculateArea(float radius) {

		System.out.println("The area of circle is : " + (3.14) * (radius * radius));
	}

	public void calculateArea(int length, int breadth) {
		System.out.println("The area of rectangle is : " + (length * breadth));
	}

	public void calculateArea(int square) {
		System.out.println("The area of square is : " + (square * square));
	}
}
