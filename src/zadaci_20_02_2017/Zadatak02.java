package zadaci_20_02_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.IntUserInput;

public class Zadatak02 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji pita korisnika da unese dva cijela, pozitivna
		 * broja te ispisuje najveæi i najmanji zajednièki djelilac za ta dva
		 * broja.
		 */

		Scanner input = new Scanner(System.in);

		// pozivamo metode koje uzimaju unos integera od korisnika
		int number1 = IntUserInput.getInt(input,
				"Unesite pozitivan cijeli broj: ", 1);
		int number2 = IntUserInput.getInt(input,
				"Unesite pozitivan cijeli broj: ", 1);

		input.close();

		// najmanji zajednicki djelilac je uvijek 1
		int gcd = 1;

		for (int divisor = 2; divisor <= number1 && divisor <= number2; divisor++) {
			if (number1 % divisor == 0 && number2 % divisor == 0) {
				// najveci broj s kojim su oba unesena broja djeljiva
				// je najveci zajednicki djelilac
				gcd = divisor;
			}
		}

		// ispisujemo najveci zajednicki djelilac
		System.out.println("\nNajveci zajednicki djelilac za brojeve "
				+ number1 + " i " + number2 + " je: " + gcd);

	}

}
