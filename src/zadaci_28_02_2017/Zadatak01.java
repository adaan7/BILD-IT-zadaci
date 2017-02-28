package zadaci_28_02_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.DoubleUserInput;

public class Zadatak01 {

	public static void main(String[] args) {

		/*
		 * *8.26 (Row sorting) Implement the following method to sort the rows
		 * in a twodimensional array. A new array is returned and the original
		 * array is intact. public static double[][] sortRows(double[][] m)
		 * Write a test program that prompts the user to enter a 3 * 3 matrix of
		 * double values and displays a new row-sorted matrix.
		 */

		Scanner input = new Scanner(System.in);

		double[][] matrix = new double[3][3];

		System.out.println("Enter a 3x3 matrix of double values");

		// uzimamo unos od korisnika
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = DoubleUserInput.getDouble(input,
						"Enter a value: ");
			}
		}

		// pozivamo metodu koja sortira redove u matrici
		double[][] sortedRowsArray = sortRows(matrix);

		System.out.println("\nArray with sorted rows:");

		// ispisujemo matricu sa sortiranim redovima
		for (double[] e : sortedRowsArray) {
			for (double f : e) {
				System.out.print(f + " ");
			}
			System.out.println();
		}

	}

	// metoda koja sortira redove u 2d nizu
	public static double[][] sortRows(double[][] m) {
		double[][] sortedArray = new double[m.length][m[0].length];

		for (int i = 0; i < m.length; i++) {
			java.util.Arrays.sort(m[i]);
		}

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				sortedArray[i][j] = m[i][j];
			}
		}

		return sortedArray;
	}

}
