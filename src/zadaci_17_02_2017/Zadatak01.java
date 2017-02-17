package zadaci_17_02_2017;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import ba.adan.zadaci.ui.IntUserInput;

public class Zadatak01 {

	public static void main(String[] args) {

		/*
		 * Napisati metodu koja vraæa broj dana u godini. Metoda koristi
		 * sljedeæi header: public static int numberOfDayInAYear(int year).
		 * Napisati program koji pita korisnika da unese poèetnu godinu, krajnju
		 * godinu te ispisuje broj dana za svaku godinu u rasponu.
		 */

		Scanner input = new Scanner(System.in);

		// uzimamo unos od korisnika
		int firstYear = IntUserInput.getInt(input, "Unesite pocetnu godinu: ",
				1);
		int lastYear = IntUserInput
				.getInt(input, "Unesite krajnju godinu: ", 1);

		// ako je prva godina veca od druge, zamijenimo im mjesta
		if (firstYear > lastYear) {
			int temp = firstYear;
			firstYear = lastYear;
			lastYear = temp;
		}

		input.close();

		System.out.println();

		// ispisujemo broj dana u odredjenom rasponu godina
		for (int i = firstYear; i <= lastYear; i++) {
			System.out.println(i + ". godina ima " + numberOfDayInAYear(i)
					+ " dana.");
		}

	}

	// metoda koja vraca broj dana u godini
	public static int numberOfDayInAYear(int year) {
		Calendar newCalendar = new GregorianCalendar(year, 1, 1);

		return newCalendar.getActualMaximum(Calendar.DAY_OF_YEAR);
	}

}
