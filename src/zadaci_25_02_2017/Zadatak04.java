package zadaci_25_02_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.DoubleUserInput;

public class Zadatak04 {

	public static void main(String[] args) {

		/*
		 * *8.1 (Sum elements column by column) Write a method that returns the
		 * sum of all the elements in a specified column in a matrix using the
		 * following header: public static double sumColumn(double[][] m, int
		 * columnIndex) Write a test program that reads a 3-by-4 matrix and
		 * displays the sum of each column.
		 */

		Scanner input = new Scanner(System.in);

		double[][] matrix = new double[3][4];

		System.out.println("Enter a 3-by-4 matrix: ");

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				// uzimamo unos od korisnika
				matrix[row][col] = DoubleUserInput.getDouble(input,
						"Enter a number: ");
			}
		}

		input.close();

		System.out.println("");

		// ispisujemo zbir elemenata kolona
		for (int col = 0; col < matrix[0].length; col++) {
			System.out.println("Sum of the elements at column " + col + " is "
					+ sumColumn(matrix, col));
		}

	}

	// metoda koja vraca zbir elemenata iz kolone
	public static double sumColumn(double[][] m, int columnIndex) {
		double sumColumn = 0;

		for (int row = 0; row < m.length; row++) {
			sumColumn += m[row][columnIndex];
		}

		return sumColumn;
	}

}
