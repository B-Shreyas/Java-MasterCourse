package day5_inher_poly;

import java.util.Scanner;

class VicePresident extends Employee {
	float allowance;

	public void setAllowance(float val) {
		allowance = val;
	}

	public float getAllowance() {
		return allowance;
	}

	public void showVPDetails() {
		showEmpRecord();
		System.out.println("Additional Allowance is Rs." + getAllowance());
	}

	public Float calculateSalary() {
		System.out.println("Salary calculated with allowance");
		return salary + allowance;
	}
}

public class PayrollApplication {

	public static void main(String[] args) {
	

		Employee e;

		VicePresident vp1 = new VicePresident();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Employee ID : ");
		int id = sc.nextInt();
		System.out.println("Enter Employee Salary : ");
		float sal = sc.nextFloat();
		sc.nextLine();
		vp1.getEmplDetails(id, name, sal);
		vp1.setAllowance(50000.00f);
		// vp1.showVPDetails();

		// Create Manager Object
		Manager m1 = new Manager();
		System.out.println("Enter Employee Name : ");
		name = sc.nextLine();
		System.out.println("Enter Employee ID : ");
		id = sc.nextInt();
		System.out.println("Enter Employee Salary : ");
		sal = sc.nextFloat();
		m1.getEmplDetails(id, name, sal);
		m1.setIncentive(2000.00f);
		
	    sc.close();

	}

}
