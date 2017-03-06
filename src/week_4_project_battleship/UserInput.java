package week_4_project_battleship;

import java.util.Scanner;

public class UserInput {

	// method that takes an integer from user
	public static int getInt(Scanner input, String text, int firstCondition,
			int secondCondition) {

		int userInput = 0;
		boolean wrongUserInput = true;

		while (wrongUserInput) {
			try {
				System.out.print(text);
				userInput = input.nextInt();

				wrongUserInput = false;

				if (userInput < firstCondition || userInput > secondCondition) {
					System.out
							.println("Wrong input. You have to enter an integer from "
									+ firstCondition
									+ " to "
									+ secondCondition
									+ ".");
					wrongUserInput = true;
				}
			} catch (Exception ex) {
				System.out
						.println("Wrong input. You have to enter an integer from "
								+ firstCondition
								+ " to "
								+ secondCondition
								+ ".");
				input.nextLine();
			}
		}

		return userInput;
	}

	// method that takes character with a column name from user
	public static char getCharColumnName(Scanner input, String text) {

		boolean wrongUserInput = true;
		char userInput = ' ';

		while (wrongUserInput) {
			try {
				System.out.print(text);
				String sUserInput = input.nextLine();
				sUserInput = sUserInput.toUpperCase();
				userInput = sUserInput.charAt(0);

				wrongUserInput = false;

				if (sUserInput.length() != 1
						|| !Validation.checkCharacter(userInput)) {
					System.out
							.println("Wrong input. You have to enter one character from A to J.");
					wrongUserInput = true;
				}
			} catch (Exception ex) {
				System.out
						.println("Wrong input. You have to enter one character from A to J.");
			}
		}

		return userInput;
	}

	// method that takes ship position from user
	public static int[] getStartPositionFromUser(Scanner input,
			String shipName, int shipLength, char[][] playerMaintable) {

		int[] position = new int[3];
		boolean wrongPosition = true;

		while (wrongPosition) {
			System.out.println("\n" + shipName);
			char columnName = UserInput.getCharColumnName(input,
					"Enter column (A - J): ");

			int column = Battleship.getColumnNumber(columnName);
			int row = UserInput.getInt(input, "Enter row (0 - 9): ", 0, 9);
			int orientation = UserInput.getInt(input,
					"Enter orientation (1 - Horizontal, 2 - Vertical): ", 1, 2);
			input.nextLine();

			position[0] = row;
			position[1] = column;
			position[2] = orientation;

			wrongPosition = false;

			if (!Validation.checkShipPosition(row, column, orientation,
					shipLength, playerMaintable)) {
				System.out
						.println("That position is wrong or taken. Choose another one!");
				wrongPosition = true;
			}
		}

		return position;
	}

	// method that takes hit position from user
	public static int[] getHitPositionFromUser(Scanner input,
			String playerName, char[][] playerShowTable) {

		int[] position = new int[2];
		boolean wrongPosition = true;

		while (wrongPosition) {
			System.out.println("---> " + playerName + ", shoot!");
			char columnName = UserInput.getCharColumnName(input,
					"Enter column (A - J): ");

			int column = Battleship.getColumnNumber(columnName);
			int row = UserInput.getInt(input, "Enter row (0 - 9): ", 0, 9);

			input.nextLine();

			position[0] = row;
			position[1] = column;

			wrongPosition = false;

			if (!Validation.checkHitPosition(row, column, playerShowTable)) {
				System.out
						.println("You've already hit that position. Choose another one!");
				wrongPosition = true;
			}
		}

		return position;
	}

}
