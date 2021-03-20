package day6_abstr_interface;

public class MathsLab implements SciCalculator {

	public static void main(String[] args) {
		MathsLab ml = new MathsLab();
		int a = 778, b = 23;
		double v = 30;
		System.out.println("Addition of " + a + " and " + b + " is " + ml.add(a, b));
		System.out.println("Multiplication of " + a + " and " + b + " is " + ml.multi(a, b));
		System.out.println("sin of angle " + v + " is " + ml.findSin(v));
		System.out.println("Log of number " + v + " is " + ml.findLog(v));
	}

	public int add(int x, int y) {

		return x + y;
	}

	public int multi(int x, int y) {
		return x * y;
	}

	public double findSin(double angle) {

		return Math.sin(angle);
	}

	public double findLog(double num) {
		return Math.log(num);
	}

}
