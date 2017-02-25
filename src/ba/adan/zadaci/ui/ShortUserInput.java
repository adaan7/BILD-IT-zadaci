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
				System.out.println("Pogresan unos. Morate unijeti short broj.");
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
							.println("Pogresan unos. Morate unijeti short broj od "
									+ firstCondition
									+ " do "
									+ secondCondition
									+ ".");
					wrongUserInput = true;
				}
			} catch (Exception ex) {
				System.out.println("Pogresan unos. Morate unijeti short broj.");
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
							.println("Pogresan unos. Morate unijeti short broj veci ili jednak od "
									+ condition);
					wrongUserInput = true;
				}
			} catch (Exception ex) {
				System.out.println("Pogresan unos. Morate unijeti short broj.");
				input.nextLine();
			}
		}

		return userInput;
	}

}
