package zadaci_20_02_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.IntUserInput;

public class Zadatak02 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji pita korisnika da unese dva cijela, pozitivna
		 * broja te ispisuje najve�i i najmanji zajedni�ki djelilac za ta dva
		 * broja.
		 */

		Scanner input = new Scanner(System.in);

		// pozivamo metode koje uzimaju unos integera od korisnika
		int number1 = IntUserInput.getInt(input,
				"Unesite pozitivan cijeli broj: ", 1);
		int number2 = IntUserInput.getInt(input,
				"Unesite pozitivan cijeli broj: ", 1);

		input.close();

		// ispisujemo najmanji zajednicki djelilac
		System.out.println("\nNajmanji zajednicki djelilac za brojeve "
				+ number1 + " i " + number2 + " je: " + lcd(number1, number2));

		// ispisujemo najveci zajednicki djelilac
		System.out.println("Najveci zajednicki djelilac za brojeve " + number1
				+ " i " + number2 + " je: " + gcd(number1, number2));

	}

	// metoda koja vraca najveci zajednicki djelilac
	public static int gcd(int number1, int number2) {
		// najmanji zajednicki djelilac je uvijek 1
		int gcd = 1;

		for (int divisor = 2; divisor <= number1 && divisor <= number2; divisor++) {
			if (number1 % divisor == 0 && number2 % divisor == 0) {
				// najveci broj s kojim su oba unesena broja djeljiva
				// je najveci zajednicki djelilac
				gcd = divisor;
			}
		}

		return gcd;
	}

	// metoda koja vraca najmanji zajednicki djelilac
	public static int lcd(int number1, int number2) {
		// najmanji zajednicki djelilac je uvijek 1
		int lcd = 1;

		for (int divisor = 2; divisor <= number1 && divisor <= number2; divisor++) {
			if (number1 % divisor == 0 && number2 % divisor == 0) {
				// prvi broj sa kojim su oba unesena broja djeljiva vracamo kao
				// najmanji zajednicki djelilac i prekidamo petlju
				lcd = divisor;
				break;
			}
		}

		return lcd;
	}

}
