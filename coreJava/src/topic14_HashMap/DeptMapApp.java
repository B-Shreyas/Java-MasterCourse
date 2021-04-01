package topic14_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DeptMapApp {

	public static void main(String[] args) {

		Student s1 = new Student(11, "Shreyas");
		Student s2 = new Student(12, "Mansi");
		Student s3 = new Student(14, "Devika");
		Student s4 = new Student(15, "Suraj");

		// ArrayList<String> students = new ArrayList<>(Arrays.asList(Studentlist0))

		List<Student> stdlist = new ArrayList<>();
		stdlist.add(s1);
		stdlist.add(s2);
		stdlist.add(s3);
		stdlist.add(s4);

		Department d1 = new Department(1, "Computers", stdlist);
		Department d2 = new Department(2, "Math", stdlist);
		Department d3 = new Department(3, "Engineering", stdlist);
		Department d4 = new Department(4, "Electronics", stdlist);

		Map<Integer, Department> deptmap = new HashMap<Integer, Department>();
		deptmap.put(d1.deptId, d1);
		deptmap.put(d2.deptId, d2);
		deptmap.put(d3.deptId, d3);
		deptmap.put(d4.deptId, d4);

		System.out.println(deptmap);

		Set<Entry<Integer, Department>> entry = deptmap.entrySet();
		for (Entry<Integer, Department> e : entry) {

			System.out.println("(Key) Dept id : " + e.getKey());
			Department o = e.getValue();
			System.out.println("Department id : " + o.deptId + " Department name : " + o.deptName);

			List<Student> ss1 = o.studentList;
			for (Student s : ss1) {
				System.out.println("\t\t" + " Student id : " + s.roll + " Student name : " + s.name);
			}
		}

	}

}
