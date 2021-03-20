package day7_oneD_arr;

import java.util.Scanner;

public class PassArrayAsParameter {

	public void findMinimum(int arr[]) // int arr[] = a;
	{
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("Minimum value from array is: " + min);
	}

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();

		int a[] = new int[size];

		System.out.print("Enter array Elements: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		PassArrayAsParameter obj = new PassArrayAsParameter();
		obj.findMinimum(a); // Array a is a reference passed as a value
		
		sc.close();

	}

}
