package day5_inher_poly;

public class Emp {

	int empid;
	String empName;
	float salary;
	Address addr;

	public Emp() {
	}

	public Emp(int empid, String empName, float salary, Address ad1) {
		System.out.println(" Inside para Constructor of Emp");
		this.empid = empid;
		this.empName = empName;
		this.salary = salary;
		addr = ad1;
	}

	public void showEmpRecord() {
		System.out.println("Employee Name :" + empName);
		System.out.println("Employee ID :" + empid);
		System.out.println("Monthly Salary is Rs." + salary);
		addr.showAddress();
	}

	public void setAddress(Address ad) {
		addr = ad;
	}

}
