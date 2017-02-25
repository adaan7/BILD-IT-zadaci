package zadaci_25_02_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.IntUserInput;

public class Zadatak03 {

	public static void main(String[] args) {

		/*
		 * *7.30 (Pattern recognition: consecutive four equal numbers) Write the
		 * following method that tests whether the array has four consecutive
		 * numbers with the same value. public static boolean
		 * isConsecutiveFour(int[] values) Write a test program that prompts the
		 * user to enter a series of integers and displays if the series
		 * contains four consecutive numbers with the same value. Your program
		 * should first prompt the user to enter the input size—i.e., the number
		 * of values in the series.
		 */

		Scanner input = new Scanner(System.in);

		// uzimamo unos duzine niza od korisnika
		int arraySize = IntUserInput.getInt(input,
				"Enter the number of values: ", 4);

		int[] values = new int[arraySize];

		for (int i = 0; i < values.length; i++) {
			// uzimamo unos integera od korisnika
			values[i] = IntUserInput.getInt(input, "Enter the value: ");
		}

		input.close();

		// provjeravamo da li ima 4 ista broja u nizu i ispisujemo odgovarajuce
		// poruke
		if (isConsecutiveFour(values)) {
			System.out.println("\nThe list has consecutive fours");
		} else {
			System.out.println("\nThe list has no consecutive fours");
		}

	}

	// metoda koja provjerava da li ima 4 ista broja u nizu
	public static boolean isConsecutiveFour(int[] values) {
		boolean isCons = true;
		int i = 0;

		while (i < values.length) {
			if (values[i] == values[i + 1] && values[i] == values[i + 2]
					&& values[i] == values[i + 3]) {
				isCons = true;
				break;
			} else {
				i++;

				if (i == values.length - 3) {
					isCons = false;
					break;
				}
			}
		}

		return isCons;
	}

}
