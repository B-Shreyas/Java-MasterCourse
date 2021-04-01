package topic13.assignment;

import java.util.Comparator;

public class P11_CustNameComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		if (o1.custId > o2.custId)
			return o1.custName.compareTo(o2.custName);
		else if (o1.custId > o2.custId)
			return o1.custName.compareTo(o2.custName);
		return 0;
	}

}
