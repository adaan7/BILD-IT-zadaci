package zadaci_09_02_2017;

import java.util.Scanner;

public class Zadatak04 {

	public static void main(String[] args) {

		/*
		 * Napisati metodu koja ispisuje n x n matricu korsiteæi sljedeæi
		 * header:
		 * 
		 * public static void printMatrix(int n)
		 * 
		 * Svaki element u matrici je ili 0 ili 1, generisan nasumièno. Napisati
		 * test program koji pita korisnika da unese n te ispisuje n x n
		 * matricu.
		 */

		// kreiramo novi scanner objekat
		Scanner input = new Scanner(System.in);

		// uzimamo unos od korisnika
		System.out.print("Unesite n: ");
		int number = input.nextInt();

		// zatvaramo scanner
		input.close();

		// pozivamo metodu
		printMatrix(number);

	}

	public static void printMatrix(int n) {
		// pravimo dvodimenzionalni niz integera
		int[][] matrix = new int[n][n];

		// prolazimo petljom kroz niz
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				// generišemo random integer 0 ili 1
				matrix[i][j] = (int) (Math.random() * 2);

				// ispisujemo elemenat niza
				System.out.print(matrix[i][j] + " ");
			}

			// prelazimo u novi red
			System.out.println();
		}
	}

}
