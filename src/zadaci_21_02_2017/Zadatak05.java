package zadaci_21_02_2017;

import java.util.Scanner;

public class Zadatak05 {

	public static void main(String[] args) {

		/*
		 * Pretpostavimo da kupujemo rižu ili neki drugi proizvod u dva
		 * razlièita pakovanja. Želimo napisati program koji uporeðuje cijene ta
		 * dva pakovanja. Program pita korisnika da unese težinu i cijenu oba
		 * pakovanja te ispisuje koje pakovanje ima bolju cijenu.
		 */

		Scanner input = new Scanner(System.in);

		// pozivamo metodu koja uzima unos od korisnika
		double weight1 = getDouble(input, "Unesite tezinu prvog paketa: ", 0);
		double price1 = getDouble(input, "Unesite cijenu prvog paketa: ", 0);

		double weight2 = getDouble(input, "Unesite tezinu drugog paketa: ", 0);
		double price2 = getDouble(input, "Unesite cijenu drugog paketa: ", 0);

		input.close();

		// da bi poredili cijene paketa, podijelimo cijenu paketa sa tezinom
		// paketa
		if (price1 / weight1 < price2 / weight2) {
			System.out.println("\nBolju cijenu ima prvi paket.");
		} else if (price1 / weight1 > price2 / weight2) {
			System.out.println("\nBolju cijenu ima drugi paket.");
		} else {
			System.out.println("\nPaketi imaju jednake cijene.");
		}

	}

	// metoda koja uzima unos double od korisnika
	public static double getDouble(Scanner input, String text, double condition) {
		double userInput = 0;
		boolean wrongUserInput = true;

		while (wrongUserInput) {
			try {
				System.out.print(text);
				userInput = input.nextDouble();

				wrongUserInput = false;

				if (userInput <= condition) {
					System.out
							.println("Pogresan unos. Morate unijeti broj veci od "
									+ condition);
					wrongUserInput = true;
				}
			} catch (Exception ex) {
				System.out
						.println("Pogresan unos. Morate unijeti broj veci od "
								+ condition);
				input.nextLine();
			}
		}

		return userInput;
	}

}
