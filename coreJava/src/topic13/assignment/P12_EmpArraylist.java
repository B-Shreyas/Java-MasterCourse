package topic13.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class P12_EmpArraylist {

	public static void main(String[] args) {

		ArrayList<Employee> arrlist = new ArrayList<>();

		arrlist.add(new Employee(101, 30000.00f, "Shreyas"));
		arrlist.add(new Employee(103, 20000.00f, "Rishabh"));
		arrlist.add(new Employee(112, 40000.00f, "Kaustubh"));
		arrlist.add(new Employee(144, 60000.00f, "Shashank"));
		arrlist.add(new Employee(89, 80000.00f, "Anjali"));

		System.out.println(arrlist);

		ArrayList<Employee> arrlist2 = new ArrayList<>();

		arrlist2.add(new Employee(10, 40000.00f, "Jayesh"));
		arrlist2.add(new Employee(13, 40000.00f, "Sakshi"));
		arrlist2.add(new Employee(12, 46000.00f, "Nikhil"));
		arrlist2.add(new Employee(44, 75000.00f, "Sameer"));
		arrlist2.add(new Employee(9, 22000.00f, "Vishal"));

		System.out.println(arrlist2);

		// arrlist.addAll(arrlist2);

		LinkedList<Employee> list = new LinkedList<>();
		list.addAll(arrlist);
		list.addAll(arrlist2);

		for (Employee emp : list)
			System.out.println(emp);

		// Q 12. Sort descending empSalary.
		
		System.out.println("-------------------------------------");

		Collections.sort(list, new Employee());
		System.out.println("Sort via descending empSalary : ");
		for (Employee emp : list)
			System.out.println(emp);

	}

}
