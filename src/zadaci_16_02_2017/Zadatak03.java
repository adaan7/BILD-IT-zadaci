package zadaci_16_02_2017;

public class Zadatak03 {

	public static void main(String[] args) {

		/*
		 * Napišite program koji ispisuje sve brojeve, od 100 do 1000, 10
		 * brojeva po liniji, koji su djeljivi i sa 5 i sa 6. Razmak izmeðu
		 * brojeva treba biti taèno jedan space.
		 */

		int counter = 0;

		System.out
				.println("Brojevi od 100 do 1000 koji su djeljivi i sa 5 i sa 6:\n");

		for (int i = 100; i < 1000; i++) {
			if (i % 5 == 0 && i % 6 == 0) {
				// ispisujemo broj ako je djeljiv i sa 5 i sa 6
				System.out.print(i + " ");
				// povecavamo brojac za 1
				counter++;

				if (counter == 10) {
					// ako je brojac jednak 10, prelazimo u novi red i
					// resetujemo brojac na 0
					System.out.println();
					counter = 0;
				}
			}
		}

	}

}
