package zadaci_09_02_2017;

public class Zadatak05 {

	public static void main(String[] args) {

		/*
		 * Napisati metodu koja prima jedan argument te simulira bacanje nov�i�a
		 * toliko puta. Nakon �to se simulacija zavr�i, program ispisuje koliko
		 * puta je nov�i� pokazao glavu a koliko puta pismo.
		 */

		// pozivamo metodu
		simulateHeadOrTails(100);

	}

	public static void simulateHeadOrTails(int n) {
		int counter = 0, countHead = 0;

		// prolazimo petljom n puta
		while (counter < n) {
			// generi�emo random integer 0 ili 1 gdje 0 predstavlja glavu a 1
			// pismo
			int randomNumber = (int) (Math.random() * 2);

			// ako je random integer 0, brojac koji broji glavu pove�avamo za 1
			if (randomNumber == 0) {
				countHead++;
			}

			// pove�avamo broja� za 1
			counter++;
		}

		// ispisujemo broj poku�aja, broj nov�i�a koji je pokazao glavu i broj
		// nov�i�a koji je pokazao pismo
		System.out.println("Broj bacanja nov�i�a " + counter);
		System.out.println("Glava: " + countHead);
		System.out.println("Pismo: " + (counter - countHead));
	}

}
