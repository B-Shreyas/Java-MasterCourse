package day9_stringBuff_buil;

public class StringBufferMethodsDemo {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("Hello ");

		// append() method
		sb1.append("Java");
		System.out.println("After append the data: " + sb1);

		// insert() method
		StringBuffer sb2 = new StringBuffer("Hello ");
		sb2.insert(2, "Java");
		System.out.println("After insert : " + sb2);

		// replace() method
		StringBuffer sb3 = new StringBuffer("Hello ");
		sb3.replace(1, 3, "java");


		// delete() method
		StringBuffer sb4 = new StringBuffer("Hello ");
		sb4.delete(1, 3);
		System.out.println("After replace : " + sb4);

		// reverse() method
		StringBuffer sb5 = new StringBuffer("Hello ");
		sb5.reverse();
		System.out.println("After replace : " + sb5);

		// capacity() method
		StringBuffer sb6 = new StringBuffer();
		System.out.println(sb6.capacity()); // default 16 capacity.
		sb6.append("Hello");
		System.out.println(sb6.capacity()); // Now its also 16.
		sb6.append("Java is my favourite language");
		System.out.println(sb6.capacity());

		// ensureCapacity() method

		StringBuffer sb7 = new StringBuffer();
		System.out.println(sb7.capacity()); // Default 16
		sb7.append("Hello");
		System.out.println(sb7.capacity()); // now 16
		sb7.append("Java is my favourite language");
		System.out.println(sb7.capacity()); // Now (16*2)+2=34 i.e (oldcapacity*2)+2
		sb7.ensureCapacity(10); // Now no change
		System.out.println(sb7.capacity()); // now 34
		sb7.ensureCapacity(50); // now (34*2)+2
		System.out.println(sb7.capacity());

	}

	// Same methods you can try by using StringBuilder

}
