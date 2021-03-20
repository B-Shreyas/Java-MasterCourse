package day9.assignment;

import java.util.Scanner;

public class P5_OccuranceWord {

	public static void main(String[] args) {

		String s = "Hi how are you you";

		String t[] = s.split(" ");

		String word = "hi";
		int count = 0;

		for (int i = 0; i < t.length; i++) {

			if (t[i].equals(word)) {
				count++;
			}

		}
		System.out.println("Occurence of word " + " ' " + word + " ' " + " --> " + count);

	}

}
