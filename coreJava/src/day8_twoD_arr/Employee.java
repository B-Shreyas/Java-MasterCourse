package day8_twoD_arr;

public class Employee {

	public int id;
	public String name;

	public Employee(int id, String name) {

		this.id = id;
		this.name = name;
	}
	
	

	@Override
	public String toString() {
		return "Employee [id= " + id + ", name= " + name + "]";
	}

    

	public static void main(String[] args) {

		Employee emp1 = new Employee(1, "Shreyas");
		System.out.println(emp1);

	}

}
