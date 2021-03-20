package day5_inher_poly;

public class SingleInheritanceExample {

	public static void main(String[] args) {

		SalesManager m = new SalesManager();
		m.getEmplDetails(123, "Shreyas", 80000.00f);
		m.setIncentive(12000.00f);
		m.setTarget(1000000.00f);
		m.showSalesManagerDetails();

		Manager man = new Manager(50000.00f);
		m.showManagerDetails();

	}

}
