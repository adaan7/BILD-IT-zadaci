package zadaci_22_02_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.IntUserInput;

public class Zadatak05 {

	public static void main(String[] args) {

		/*
		 * Napisati metodu koja ispisuje n x n matricu koristeæi se sljedeæim
		 * headerom: public static void printMatrix(int n). Svaki element u
		 * matrici je ili 0 ili 1, nasumièno generisana. Napisati test program
		 * koji pita korisnika da unese broj n te mu ispiše n x n matricu u
		 * konzoli.
		 */

		Scanner input = new Scanner(System.in);

		// pozivamo metodu koja uzima unos od korisnika
		int n = IntUserInput.getInt(input, "Unesite broj n: ", 1);

		// pozivamo metodu koja ispisuje matricu
		printMatrix(n);

	}

	// metoda koja ispisuje matricu
	public static void printMatrix(int n) {
		int[][] matrix = new int[n][n];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				// generisemo random broj izmedju 1 i 2
				int number = (int) (Math.random() * 2);

				System.out.print(number + " ");
			}

			System.out.println();
		}
	}

}
