package zadaci_23_02_2017;

import java.util.Scanner;

public class Zadatak03 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji pita korisnika da unese Social Security Number
		 * (SSN) u formatu DDD-DD-DDDD gdje D predstavlja broj. Program treba da
		 * provjerava da li je broj unesešen u ispravnom formatu. Ukoliko nije,
		 * program pita korisnika da pokuša ponovo. Ukoliko jeste unešen u
		 * pravom formatu, program završava sa radom.
		 */

		Scanner input = new Scanner(System.in);

		boolean wrongUserInput = true;

		while (wrongUserInput) {
			// uzimamo unos od korisnika
			System.out
					.print("Unesite SSN (u formatu DDD-DD-DDDD, D oznacava broj): ");
			String ssn = input.nextLine();

			wrongUserInput = false;

			// provjeravamo da li je validan ssn broj i ispisujemo odgovarajucu
			// poruku
			if (!isValidSSN(ssn)) {
				System.out
						.println("Pogresan unos. SSN morate unijeti u formatu DDD-DD-DDDD, gdje D oznacava broj.");
				wrongUserInput = true;
			} else {
				System.out.println("\nIspravan unos.");
			}
		}

		input.close();

	}

	// metoda koja provjerava da li je validan ssn broj
	public static boolean isValidSSN(String ssn) {
		if (checkLength(ssn) && checkDashes(ssn) && checkDigits(ssn)) {
			return true;
		}

		return false;
	}

	// metoda koja provjerava duzinu stringa
	public static boolean checkLength(String ssn) {
		if (ssn.length() != 11) {
			return false;
		}

		return true;
	}

	// metoda koja provjerava da li se na odredjenim mjestima nalazi crtica
	public static boolean checkDashes(String ssn) {
		for (int i = 0; i < ssn.length(); i++) {
			if (i == 3 || i == 6) {
				if (ssn.charAt(i) != '-') {
					return false;
				}
			}
		}

		return true;
	}

	// metoda koja provjerava da li se na odredjenim mjestima nalazi broj
	public static boolean checkDigits(String ssn) {
		for (int i = 0; i < ssn.length(); i++) {
			if (i == 3 || i == 6) {
				continue;
			} else {
				if (!Character.isDigit(ssn.charAt(i))) {
					return false;
				}
			}
		}

		return true;
	}

}
