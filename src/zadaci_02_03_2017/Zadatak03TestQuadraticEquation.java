package zadaci_02_03_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.DoubleUserInput;

public class Zadatak03TestQuadraticEquation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// uzimamo unos od korisnika
		double a = DoubleUserInput.getDouble(input, "Enter value for a: ");
		double b = DoubleUserInput.getDouble(input, "Enter value for b: ");
		double c = DoubleUserInput.getDouble(input, "Enter value for c: ");

		input.close();

		// pravimo novi quadraticequation objekat
		QuadraticEquation test = new QuadraticEquation(a, b, c);

		// provjeravamo diskriminantu i ispisujemo rezultate
		if (test.getDiscriminant() > 0) {
			System.out.println("Root1 is " + test.getRoot1());
			System.out.println("Root2 is " + test.getRoot2());
		} else if (test.getDiscriminant() == 0) {
			System.out.println("Root1 is " + test.getRoot1());
		} else if (test.getDiscriminant() < 0) {
			System.out.println("The equation has no roots.");
		}

	}

}
