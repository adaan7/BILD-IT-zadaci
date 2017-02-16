package zadaci_16_02_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.LongUserInput;

public class Zadatak05 {

	public static void main(String[] args) {

		/*
		 * Napisati metodu koja pretavara milisekunde u sate, minute i sekunde.
		 * Metoda treba da koristi sljedeæi header: public static String
		 * convertMillis(long millis). Metoda treba da vraæa vrijeme kao string
		 * u formatu sati:minute:sekunde. Na primjer convertMillis(100000) treba
		 * da vrati 0:1:40.
		 */

		Scanner input = new Scanner(System.in);

		// uzimamo unos od korisnika
		long millis = LongUserInput.getLong(input, "Unesite millisekunde: ", 0);

		input.close();

		// ispisujemo vrijeme
		System.out.println("\nSati: " + convertMillis(millis));

	}

	// metoda koja konvertuje millisekunde u string format sati
	public static String convertMillis(long millis) {
		String time = "";

		// izracunamo ukupne sekunde i trenutne sekunde
		long totalSeconds = millis / 1000;
		long currentSeconds = totalSeconds % 60;

		// izracunamo ukupne minute i trenutne minute
		long totalMinutes = totalSeconds / 60;
		long currentMinutes = totalMinutes % 60;

		// izracunamo ukupne sate i trenutne sate
		long totalHours = totalMinutes / 60;
		long currentHours = totalHours % 24;

		time = currentHours + ":" + currentMinutes + ":" + currentSeconds;

		return time;
	}

}
