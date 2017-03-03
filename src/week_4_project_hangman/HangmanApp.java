package week_4_project_hangman;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HangmanApp {

	public static void main(String[] args) throws IOException {

		// pozivamo metodu koja pokrece aplikaciju
		startApplication();

	}

	// metoda koja pokrece aplikaciju
	public static void startApplication() throws IOException {
		Scanner input = new Scanner(System.in);

		ArrayList<String> wordList = new ArrayList<>();
		// kopiramo listu rijeci iz fajla u array listu
		FileOutput.copyFileToWordList(wordList);

		System.out.println("*** HANGMAN ***");

		int playAgainUserOption = 0;

		while (playAgainUserOption != 2) {
			// pozivamo metodu da pokrenemo igru
			Hangman.playGame(input, wordList);

			// uzimamo unos korisnika o nastavku igranja igre
			playAgainUserOption = UserInput.getPlayAgainUserOption(input);
		}

		System.out.println("\nThanks for playing!");

		input.close();
	}

}
