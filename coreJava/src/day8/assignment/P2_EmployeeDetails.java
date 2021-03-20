package day8.assignment;

import java.util.Arrays;

class Department {
	int deptId;
	String deptName;

	Department() {

	}

	public Department(int deptId, String deptName) {
		this.deptId = deptId;
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}

}

public class P2_EmployeeDetails {

	int empno;
	String empname;
	Department dept;

	P2_EmployeeDetails() {

	}

	public P2_EmployeeDetails(int empno, String empname, Department dept) {
		this.empno = empno;
		this.empname = empname;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empname=" + empname + "]";
	}

	public static void main(String[] args) {

		P2_EmployeeDetails emp[] = new P2_EmployeeDetails[3];
		emp[0] = new P2_EmployeeDetails(1, "Shreyas", new Department(101, "IT"));
		emp[1] = new P2_EmployeeDetails(1, "Shweta", new Department(102, "Sales"));
		emp[2] = new P2_EmployeeDetails(1, "Kajal", new Department(103, "HR"));

		for (int i = 0; i < emp.length; i++) {
			for (int j = i + 1; j < emp.length; j++) {
				if (emp[i].dept.deptName.compareTo(emp[j].dept.deptName) > 0) { // Sorted with name.
					P2_EmployeeDetails temp = emp[i];
					emp[i] = emp[j];
					emp[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(emp));

	}

}
