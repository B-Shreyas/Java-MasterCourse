package topic14_HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterateHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> m = new HashMap<>();

		m.put(23, "Shreyas"); // Put method return type is string now
		m.put(41, "Anjali");
		m.put(13, "Sejal");
		m.put(2, "Divyansh");
		m.put(3, "Bharat");
		m.put(1, "Rishi");

		// Iterating Map using iterator to keyset

		System.out.println("Iterating map using iterator ");
		Set<Integer> s = m.keySet(); // Keyset() method return set type value
		Iterator<Integer> i = s.iterator();
		while (i.hasNext()) {
			Integer key = i.next();
			System.out.println("key : " + key); // It displays the key
			System.out.println("Value : " + m.get(key));
		}

		// Iterating Map using iterator to collection recieved from
		System.out.println("Iterator map using iterator to collection using values()...");
		Collection list = m.values(); // It returns values
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println("Value is : " + itr.next());
		}

		// Iterating Map using iterator to entryset

		System.out.println("Iterating Map using iterator to entry ");
		Set<Map.Entry<Integer, String>> entryset = m.entrySet(); // Its return type is Set - Set<Entry<Integer,String>>
		// It has been generic type
		Iterator itr1 = entryset.iterator();
		while (itr1.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) itr1.next(); // next() return whole entry
																							// object
			System.out.println("key : " + entry.getKey() + " Value : " + entry.getValue());
		}
	}

}
