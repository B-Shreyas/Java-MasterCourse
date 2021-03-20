package day1.assignment;

import java.util.Scanner;

public class PrincipleInterest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Principle:");

		int principle = sc.nextInt();

		System.out.println("Enter the Time");

		double time = sc.nextDouble();

		System.out.println("Enter the Rate:");

		float rate = sc.nextFloat();

		System.out.println("The given inputs are...: ");
		
		System.out.println("Principle : " + principle);
		System.out.println("Time : " + time);
        System.out.println("Rate : " + rate);
		System.out.println("The Simple Interest (p * t * r) / 100 = " + (principle * time * rate) / 100);

	}

}
