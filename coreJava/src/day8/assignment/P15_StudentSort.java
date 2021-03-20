package day8.assignment;

import java.util.Arrays;

public class P15_StudentSort {

	int roll;
	String name;
	float marks;

	P15_StudentSort() {

	}

	public P15_StudentSort(int roll, String name, float marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "P15_StudentSort [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}

	public static void main(String[] args) {

		P15_StudentSort std[] = new P15_StudentSort[3];
		std[0] = new P15_StudentSort(01, "Shreyas", 85.5f);
		std[1] = new P15_StudentSort(02, "Harry", 70.5f);
		std[2] = new P15_StudentSort(03, "Martin", 90.5f);

		for (int i = 0; i < std.length; i++) {
			for (int j = i + 1; j < std.length; j++) {
				if (std[i].marks > std[j].marks) {
					P15_StudentSort temp;
					temp = std[i];
					std[i] = std[j];
					std[j] = temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(std));

	}

}
