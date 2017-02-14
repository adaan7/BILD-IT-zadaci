package ba.adan.zadaci.ui;

import java.util.Scanner;

public class IntArrayUserInput {

	public static int[] getIntArray(Scanner input, String text,
			int arrayLength, int firstCondition, int secondCondition) {
		int[] numbers = new int[arrayLength];

		System.out.println("Potrebno je da unesete " + numbers.length
				+ " cijelih brojeva.");

		for (int i = 0; i < numbers.length; i++) {
			boolean wrongUserInput = true;
			int number = 0;

			while (wrongUserInput) {
				try {
					System.out.println(text);
					number = input.nextInt();

					wrongUserInput = false;

					if (number < firstCondition || number > secondCondition) {
						System.out
								.println("Pogresan unos. Morate unijeti broj od "
										+ firstCondition
										+ " do "
										+ secondCondition);
						wrongUserInput = true;
					}
				} catch (Exception ex) {
					System.out.println("Pogresan unos. Morate unijeti broj od "
							+ firstCondition + " do " + secondCondition);
					input.nextLine();
				}
			}
			numbers[i] = number;
		}

		return numbers;
	}

	public static int[] getIntArray(Scanner input, String text,
			int arrayLength, int condition) {
		int[] numbers = new int[arrayLength];

		System.out.println("Potrebno je da unesete " + numbers.length
				+ " cijelih brojeva.");

		for (int i = 0; i < numbers.length; i++) {
			boolean wrongUserInput = true;
			int number = 0;

			while (wrongUserInput) {
				try {
					System.out.println(text);
					number = input.nextInt();

					wrongUserInput = false;

					if (number < condition) {
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
			numbers[i] = number;
		}

		return numbers;
	}

	public static int[] getIntArray(Scanner input, String text, int arrayLength) {
		int[] numbers = new int[arrayLength];

		System.out.println("Potrebno je da unesete " + numbers.length
				+ " cijelih brojeva.");

		for (int i = 0; i < numbers.length; i++) {
			boolean wrongUserInput = true;
			int number = 0;

			while (wrongUserInput) {
				try {
					System.out.println(text);
					number = input.nextInt();

					wrongUserInput = false;
				} catch (Exception ex) {
					System.out.println("Pogresan unos. Morate unijeti broj.");
					input.nextLine();
				}
			}
			numbers[i] = number;
		}

		return numbers;
	}

}
