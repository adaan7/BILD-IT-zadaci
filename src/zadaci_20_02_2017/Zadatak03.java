package zadaci_20_02_2017;

public class Zadatak03 {

	public static void main(String[] args) {

		/*
		 * Napisati metodu sa sljedeæim headerom: public static int isPrime(int
		 * n) koja provjerava da li je broj prost/prime. Napsati test program
		 * koji poziva ovu metodu i ispisuje sve proste brojeve u rasponu od 0
		 * do 100000.
		 */

		int counter = 0;

		for (int number = 0; number < 100000; number++) {
			if (isPrime(number) == 1) {
				// provjeravamo da li je broj prost i ispisujemo ga ako jeste
				System.out.printf("%5d ", number);
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

	// metoda koja provjerava da li je broj prost i vraca 1 ako jeste a 0 ako
	// nije
	public static int isPrime(int n) {
		for (int divisor = 2; divisor <= n / 2; divisor++) {
			if (n % divisor == 0) {
				return 0;
			}
		}

		if (n == 0 || n == 1) {
			return 0;
		}

		return 1;
	}

}
