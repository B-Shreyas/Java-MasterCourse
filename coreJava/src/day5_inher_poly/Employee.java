package day5_inher_poly;

public class Employee {

	int empid; // id mail course , course content. perfor the containment using getter setter.
	String empName;
	float salary;

	public Employee() {
		System.out.println("Default Constructor of Employee Class");
		empid = 1234;
		empName = "Shreyas";
		salary = 45000.00f;
	}

	protected Number calculateSalary() {
		System.out.println("Salary Calculated in routine way");
		return salary;
	}

	public Employee(int empid, String empName, float salary) {
		System.out.println("Para Constructor of Employee Class");
		this.empid = empid;
		this.empName = empName;
		this.salary = salary;
	}

	public void getEmplDetails(int empid, String empName, float salary) {
		this.empid = empid;
		this.empName = empName;
		this.salary = salary;
	}

	protected void showEmpRecord() {
		System.out.println("Employee Name :" + empName);
		System.out.println("Employee ID :" + empid);
		System.out.println("Monthly Salary is Rs." + salary);
	}

	public String toString() {
		String str = "Emp Name :" + empName + " Emp Id :" + empid + "Monthly Salary :" + salary;
		return str;
	}
}

//Single Inheritance
class Manager extends Employee {
	float incentive;

	public Manager() {
		super(222, "Rishi", 35000.00f);
		System.out.println("Default constructor of Manager");
		incentive = 30000.00f;
	}

	public Manager(float inc) {
		System.out.println("Para constructor of Manager");
		incentive = inc;
	}

	public Float calculateSalary() {
		System.out.println("Salary calculated with incentive");
		return salary + incentive;
	}

	public void setIncentive(float val) {
		incentive = val;
	}

	public float getIncentive() {
		return incentive;
	}

	public void showManagerDetails() {
		showEmpRecord();
		System.out.println("Incentive Paid is Rs." + getIncentive());
	}

}

//MultiLevel Inheritance

class SalesManager extends Manager {
	float target;

	public void setTarget(float val) {
		target = val;
	}

	public float getTarget() {
		return target;
	}

	public void showSalesManagerDetails() {
		showManagerDetails();
		System.out.println("Target to be acheived for Q1" + getTarget());
	}
}
