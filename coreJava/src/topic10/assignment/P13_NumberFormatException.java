package topic10.assignment;

public class P13_NumberFormatException {

	private static final String inputString = "hhh";

	public static void main(String[] args) {
//		
//		 int a = Integer.parseInt("30k");
//	      System.out.println(a );
//		

		try {
			int a = Integer.parseInt(inputString);
		} catch (NumberFormatException ex) {
			System.err.println("Invalid string in argumment");

		}

	}

}
