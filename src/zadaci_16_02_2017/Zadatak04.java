package zadaci_16_02_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.IntUserInput;

public class Zadatak04 {

	public static void main(String[] args) {

		/*
		 * Napišite program koji uèitava neodreðen broj cijelih brojeva (unos
		 * prekida nula), pronalazi najveæi od unijetih brojeva te ispisuje
		 * koliko se najveæi broj puta ponovio. Na primjer, ukoliko unesemo 3 5
		 * 2 5 5 5 0 program ispisuje da je najveæi broj 5 te ispisuje da se
		 * isti ponavlja 4 puta.
		 */

		Scanner input = new Scanner(System.in);

		int number = -1, counter = 0, max = 0;

		while (number != 0) {
			// pozivamo metodu koja uzima unos od korisnika
			number = IntUserInput.getInt(input,
					"Unesite cijeli broj (unos prekida 0): ");

			if (max < number) {
				// ako je trenutni najveci broj manji od unesenog broja,
				// trenutni najveci broj postaje uneseni broj i postavljamo
				// brojac na 1
				max = number;
				counter = 1;
			} else if (max == number) {
				// ako je trenutni najveci broj jednak unesenom broju,
				// povecavamo brojac za 1
				counter++;
			}
		}

		// zatvaramo scanner
		input.close();

		// ispisujemo najveci broj i broj ponavljanja
		System.out.println("\nNajveci broj je " + max + " i ponavlja se "
				+ counter + " puta.");

	}

}
