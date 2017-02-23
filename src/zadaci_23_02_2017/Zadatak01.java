package zadaci_23_02_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.IntUserInput;

public class Zadatak01 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji pita korisnika da unese cijeli trocifreni broj
		 * te provjerava da li je unijeti broj palindrom. Broj je palindrom
		 * ukoliko se èita isto i sa lijeva na desno i sa desna na lijevo npr.
		 * 121, 131, itd.
		 */

		Scanner input = new Scanner(System.in);

		// pozivamo metodu koja uzima unos od korisnika
		int number = IntUserInput.getInt(input,
				"Unesite pozitivan cijeli trocifreni broj: ", 100, 999);

		input.close();

		// ispisujemo da li je uneseni broj palindrom
		System.out
				.println("\nBroj "
						+ number
						+ (isPalindrome(number) ? " je palindrom."
								: " nije palindrom."));

	}

	// metoda koja provjerava da li je broj palindrom
	public static boolean isPalindrome(int number) {
		if (number < 0) {
			// ako je broj negativan, vracamo false, jer negativan broj nije
			// palindrom
			return false;
		}

		if (number != reverse(number)) {
			return false;
		}

		return true;
	}

	// metoda koja vraca broj naopako
	public static int reverse(int number) {
		int reverseNumber = 0;

		while (number != 0) {
			reverseNumber = reverseNumber * 10 + number % 10;

			number /= 10;
		}

		return reverseNumber;
	}

}
