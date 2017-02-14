package ba.adan.zadaci.ui;

import java.util.Scanner;

public class DoubleArrayUserInput {
	
	public static double[] getDoubleArray(Scanner input, String text,
			int arrayLength, double firstCondition, double secondCondition) {
		double[] numbers = new double[arrayLength];

		System.out.println("Potrebno je da unesete " + numbers.length
				+ " cijelih brojeva.");

		for (int i = 0; i < numbers.length; i++) {
			boolean wrongUserInput = true;
			double number = 0;

			while (wrongUserInput) {
				try {
					System.out.println(text);
					number = input.nextDouble();

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

	public static double[] getDoubleArray(Scanner input, String text,
			int arrayLength, double condition) {
		double[] numbers = new double[arrayLength];

		System.out.println("Potrebno je da unesete " + numbers.length
				+ " cijelih brojeva.");

		for (int i = 0; i < numbers.length; i++) {
			boolean wrongUserInput = true;
			double number = 0;

			while (wrongUserInput) {
				try {
					System.out.println(text);
					number = input.nextDouble();

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

	public static double[] getDoubleArray(Scanner input, String text, int arrayLength) {
		double[] numbers = new double[arrayLength];

		System.out.println("Potrebno je da unesete " + numbers.length
				+ " cijelih brojeva.");

		for (int i = 0; i < numbers.length; i++) {
			boolean wrongUserInput = true;
			double number = 0;

			while (wrongUserInput) {
				try {
					System.out.println(text);
					number = input.nextDouble();

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
