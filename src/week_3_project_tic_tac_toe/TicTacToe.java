package week_3_project_tic_tac_toe;

import java.util.Scanner;

public class TicTacToe {

	public static void playGame(Scanner input) {

		// pravimo tabelu za igru
		int[][] table = new int[3][3];
		boolean isPlaying = true;
		final String TAKEN_POSITION_MESSAGE = "That position is already taken. Choose another.";
		final String DRAW_MESSAGE = "It's draw!";

		while (isPlaying) {
			// pravimo 2d niz karaktera koji nam sluzi za ispisivanje tabele za
			// igru
			char[][] charTable = Control.changeIntTableToCharTable(table);
			// pozivamo metodu koja ispisuje tabelu
			Display.printTable(charTable);

			boolean isWrongInputX = true, isWrongInputO = true;
			int numPlayerX = 0, numPlayerO = 0;
			int[] positionPlayerX = new int[2];
			int[] positionPlayerO = new int[2];

			while (isWrongInputX) {
				// uzimamo unos od igraca X
				numPlayerX = UserInput.getInt(input,
						"Enter a position (1 - 9) for player 'X': ", 1, 9);

				isWrongInputX = false;

				// pretvaramo uneseni broj od 1 do 9 u poziciju u tabeli
				positionPlayerX = Control.changeNumToPosition(numPlayerX);

				// provjeravamo da li je pozicija koju igrac X unese zauzeta,
				// ako jeste, trazimo da ponovo unese poziciju
				if (table[positionPlayerX[0]][positionPlayerX[1]] != 0) {
					System.out.println(TAKEN_POSITION_MESSAGE);
					isWrongInputX = true;
				}
			}

			// ubacujemo unesenu poziciju igraca X u tabelu
			table[positionPlayerX[0]][positionPlayerX[1]] = 1;
			charTable = Control.changeIntTableToCharTable(table);
			Display.printTable(charTable);

			// nakon unosa igraca X, provjeravamo da li imamo niz od tri slova
			// X, ako ima ispisujemo da je igrac X pobjednik
			if (Validation.checkForTripleInTable(1, table)) {
				System.out.println("'X' player won!");
				isPlaying = false;
				break;
			}

			// provjerimo da li ima nula u tabeli, ako nema ispisujemo da je
			// nerjesen rezultat
			if (Validation.checkForZeroInTable(table)) {
				System.out.println(DRAW_MESSAGE);
				isPlaying = false;
				break;
			}

			while (isWrongInputO) {
				// uzimamo unos od igraca O
				numPlayerO = UserInput.getInt(input,
						"Enter a position (1 - 9) for player 'O': ", 1, 9);

				isWrongInputO = false;

				// pretvaramo uneseni broj od 1 do 9 u poziciju u tabeli
				positionPlayerO = Control.changeNumToPosition(numPlayerO);

				// provjeravamo da li je pozicija koju igrac O unese zauzeta,
				// ako jeste, trazimo da ponovo unese poziciju
				if (table[positionPlayerO[0]][positionPlayerO[1]] != 0) {
					System.out.println(TAKEN_POSITION_MESSAGE);
					isWrongInputO = true;
				}
			}

			// ubacujemo unesenu poziciju igraca O u tabelu
			table[positionPlayerO[0]][positionPlayerO[1]] = 2;

			// nakon unosa igraca O, provjeravamo da li imamo niz od tri slova
			// O, ako ima ispisujemo da je igrac O pobjednik
			if (Validation.checkForTripleInTable(2, table)) {
				charTable = Control.changeIntTableToCharTable(table);
				Display.printTable(charTable);
				System.out.println("'O' player won!");
				isPlaying = false;
				break;
			}

			// provjerimo da li ima nula u tabeli, ako nema ispisujemo da je
			// nerjesen rezultat
			if (Validation.checkForZeroInTable(table)) {
				System.out.println(DRAW_MESSAGE);
				isPlaying = false;
			}
		}
	}

}
