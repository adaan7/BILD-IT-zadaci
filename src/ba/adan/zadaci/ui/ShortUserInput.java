package ba.adan.zadaci.ui;

import java.util.Scanner;

public class ShortUserInput {

	public static short getShort(Scanner input, String text) {
		short userInput = 0;
		boolean wrongUserInput = true;

		while (wrongUserInput) {
			try {
				System.out.print(text);
				userInput = input.nextShort();

				wrongUserInput = false;
			} catch (Exception ex) {
				System.out
						.println("Wrong input. You have to enter a short number.");
				input.nextLine();
			}
		}

		return userInput;
	}

	public static short getShort(Scanner input, String text,
			int firstCondition, int secondCondition) {
		short userInput = 0;
		boolean wrongUserInput = true;

		while (wrongUserInput) {
			try {
				System.out.print(text);
				userInput = input.nextShort();

				wrongUserInput = false;

				if (userInput < firstCondition || userInput > secondCondition) {
					System.out
							.println("Wrong input. You have to enter a short number from "
									+ firstCondition
									+ " to "
									+ secondCondition
									+ ".");
					wrongUserInput = true;
				}
			} catch (Exception ex) {
				System.out
						.println("Wrong input. You have to enter a short number from "
								+ firstCondition
								+ " to "
								+ secondCondition
								+ ".");
				input.nextLine();
			}
		}

		return userInput;
	}

	public static short getShort(Scanner input, String text, int condition) {
		short userInput = 0;
		boolean wrongUserInput = true;

		while (wrongUserInput) {
			try {
				System.out.print(text);
				userInput = input.nextShort();

				wrongUserInput = false;

				if (userInput < condition) {
					System.out
							.println("Wrong input. You have to enter a short number bigger or equal to "
									+ condition);
					wrongUserInput = true;
				}
			} catch (Exception ex) {
				System.out
						.println("Wrong input. You have to enter a short number bigger or equal to "
								+ condition);
				input.nextLine();
			}
		}

		return userInput;
	}

}
