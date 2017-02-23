package week_3_project_tic_tac_toe;

public class Validation {

	// metoda koja provjerava da li ima nula u tabeli
	public static boolean checkForZeroInTable(int[][] table) {
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[0].length; j++) {
				if (table[i][j] == 0) {
					return false;
				}
			}
		}

		return true;
	}

	// metoda koja provjerava da li ima niz od tri ista broja u tabeli
	public static boolean checkForTripleInTable(int value, int[][] values) {
		if (!checkColumns(value, values) && !checkRows(value, values)
				&& !checkMainDiagonal(value, values)
				&& !checkSecondaryDiagonal(value, values)) {
			return false;
		}

		return true;
	}

	// metoda koja provjerava jesu li tri ista broja u redovima
	public static boolean checkColumns(int value, int[][] values) {
		int count = 0;

		for (int row = 0; row < values.length; row++) {
			if (value == values[row][0] && value == values[row][1]
					&& value == values[row][2]) {
				count++;
				break;
			}
		}

		if (count == 0) {
			return false;
		}

		return true;
	}

	// metoda koja provjerava jesu li tri ista broja u kolonama
	public static boolean checkRows(int value, int[][] values) {
		int count = 0;

		for (int col = 0; col < values[0].length; col++) {
			if (value == values[0][col] && value == values[1][col]
					&& value == values[2][col]) {
				count++;
				break;
			}
		}

		if (count == 0) {
			return false;
		}

		return true;
	}

	// metoda koja provjerava jesu li tri ista broja na glavnoj dijagonali
	public static boolean checkMainDiagonal(int value, int[][] values) {
		boolean checkDiag = true;

		if (value == values[0][0] && value == values[1][1]
				&& value == values[2][2]) {
			checkDiag = true;
		} else {
			checkDiag = false;
		}

		return checkDiag;
	}

	// metoda koja provjerava jesu li tri ista broja na sporednoj dijagonali
	public static boolean checkSecondaryDiagonal(int value, int[][] values) {
		boolean checkDiag = true;

		if (value == values[2][0] && value == values[1][1]
				&& value == values[0][2]) {
			checkDiag = true;
		} else {
			checkDiag = false;
		}

		return checkDiag;
	}

}
