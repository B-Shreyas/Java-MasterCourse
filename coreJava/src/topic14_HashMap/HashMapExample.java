package topic14_HashMap;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<Integer, String> m = new HashMap<>(); // Hashmap never maintains an order

		System.out.println("Size of map : " + m.size()); // Its by default 16 size.
		m.put(23, "Shreyas"); // Put method return type is string now
		m.put(41, "Anjali");
		m.put(13, "Sejal");
		m.put(2, "Divyansh");
		m.put(3, "Bharat");
		m.put(null, "Rishi"); // Key will be only once at null
		m.put(55, null); // But value many more be null
		System.out.println("Size of map : " + m.size());
		System.out.println(m);

		System.out.println("Original value of key 23 : " + m.put(23, "Shruti")); // If we take same key asa reference
																					// the new key will be override to
																					// previous key
		System.out.println(m);
		System.out.println(m.size());

		System.out.println("Which value has associated value of key 13 : " + m.get(13)); // If value is not present it
																							// gets null.
		System.out.println("Removed : " + m.remove(13)); // It removes the key as well as value as an entry
		System.out.println(m);

		System.out.println("Value of null key : " + m.get(null)); // It return value of null key entry
		System.out.println("Value of key 100 : " + m.get(23));

		System.out.println("Does map contains key null? " + m.containsKey(null)); // It return boolean value
		System.out.println("Does map contains key 55? " + m.containsKey(55)); // It return boolean value
		System.out.println("Does more than one keys map to 'shruti? " + m.containsValue("Shruti")); // It return boolean
																									// value

		String replace = m.replace(23, "Shruti"); // t replace value by key
		System.out.println(replace);
		System.out.println(m);
	}

}
