package ba.adan.zadaci.ui;

import java.util.Scanner;

public class StringUserInput {

	public static String getString(Scanner input, String text) {
		boolean wrongUserInput = true;
		String userInput = "";

		while (wrongUserInput) {
			try {
				System.out.print(text);
				userInput = input.nextLine();

				wrongUserInput = false;
			} catch (Exception ex) {
				System.out.println("Wrong input. You have to enter a string.");
			}
		}

		return userInput;
	}

}
