package week_3_project_tic_tac_toe;

import java.util.Scanner;

public class Control {

	public static void ticTacToeApplication() {

		Scanner input = new Scanner(System.in);

		// pozivamo metodu koja ispisuje zaglavlje
		Display.printHeader();

		int userOption = 0;

		while (userOption != 2) {
			// pozivamo metodu za igranje tic tac toe
			TicTacToe.playGame(input);

			System.out.println("");

			// uzimamo unos od korisnika za nastavak igre
			userOption = UserInput.getInt(input,
					"Play again (1 - Yes, 2 - No): ", 1, 2);
		}

		input.close();

		System.out.println("\nThanks for playing!");

	}

	// metoda koja mijenja brojeve iz tabele sa karakterima
	public static char[][] changeIntTableToCharTable(int[][] table) {
		char[][] charTable = new char[table.length][table[0].length];

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[0].length; j++) {
				char temp = ' ';

				switch (table[i][j]) {
				case 0:
					temp = ' ';
					break;
				case 1:
					temp = 'X';
					break;
				case 2:
					temp = 'O';
				}

				charTable[i][j] = temp;
			}
		}

		return charTable;
	}

	// metoda koja vraca poziciju u tabeli
	public static int[] changeNumToPosition(int n) {
		int[] position = new int[2];

		switch (n) {
		case 1:
			position[0] = 0;
			position[1] = 0;
			break;
		case 2:
			position[0] = 0;
			position[1] = 1;
			break;
		case 3:
			position[0] = 0;
			position[1] = 2;
			break;
		case 4:
			position[0] = 1;
			position[1] = 0;
			break;
		case 5:
			position[0] = 1;
			position[1] = 1;
			break;
		case 6:
			position[0] = 1;
			position[1] = 2;
			break;
		case 7:
			position[0] = 2;
			position[1] = 0;
			break;
		case 8:
			position[0] = 2;
			position[1] = 1;
			break;
		case 9:
			position[0] = 2;
			position[1] = 2;
		}

		return position;
	}

}
