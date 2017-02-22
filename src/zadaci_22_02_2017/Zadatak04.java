package zadaci_22_02_2017;

public class Zadatak04 {

	public static void main(String[] args) {

		/*
		 * Napisati metodu koja izraèunava zbir svih brojeva u cijelom broju.
		 * Koristite sljedeæi header: public static int sumDigits(long n). Na
		 * primjer, ako pozovemo metodu i proslijedimo joj broj 234
		 * (sumDigits(234)) metoda treba da vrati 9. (2 + 3 + 4 = 9)
		 */

		long n = -234;

		// ispisujemo sumu cifara broja
		System.out
				.println("Suma cifara broja " + n + " iznosi " + sumDigits(n));

	}

	// metoda koja vraca zbir cifara broja
	public static int sumDigits(long n) {
		n = Math.abs(n);

		String sN = n + "";
		int sum = 0;

		for (int i = 0; i < sN.length(); i++) {
			int digit = Integer.parseInt(sN.charAt(i) + "");

			sum += digit;
		}

		return sum;
	}

}
