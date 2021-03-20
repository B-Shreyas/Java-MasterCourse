package day5.assignment;

import day5_inher_poly.Address;

public class School {

	String name;
	String address;
	Student std;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public School() {
	}

	public School(String name, String address, Student std1) {

		this.name = name;
		this.address = address;
		std = std1;
	}

	public void showEmpRecord() {
		System.out.println("School name :" + name);
		System.out.println("School address:" + address);
		std.showStudentDetails();
	}

	public void setStudent(Student sd) {
		std = sd;
	}

}
