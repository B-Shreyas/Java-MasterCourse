package day2_if_loop;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("How many participants for trip?");

		int par = sc.nextInt();

		System.out.println("Numbers of participants are going: " + par);

		switch (par) {
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("So let's arrange the car:");
			break;

		case 8:
			System.out.println("So let's arrange the SUV:");
			break;

		case 15:
			System.out.println("So let's arrange the mini bus:");
			break;

		case 20:
			System.out.println("So let's arrange the Traveller:");
			break;

		default:
			System.out.println("Invalid no. of participants");

		}

	}

}
