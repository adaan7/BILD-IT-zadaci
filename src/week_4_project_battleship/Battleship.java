package week_4_project_battleship;

import java.util.ArrayList;
import java.util.Scanner;

public class Battleship {

	final static int AIRCRAFTCARRIER_LENGTH = 5;
	final static int BATTLESHIP_LENGTH = 4;
	final static int CRUISER_LENGTH = 3;
	final static int SUBMARINE_LENGTH = 3;
	final static int DESTROYER_LENGTH = 2;

	final static char AIRCRAFTCARRIER = 'A';
	final static char BATTLESHIP = 'B';
	final static char CRUISER = 'C';
	final static char SUBMARINE = 'S';
	final static char DESTROYER = 'D';

	// method that starts the game Battleship
	public static void playGame(Scanner input) {

		Display.printHeader();

		// create ship groups for players
		ArrayList<Ship> playerOneShipGroup = new ArrayList<>();
		ArrayList<Ship> playerTwoShipGroup = new ArrayList<>();

		// create main and show char table for player one
		char[][] playerOneMainTable = new char[10][10];
		char[][] playerOneShowTable = new char[10][10];

		// create main and show char table for player two
		char[][] playerTwoMainTable = new char[10][10];
		char[][] playerTwoShowTable = new char[10][10];

		// player one place ships on table
		placePlayerShipsOnTable(input, "Player One", playerOneMainTable,
				playerOneShowTable, playerOneShipGroup);

		// player two place ships on table
		placePlayerShipsOnTable(input, "Player Two", playerTwoMainTable,
				playerTwoShowTable, playerTwoShipGroup);

		System.out.println("\n|-|-| START WITH SHOOTING |-|-|");

		while (Validation.checkPlayerShips(playerOneShipGroup)
				&& Validation.checkPlayerShips(playerTwoShipGroup)) {
			// get player One shot
			getPlayerShot(input, "Player One", "Player Two",
					playerTwoMainTable, playerTwoShowTable, playerTwoShipGroup);

			// get player Two shot
			getPlayerShot(input, "Player Two", "Player One",
					playerOneMainTable, playerOneShowTable, playerOneShipGroup);
		}

	}

	// method that takes a shot from player
	public static void getPlayerShot(Scanner input, String playerName,
			String enemyName, char[][] enemyMainTable, char[][] enemyShowTable,
			ArrayList<Ship> enemyShipGroup) {

		boolean isPlayerGoodShot = true;

		while (isPlayerGoodShot) {
			Display.printTable(enemyShowTable);

			// get hit position from player
			int[] playerHitPosition = UserInput.getHitPositionFromUser(input,
					playerName, enemyShowTable);

			int row = playerHitPosition[0];
			int column = playerHitPosition[1];

			// check if player hit one of the ships
			if (Validation.isGoodShot(row, column, enemyMainTable)) {
				playerHitShip(row, column, playerName, enemyMainTable,
						enemyShowTable, enemyShipGroup);
			} else {
				playerMissShip(row, column, enemyShowTable);

				isPlayerGoodShot = false;
			}

			if (!Validation.checkPlayerShips(enemyShipGroup)) {
				// check if enemy's ships are all destroyed, display
				// corresponding message and finish the game
				Display.printTable(enemyShowTable);

				System.out.println("\nAll ships from " + enemyName
						+ " have been destroyed!");
				System.out.println("*** " + playerName + " WIN! ***");
				break;
			}
		}
	}

	// method that perform operation when player miss the ship
	public static void playerMissShip(int row, int column,
			char[][] enemyShowTable) {
		// if player missed a ship, write 'X' in the enemy's table on
		// that position
		enemyShowTable[row][column] = 'X';

		System.out.println("\nYou missed!");
	}

	// method that perform operations when one of the ship is hitted
	public static void playerHitShip(int row, int column, String playerName,
			char[][] enemyMainTable, char[][] enemyShowTable,
			ArrayList<Ship> enemyShipGroup) {

		// get index of the ship that was hit
		int indexOfShip = getIndexOfShip(row, column, enemyMainTable,
				enemyShipGroup);
		// hit that ship, increase hit counter by 1
		enemyShipGroup.get(indexOfShip).hit();

		char shipFirstLetter = getShipFirstLetterFromIndex(indexOfShip);

		enemyShowTable[row][column] = shipFirstLetter;

		System.out.println("\nGood shot, " + playerName + "!");

		if (enemyShipGroup.get(indexOfShip).getNumberOfHits() == enemyShipGroup
				.get(indexOfShip).getShipLength()) {
			System.out.println("*** You have been destroyed enemy's "
					+ enemyShipGroup.get(indexOfShip).getShipName() + "! ***");
			enemyShipGroup.get(indexOfShip).setDestroyed(true);
		}
	}

