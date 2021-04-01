package topic12_collections;

import java.util.ArrayList;

public class NonGenericArrayListExample {

	public static void main(String args[]) {

		ArrayList list = new ArrayList(); // This is non generic collection ---> which allows any type of object in
											// collection.
		System.out.println(list);

		list.add(23);
		list.add(new Integer(52));
		list.add(51.0f);
		list.add(new Item(01, 500.0f, "Earphones"));
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		for (int i = 0; i < list.size(); i++) {
			int data = (int) list.get(i); // Here we get class cast exception.
			list.set(i, data + 5);
		}

		System.out.println(list);
		
		
	}

}
