package day5.assignment;

public class Student {

	int id;
	String name, course, courseContent;

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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCourseContent() {
		return courseContent;
	}

	public void setCourseContent(String courseContent) {
		this.courseContent = courseContent;
	}

	public Student(int id, String name, String course, String courseContent) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.courseContent = courseContent;
	}

	public Student() {
	}

	public void showStudentDetails() {
		System.out.println("Student name: " + name + ", Student id: " + id + ", Stduent course: " + course
				+ ", Course Content: " + courseContent);
	}

}
