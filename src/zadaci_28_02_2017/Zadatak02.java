package zadaci_28_02_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.IntUserInput;

public class Zadatak02 {

	public static void main(String[] args) {

		/*
		 * 8.28 (Strictly identical arrays) The two-dimensional arrays m1 and m2
		 * are strictly identical if their corresponding elements are equal.
		 * Write a method that returns true if m1 and m2 are strictly identical,
		 * using the following header: public static boolean equals(int[][] m1,
		 * int[][] m2) Write a test program that prompts the user to enter two 3
		 * * 3 arrays of integers and displays whether the two are strictly
		 * identical.
		 */

		Scanner input = new Scanner(System.in);

		int[][] m1 = new int[3][3];
		int[][] m2 = new int[3][3];

		System.out.println("Enter 3x3 matrix1:");

		// uzimamo unos prve matrice od korisnika
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				m1[i][j] = IntUserInput.getInt(input, "Enter a value: ");
			}
		}

		System.out.println("\nEnter 3x3 matrix2: ");

		// uzimamo unos druge matrice od korisnika
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[0].length; j++) {
				m2[i][j] = IntUserInput.getInt(input, "Enter a value: ");
			}
		}

		// provjeravamo i ispisujemo da li su matrice striktno identicne
		if (equals(m1, m2)) {
			System.out.println("\nThe two arrays are strictly identical.");
		} else {
			System.out.println("\nThe two arrays are not strictly identical.");
		}

	}

	// metoda koja provjerava da li su matrice striktno identicne
	public static boolean equals(int[][] m1, int[][] m2) {
		// vracamo false ako su velicine niza razlicite
		if (m1.length != m2.length || m1[0].length != m2[0].length) {
			return false;
		}

		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				if (m1[i][j] != m2[i][j]) {
					return false;
				}
			}
		}

		return true;
	}

}
