package zadaci_11_02_2017;

import java.util.Scanner;

public class Zadatak03 {

	public static void main(String[] args) {

		/*
		 * Napisati metodu sa sljedeæim headerom koja ispisuje tri broja u
		 * rastuæem redosljedu: public static void displaySortedNumbers(double
		 * num1, double num2, double num3). Napisati program koji pita korisnika
		 * da unese tri broja te ispiše ta tri broja u rastuæem redosljedu.
		 */

		// novi scanner
		Scanner input = new Scanner(System.in);

		// niz od 3 double broja
		double[] numbers = new double[3];
		// niz stringova
		String[] strings = { "prvi", "drugi", "treci" };

		for (int i = 0; i < numbers.length; i++) {
			// boolean varijabla koja ce kontrolisati petlju
			boolean wrongUserInput = true;

			// petlja radi dok je unos korisnika pogresan
			while (wrongUserInput) {
				try {
					// uzimamo unos od korisnika
					System.out.print("Unesite " + strings[i] + " broj: ");
					numbers[i] = input.nextDouble();

					// postavljamo boolean na false da bi izasli iz petlje
					wrongUserInput = false;
				} catch (Exception ex) {
					// ako je uhvacen exception ispisujemo odgovarajucu poruku
					System.out.println("Pogresan unos. Morate unijeti broj.");
					input.nextLine();
				}
			}
		}

		// zatvaramo scanner
		input.close();

		// pozivamo metodu koja ispisuje sortirane brojeve
		displaySortedNumbers(numbers[0], numbers[1], numbers[2]);

	}

	public static void displaySortedNumbers(double num1, double num2,
			double num3) {
		// smjestimo brojeve u niz double
		double[] numbers = { num1, num2, num3 };

		// sortiramo niz pozivajuci sort metodu
		java.util.Arrays.sort(numbers);

		// ispisujemo sve brojeve niza
		System.out.println("Sortirani brojevi: " + numbers[0] + " " + numbers[1] + " "
				+ numbers[2]);
	}

}
