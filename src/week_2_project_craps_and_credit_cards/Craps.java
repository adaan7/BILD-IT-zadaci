package week_2_project_craps_and_credit_cards;

import java.util.Scanner;

public class Craps {

	public static void main(String[] args) {

		/*
		 * Craps is a popular dice game played in casinos. Write a program to
		 * play a variation of the game, as follows: Roll two dice. Each die has
		 * six faces representing values 1, 2, …, and 6, respectively. Check the
		 * sum of the two dice. If the sum is 2, 3, or 12 (called craps), you
		 * lose; if the sum is 7 or 11 (called natural), you win; if the sum is
		 * another value (i.e., 4, 5, 6, 8, 9, or 10), a point is established.
		 * Continue to roll the dice until either a 7 or the same point value is
		 * rolled. If 7 is rolled, you lose. Otherwise, you win. Your program
		 * acts as a single player.
		 */

		// pozivamo metodu koja pokrece aplikaciju
		startCraps();

	}

	public static void startCraps() {
		Scanner input = new Scanner(System.in);

		System.out.println("*** CRAPS ***");

		System.out.print("\nHit ENTER to start: ");
		input.nextLine();

		int userInput = 0;

		while (userInput != 2) {
			System.out.println("\n-------------------------");

			// pozivamo metodu koja simulira bacanje kockica
			int sum = rollingDice();

			if (sum == 2 || sum == 3 || sum == 12) {
				// ako je zbir kockica 2, 3 ili 12, korisnik je izgubio
				printLoseMessage();
			} else if (sum == 7 || sum == 11) {
				// ako je ukupan zbir kockica 7 ili 11, korisnik je pobijedio
				printWinMessage();
			} else {
				// ako uslovi nisu ispunjeni, ponavlja se bacanje

				System.out.println("point is " + sum);

				boolean rollAgain = true;

				while (rollAgain) {
					// pozivamo metodu koja simulira bacanje kockica
					int newSum = rollingDice();

					if (newSum == 7) {
						// ako je zbir ponovljenih kockica 7, korisnik je
						// izgubio
						printLoseMessage();
						rollAgain = false;
					} else if (newSum == sum) {
						// ako je zbir ponovljenih kockica jednak pocetnom
						// zbiru, korisnik je pobijedio
						printWinMessage();
						rollAgain = false;
					}
				}
			}

			// uzimamo unos od korisnika
			userInput = getUserInput(input, "Play again (1 - Yes, 2 - No): ",
					1, 2);
		}

		input.close();

		System.out.println("\nSee you soon!");

	}

	// metoda koja printa poruku kada korisnik pobijedi
	public static void printWinMessage() {
		System.out.println("-------------------------");
		System.out.println("You win!");
		System.out.println("-------------------------\n");
	}

	// metoda koja printa poruku kada korisnik izgubi
	public static void printLoseMessage() {
		System.out.println("-------------------------");
		System.out.println("You lose!");
		System.out.println("-------------------------\n");
	}

	// metoda koja simulira bacanje kockica
	public static int rollingDice() {
		// generisemo random integer od 1 do 6
		int dice1 = (int) (Math.random() * 6 + 1);
		int dice2 = (int) (Math.random() * 6 + 1);

		int sum = dice1 + dice2;

		// pauziramo program pola sekunde i simuliramo bacanje dvije kockice
		try {
			Thread.sleep(500);
			System.out.print("|" + dice1 + "|");
			Thread.sleep(500);
			System.out.print("|" + dice2 + "|");
			Thread.sleep(500);
		} catch (Exception ex) {

		}

		// ispisujemo brojeve koje je korisnik dobio
		System.out.print(" You rolled " + dice1 + " + " + dice2 + " = " + sum
				+ "\n");

		return sum;
	}

	// metoda koja uzima unos integera od korisnika
	public static int getUserInput(Scanner input, String text,
			int firstCondition, int secondCondition) {
		int userInput = 0;
		boolean wrongUserInput = true;

		while (wrongUserInput) {
			try {
				System.out.print(text);
				userInput = input.nextInt();

				wrongUserInput = false;

				if (userInput < firstCondition || userInput > secondCondition) {
					System.out
							.println("Wrong input. You have to enter a number from "
									+ firstCondition
									+ " to "
									+ secondCondition
									+ ".");
					wrongUserInput = true;
				}
			} catch (Exception ex) {
				System.out
						.println("Wrong input. You have to enter a number from "
								+ firstCondition
								+ " to "
								+ secondCondition
								+ ".");
				input.nextLine();
			}
		}

		return userInput;
	}

}
