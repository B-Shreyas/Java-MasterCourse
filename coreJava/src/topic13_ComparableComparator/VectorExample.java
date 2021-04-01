package topic13_ComparableComparator;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		Vector v = new Vector(5); // Vector class assigned int type value in initial capacity. This is non-generic
									// vector
		System.out.println("Initial capacity of vector : " + v.capacity()); // The capacity() methods shows the capacity
																			// of given.
		v.add(53);
		v.addElement(655);
		v.add(2, "2nd Element"); // We can add here string type object here
		v.add(46);
		v.add(456);
		System.out.println("No. of elements : " + v.size()); // It shows size of the vector
		v.add(789);
		System.out.println("No. of elements : " + v.size());
		System.out.println("New capacity of vector : " + v.capacity()); // It doubles the value i.e 5 to 10.
		System.out.println(v);

		Vector xerox = (Vector) v.clone(); // It generates the copy or clones the vector
		System.out.println("It is a clone vector : " + xerox);

		v.removeAllElements();
		System.out.println("Object found for removal : " + v.removeElement(46));
		v.addAll(xerox);
		System.out.println(v);

		for (int i = 0; i < v.size(); i++) {
			if (i == 3) {
				System.out.println("I am going to remove : " + v.elementAt(i)); // we can get the index at element
				v.removeElementAt(i); // It will remove the element according to the index
			}
		}
		System.out.println(v);

		System.out.println("Navigating vector using enumeration");
		Enumeration en = v.elements();
		while (en.hasMoreElements()) { // It check whether the collection has more elements
			System.out.println(en.nextElement());
		}

		System.out.println("Navigating vector using Iterator");
		Iterator i = v.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
