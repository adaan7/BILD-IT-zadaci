package week_3_project_connect_4;

public class Display {
	
	public static void printHeader() {
		System.out.println("***Connect Four***");
	}
	
	// metoda koja ispisuje tabelu
	public static void printTable(char[][] array) {
		System.out.println("\n---------------");
		for (int i = 0; i < array.length; i++) {
			System.out.print("|");
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + "|");
			}
			System.out.print("\n");
		}
		System.out.println("---------------");
		System.out.println("|1|2|3|4|5|6|7|");
		System.out.println("---------------");
	}

}
