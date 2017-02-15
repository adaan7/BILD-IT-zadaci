package zadaci_15_02_2017;

import java.util.Scanner;

public class Zadatak05 {

	public static void main(String[] args) {

		/*
		 * Neke web stranice forsiraju odreðena pravila za passworde. Napisati
		 * metodu koja provjerava da li je unijeti string validan password.
		 * Pravila da bi password bio validan su sljedeæa: 1. Password mora biti
		 * saèinjen od najmanje 8 karaktera. 2. Password smije da se sastoji
		 * samo od slova i brojeva. 3. Password mora sadržati najmanje 2 broja.
		 * Napisati program koji pita korisnika da unese password te mu ispisuje
		 * "password je validan" ukoliko su sva pravila ispoštovana ili
		 * "password nije validan" ukoliko pravila nisu ispoštovana.
		 */

		Scanner input = new Scanner(System.in);

		// uzimamo unos od korisnika
		System.out
				.print("Unesite password (min 8 karaktera, samo slova i brojeva, min 2 broja): ");
		String password = input.nextLine();

		// provjeravamo validnost passworda i ispisujemo odgovarajuce poruke
		if (isValidPassword(password)) {
			System.out.println("Password je validan.");
		} else {
			System.out.println("Password nije validan.");
		}

		input.close();

	}

	// metoda koja provjerava validnost passworda
	public static boolean isValidPassword(String password) {
		if (isValidLength(password) && isLettersAndDigits(password)
				&& checkDigitCount(password)) {
			return true;
		}

		return false;
	}

	// metoda koja provjerava duzinu passworda
	public static boolean isValidLength(String password) {
		if (password.length() < 8) {
			return false;
		}

		return true;
	}

	// metoda koja provjerava sadrzi li password samo slova i brojeve
	public static boolean isLettersAndDigits(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (!Character.isLetterOrDigit(password.charAt(i))) {
				return false;
			}
		}

		return true;
	}

	// metoda koja provjerava sadrzi li password minimalno 2 broja
	public static boolean checkDigitCount(String password) {
		int counter = 0;

		for (int i = 0; i < password.length(); i++) {
			if (Character.isDigit(password.charAt(i))) {
				counter++;
			}
		}

		if (counter < 2) {
			return false;
		}

		return true;
	}

}
