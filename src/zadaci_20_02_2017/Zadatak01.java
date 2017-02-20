package zadaci_20_02_2017;

public class Zadatak01 {

	public static void main(String[] args) {

		/*
		 * Pretpostavimo da se registarska tablica za auto sastoji od tri
		 * uppercase karaktera i 4 broja u sljedeæem formatu AAA-1234. Napisati
		 * program koji nasumièno generiše tablicu.
		 */

		System.out.print("Registarska tablica: ");

		for (int i = 0; i < 3; i++) {
			// generisemo random uppercase karakter (po ASCII od 65 do 90)
			char randomUppercaseChar = (char) ((int) (Math.random() * 26 + 65));

			// ispisujemo karakter
			System.out.print(randomUppercaseChar);
		}

		System.out.print("-");

		for (int i = 0; i < 4; i++) {
			// generisemo random integer od 0 do 9
			int randomNum = (int) (Math.random() * 10);

			// ispisujemo random integer
			System.out.print(randomNum);
		}

	}

}
