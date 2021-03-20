package day7_oneD_arr;

public class StringArray {

	public static void main(String[] args) {

		String s[] = { "shreyas", "rafiq", "car", "Bike" };
		System.out.println("The given input arrays length: " + s.length);
		for (String str : s) { // We dont need to reinitialisation 
			System.out.print(str + " => ");
			System.out.println("Length of String : " + str.length());

		}

	}

}
