package topic11_enum_wrappr;

public class ParsingMethods {

	public static void main(String[] args) {

		int itemsInt = Integer.parseInt(args[0]);
		float itemFloat = Float.parseFloat(args[1]);
		boolean avail = Boolean.parseBoolean(args[2]);

		System.out.println("Items are:......");
		System.out.println("Items are : " + itemsInt);
		System.out.println("Items in float are : " + itemFloat);
		System.out.println("Items is avail: " + avail);

	}

}