	// method that place all ships from player on table
	public static void placePlayerShipsOnTable(Scanner input,
			String playerName, char[][] playerMainTable,
			char[][] playerShowTable, ArrayList<Ship> playerShipGroup) {

		Display.printTable(playerShowTable);

		System.out.println(playerName + ", place your ships!");

		placePlayerShipOnTable(input, "AIRCRAFTCARRIER - 5 squares long",
				"Aircraftcarrier", AIRCRAFTCARRIER_LENGTH, AIRCRAFTCARRIER,
				playerMainTable, playerShipGroup);

		placePlayerShipOnTable(input, "BATTLESHIP - 4 squares long",
				"Battleship", BATTLESHIP_LENGTH, BATTLESHIP, playerMainTable,
				playerShipGroup);

		placePlayerShipOnTable(input, "CRUISER - 3 squares long", "Cruiser",
				CRUISER_LENGTH, CRUISER, playerMainTable, playerShipGroup);

		placePlayerShipOnTable(input, "SUBMARINE - 3 squares long",
				"Sumbarine", SUBMARINE_LENGTH, SUBMARINE, playerMainTable,
				playerShipGroup);

		placePlayerShipOnTable(input, "DESTROYER - 2 squares long",
				"Destroyer", DESTROYER_LENGTH, DESTROYER, playerMainTable,
				playerShipGroup);

		System.out.println("\n" + playerName + " ships have been deployed!");
	}

	public static void placePlayerShipOnTable(Scanner input, String text,
			String shipName, int shipLength, char shipFirstLetter,
			char[][] playerMainTable, ArrayList<Ship> playerShipGroup) {

		// get position from ship, place it on the table, create ship
		// object and place it in the ship group
		int[] shipPosition = UserInput.getStartPositionFromUser(input, text,
				shipLength, playerMainTable);
		placeShipOnTable(shipPosition, shipLength, shipFirstLetter,
				playerMainTable);

		Ship ship = new Ship(shipName, shipLength);
		playerShipGroup.add(ship);
	}

	// method that place one ship on table
	public static void placeShipOnTable(int[] position, int shipLength,
			char shipChar, char[][] table) {
		int row = position[0];
		int column = position[1];
		int orientation = position[2];

		if (orientation == 1) {
			for (int j = column; j < column + shipLength; j++) {
				table[row][j] = shipChar;
			}
		} else if (orientation == 2) {
			for (int i = row; i < row + shipLength; i++) {
				table[i][column] = shipChar;
			}
		}
	}

	// method that returns the number of a column
	public static int getColumnNumber(char columnName) {
		int column = 0;

		switch (columnName) {
		case 'A':
			column = 0;
			break;
		case 'B':
			column = 1;
			break;
		case 'C':
			column = 2;
			break;
		case 'D':
			column = 3;
			break;
		case 'E':
			column = 4;
			break;
		case 'F':
			column = 5;
			break;
		case 'G':
			column = 6;
			break;
		case 'H':
			column = 7;
			break;
		case 'I':
			column = 8;
			break;
		case 'J':
			column = 9;
		}

		return column;
	}

	// method that get first letter of ship name from index of that ship in ship
	// group
	public static char getShipFirstLetterFromIndex(int indexOfShip) {
		char shipFirstLetter = ' ';

		switch (indexOfShip) {
		case 0:
			shipFirstLetter = 'A';
			break;
		case 1:
			shipFirstLetter = 'B';
			break;
		case 2:
			shipFirstLetter = 'C';
			break;
		case 3:
			shipFirstLetter = 'S';
			break;
		case 4:
			shipFirstLetter = 'D';
		}

		return shipFirstLetter;
	}

	// method that get index of ship from ship group
	public static int getIndexOfShip(int row, int column,
			char[][] playerMainTable, ArrayList<Ship> shipGroup) {
		int indexOfShip = 0;

		if (playerMainTable[row][column] == 'A') {
			indexOfShip = 0;
		} else if (playerMainTable[row][column] == 'B') {
			indexOfShip = 1;
		} else if (playerMainTable[row][column] == 'C') {
			indexOfShip = 2;
		} else if (playerMainTable[row][column] == 'S') {
			indexOfShip = 3;
		} else if (playerMainTable[row][column] == 'D') {
			indexOfShip = 4;
		}

		return indexOfShip;
	}

}
