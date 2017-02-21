package zadaci_21_02_2017;

public class Zadatak04 {

	public static void main(String[] args) {

		/*
		 * Palindrome prime je prosti broj koji je takoðer i palindrom. Na
		 * primjer, 131 je palindrome prime, kao i brojevi 313 i 757. Napisati
		 * program koji ispisuje prvih 100 palindrome prime brojeva, 10 brojeva
		 * po liniji.
		 */

		int counter = 0;
		int number = 2;

		while (counter < 100) {
			if (isPalindromePrime(number)) {
				// provjeravam da li je broj palindrom i prost i ako jeste,
				// ispisujemo ga
				System.out.printf("%5d ", number);
				counter++;

				if (counter % 10 == 0) {
					// kada je brojac djeljiv sa 10, prelazimo u novi red
					System.out.println();
				}
			}

			number++;
		}

	}

	// metoda koja provjerava da li je broj prost i palindrom
	public static boolean isPalindromePrime(int number) {
		if (isPalindrome(number) && isPrime(number)) {
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

	// metoda koja provjerava da li je broj palindrom
	public static boolean isPalindrome(int number) {
		if (number != reverse(number)) {
			return false;
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

}
