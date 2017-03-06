package week_4_project_battleship;

import java.util.Scanner;

public class BattleshipApp {

	public static void main(String[] args) {

		// method that starts the application
		BattleshipApplication();

	}

	// method that starts the application
	public static void BattleshipApplication() {
		Scanner input = new Scanner(System.in);

		int userOption = 1;

		while (userOption != 2) {
			Battleship.playGame(input);

			System.out.println("");

			userOption = UserInput.getInt(input,
					"Play again (1 - Yes, 2 - No)? ", 1, 2);
		}

		System.out.println("\nThanks for playing!");
	}

}
