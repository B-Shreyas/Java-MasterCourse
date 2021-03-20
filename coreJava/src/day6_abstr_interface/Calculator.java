package day6_abstr_interface;

public interface Calculator {

	int add(int x, int y);

	int multi(int x, int y);

}

interface SciCalculator extends Calculator {
	double findSin(double angle);

	double findLog(double num);

	default double findSqrt(double x) {
		return Math.sqrt(x);
	}
}
