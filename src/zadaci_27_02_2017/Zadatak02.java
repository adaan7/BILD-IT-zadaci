package zadaci_27_02_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.DoubleUserInput;

public class Zadatak02 {

	public static void main(String[] args) {

		/*
		 * **8.6 (Algebra: multiply two matrices) Write a method to multiply two
		 * matrices. The header of the method is: public static double[][]
		 * multiplyMatrix(double[][] a, double[][] b) To multiply matrix a by
		 * matrix b, the number of columns in a must be the same as the number
		 * of rows in b, and the two matrices must have elements of the same or
		 * compatible types. Let c be the result of the multiplication. Assume
		 * the column size of matrix a is n. Each element cij is ai1 * b1j + ai2
		 * * b2j + c + ain * bnj. For example, for two 3 * 3 matrices a and b, c
		 * is £ a11 a12 a13 a21 a22 a23 a31 a32 a33 ≥ * £ b11 b12 b13 b21 b22
		 * b23 b31 b32 b33 ≥ = £ c11 c12 c13 c21 c22 c23 c31 c32 c33 ≥ where cij
		 * = ai1 * b1j + ai2 * b2j + ai3 * b3j. Write a test program that
		 * prompts the user to enter two 3 * 3 matrices and displays their
		 * product.
		 */

		Scanner input = new Scanner(System.in);

		double[][] matrix1 = new double[3][3];

		System.out.println("Enter matrix1: ");

		// uzimamo unos prve matrice od korisnika
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				matrix1[i][j] = DoubleUserInput.getDouble(input,
						"Enter a number: ");
			}
		}

		double[][] matrix2 = new double[3][3];

		System.out.println("\nEnter matrix2: ");

		// uzimamo unos druge matrice od korisnika
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[0].length; j++) {
				matrix2[i][j] = DoubleUserInput.getDouble(input,
						"Enter a number: ");
			}
		}

		input.close();
		
		// pozivamo metodu koja vraca proizvod dvije matrice
		double[][] matrix3 = multiplyMatrix(matrix1, matrix2);

		System.out.println("");
		
		// ispisujemo matricu
		for (int i = 0; i < matrix3.length; i++) {
			for (int j = 0; j < matrix3[0].length; j++) {
				System.out.printf("%-1.1f ", matrix3[i][j]);
			}
			System.out.println();
		}

	}

	// metoda koja vraca proizvod dvije matrice
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		double[][] c = new double[a.length][a[0].length];

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				double sum = 0;

				for (int k = 0; k < c[0].length; k++) {
					sum += a[i][k] * b[k][j];
				}

				c[i][j] = sum;
			}
		}

		return c;
	}

}
