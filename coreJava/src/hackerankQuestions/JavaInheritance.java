package hackerankQuestions;

public class JavaInheritance {
	
	class Arithmetic {
	    int add(final int a , final int b){
	        return a + b;
	    }
	}

	class Adder extends Arithmetic{
	    int add(final int a, final int b){
	        return super.add(a,b);
	    }
	}

	public static void main(String[] args) {
	
    
		

	}

}
