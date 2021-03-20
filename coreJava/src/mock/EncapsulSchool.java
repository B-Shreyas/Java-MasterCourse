package mock;

public class EncapsulSchool {

	private int rollNo;
	private String name;
	private float marks;
	public static String address = "New Cloth line, Latur"; // Static called

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public void stdDetails(int roll, String nm, float mrks) {
		rollNo = roll;
		name = nm;
		marks = mrks;
	}

}
