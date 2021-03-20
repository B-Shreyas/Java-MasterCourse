package day4_cons_static_poly;

// No instance variables are there only local variables are there.

public class NumberOperations { /// Its Called as Method Overloading || Method Overloading will be sucesful.
								/// but we also take care about signature also. Method signature has to be
								/// different

	public void addNumbers(int x, int y, float z) { // Its signature
		System.out.println("The addition of given numbers is : " + (x + y + z));
	}

	public int addNumbers(int x, int y) {
		return x + y;
	}

	
	public void addNumbers(int y, float z) {
		System.out.println("The addition of given numbers is : " + (y + z));
	}

}
