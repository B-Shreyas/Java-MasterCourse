package topic12.assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class P6_EvenNoUsingIterator {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>(50);

		for (int i = 1; i <= 50; i++) {
			al.add(i);
		}

		System.out.println("Original List :");
		System.out.println(al);

//		 while(Iterator<Integer> iterator = al.iterator(); iterator.hasNext();) { 
//			Integer even = iterator.next();
//			if (even % 2 == 0)
//				System.out.println("This is the even numbers from given list : " + even);
//
//		}

		Iterator<Integer> iterator = al.iterator();
		while (iterator.hasNext()) {
			Integer even = iterator.next();
			System.out.println(even);
		}

	}

}
