package zadaci_18_02_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.LongUserInput;

public class Zadatak04 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji pita korisnika da unese broj minuta (npr. 1
		 * milijardu) te ispiše korisniku koliko je to u godinama i danima. Zbog
		 * jednostavnosti, pretpostavimo da godina ima 365 dana.
		 */

		Scanner input = new Scanner(System.in);

		// uzimamo unos od korisnika
		long minutes = LongUserInput.getLong(input, "Unesite broj minuta: ", 0);

		// izracunamo ukupan broj minuta u godini
		long numberOfMinutesInAYear = 365 * 1440;

		// izracunamo broj godina
		long totalYears = minutes / numberOfMinutesInAYear;

		// izracunamo broj dana
		long totalDays = (minutes % numberOfMinutesInAYear) / 1440;

		System.out.println(minutes + " minuta je otprilike " + totalYears
				+ " godina i " + totalDays + " dana.");

	}

}
