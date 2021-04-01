package topic13.assignment;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class P3_CustomerLinkedList {

	public static void main(String[] args) {

		LinkedList<Customer> custlist = new LinkedList<>();

		custlist.add(new Customer(101, "9011783001", "Shreyas"));
		custlist.add(new Customer(102, "7852651236", "Rohit"));
		custlist.add(new Customer(155, "9555322222", "Sachin"));
		custlist.add(new Customer(196, "8552365544", "Amit"));
		custlist.add(new Customer(85, "7322225635", "Prakash"));
		custlist.add(new Customer(3, "9212266555", "Chetan"));

		System.out.println("Original list : " + custlist);

		System.out.println("----------------------------------------------------------------");

		System.out.println("By using for loop : ");
		for (int i = 0; i < custlist.size(); i++) {
			System.out.println(custlist.get(i));
		}

		System.out.println("----------------------------------------------------------------");

		System.out.println("By using for-each loop : ");
		for (Customer cust : custlist)
			System.out.println(cust);

		System.out.println("----------------------------------------------------------------");

		System.out.println("By using Iterator : ");
		Iterator<Customer> itr = custlist.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("----------------------------------------------------------------");

		// Q7. To sort custlist via ascending order
		Collections.sort(custlist, new Customer());
		System.out.println("After sorting the custlist via ascending for custId :");
		for (Customer cust : custlist)
			System.out.println(cust);

		System.out.println("----------------------------------------------------------------");

		// 11. To sort custlist via ascending order custnName

		Collections.sort(custlist, new P11_CustNameComparator());
		System.out.println("After sorting the custlist via ascending for custName :");
//		Collections.reverse(custlist);
		for (Customer cust : custlist)
			System.out.println(cust);
	}

}
