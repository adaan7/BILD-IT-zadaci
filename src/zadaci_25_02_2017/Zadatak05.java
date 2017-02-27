package zadaci_25_02_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.DoubleUserInput;

public class Zadatak05 {

	public static void main(String[] args) {

		/*
		 * 8.5 (Algebra: add two matrices) Write a method to add two matrices.
		 * The header of the method is as follows: public static double[][]
		 * addMatrix(double[][] a, double[][] b) Programming Exercises 307 In
		 * order to be added, the two matrices must have the same dimensions and
		 * the same or compatible types of elements. Let c be the resulting
		 * matrix. Each element cij is aij + bij. For example, for two 3 * 3
		 * matrices a and b, c is £ a11 a12 a13 a21 a22 a23 a31 a32 a33 ≥ + £
		 * b11 b12 b13 b21 b22 b23 b31 b32 b33 ≥ = £ a11 + b11 a12 + b12 a13 +
		 * b13 a21 + b21 a22 + b22 a23 + b23 a31 + b31 a32 + b32 a33 + b33 ≥
		 * Write a test program that prompts the user to enter two 3 * 3
		 * matrices and displays their sum.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Enter matrix1: ");

		double[][] matrix1 = new double[3][3];

		// uzimamo unos prve matrice od korisnika
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				matrix1[i][j] = DoubleUserInput.getDouble(input,
						"Enter a number: ");
			}
		}

		System.out.println("\nEnter matrix2: ");

		// uzimamo unos druge matrice od korisnika
		double[][] matrix2 = new double[3][3];
		
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[0].length; j++) {
				matrix2[i][j] = DoubleUserInput.getDouble(input,
						"Enter a number: ");
			}
		}

		input.close();

		// pozivamo metodu koja zbraja dvije matrice
		double[][] matrix3 = addMatrix(matrix1, matrix2);

		System.out.println("\nmatrix1 + matrix2 is: ");

		// ispisujemo novu matricu
		for (double[] e : matrix3) {
			for (double f : e) {
				System.out.print(f + " ");
			}

			System.out.println();
		}

	}

	// metoda koja zbraja dvije matrice
	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] c = new double[a.length][a[0].length];

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[0].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}

		return c;
	}

}
