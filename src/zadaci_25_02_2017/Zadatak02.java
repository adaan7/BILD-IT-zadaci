package zadaci_25_02_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.IntUserInput;

public class Zadatak02 {

	public static void main(String[] args) {

		/*
		 * *7.13 (Random number chooser) Write a method that returns a random
		 * number between 1 and 54, excluding the numbers passed in the
		 * argument. The method header is specified as follows: public static
		 * int getRandom(int... numbers)
		 */

		Scanner input = new Scanner(System.in);

		System.out
				.println("Enter ten numbers to exclude from random numbers: ");

		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			// uzimamo unos od korisnika
			numbers[i] = IntUserInput
					.getInt(input, "Enter an integer: ", 1, 54);
		}

		input.close();

		System.out.println("\nThe 100 random numbers: ");

		int counter = 0;

		// ispisujemo 100 random brojeva
		for (int i = 0; i < 100; i++) {
			System.out.print(getRandom(numbers) + " ");
			counter++;

			// ako je brojac jednak 20, prelazimo u novi red
			if (counter == 20) {
				System.out.println();
				counter = 0;
			}
		}

	}

	// metoda koja vraca random integer
	public static int getRandom(int... numbers) {
		int randomNumber = 0;
		boolean diffRandom = true;

		while (diffRandom) {
			randomNumber = (int) (Math.random() * 54 + 1);

			diffRandom = false;

			for (int i = 0; i < numbers.length; i++) {
				if (randomNumber == numbers[i]) {
					diffRandom = true;
				}
			}
		}

		return randomNumber;
	}

}
