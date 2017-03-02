package zadaci_02_03_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.DoubleUserInput;

public class Zadatak05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// uzimamo unos od korisnika
		double x1 = DoubleUserInput.getDouble(input, "Enter value for x1: ");
		double y1 = DoubleUserInput.getDouble(input, "Enter value for y1: ");
		double x2 = DoubleUserInput.getDouble(input, "Enter value for x2: ");
		double y2 = DoubleUserInput.getDouble(input, "Enter value for y2: ");
		double x3 = DoubleUserInput.getDouble(input, "Enter value for x3: ");
		double y3 = DoubleUserInput.getDouble(input, "Enter value for y3: ");
		double x4 = DoubleUserInput.getDouble(input, "Enter value for x4: ");
		double y4 = DoubleUserInput.getDouble(input, "Enter value for y4: ");

		input.close();

		// rjesavamo jednacinu koristeci kramerovo pravilo
		double a = y1 - y2;
		double b = x1 - x2;
		double c = y3 - y4;
		double d = x3 - x4;
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;

		// pravimo novi linearequation objekat
		LinearEquation test = new LinearEquation(a, b, c, d, e, f);

		// provjeravamo da li jednacina ima rjesenja i ispisujemo rezultat
		if (test.isSolvable()) {
			System.out.println("The intersecting point is at (" + test.getX()
					+ ", " + test.getY() + ")");
		} else {
			System.out.println("The two lines are parallel.");
		}

	}

}
