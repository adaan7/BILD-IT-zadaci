package week_3_project_connect_4;

public class Validation {

	// metoda koja provjerava da li ima nula u tabeli
	public static boolean checkForZeroInTable(int column, int[][] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i][column] == 0) {
				return false;
			}
		}

		return true;
	}

	// metoda koja provjerava da li ima 4 ista broja u nizu
	public static boolean isConsecutiveFour(int value, int[][] values) {
		if (!isConsecutiveFourHorizontal(value, values)
				&& !isConsecutiveFourVertical(value, values)
				&& !isConsecutiveFourDiagonal(value, values)) {
			return false;
		}

		return true;
	}

	// metoda koja provjerava da li ima 4 ista broja horizontalno
	public static boolean isConsecutiveFourHorizontal(int value, int[][] values) {
		int countCons = 0;

		for (int i = 0; i < values.length; i++) {
			int j = 0;
			while (j < values[0].length) {
				if (value == values[i][j] && value == values[i][j + 1]
						&& value == values[i][j + 2]
						&& value == values[i][j + 3]) {
					countCons++;
					break;
				} else {
					j++;
					if (j == values[0].length - 3) {
						break;
					}
				}
			}
		}

		if (countCons == 0) {
			return false;
		}

		return true;
	}

	// metoda koja provjerava da li ima 4 ista broja vertikalno
	public static boolean isConsecutiveFourVertical(int value, int[][] values) {
		int countCons = 0;

		for (int i = 0; i < values.length;) {
			for (int j = 0; j < values[0].length; j++) {
				if (value == values[i][j] && value == values[i + 1][j]
						&& value == values[i + 2][j]
						&& value == values[i + 3][j]) {
					countCons++;
					break;
				}
			}
			i++;
			if (i == values.length - 3) {
				break;
			}
		}

		if (countCons == 0) {
			return false;
		}

		return true;
	}

	// metoda koja provjerava da li ima 4 broja dijagonalno
	public static boolean isConsecutiveFourDiagonal(int value, int[][] values) {
		int countCons = 0;

		// glavna dijagonala
		for (int i = values.length - 1; i >= 0;) {
			for (int j = 0; j < values[0].length;) {
				if (value == values[i][j] && value == values[i - 1][j + 1]
						&& value == values[i - 2][j + 2]
						&& value == values[i - 3][j + 3]) {
					countCons++;
					break;
				} else {
					j++;
					if (j == values[0].length - 3) {
						break;
					}
				}
			}
			i--;
			if (i == 2) {
				break;
			}
		}

		// sporedna dijagonala
		for (int i = 0; i < values.length;) {
			for (int j = 0; j < values[0].length;) {
				if (value == values[i][j] && value == values[i + 1][j + 1]
						&& value == values[i + 2][j + 2]
						&& value == values[i + 3][j + 3]) {
					countCons++;
					break;
				} else {
					j++;
					if (j == values[0].length - 3) {
						break;
					}
				}
			}
			i++;
			if (i == values.length - 3) {
				break;
			}
		}

		if (countCons == 0) {
			return false;
		}

		return true;
	}

}
