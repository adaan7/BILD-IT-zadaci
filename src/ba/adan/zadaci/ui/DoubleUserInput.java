package ba.adan.zadaci.ui;

import java.util.Scanner;

public class DoubleUserInput {
	
	public static double getDouble(Scanner input, String text,
			double firstCondition, double secondCondition) {
		double userInput = 0;
		boolean wrongUserInput = true;

		while (wrongUserInput) {
			try {
				System.out.print(text);
				userInput = input.nextDouble();

				wrongUserInput = false;

				if (userInput < firstCondition || userInput > secondCondition) {
					System.out
							.println("Pogresan unos. Morate unijeti broj od "
									+ firstCondition
									+ " do "
									+ secondCondition
									+ ".");
					wrongUserInput = true;
				}
			} catch (Exception ex) {
				System.out
						.println("Pogresan unos. Morate unijeti broj od "
								+ firstCondition
								+ " do "
								+ secondCondition
								+ ".");
				input.nextLine();
			}
		}

		return userInput;
	}

	public static double getDouble(Scanner input, String text, double condition) {
		double userInput = 0;
		boolean wrongUserInput = true;

		while (wrongUserInput) {
			try {
				System.out.print(text);
				userInput = input.nextDouble();

				wrongUserInput = false;

				if (userInput < condition) {
					System.out
							.println("Pogresan unos. Morate unijeti broj veci ili jednak od "
									+ condition);
					wrongUserInput = true;
				}
			} catch (Exception ex) {
				System.out
						.println("Pogresan unos. Morate unijeti broj veci ili jednak od "
								+ condition);
				input.nextLine();
			}
		}

		return userInput;
	}

	public static double getDouble(Scanner input, String text) {
		double userInput = 0;
		boolean wrongUserInput = true;

		while (wrongUserInput) {
			try {
				System.out.print(text);
				userInput = input.nextDouble();

				wrongUserInput = false;
			} catch (Exception ex) {
				System.out
						.println("Pogresan unos. Morate unijeti broj.");
				input.nextLine();
			}
		}

		return userInput;
	}

}
