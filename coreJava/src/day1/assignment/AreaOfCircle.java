package day1.assignment;

import java.util.Scanner;

public class AreaOfCircle {
	
	public static void main(String args[]) {

		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the data to calculate the area of circle: ");

		int radius = scanner.nextInt();

		System.out.println("The given data: " + radius + " = " + (3.14) * (radius * radius));
		scanner.close();

	}

}
