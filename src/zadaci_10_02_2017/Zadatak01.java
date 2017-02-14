package zadaci_10_02_2017;

public class Zadatak01 {

	public static void main(String[] args) {

		/*
		 * Napisati metodu koja prima 2 argumenta: poèetni broj i krajnji broj
		 * te printa sve proste brojeve u zadanom rangu. BONUS: metoda moe
		 * primati i treæi argument, broj brojeva za isprintati po liniji.
		 */

		// pozivamo metodu koja ispisuje proste brojeve
		printPrimeNumbers(1, 100, 10);

	}

	// metoda koja prima pocetni broj, krajnji broj i broj brojeva po liniji, te
	// ispisuje proste brojeve u datom rangu
	public static void printPrimeNumbers(int firstNum, int lastNum,
			int numbersPerLine) {
		int counter = 0;
		
		// ako su uneseni argumenti negativni, pretvorimo ih u pozitivne
		firstNum = Math.abs(firstNum);
		lastNum = Math.abs(lastNum);
		numbersPerLine = Math.abs(numbersPerLine);
		
		// ako je prvi broj veci od drugog, zammijenimo im mjesta
		if (firstNum > lastNum) {
			int temp = firstNum;
			firstNum = lastNum;
			lastNum = temp;
		}

		for (int number = firstNum; number <= lastNum; number++) {
			// pozivamo metodu koja provjerava je li broj prost, ako jeste
			// ispisujemo ga
			if (isPrime(number)) {
				System.out.print(number + " ");
				counter++;

				// ako je brojac jednak odredjenom broju, prelazimo u novi red
				if (counter == numbersPerLine) {
					System.out.println();
					counter = 0;
				}
			}
		}
	}

	// metoda koja vraca true ako je broj prost ili false ako nije
	public static boolean isPrime(int number) {
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

}
