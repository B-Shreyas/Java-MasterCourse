package day2_if_loop;

public class WhileDemo {

	public static void main(String[] args) {

//		int i = 1;
//
//		while (i <= 5) {
//			System.out.println("Hello");
//			i = i + 4;
//		}
//		System.out.println("i = " + i);

//		int i = 10, sum=0;
//
//		while (i > 0) {
//			System.out.println("i = " + i);
//			i--;
//			sum += i;
//		}
//			System.out.println("sum of first 10 numbers = " + sum);
//
//		int i = 1;
//		while (i <= 10) {
//			i++;
//			if (i == 7)
//				continue;
//			System.out.println("i = " + i);
//			
//		}
//			System.out.println("Out of while loop");
		
//		int i=1, k=1;
//		while(i++<=5) {
//			k*=i;
//		}
//		System.out.println("k= " + k + " i = " + i);
		
		for(int i = 5; i > 0;i-- ){
			int mysteryInt = 100;
			mysteryInt -= i;
		System.out.println(mysteryInt);
		}
	}

}
