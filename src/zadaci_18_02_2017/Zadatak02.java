package zadaci_18_02_2017;

public class Zadatak02 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji ispisuje sve proste brojeve od 2 do 1000,
		 * ukljuæujuæi i 2 i 1000. Program treba da ispiše 8 brojeva po liniji
		 * te razmak izmeðu brojeva treba da bude jedan space.
		 */

		int counter = 0;

		for (int number = 2; number <= 1000; number++) {
			if (isPrime(number)) {
				// provjeravamo da li je broj prost, ako jeste, ispisujemo taj
				// broj i povecavamo brojac za 1
				System.out.printf("%3d ", number);
				counter++;

				// kada je brojac jednak 8, prelazimo u novi red i resetujemo
				// brojac na 0
				if (counter == 8) {
					System.out.println();
					counter = 0;
				}
			}
		}

	}

	// metoda koja provjerava da li je broj prost
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}

		return true;
	}

}
