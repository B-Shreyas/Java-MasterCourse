package day6_abstr_interface;

interface SciCalculator1 {
	double findSin(double angle);

	double findLog(double num);

	default double findSqrt(double x) {
		return Math.sqrt(x);
	}

	static double findTan(double x) {
		return Math.tan(x);
	}
}
