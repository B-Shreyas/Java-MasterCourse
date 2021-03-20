package day3.assignment;

public class Student {

	private int id;
	private String name;
	private float marks;
	private boolean isPassed;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public boolean isPassed() {
		return isPassed;
	}

	public void setPlayed(boolean isPassed) {
		this.isPassed = isPassed;
	}

	public void studentDetails(int ids, String nm, float mrk, boolean isPsd) {
		id = ids;
		name = nm;
		marks = mrk;
		isPassed = isPsd;
	}

}
