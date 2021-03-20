package day6_abstr_interface;

public class MathsOperation implements SciCalculator1 {

	public static void main(String[] args) {
		MathsOperation o = new MathsOperation();
		System.out.println(" Sqrt is " + o.findSqrt(169));
		System.out.println(" Tan of 1 is " + SciCalculator1.findTan(1));
		System.out.println(" Tan of 5 is " + MathsOperation.findTan(5 ));
	}

	public double findSin(double angle) {

		return Math.sin(angle);

	}

	public double findLog(double num) {
		// TODO Auto-generated method stub
		return Math.log(num);
	}

	public double findSqrt(double x) {
		System.out.println("This is my Overridden Version of SQRT Method");
		return Math.sqrt(x);
	}

	static double findTan(double x) {
		return Math.tan(x);
	}

}
