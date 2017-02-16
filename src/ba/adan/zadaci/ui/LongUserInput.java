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
							.println("Pogresan unos. Morate unijeti cijeli broj jednak ili veci od "
									+ condition + ".");
					wrongUserInput = true;
				}
			} catch (Exception ex) {
				System.out
						.println("Pogresan unos. Morate unijeti cijeli broj kao long.");
				input.nextLine();
			}
		}

		return userInput;
	}

}
