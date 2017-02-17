package zadaci_17_02_2017;

public class Zadatak03 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji ispisuje sve mogu�e kombinacije za biranje dva
		 * broja u rasponu od 1 do 7. Tako�er, program ispisuje broj svih
		 * mogu�ih kombinacija. Dakle, program treba da ispi�e sve mogu�e parove
		 * brojeva u datom rasponu, krenuv�i sa 1 2, 1 3, 1 4, itd. Broj mogu�ih
		 * kombinacija je 21.
		 */

		int counter = 0;

		for (int i = 1; i <= 7; i++) {
			for (int j = i; j <= 7; j++) {
				if (i != j) {
					// ispisujemo kombinacije brojeva od 1 do 7, iskljucujuci
					// iste brojeve
					System.out.print(i + " " + j + ", ");
					counter++;

					// kada brojac djeljiv sa 10, prelazimo u novi red
					if (counter % 10 == 0) {
						System.out.println();
					}
				}
			}
		}

		// ispisujemo broj kombinacija
		System.out.println("\n\nBroj kombinacija: " + counter);

	}

}
