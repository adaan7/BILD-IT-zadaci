package zadaci_24_02_2017;

import java.util.ArrayList;
import java.util.Scanner;

import ba.adan.zadaci.ui.DoubleUserInput;

public class Zadatak05 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji uèitava 10 brojeva te ispisuje koilko je
		 * jedinstvenih brojeva unijeto te sve jedinstvene brojeve koji su
		 * unijeti, razmaknute jednim spaceom. Ukoliko se neki broj pojavljuje
		 * više puta, broj treba ispisati samo jednom.
		 */

		Scanner input = new Scanner(System.in);

		ArrayList<Double> numList = new ArrayList<>();

		int counter = 0;

		System.out.println("Potrebno je da unesete 10 brojeva.");

		while (counter < 10) {
			// uzimamo unos od korisnika
			double number = DoubleUserInput.getDouble(input, "Unesite broj: ");

			// ako lista ne sadrzi uneseni broj, unosimo ga u listu
			if (!numList.contains(number)) {
				numList.add(number);
			}

			counter++;
		}

		// ispisujemo broj jedinstvenih brojeva
		System.out.println("\nUneseno je " + numList.size()
				+ " jedinstvenih brojeva.");
		System.out.println("Jedinstveni brojevi su: ");

		// ispisujemo jedinstvene brojeve
		for (int i = 0; i < numList.size(); i++) {
			System.out.print(numList.get(i) + " ");
		}

	}

}
