package ba.adan.zadaci.ui;

import java.util.Scanner;

public class LongUserInput {

	public static long getLong(Scanner input, String text, long condition) {
		long userInput = 0;
		boolean wrongUserInput = true;

		while (wrongUserInput) {
			try {
				System.out.print(text);
				userInput = input.nextLong();

				wrongUserInput = false;

				if (userInput < condition) {
					System.out
							.println("Wrong input. You have to enter a long number bigger or equal to "
									+ condition + ".");
					wrongUserInput = true;
				}
			} catch (Exception ex) {
				System.out
						.println("Wrong input. You have to enter a long number bigger or equal to "
								+ condition + ".");
				input.nextLine();
			}
		}

		return userInput;
	}

}
