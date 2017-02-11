package zadaci_10_02_2017;

import java.util.Scanner;

public class Zadatak02 {

	public static void main(String[] args) {

		/*
		 * Napisati metodu koja nalazi najmanji element u nizu decimalnih
		 * vrijednosti koristeæi se sljedeæim headerom:
		 * 
		 * public static double min(double[ ] array)
		 * 
		 * Napišite potom test program koji pita korisnika da unese deset
		 * brojeva te poziva ovu metodu da vrati najmanji element u nizu.
		 */

		// kreiramo novi scanner objekat
		Scanner input = new Scanner(System.in);

		// deklarisemo double array
		double[] array = new double[10];
		
		System.out.println("Potrebno je da unesete 10 brojeva.");

		for (int i = 0; i < array.length; i++) {
			// boolean varijabla koja kontrolise petlju
			boolean wrongUserInput = true;
			double number = 0;
			
			while (wrongUserInput) {
				try {
					// uzimamo unos od korisnika
					System.out.print("Unesite broj: ");
					number = input.nextDouble();
					
					// postavljamo boolean na false da bi izasli iz petlje
					wrongUserInput = false;
				} catch (Exception ex) {
					// ako je uhvacen exception ispisujemo odgovarajucu poruku
					System.out.println("Pogresan unos. Morate unijeti broj.");
					input.nextLine();
				}
			}
			
			array[i] = number;
		}

		// zatvaramo scanner
		input.close();

		// ispisujemo najmanji element u nizu
		System.out.println("Najmanji element u nizu: " + min(array));

	}

	// metoda koja vraca najmanji element u nizu
	public static double min(double[] array) {
		double min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}

		return min;
	}

}
