package day4.assignment;

public class Employee {

	// Create an employee class and have instance variables like employee id, name,
	// salary. When object of employee create, lets have some constructor like i.e
	// one default & parameterized constructor and 2 more instance variables 1.
	// HA(House-Rate Allowance 2.DA(Dearness Allowance) & Gross Salary = basic
	// salary + HA + DA

	public int id;
	public String name;
	public float salary;

	Employee() {

		id = 1;
		name = "Shreyas";
		salary = 60000.00f;

	}

	Employee(int id, String name, float salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void acceptDetails(int id, String name, float salary) { // To avoid shadowance of instance variable
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void showDetails() { // To refer the current objects
		System.out.println("The employee id = " + this.id);
		System.out.println("The employee name = " + this.name);
		System.out.println("The employee salary = " + this.salary);
	}

	public static void main(String args[]) {

		Employee emp1 = new Employee();
		System.out.println("After initialising the values to it:");
		emp1.showDetails();

		System.out.println("********************************************");

		Employee emp2 = new Employee(2, "Shree", 40000.00f);
		System.out.println("After initialising the values to it:");
		emp2.showDetails();

	}

}
