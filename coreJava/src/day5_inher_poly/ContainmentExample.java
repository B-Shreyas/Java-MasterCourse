package day5_inher_poly;

import java.util.Scanner;

public class ContainmentExample {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Employee ID : ");
		int id = sc.nextInt();
		System.out.println("Enter Employee Salary : ");
		float sal = sc.nextFloat();

		System.out.println("Enter Address Details : ");
		System.out.println("Enter Socity Name: ");
		sc.nextLine();
		String sname = sc.nextLine();
		System.out.println("Enter Surve No : ");
		int sno = sc.nextInt();
		System.out.println("Enter City : ");
		String city = sc.next();
		System.out.println("Enter PIN : ");
		int pin = sc.nextInt();

		Address ad1 = new Address(sno, pin, sname, city);
		Emp e1 = new Emp(id, name, sal, ad1);
		e1.showEmpRecord();
	}
}
