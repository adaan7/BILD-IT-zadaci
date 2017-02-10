package zadaci_10_02_2017;

import java.util.Scanner;

public class Zadatak04 {

	public static void main(String[] args) {

		/*
		 * Napisati metodu koja vraæa lokaciju najveæeg elementa u 2D nizu.
		 * Metoda treba da koristi sljedeæi header:
		 * 
		 * public static int[ ] locateLargest(double[ ][ ] a)
		 * 
		 * Napisati test program koji pita korisnika da unese 2D niz te mu
		 * ispisuje lokaciju najveæeg elementa u nizu.
		 */

		// kreiramo novi scanner objekat
		Scanner input = new Scanner(System.in);

		// deklarisemo 2d double niz
		double[][] matrix = new double[3][3];

		// uzimamo unos od korisnika
		System.out.println("Unesite 3x3 2D niz: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}

		// zatvaramo scanner
		input.close();

		// pozivamo metodu koja vraca najveci element u 2d nizu i smjestimo je u
		// niz int
		int[] locationOfLargest = locateLargest(matrix);

		// ispisujemo lokaciju najveceg elementa u nizu
		System.out.println("\nLokacija najveceg elementa u nizu: ("
				+ locationOfLargest[0] + ", " + locationOfLargest[1] + ")");

	}

	// metoda koja vraca najveci element u 2d nizu
	public static int[] locateLargest(double[][] a) {
		double max = a[0][0];
		int[] locationOfLargest = new int[2];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (max < a[i][j]) {
					max = a[i][j];
					// kada pronadjemo najveci element u nizu, indexe dodjelimo
					// nizu int
					locationOfLargest[0] = i;
					locationOfLargest[1] = j;
				}
			}
		}

		// vracamo niz int
		return locationOfLargest;
	}

}
