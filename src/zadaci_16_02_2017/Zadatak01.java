package zadaci_16_02_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.IntUserInput;

public class Zadatak01 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji pita korisnika da unese cijeli broj za današnji
		 * dan u sedmici (0 za ponedjeljak, 1 za utorak...) i da unese broj dana
		 * nakon današnjeg dana te mu ispiše koji je to dan u buduænosti.
		 * (Primjer: ako korisnik unese 1 kao današnji dan a 3 kao dan u
		 * buduænosti program mu ispisuje da je danas utorak a dan u buduænosti
		 * je petak.)
		 */

		Scanner input = new Scanner(System.in);
		
		String text = "Unesite cijeli broj za danasnji dan u sedmici "
				+ "(0 - ponedjeljak, 1 - utorak.. itd): ";
		// pozivamo metode koje uzimaju unos od korisnika
		int todaysDay = IntUserInput.getInt(input, text, 0, 6);
		int days = IntUserInput.getInt(input,
				"Unesite broj dana nakon danasnjeg dana: ", 0);
		
		input.close();
		
		// izracunamo buduci dan
		int futureDay = (todaysDay + days) % 7;
		
		// ispisujemo danasnji dan i buduci dan
		System.out.println("\nDanas je " + getDayName(todaysDay)
				+ " a dan u buducnosti je " + getDayName(futureDay));

	}
	
	// metoda koja vraca ime dana
	public static String getDayName(int day) {
		String dayName = "";

		switch (day) {
		case 0:
			dayName = "ponedjeljak";
			break;
		case 1:
			dayName = "utorak";
			break;
		case 2:
			dayName = "srijeda";
			break;
		case 3:
			dayName = "cetvrtak";
			break;
		case 4:
			dayName = "petak";
			break;
		case 5:
			dayName = "subota";
			break;
		case 6:
			dayName = "nedjelja";
		}

		return dayName;
	}

}
