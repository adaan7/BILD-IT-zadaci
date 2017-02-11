package zadaci_09_02_2017;

import java.util.Scanner;

public class Zadatak04 {

	public static void main(String[] args) {

		/*
		 * Napisati metodu koja ispisuje n x n matricu korsiteæi sljedeæi
		 * header:
		 * 
		 * public static void printMatrix(int n)
		 * 
		 * Svaki element u matrici je ili 0 ili 1, generisan nasumièno. Napisati
		 * test program koji pita korisnika da unese n te ispisuje n x n
		 * matricu.
		 */

		// kreiramo novi scanner objekat
		Scanner input = new Scanner(System.in);

		// boolean varijabla koja ce da kontrolise petlju
		boolean wrongUserInput = true;
		int number = 0;

		// petlja radi dok je unos korisnika pogresan
		while (wrongUserInput) {
			try {
				// uzimamo unos od korisnika
				System.out.print("Unesite n: ");
				number = input.nextInt();

				// postavljamo boolean na false da bi izasli iz petlje
				wrongUserInput = false;

				if (number < 1) {
					// ako je broj manji od 1 ispisujemo odgovarajucu poruku i
					// vracamo boolean na true
					System.out
							.println("Pogresan unos. Morate unijeti cijeli broj veci od 0.");
					wrongUserInput = true;
				}
			} catch (Exception ex) {
				System.out
						.println("Pogresan unos. Morate unijeti cijeli broj veci od 0.");
				input.nextLine();
			}
		}

		// zatvaramo scanner
		input.close();

		// pozivamo metodu
		printMatrix(number);

	}

	public static void printMatrix(int n) {
		// pravimo dvodimenzionalni niz integera
		int[][] matrix = new int[n][n];

		// prolazimo petljom kroz niz
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				// generišemo random integer 0 ili 1
				matrix[i][j] = (int) (Math.random() * 2);

				// ispisujemo elemenat niza
				System.out.print(matrix[i][j] + " ");
			}

			// prelazimo u novi red
			System.out.println();
		}
	}

}
