package week_3_project_tic_tac_toe;

public class Display {

	// metoda koja ispisuje zaglavlje
	public static void printHeader() {
		System.out.println("*** TIC-TAC-TOE ***");
	}

	// metoda koja ispisuje tabelu
	public static void printTable(char[][] table) {
		System.out.println("");

		for (int i = 0; i < table.length; i++) {
			System.out.println("-------------");

			for (int j = 0; j < table[0].length; j++) {
				System.out.print("| " + table[i][j] + " ");
			}

			System.out.print("|\n");
		}
		System.out.println("-------------\n");
	}

}
