package week_3_project_connect_4;

import java.util.Scanner;

import ba.adan.zadaci.ui.IntUserInput;

public class Control {

	// metoda koja pokrece aplikaciju
	public static void connectFourApplication() {
		Scanner input = new Scanner(System.in);

		// pozivamo metodu koja ispisuje zaglavlje
		Display.printHeader();

		int userOption = 0;

		while (userOption != 2) {
			// pozivamo metodu koja pokrece igru
			ConnectFour.playGame(input);

			// uzimamo unos od korisnika za nastavak igre
			userOption = IntUserInput.getInt(input,
					"Play again (1 - Yes, 2 - No): ", 1, 2);
		}

		input.close();

		System.out.println("\nThanks for playing!");

	}

	// metoda koja mijenja brojeve iz tabele sa karakterima
	public static char[][] changeIntTableToCharTable(int[][] values) {
		char[][] charValues = new char[values.length][values[0].length];

		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values[0].length; j++) {
				char temp = ' ';
				switch (values[i][j]) {
				case 0:
					temp = ' ';
					break;
				case 1:
					temp = 'X';
					break;
				case 2:
					temp = 'O';
				}

				charValues[i][j] = temp;
			}
		}

		return charValues;
	}

}
