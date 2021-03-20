package day8.assignment;

import java.util.Arrays;

public class P14_EmployeeCondition {

	String names;

	P14_EmployeeCondition() {

	}

	public P14_EmployeeCondition(String names) {
		this.names = names;
	}

	@Override
	public String toString() {
		return "P14_EmployeeCondition [names=" + names + "]";
	}

	public static void main(String[] args) {

		P14_EmployeeCondition nm[] = new P14_EmployeeCondition[3];
		nm[0] = new P14_EmployeeCondition("Shreyas");
		nm[1] = new P14_EmployeeCondition("Zoya");
		for (int i = 0; i < nm.length; i++) {
			for (int j = i + 1; j < nm.length; j++) {
				if (nm[i].names.compareTo(nm[j].names) > 0) {
					P14_EmployeeCondition temp;
					temp = nm[i];
					nm[i] = nm[j];
					nm[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(nm));

	}

}
