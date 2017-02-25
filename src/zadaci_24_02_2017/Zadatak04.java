package zadaci_24_02_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.IntUserInput;

public class Zadatak04 {

	public static void main(String[] args) {

		/*
		 * Napisati metodu sa sljedeæim headerom: public static String
		 * format(int number, int width) koja vraæa string broja sa prefiksom od
		 * jedne ili više nula. Velièina stringa je width argument. Na primjer,
		 * ukoliko pozovemo metodu format(34, 4) metoda vraæa 0034, ukoliko
		 * pozovemo format(34, 5) metoda vraæa 00034. Ukoliko je uneseni broj
		 * veæi nego width argument, metoda vraæa samo string broja. Npr.
		 * ukoliko pozovemo format(34, 1) metoda vraæa 34.
		 */

		Scanner input = new Scanner(System.in);

		// uzimamo unos od korisnika
		int number = IntUserInput.getInt(input,
				"Unesite pozitivan cijeli broj: ", 0);
		int width = IntUserInput.getInt(input,
				"Unesite pozitivan cijeli broj za sirinu: ", 1);

		input.close();

		// ispisujemo formatirani broj
		System.out.println("\nFormatirani broj: " + format(number, width));

	}

	// metoda koja vraca formatirani broj kao string
	public static String format(int number, int width) {
		return String.format("%0" + width + "d", number);
	}

}
