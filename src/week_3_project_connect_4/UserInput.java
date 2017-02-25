package week_3_project_connect_4;

import java.util.Scanner;

public class UserInput {

	// metoda koja uzima unos integera od korisnika
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

}
