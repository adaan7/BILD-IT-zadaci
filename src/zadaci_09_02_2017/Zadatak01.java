package zadaci_09_02_2017;

public class Zadatak01 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji ispisuje sve prestupne godine, 10 po liniji, od
		 * godine 101 do 2100, odvojene jednim spaceom. Takoðer ispisati i
		 * ukupan broj prijestupnih godina u ovom vremenskom periodu.
		 */

		int firstYear = 101, lastYear = 2100, counter = 0;

		for (int year = firstYear; year <= lastYear; year++) {
			// ispisujemo godinu koja je djeljiva sa 4 ali ne i sa 100 ili ako
			// je djeljiva sa 400
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.printf("%4s ", year);
				// brojimo prijestupne godine
				counter++;

				// ako je broj prijestupnih godina djeljiv sa 10, prelazimo u
				// novi red
				if (counter % 10 == 0) {
					System.out.println();
				}
			}
		}

		// ispisujemo broj prijestupnih godina
		System.out.println("\n\nBroj prijestupnih godina: " + counter);

	}

}
