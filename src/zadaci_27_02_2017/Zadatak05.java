package zadaci_27_02_2017;

public class Zadatak05 {

	public static void main(String[] args) {

		/*
		 * *8.22 (Even number of 1s) Write a program that generates a 6-by-6
		 * two-dimensional matrix filled with 0s and 1s, displays the matrix,
		 * and checks if every row and every column have an even number of 1s.
		 */

		int[][] matrix = new int[6][6];

		// ispunjavamo 6x6 matrixu sa random integerima izmedju 0 i 1 i
		// ispisujemo matricu
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);

				System.out.print(matrix[i][j] + " ");
			}

			System.out.println();
		}

		int[] countRows = new int[matrix.length];
		int[] countCols = new int[matrix[0].length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 1) {
					// brojimo 1ce u redovima i kolonama
					countRows[i]++;
					countCols[j]++;
				}
			}
		}

		System.out.println("");

		// provjeravamo i ispisujemo da li je paran ili neparan broj 1ca u redu
		for (int i = 0; i < countRows.length; i++) {
			if (isEven(countRows[i])) {
				System.out.println("Row " + i + " have an even number of 1s");
			} else {
				System.out.println("Row " + i + " have an odd number of 1s");
			}
		}

		// provjeravamo i ispisujemo da li je paran ili neparan broj 1ca u
		// koloni
		for (int i = 0; i < countCols.length; i++) {
			if (isEven(countCols[i])) {
				System.out.println("Col " + i + " have an even number of 1s");
			} else {
				System.out.println("Col " + i + " have an odd number of 1s");
			}
		}

	}

	// metoda koja provjerava da li je broj paran
	public static boolean isEven(int number) {
		if (number % 2 != 0) {
			return false;
		}

		return true;
	}

}
