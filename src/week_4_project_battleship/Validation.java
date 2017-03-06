package week_4_project_battleship;

import java.util.ArrayList;

public class Validation {

	// method that checks if a charater is from A to J for column name input
	// validation
	public static boolean checkCharacter(char ch) {

		if (ch < 65 || ch > 74) {
			return false;
		}

		return true;
	}

	// method that checks for a free position to place ship in the table
	public static boolean checkShipPosition(int row, int column,
			int orientation, int shipLength, char[][] playerMaintable) {

		if (orientation == 1) {
			for (int j = column; j < column + shipLength; j++) {
				if (j == playerMaintable[0].length) {
					return false;
				} else {
					if (playerMaintable[row][j] == 'A'
							|| playerMaintable[row][j] == 'B'
							|| playerMaintable[row][j] == 'C'
							|| playerMaintable[row][j] == 'S'
							|| playerMaintable[row][j] == 'D') {
						return false;
					}
				}
			}
		} else if (orientation == 2) {
			for (int i = row; i < row + shipLength; i++) {
				if (i == playerMaintable.length) {
					return false;
				} else {
					if (playerMaintable[i][column] == 'A'
							|| playerMaintable[i][column] == 'B'
							|| playerMaintable[i][column] == 'C'
							|| playerMaintable[i][column] == 'S'
							|| playerMaintable[i][column] == 'D') {
						return false;
					}
				}
			}
		}

		return true;
	}

	// method that checks for a free position to hit in the table
	public static boolean checkHitPosition(int row, int column,
			char[][] playerShowTable) {

		if (playerShowTable[row][column] == 'A'
				|| playerShowTable[row][column] == 'B'
				|| playerShowTable[row][column] == 'C'
				|| playerShowTable[row][column] == 'S'
				|| playerShowTable[row][column] == 'D'
				|| playerShowTable[row][column] == 'X') {
			return false;
		}

		return true;
	}

	// method that returns true if a player hit one of the ships
	public static boolean isGoodShot(int row, int column,
			char[][] playerMainTable) {

		if (playerMainTable[row][column] == 'A'
				|| playerMainTable[row][column] == 'B'
				|| playerMainTable[row][column] == 'C'
				|| playerMainTable[row][column] == 'S'
				|| playerMainTable[row][column] == 'D') {
			return true;
		}

		return false;
	}

	// method that returns true if a player have at least one ship not destroyed
	public static boolean checkPlayerShips(ArrayList<Ship> playerShipGroup) {

		for (int i = 0; i < playerShipGroup.size(); i++) {
			if (!playerShipGroup.get(i).isDestroyed()) {
				return true;
			}
		}

		return false;
	}

}
