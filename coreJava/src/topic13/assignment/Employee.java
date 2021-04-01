package topic13.assignment;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {

	int empId;
	float empSalary;
	String empName;

	Employee() {

	}

	public Employee(int empId, float empSalary, String empName) {
		this.empId = empId;
		this.empSalary = empSalary;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empSalary=" + empSalary + ", empName=" + empName + "]";
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.empSalary > o2.empSalary)
			return -1;
		else if (o1.empSalary > o2.empSalary)
			return 1;
		return 0;
	}

}
