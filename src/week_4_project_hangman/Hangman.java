package week_4_project_hangman;

import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {

	// metoda koja pokrece igru hangman
	public static void playGame(Scanner input, ArrayList<String> wordList) {

		String randomWord = wordList
				.get((int) (Math.random() * wordList.size()));

		ArrayList<Character> missedCharList = new ArrayList<>();
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
			Display.printHangman(countMiss);

			// pozivamo metodu koja ispisuje karaktere koje je korisnik promasio
			Display.printMissedChars(missedCharList);

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

				if (missedCharList.contains(user)) {
					// ako korisnik unese slovo koje je vec pokusao, ispisujemo
					// odgovarajucu poruku i trazimo novi unos
					System.out.println("You have already tried '" + user + "'");
					noMatch = false;
					break;
				}
			}

			if (noMatch) {
				// ako korisnik nije slovo iz rijeci, ispisujemo odgovarajucu
				// poruku i povecavamo brojac promasaja
				// za 1
				System.out.println(user + " is not in the word");

				if (!missedCharList.contains(user)) {
					// ako lista promasenih slova ne sadrzi trenutno promaseno
					// slovo, dodajemo to slovo u listu
					missedCharList.add(user);
				}

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
