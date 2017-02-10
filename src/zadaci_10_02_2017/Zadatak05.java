package zadaci_10_02_2017;

import java.util.Scanner;

public class Zadatak05 {

	public static void main(String[] args) {

		/*
		 * Implementirati sljedeæu metodu da sortira redove u 2D nizu.
		 * 
		 * public static double[ ][ ] sortRows(double[ ][ ] array)
		 * 
		 * Napisati testni program koji pita korisnika da unese 3x3 matricu (ili
		 * da pita korisnika koliku matricu želi unijeti) te mu ispisuje na
		 * konzoli matricu sa sortiranim redovima - od najmanjeg broja do
		 * najveæeg.
		 */

		// kreiramo novi scanner objekat
		Scanner input = new Scanner(System.in);

		// deklarisemo novi 2d niz
		double[][] matrix = new double[3][3];

		// uzimamo unos od korisnika
		System.out.println("Unesite 3x3 matricu: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}

		// zatvaramo scanner
		input.close();

		// sortiramo redove u postojecem 2d nizu pozivajuci metodu koja vraca
		// sortirani 2d niz
		matrix = sortRows(matrix);

		// ispisujemo matrixu sa sortiranim redovima
		System.out.println("\nMatrica sa sortiranim redovima: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	// metoda koja vraca sortirane redove u 2d nizu
	public static double[][] sortRows(double[][] array) {
		for (int i = 0; i < array.length; i++) {
			// pozivamo metodu sort koja sortira svaki niz
			java.util.Arrays.sort(array[i]);
		}

		// vracamo 2d niz sa sortiranim redovima
		return array;
	}

}
