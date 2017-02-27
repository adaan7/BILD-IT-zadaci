package zadaci_27_02_2017;

public class Zadatak03 {

	public static void main(String[] args) {

		/*
		 * *8.10 (Largest row and column) Write a program that randomly fills in
		 * 0s and 1s into a 4-by-4 matrix, prints the matrix, and finds the
		 * first row and column with the most 1s. Here is a sample run of the
		 * program: 0011 0011 1101 1010 The largest row index: 2 The largest
		 * column index: 2
		 */

		int[][] matrix = new int[4][4];

		// 2d niz ispunimo sa random integerima izmedju 0 i 1
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
			}
		}

		// niz koji ce da broji 1ce u redovima
		int[] rowCounts = new int[matrix.length];
		// niz koji ce da broji 1ce u kolonama
		int[] colCounts = new int[matrix[0].length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				// ispisujemo random matricu
				System.out.print(matrix[i][j]);

				if (matrix[i][j] == 1) {
					colCounts[j]++;
					rowCounts[i]++;
				}
			}
			System.out.println();
		}

		// ispisujemo index najveceg reda i index najvece kolone
		System.out.println("\nThe largest row index: " + indexOfMax(rowCounts));
		System.out
				.println("The largest column index: " + indexOfMax(colCounts));

	}

	// metoda koja vraca index najveceg broja u nizu
	public static int indexOfMax(int[] array) {
		int max = array[0];
		int maxIndex = 0;

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
				maxIndex = i;
			}
		}

		return maxIndex;
	}

}
