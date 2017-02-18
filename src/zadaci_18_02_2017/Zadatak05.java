package zadaci_18_02_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.IntUserInput;

public class Zadatak05 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji uèitava neodreðen broj cijelih brojeva,
		 * odreðuje koliko je pozitivnih brojeva korisnik unijeo, koliko
		 * negativnih te izraèunava ukupnu sumu i prosjek svih unesenih brojeva.
		 * (Korisnik prekida unos tako što unese nulu). Na primjer, ukoliko
		 * korisnik unese 1 2 -1 3 0 program treba da ispiše da je broj
		 * pozitivnih brojeva 3, negativnih brojeva 1, suma ili zbir su 5.0 a
		 * prosjek svih brojeva je 1.25.
		 */

		Scanner input = new Scanner(System.in);

		int number = -1, countPositive = 0, countNegative = 0;
		double sum = 0, average = 0;

		// petlja radi dok korisnik ne unese 0
		while (number != 0) {
			// uzimamo unos od korisnika
			number = IntUserInput.getInt(input,
					"Unesite cijeli broj (unos prekida 0): ");

			if (number > 0) {
				// ako je broj pozitivan, povecavamo brojac pozitivnih za 1 i
				// dodajemo broj u sum
				sum += number;
				countPositive++;
			} else if (number < 0) {
				// ako je broj negativan, povecavamo brojac negativnih za 1 i
				// dodajemo broj u sum
				sum += number;
				countNegative++;
			}
		}

		input.close();

		// izracunamo prosjek brojeva
		average = sum / (countPositive + countNegative);

		// ispis
		System.out.println("\nBroj pozitivnih brojeva: " + countPositive
				+ "\nBroj negativnih brojeva: " + countNegative
				+ "\nSuma brojeva: " + sum + "\nProsjek svih brojeva: "
				+ average);

	}

}
