package week_4_project_hangman;

import java.util.Scanner;

public class UserInput {

	// metoda koja uzima unos slova za pogadjanje rijeci od korisnika
	public static char getGuessingChar(Scanner input, char[] asteriskChars) {
		boolean wrongUserInput = true;
		char user = ' ';

		while (wrongUserInput) {
			System.out.print("\n(Guess) Enter a letter in a word ");

			for (int i = 0; i < asteriskChars.length; i++) {
				System.out.print(asteriskChars[i]);
			}

			System.out.print(" > ");

			// uzimamo unos od korisnika
			String sUser = input.nextLine();
			user = sUser.charAt(0);

			wrongUserInput = false;

			if (sUser.length() != 1 || !Character.isLetter(user)) {
				// ako korisnik unese vise od 1 ili ni jedan karakter ili unese
				// karakter koji nije slovo, ispisujemo odgovarajucu poruku
				System.out.println("Wrong input. You have to enter a letter.");
				wrongUserInput = true;
			}
		}

		return user;
	}

	// metoda koja uzima unos integera od korisnika za nastavak igre
	public static int getPlayAgainUserOption(Scanner input) {
		boolean wrongUserInput = true;
		int userOption = 0;

		while (wrongUserInput) {
			try {
				// uzimamo unos od korisnika
				System.out
						.print("\nDo you want to guess another word? Enter 1 - Yes, 2 - No > ");
				userOption = input.nextInt();

				wrongUserInput = false;

				if (userOption < 1 || userOption > 2) {
					System.out
							.println("Wrong input. You have to enter an integer from 1 to 2.");
					wrongUserInput = true;
				}
			} catch (Exception ex) {
				System.out
						.println("Wrong input. You have to enter an integer from 1 to 2.");
				wrongUserInput = true;
				input.nextLine();
			}
		}

		input.nextLine();

		return userOption;
	}

}
