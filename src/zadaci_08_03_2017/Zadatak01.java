package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

import ba.adan.zadaci.ui.IntUserInput;

public class Zadatak01 {

	public static void main(String[] args) {

		/*
		 * (Largest rows and columns) Write a program that randomly fills in 0s
		 * and 1s into an n-by-n matrix, prints the matrix, and finds the rows
		 * and columns with the most 1s. (Hint: Use two ArrayLists to store the
		 * row and column indices with the most 1s.)
		 */

		Scanner input = new Scanner(System.in);

		// get array size from user
		int arraySize = IntUserInput.getInt(input, "Enter the array size n: ",
				1, 100);
		
		input.close();

		int[][] matrix = new int[arraySize][arraySize];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);

				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}

		ArrayList<Integer> largestRowIndexList = getLargestRowIndex(matrix);
		ArrayList<Integer> largestColumnIndexList = getLargestColumnIndex(matrix);

		System.out.print("\nThe largest row index: ");

		for (int i = 0; i < largestRowIndexList.size(); i++) {
			System.out.print(largestRowIndexList.get(i) + ", ");
		}

		System.out.print("\nThe largest column index: ");

		for (int i = 0; i < largestColumnIndexList.size(); i++) {
			System.out.print(largestColumnIndexList.get(i) + ", ");
		}

	}

	// method that return ArrayList of Integers with index of largest row in
	// matrix
	public static ArrayList<Integer> getLargestRowIndex(int[][] matrix) {
		ArrayList<Integer> largestRowIndexList = new ArrayList<>();
		int[] countRows = new int[matrix.length];
		int max = countRows[0];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 1) {
					countRows[i]++;
				}
			}
		}

		for (int i = 0; i < countRows.length; i++) {
			if (max < countRows[i]) {
				max = countRows[i];
			}
		}

		for (int i = 0; i < countRows.length; i++) {
			if (max == countRows[i]) {
				largestRowIndexList.add(i);
			}
		}

		return largestRowIndexList;
	}

	// method that return ArrayList of Integers with index of largest column in
	// matrix
	public static ArrayList<Integer> getLargestColumnIndex(int[][] matrix) {
		ArrayList<Integer> largestColumnIndexList = new ArrayList<>();
		int[] countColumns = new int[matrix[0].length];
		int max = countColumns[0];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 1) {
					countColumns[j]++;
				}
			}
		}

		for (int i = 0; i < countColumns.length; i++) {
			if (max < countColumns[i]) {
				max = countColumns[i];
			}
		}

		for (int i = 0; i < countColumns.length; i++) {
			if (max == countColumns[i]) {
				largestColumnIndexList.add(i);
			}
		}

		return largestColumnIndexList;
	}

}
