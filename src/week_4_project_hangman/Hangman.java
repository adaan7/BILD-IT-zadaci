package week_4_project_hangman;

import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {

	// metoda koja pokrece igru hangman
	public static void playGame(Scanner input, ArrayList<String> wordList) {

		String randomWord = wordList
				.get((int) (Math.random() * wordList.size()));

		char[] wordChars = new char[randomWord.length()];
		char[] asteriskChars = new char[randomWord.length()];
		char asterisk = '*';
		int countMiss = 0;
		boolean isAsterisk = true;

		// pravimo niz karaktera od random rijeci
		for (int i = 0; i < wordChars.length; i++) {
			wordChars[i] = randomWord.charAt(i);
		}

		// pravimo niz karaktera od zjezdice, velicina niza je broj karaktera u
		// random rijeci
		for (int i = 0; i < asteriskChars.length; i++) {
			if (wordChars[i] == ' ') {
				asteriskChars[i] = ' ';
			} else {
				asteriskChars[i] = '*';
			}
		}

		// petlja radi dok je broj promasaja manji do 6 ili dok jos uvijek ima
		// neotkrivenih slova u rijeci
		while (countMiss < 6 && isAsterisk) {
			boolean noMatch = true;

			// crtamo hangman-a u zavisnosti od broja promasaja
			if (countMiss == 0) {
				Display.printHanger();
			} else if (countMiss == 1) {
				Display.printHead();
			} else if (countMiss == 2) {
				Display.printHeadBody();
			} else if (countMiss == 3) {
				Display.printHeadBodyOneArm();
			} else if (countMiss == 4) {
				Display.printHeadBodyArms();
			} else if (countMiss == 5) {
				Display.printHeadBodyArmsLeg();
			}

			// uzimamo unos karaktera od korisnika
			char user = UserInput.getGuessingChar(input, asteriskChars);

			for (int i = 0; i < asteriskChars.length; i++) {
				if (user == asteriskChars[i]) {
					// ako korisnik unese slovo koje je vec jednom unijeo,
					// ispisujemo odgovarajucu poruku
					System.out.println(user + " is already in the word");
				}

				if (user == wordChars[i]) {
					// ako je korisnik unio slovo koje se nalazi u random
					// rijeci, upisujemo to slovo i u niz karaktera sa
					// zvjezdicama i postavljamo noMatch na false
					asteriskChars[i] = user;
					noMatch = false;
				}
			}

			if (noMatch) {
				// ako korisnik nije pogodio ni jedno slovo iz rijeci,
				// ispisujemo odgovarajucu poruku i povecavamo brojac promasaja
				// za 1
				System.out.println(user + " is not in the word");
				countMiss++;
			}

			isAsterisk = false;

			for (int i = 0; i < asteriskChars.length; i++) {
				if (asterisk == asteriskChars[i]) {
					// provjeravamo da li ima zvijezdica u nizu sa zvijezdicama,
					// ako ima, postavljamo isAsterisk na true da bi nastavili
					// sa petljom
					isAsterisk = true;
				}
			}
		}

		if (countMiss == 6) {
			// ako je broj promasaja 6, crtamo hangman-a na vjesalici
			Display.printFullBody();
		}

		if (isAsterisk) {
			// provjeravamo ako jos uvijek ima zvjezdica u nizu karaktera sa
			// zvjezdicama korisnik nije uspio pogoditi trazenu rijec iz
			// ogranicenog broja pokusaja, ispisujemo odgovarajucu poruku i broj
			// promasaja
			System.out.println("\nYou lose. The word was '" + randomWord
					+ "'. \nYou missed " + countMiss
					+ ((countMiss == 1) ? " time" : " times"));
		} else {
			// ako nema zvjezdica, korisnik je pogodio trazenu rijec, ispisujemo
			// odgovarajucu poruku i broj promasaja
			System.out.println("\nYou guessed it. The word is '" + randomWord
					+ "'. Well done!" + "\nYou missed " + countMiss
					+ ((countMiss == 1) ? " time" : " times"));
		}
	}

}
