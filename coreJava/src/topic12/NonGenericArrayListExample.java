package topic12;

import java.util.ArrayList;

public class NonGenericArrayListExample {

	public static void main(String args[]) {

		ArrayList list = new ArrayList();

		System.out.println(list);

		list.add("Shreyas");
		list.add(new Integer(1));
		list.add("Basutkar");
		list.add(2);
		list.add(45.65f);
	//	list.add(new Item(111,500.0f, "Head Phone"));
		

		System.out.println(list);
	}

}
