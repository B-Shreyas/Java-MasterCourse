package topic13.assignment;

import java.util.Comparator;

public class Customer implements Comparator<Customer> {

	int custId;
	String custMobNo;
	String custName;

	Customer() {

	}

	public Customer(int custId, String custMobNo, String custName) {
		this.custId = custId;
		this.custMobNo = custMobNo;
		this.custName = custName;
	}

	@Override
	public String toString() {
		return "P3_Customer [custId=" + custId + ", custMobNo=" + custMobNo + ", custName=" + custName + "]";
	}

	@Override
	public int compare(Customer o1, Customer o2) {
		if (o1.custId < o2.custId)
			return -1;
		else if (o1.custId < o2.custId)
			return 1;
		return o1.custName.compareTo(o2.custName);
	}

}
