package zadaci_02_03_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.DoubleUserInput;

public class Zadatak04TestLinearEquation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// uzimamo unos od korisnika
		double a = DoubleUserInput.getDouble(input, "Enter a value for a: ");
		double b = DoubleUserInput.getDouble(input, "Enter a value for b: ");
		double c = DoubleUserInput.getDouble(input, "Enter a value for c: ");
		double d = DoubleUserInput.getDouble(input, "Enter a value for d: ");
		double e = DoubleUserInput.getDouble(input, "Enter a value for e: ");
		double f = DoubleUserInput.getDouble(input, "Enter a value for f: ");

		input.close();

		// pravimo novi linearequation objekat
		LinearEquation test = new LinearEquation(a, b, c, d, e, f);

		// provjeravamo da li jednacina ima rjesenje i ispisujemo rezultat
		if (test.isSolvable()) {
			System.out.println("X is " + test.getX());
			System.out.println("Y is " + test.getY());
		} else {
			System.out.println("The equation has no solution.");
		}

	}

}
