package zadaci_21_02_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.IntUserInput;

public class Zadatak02 {

	public static void main(String[] args) {

		/*
		 * Napišite metodu sa sljedeæim headerom koja vraæa naopako ispisan broj
		 * koji joj je proslijeðen kao argument: public static void reverse(int
		 * number). Na primjer, reverse(3456) treba da vrati 6543. Napisati
		 * program koji pita korisnika da unese neki cijeli broj te mu vrati
		 * isti ispisan naopako.
		 */

		Scanner input = new Scanner(System.in);

		// pozivamo metodu koja uzima unos od korisnika
		int number = IntUserInput.getInt(input, "Unesite cijeli broj: ", 0);

		input.close();

		// pozivamo metodu koja ispisuje broj naopako
		reverse(number);

	}
	
	// metoda koja ispisuje broj naopako
	public static void reverse(int number) {
		while (number != 0) {
			System.out.print(number % 10);

			number /= 10;
		}
	}

}
