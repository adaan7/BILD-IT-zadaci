package zadaci_24_02_2017;

import java.util.Scanner;

public class Zadatak02 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji prima karakter te vraæa njegov Unicode.
		 * Primjer: ukoliko korisnik unese karakter E program mu vraæa 69 kao
		 * unicode za taj karakter.
		 */

		Scanner input = new Scanner(System.in);

		boolean wrongInput = true;
		String s = "";

		while (wrongInput) {
			// uzimamo unos od korisnika
			System.out.print("Unesite karakter: ");
			s = input.nextLine();

			wrongInput = false;

			// ako korisnik unese vise od jednog karaktera, trazimo ponovljeni
			// unos
			if (s.length() != 1) {
				System.out
						.println("Pogresan unos. Potrebno je da uneste samo jedan karakter.");
				wrongInput = true;
			}
		}

		input.close();

		// uzimamo prvi karakter iz stringa
		char ch = s.charAt(0);

		// ispisujemo unicode za karakter
		System.out.println("\nUnicode za karakter " + ch + " je " + (int) ch);

	}

}
