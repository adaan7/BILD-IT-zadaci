package week_3_project_connect_4;

import java.util.Scanner;

import ba.adan.zadaci.ui.IntUserInput;

public class ConnectFour {

	public static void playGame(Scanner input) {

		final String FULL_COLUMN_MESSAGE = "That column is full. Choose another one!";

		int[][] table = new int[6][7];
		boolean isPlaying = true;

		while (isPlaying) {
			int countUser = 0;

			// pretvaramo int tabelu u char tabelu i ispisujemo tabelu
			char[][] charTable = Control.changeIntTableToCharTable(table);
			Display.printTable(charTable);

			int xUserCol = 0, oUserCol = 0;
			boolean isWrongInputX = true, isWrongInputO = true;

			while (isWrongInputX) {
				// uzimamo unos od korisnika X
				xUserCol = IntUserInput.getInt(input,
						"Drop a -X- disk at column (1-7): ", 1, 7);

				xUserCol--;

				isWrongInputX = false;

				// provjerimo da li je kolona popunjena
				if (Validation.checkForZeroInTable(xUserCol, table)) {
					System.out.println(FULL_COLUMN_MESSAGE);
					isWrongInputX = true;
				}
			}

			// provjeravamo redove od kraja, ako je polje u redu slobodno,
			// upisujemo korisnikov unos, ako nije nastavimo dalje da
			// provjeravamo dok ne pronadjemo slobodno polje
			for (int row = table.length - 1; row >= 0;) {
				if (table[row][xUserCol] == 0) {
					table[row][xUserCol] = 1;
					break;
				} else {
					row--;
				}
			}

			// pretvaramo int tabelu u char tabelu i ispisujemo tabelu
			charTable = Control.changeIntTableToCharTable(table);
			Display.printTable(charTable);

			// provjeravamo da li korisnik X ima pogodjena 4 broja u nizu
			if (Validation.isConsecutiveFour(1, table)) {
				System.out.println("\nThe X player won\n");
				isPlaying = false;
				break;
			}

			while (isWrongInputO) {
				// uzimamo unos od korisnika O
				oUserCol = IntUserInput.getInt(input,
						"Drop a -O- disk at column (1-7): ", 1, 7);

				oUserCol--;

				isWrongInputO = false;

				// provjerimo da li je kolona popunjena
				if (Validation.checkForZeroInTable(oUserCol, table)) {
					System.out.println(FULL_COLUMN_MESSAGE);
					isWrongInputO = true;
				}
			}

			// provjeravamo redove od kraja, ako je polje u redu slobodno,
			// upisujemo korisnikov unos, ako nije nastavimo dalje da
			// provjeravamo dok ne pronadjemo slobodno polje
			for (int row = table.length - 1; row >= 0;) {
				if (table[row][oUserCol] == 0) {
					table[row][oUserCol] = 2;
					break;
				} else {
					row--;
				}
			}

			// provjerimo da li korisnik O ima pogodjena 4 broja u nizu
			if (Validation.isConsecutiveFour(2, table)) {
				charTable = Control.changeIntTableToCharTable(table);
				Display.printTable(charTable);

				System.out.println("\nThe O player won\n");
				isPlaying = false;
				break;
			}
			
			for (int i = 0; i < table.length; i++) {
				for (int j = 0; j < table[0].length; j++) {
					if (table[i][j] == 1 || table[i][j] == 2) {
						// brojimo unose oba korisnika
						countUser++;
					}
				}
			}
			
			// ako je broj unosa korisnika jednak broju polja, ispisujemo da je rezultat nerjesen
			if (countUser == (table.length * table[0].length)) {
				charTable = Control.changeIntTableToCharTable(table);
				Display.printTable(charTable);

				System.out.println("\nIt's draw\n");
				isPlaying = false;
			}
		}
	}

}
