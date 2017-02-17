package zadaci_17_02_2017;

public class Zadatak02 {

	public static void main(String[] args) {

		/*
		 * Twin prime brojevi su par prostih brojeva koji se razlikuju za 2. Na
		 * primjer, brojevi 3 i 5 su twin primes, brojevi 5 i 7 i 11 i 13 su
		 * takoðer twin primes. Napisati program koji ispisuje sve twin prime
		 * brojeve manje od 10000, 10 parova po liniji.
		 */

		int number = 2;
		int counter = 0;

		while (number < 10000) {
			if (isPrime(number) && isPrime(number + 2)) {
				// ako je broj prost i broj veci za 2 od tog broja prost,
				// ispisujemo oba broja
				System.out.printf("(%4d, %-4d)", number, (number + 2));
				counter++;

				// ako je brojac jednak 10, prelazimo u novi red i resetujemo
				// brojac na 0
				if (counter == 10) {
					System.out.println();
					counter = 0;
				}
			}
			number++;
		}

	}

	// metoda koja vraca true ako je broj prost
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}
		return true;
	}

}
