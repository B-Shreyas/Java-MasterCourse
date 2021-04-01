package topic12.assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class P13_EmpArrayList {

	public static void main(String[] args) {

		ArrayList<P12_Emp> list = new ArrayList<>();

		list.add(new P12_Emp(101, "Shreyas", 50000.00f));
		list.add(new P12_Emp(103, "Rishi", 30000.00f));
		list.add(new P12_Emp(111, "Sangita", 60000.00f));
		list.add(new P12_Emp(121, "Amit", 40000.00f));
		list.add(new P12_Emp(11, "Rohit", 35000.00f));
		list.add(new P12_Emp(114, "Vishal", 5000.00f));
		list.add(new P12_Emp(224, "Sachin", 75000.00f));

		System.out.println(list);

		// Q14. To print a program whose salary is greater than 10000

		System.out.println("Employee whose salary is greater than 10,000 : ");
		for (P12_Emp emp : list) {
			if (emp.empSal > 10000)
				System.out.println(emp);
		}

		System.out.println("____________________________________________________________");

		// Q15.
		System.out.println("Employee whose name is Sachin : ");
		for (P12_Emp emp : list) {
			if (emp.empName.equals("Sachin"))
				System.out.println(emp);
		}

		System.out.println("____________________________________________________________");

		// Q16.
		System.out.println("Employee to have highest salary : ");

		Iterator<P12_Emp> itr = list.iterator();

		float max = 0;
		while (itr.hasNext()) {
			P12_Emp sal = itr.next();
			if (max < sal.empSal) {
				max = sal.empSal;
			}
		}

		for (P12_Emp emp : list) {
			if (emp.empSal == max)
				System.out.println(emp);
		}

	}

}
