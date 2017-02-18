package zadaci_18_02_2017;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Zadatak03 {

	public static void main(String[] args) {

		/*
		 * Ako pozovemo metodu System.currentTimeMillis() dobijemo broj
		 * milisekundi od 1. januara 1970 do trenutka pozivanja metode. Napisati
		 * program koji ispisuje trenutaèni datum i vrijeme u formatu
		 * "Trenutni datum i vrijeme: 22. juli, 2015 19:59:47"
		 */

		// pozivamo metodu koja ispisuje trenutni datum i vrijeme
		currentDateAndTime();

	}

	// metoda koja ispisuje trenutni datum i vrijeme
	public static void currentDateAndTime() {
		System.out.println("Trenutni datum i vrijeme: " + getDate() + " "
				+ getTime());
	}

	// metoda koja vraca trenutno vrijeme
	public static String getTime() {
		long milliseconds = System.currentTimeMillis();

		// trenutnom broju sekundi dodamo 3600, sto predstavlja plus jedan sat
		// jer je nasa trenutna zona +1
		long totalSeconds = milliseconds / 1000 + 3600;
		long currentSeconds = totalSeconds % 60;

		long totalMinutes = totalSeconds / 60;
		long currentMinutes = totalMinutes % 60;

		long totalHours = totalMinutes / 60;
		long currentHours = totalHours % 24;

		// ako je broj minuta ili sekundi manji od 10, dodajemo 0 u prefix radi
		// boljeg formata
		String currentTime = currentHours
				+ ":"
				+ ((currentMinutes < 10) ? "0" + currentMinutes
						: currentMinutes)
				+ ":"
				+ ((currentSeconds < 10) ? "0" + currentSeconds
						: currentSeconds);

		return currentTime;
	}

	// metoda koja vraca trenutni datum
	public static String getDate() {
		// novi gregoriancalendar
		Calendar newCalendar = new GregorianCalendar();

		// ispisujemo dan, mjesec i godinu pozivajuci metode iz
		// gregoriancalendar klase
		String currentDate = newCalendar.get(Calendar.DATE) + ". "
				+ getMonthName(newCalendar.get(Calendar.MONTH) + 1) + " "
				+ newCalendar.get(Calendar.YEAR);

		return currentDate;
	}

	// metoda koja vraca ime mjeseca
	public static String getMonthName(int month) {
		String monthName = "";

		switch (month) {
		case 1:
			monthName = "januar";
			break;
		case 2:
			monthName = "februar";
			break;
		case 3:
			monthName = "mart";
			break;
		case 4:
			monthName = "april";
			break;
		case 5:
			monthName = "maj";
			break;
		case 6:
			monthName = "juni";
			break;
		case 7:
			monthName = "juli";
			break;
		case 8:
			monthName = "august";
			break;
		case 9:
			monthName = "septembar";
			break;
		case 10:
			monthName = "oktobar";
			break;
		case 11:
			monthName = "novembar";
			break;
		case 12:
			monthName = "decembar";
			break;
		}

		return monthName;
	}

}
