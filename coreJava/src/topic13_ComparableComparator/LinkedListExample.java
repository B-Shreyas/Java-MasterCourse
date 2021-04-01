package topic13_ComparableComparator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<>();
		System.out.println(ll);

		ll.add("first");
		ll.add("second");
		ll.add("third");

		System.out.println(ll);

		ll.addFirst("Fourth");
		ll.addLast("Sixth");
		ll.add(3, "fifth");

		System.out.println(ll);

		ll.removeFirst();
		ll.removeLast();

		System.out.println(ll);
		
		ll.addAll(ll);
		System.out.println("addAll : " + ll);

		// To get first element from linkedlist
		String firstElement = ll.element();
		System.out.println("First element " + firstElement);
		System.out.println("First element " + ll.getFirst());

		// getFirst(), element() throws NoSuchElementException if list is empty

		String ss = ll.get(0); // throws IndexOutOfBoundException if index is not available
		System.out.println("First element with get(0) : " + ss);
		System.out.println("Third element with get(2) : " + ll.get(2));

		System.out.println("Iteration using iterator");
		Iterator<String> itr = ll.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Iteration using ListIterator"); // using forward direction hasNext()
		ListIterator<String> litr = ll.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}

		while (litr.hasPrevious()) {
			System.out.println(litr.previous()); // using backward direction hasPrevious()
		}

		System.out.println("Iteration using descendingIterator"); // Using forward direction to traverse the linkedlist
																	// using descending iterator
		Iterator<String> descitr = ll.descendingIterator();
		while (descitr.hasNext()) {
			System.out.println(descitr.next());
		}
	}

}
