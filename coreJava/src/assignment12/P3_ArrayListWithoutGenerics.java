package topic12.assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class P3_ArrayListWithoutGenerics {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add(01);
		list.add("Shreyas");
		list.add(02);
		list.add("Amol");
		list.add(03);
		list.add("Varad");

		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println(list);
	}

}
