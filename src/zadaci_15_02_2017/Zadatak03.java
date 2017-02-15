package zadaci_15_02_2017;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import ba.adan.zadaci.ui.IntUserInput;

public class Zadatak03 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji pita korisnika da unese godinu i prva tri slova
		 * imena mjeseca (prvo slovo uppercase) te mu ispiše broj dana u tom
		 * mjesecu. Na primjer, ukoliko korisnik kao godinu unese 2001 a kao
		 * mjesec Jan program mu ispisuje da Jan 2011 ima 31 dan.
		 */

		Scanner input = new Scanner(System.in);

		// pozivamo metodu koja uzima unos od korisnika
		int year = IntUserInput.getInt(input, "Unesite godinu: ", 1);
		String monthName = "";
		boolean invalidMonthName = true;

		input.nextLine();

		// petlja radi dok korisnik ne unese ispravan naziv mjeseca
		while (invalidMonthName) {
			System.out
					.print("Unesite prva tri slova imena mjeseca (prvo slovo uppercase): ");
			monthName = input.nextLine();

			invalidMonthName = false;

			// provjeravamo da li je unos korisnika ispravan
			if (!checkMonthName(monthName)) {
				System.out
						.println("Pogresan unos. Morate unijeti prva tri slova imena mjeseca (prvo slovo uppercase).");
				invalidMonthName = true;
			}
		}

		// novi gregoriancalendar
		Calendar newCalendar = new GregorianCalendar(year,
				getMonth(monthName) - 1, 1);

		// pozivamo metodu koja vraca broj dana u mjesecu
		int numberOfDaysInAMonth = newCalendar.getActualMaximum(Calendar.DATE);

		// ispisujemo broj dana u mjesecu
		System.out.println("\n" + monthName + " " + year + " je imao "
				+ numberOfDaysInAMonth
				+ ((numberOfDaysInAMonth == 31) ? " dan." : " dana."));

	}

	// metoda koja provjerava naziv mjeseca
	public static boolean checkMonthName(String monthName) {
		String[] monthNames = { "Jan", "Feb", "Mar", "Apr", "Maj", "Jun",
				"Jul", "Aug", "Sep", "Okt", "Nov", "Dec" };

		for (int i = 0; i < monthNames.length; i++) {
			if (monthNames[i].equals(monthName)) {
				return true;
			}
		}

		return false;
	}

	// metoda koja vraca broj mjeseca
	public static int getMonth(String monthName) {
		int month = 0;

		switch (monthName) {
		case "Jan":
			month = 1;
			break;
		case "Feb":
			month = 2;
			break;
		case "Mar":
			month = 3;
			break;
		case "Apr":
			month = 4;
			break;
		case "Maj":
			month = 5;
			break;
		case "Jun":
			month = 6;
			break;
		case "Jul":
			month = 7;
			break;
		case "Aug":
			month = 8;
			break;
		case "Sep":
			month = 9;
			break;
		case "Okt":
			month = 10;
			break;
		case "Nov":
			month = 11;
			break;
		case "Dec":
			month = 12;
			break;
		}

		return month;
	}

}
