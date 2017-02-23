package zadaci_23_02_2017;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Zadatak04 {

	public static void main(String[] args) {

		/* Napisati metodu koja vraæa datum i trenutaèno vrijeme. */

		// ispisujemo datum i trenutno vrijeme
		System.out.println("Datum i trenutno vrijeme: " + currentDateAndTime());

	}

	// metoda koja vraca kao string datum i trenutno vrijeme
	public static String currentDateAndTime() {
		return getDate() + ", " + getTime();
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
		String currentDate = newCalendar.get(Calendar.DATE) + "."
				+ (newCalendar.get(Calendar.MONTH) + 1) + "."
				+ newCalendar.get(Calendar.YEAR) + ".";

		return currentDate;
	}

}
