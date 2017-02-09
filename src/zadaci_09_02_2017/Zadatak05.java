package zadaci_09_02_2017;

public class Zadatak05 {

	public static void main(String[] args) {

		/*
		 * Napisati metodu koja prima jedan argument te simulira bacanje novèiæa
		 * toliko puta. Nakon što se simulacija završi, program ispisuje koliko
		 * puta je novèiæ pokazao glavu a koliko puta pismo.
		 */

		// pozivamo metodu
		simulateHeadOrTails(100);

	}

	public static void simulateHeadOrTails(int n) {
		int counter = 0, countHead = 0;

		// prolazimo petljom n puta
		while (counter < n) {
			// generišemo random integer 0 ili 1 gdje 0 predstavlja glavu a 1
			// pismo
			int randomNumber = (int) (Math.random() * 2);

			// ako je random integer 0, brojac koji broji glavu poveæavamo za 1
			if (randomNumber == 0) {
				countHead++;
			}

			// poveæavamo brojaè za 1
			counter++;
		}

		// ispisujemo broj pokušaja, broj novèiæa koji je pokazao glavu i broj
		// novèiæa koji je pokazao pismo
		System.out.println("Broj bacanja novèiæa " + counter);
		System.out.println("Glava: " + countHead);
		System.out.println("Pismo: " + (counter - countHead));
	}

}
