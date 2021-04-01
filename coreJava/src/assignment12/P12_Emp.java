package topic12.assignment;

public class P12_Emp {

	int empId;
	String empName;
	float empSal;

	P12_Emp() {

	}

	public P12_Emp(int empId, String empName, float empSal) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

}
