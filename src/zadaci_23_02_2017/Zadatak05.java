package zadaci_23_02_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.IntUserInput;

public class Zadatak05 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji pita korisnika da unese cijeli broj te ispisuje
		 * piramidu svih brojeva do tog broja. (Na primjer, ukoliko korisnik
		 * unese 7 vrh piramide je broj 1, red ispod vrha piramide je 2 1 2, red
		 * ispod je 3 2 1 2 3, red ispod 4 3 2 1 2 3 4 itd.)
		 */

		Scanner input = new Scanner(System.in);

		// uzimamo unos od korisnika
		int number = IntUserInput.getInt(input,
				"Unesite cijeli broj do kojeg zelite ispisati piramidu: ", 1);

		input.close();

		// petlja koja sluzi za redove piramide
		for (int i = 1; i <= number; i++) {
			// petlja koja ispisuje razmake
			for (int j = i; j <= number; j++) {
				System.out.print("  ");
			}
			// petlja koja ispisuje lijevu stranu piramide
			for (int k = i; k >= 1; k--) {
				System.out.print(k + " ");
			}
			// petlja koja ispisuje desnu stranu piramide
			for (int m = 2; m <= i; m++) {
				System.out.print(m + " ");
			}
			System.out.println();
		}

	}

}
