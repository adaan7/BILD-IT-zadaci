package zadaci_21_02_2017;

public class Zadatak03 {

	public static void main(String[] args) {

		/*
		 * Emirp brojevi (prime unazad) je nepalindromski prosti broj koji je
		 * prosti broj i kada ispišemo naopako. Na primjer, broj 17 i broj 71 su
		 * prosti brojevi tako da su brojevi i 17 i 71 emirp brojevi. Napisati
		 * program koji ispisuje prvih 100 emirp brojeva, 10 brojeva po liniji.
		 */

		int counter = 0;
		int number = 2;

		while (counter < 100) {
			if (isEmirp(number)) {
				// provjeravamo da li je broj emirp i ako jeste, ispisujemo taj
				// broj
				System.out.printf("%4d ", number);
				counter++;

				if (counter % 10 == 0) {
					// kada je brojac djeljiv sa 10, prelazimo u novi red
					System.out.println();
				}
			}

			number++;
		}

	}

	// metoda koja provjerava da li je broj emirp
	public static boolean isEmirp(int number) {
		if (isPrime(number) && isPrime(reverse(number))
				&& !isPalindrome(number)) {
			return true;
		}

		return false;
	}

	// metoda koja provjerava da li je broj prost
	public static boolean isPrime(int number) {
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

	// metoda koja vraca broj naopako
	public static int reverse(int number) {
		String sReverseNumber = "";

		while (number != 0) {
			sReverseNumber += number % 10;

			number /= 10;
		}

		return Integer.parseInt(sReverseNumber);
	}

	// metoda koja provjerava da li je broj palindrom
	public static boolean isPalindrome(int number) {
		if (number != reverse(number)) {
			return false;
		}

		return true;
	}

}
