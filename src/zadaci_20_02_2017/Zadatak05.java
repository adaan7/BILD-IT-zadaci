package zadaci_20_02_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.IntUserInput;

public class Zadatak05 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji uèitava cijele brojeve u rasponu od 1 do 100 te
		 * broji i ispisuje koliko je koji broj puta unijet. Pretpostavimo da
		 * nula prekida unos brojeva. Ukoliko unesemo sljedeæi niz brojeva 2 5 6
		 * 23 42 58 2 6 0 program nam ispisuje da se broj 2 ponavlja 2 puta,
		 * broj 5 jednom, broj 6 2 puta, broj 23 jednom, itd.
		 */

		Scanner input = new Scanner(System.in);

		// niz integera koji ce sluziti kao brojac
		int[] countNumbers = new int[101];
		int number = -1;

		while (number != 0) {
			// pozivamo metodu koja uzima unos od korisnika
			number = IntUserInput.getInt(input,
					"Unesite broj od 1 do 100 (unos prekida 0): ", 0, 100);

			if (number != 0) {
				// ako je broj razlicit od nule povecavamo brojac tog broja za 1
				countNumbers[number]++;
			}
		}

		input.close();

		for (int i = 0; i < countNumbers.length; i++) {
			if (countNumbers[i] != 0) {
				// ispisujemo samo one brojeve koji su uneseni
				System.out.print("\nBroj " + i + " se ponavlja "
						+ countNumbers[i] + " puta.");
			}
		}

	}

}
