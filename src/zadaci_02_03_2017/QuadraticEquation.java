package zadaci_02_03_2017;

public class QuadraticEquation {

	private double a;
	private double b;
	private double c;

	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getDiscriminant() {
		return Math.pow(b, 2) - 4 * a * c;
	}

	public double getRoot1() {
		double root1 = 0;

		if (this.getDiscriminant() < 0) {
			root1 = 0;
		} else {
			root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		}

		return root1;
	}

	public double getRoot2() {
		double root2 = 0;

		if (this.getDiscriminant() < 0) {
			root2 = 0;
		} else {
			root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		}

		return root2;
	}

}
