package week_4_project_battleship;

public class Display {

	// method that displays the header
	public static void printHeader() {
		System.out.println("************ B A T T L E S H I P ************");
	}

	// method that prints the table
	public static void printTable(char[][] table) {
		System.out.println("\n---------------------------------------------");
		System.out.println("|   | A | B | C | D | E | F | G | H | I | J |");
		System.out.println("---------------------------------------------");

		for (int i = 0; i < table.length; i++) {
			System.out.print("| " + i + " |");

			for (int j = 0; j < table[0].length; j++) {
				System.out.print(" " + table[i][j] + " |");
			}

			System.out
					.println("\n---------------------------------------------");
		}
	}

}
