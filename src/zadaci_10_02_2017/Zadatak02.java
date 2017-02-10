package zadaci_10_02_2017;

import java.util.Scanner;

public class Zadatak02 {

	public static void main(String[] args) {

		/*
		 * Napisati metodu koja nalazi najmanji element u nizu decimalnih
		 * vrijednosti koristeæi se sljedeæim headerom:
		 * 
		 * public static double min(double[ ] array)
		 * 
		 * Napišite potom test program koji pita korisnika da unese deset
		 * brojeva te poziva ovu metodu da vrati najmanji element u nizu.
		 */

		// kreiramo novi scanner objekat
		Scanner input = new Scanner(System.in);

		// deklarisemo double array
		double[] array = new double[10];

		// uzimamo unos od korisnika
		System.out.print("Unesite deset brojeva: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}

		// zatvaramo scanner
		input.close();

		// ispisujemo najmanji element u nizu
		System.out.println("Najmanji element u nizu: " + min(array));

	}

	// metoda koja vraca najmanji element u nizu
	public static double min(double[] array) {
		double min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}

		return min;
	}

}
