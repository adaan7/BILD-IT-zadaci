package zadaci_20_02_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.IntUserInput;

public class Zadatak04 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji pita korisnika da unese 3 cijela broja te mu
		 * ispiše ta ista tri broja u rastuæem redosljedu. Bonus: Napisati
		 * metodu koja prima tri cijela broja kao argumente te vraæa brojeve u
		 * rastuæem redosljedu.
		 */

		Scanner input = new Scanner(System.in);

		String text = "Unesite cijeli broj: ";

		// pozivamo metode koje uzimaju unos od korisnika
		int number1 = IntUserInput.getInt(input, text);
		int number2 = IntUserInput.getInt(input, text);
		int number3 = IntUserInput.getInt(input, text);

		input.close();

		// pozivamo metodu koja vraca sortirane brojeve
		int[] sortedNumbers = getSortedNumbers(number1, number2, number3);

		// ispisujemo brojeve u rastucem redoslijedu
		System.out.println("\nBrojevi u rastucem redoslijedu: "
				+ sortedNumbers[0] + ", " + sortedNumbers[1] + ", "
				+ sortedNumbers[2]);

	}

	// metoda koja vraca brojeve u rastucem redoslijedu
	public static int[] getSortedNumbers(int num1, int num2, int num3) {
		int[] numbers = { num1, num2, num3 };

		java.util.Arrays.sort(numbers);

		return numbers;
	}

}
