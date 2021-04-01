package topic14_HashMap;

import java.util.List;

public class Department {

	int deptId;
	String deptName;
	List<Student> studentList; // It is Containment

	public Department(int deptId, String deptName, List<Student> studentList) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", studentList=" + studentList + "]";
	}

}
