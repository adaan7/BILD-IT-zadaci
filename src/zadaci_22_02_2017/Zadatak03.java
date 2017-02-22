package zadaci_22_02_2017;

public class Zadatak03 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji sabira sljedeæu seriju 1/3 + 3/5 + 5/7 + 7/9 +
		 * 9/11 + 11/13 ..... + 95/97 + 97/99.
		 */

		double sum = 0;

		// prolazimo petljom od 1 do 98, nakon svake iteracije povecavamo i za 2
		for (int i = 1; i < 98; i += 2) {
			sum += i / (i + 2.0);
		}

		// formatiramo i ispisujemo zbir serije
		System.out.printf("Zbir serije: %2.3f", sum);

	}

}
