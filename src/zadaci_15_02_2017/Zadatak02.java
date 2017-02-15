package zadaci_15_02_2017;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import ba.adan.zadaci.ui.IntUserInput;

public class Zadatak02 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji pita korisnika da unese mjesec i godinu te mu
		 * ispiše broj dana u datom mjesecu. Na primjer, ukoliko korisnik unese
		 * kao godinu 2012 a kao mjesec 2, program treba ispisati da je Februar
		 * 2012 imao 29 dana. Ukoliko korisnik unese kao godinu 2015 a kao
		 * mjesec 3, program treba ispisati da je Mart 2015 imao 31 dan.
		 */

		Scanner input = new Scanner(System.in);

		// pozivamo metode koje uzimaju unos od korisnika
		int month = IntUserInput.getInt(input, "Unesite mjesec (od 1 - 12): ",
				1, 12);
		int year = IntUserInput.getInt(input, "Unesite godinu: ", 1);

		// novi gregoriancalendar
		Calendar newCalendar = new GregorianCalendar(year, month - 1, 1);

		// pozivamo metodu koja vraca broj dana u mjesecu
		int numberOfDaysInAMonth = newCalendar.getActualMaximum(Calendar.DATE);

		// ispisujemo broja dana u mjesecu
		System.out.println("\n" + getMonthName(month) + " " + year
				+ " je imao " + numberOfDaysInAMonth
				+ ((numberOfDaysInAMonth == 31) ? " dan." : " dana."));

	}

	// metoda koja vraca naziv mjeseca
	public static String getMonthName(int month) {
		String monthName = "";

		switch (month) {
		case 1:
			monthName = "Januar";
			break;
		case 2:
			monthName = "Februar";
			break;
		case 3:
			monthName = "Mart";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "Maj";
			break;
		case 6:
			monthName = "Juni";
			break;
		case 7:
			monthName = "Juli";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "Septembar";
			break;
		case 10:
			monthName = "Oktobar";
			break;
		case 11:
			monthName = "Novembar";
			break;
		case 12:
			monthName = "Decembar";
		}

		return monthName;
	}

}
