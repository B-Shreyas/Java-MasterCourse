package day9_stringBuff_buil;
	
public class StringExample1 {

	public static void main(String[] args) {

		String str = "Hello";
		// Only 1 object created in SCP as such object is not there.

		String str1 = "Hello";

		// Literal is same, Hence no object create in SCP as such object is already
		// there.    

		String str2 = new String("Good Morning");
		// By using new keyword new literal is assign as Good morn.
		// Here one object created in heap and one in SCP.
		// SCP Object "Good Morning" have internal reference created & the references
		// will be internally created by JVM for all String type objects

		String str3 = new String("Good Morning");
		// Here one object created in heap because of new keyword but not in SCP.
		str.chars();
	}

}
