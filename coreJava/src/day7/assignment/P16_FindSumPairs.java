package day7.assignment;


import java.util.Scanner;

public class P16_FindSumPairs {

	static void printPairs(int arr[], int n, int sum) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] + arr[j] == sum)
					System.out.println("[" + arr[i] + " ," + arr[j] + " ]");
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];

		System.out.println("The length of array: " + a.length);
		System.out.println("Enter the " + a.length + " elements: ");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("The pairs of given sum : ");
		int n = a.length;
		int sum = 6;
		printPairs(a, n, sum);
		sc.close();

	}

}
