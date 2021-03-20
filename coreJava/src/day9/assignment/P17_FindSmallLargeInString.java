package day9.assignment;

public class P17_FindSmallLargeInString {

	public static void main(String[] args) {

		String str = "This is an umbrella";

		String sentence[] = str.split(" ");

		String shortest = sentence[0], longest = "";

		for (String s1 : sentence) {
			if (s1.length() < shortest.length()) {
				shortest = s1;
			} else if (s1.length() > longest.length()) {
				longest = s1;
			}
		}
		System.out.println("Shortest word in string : " + shortest);
		System.out.println("Longest word in string : " + longest);
	}

}
