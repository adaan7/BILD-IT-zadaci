package zadaci_17_02_2017;

import java.util.Scanner;

public class Zadatak04 {

	public static void main(String[] args) {

		/*
		 * Napisati metodu koja pronalazi broj ponavljanja odreðenog karaktera u
		 * stringu. Metoda treba da koristi sljedeæi header: public static int
		 * count(String str, char a). Na primjer, ukoliko pozovemo metodu na
		 * sljedeæi naèin: count("Welcome", e) metoda treba da vrati 2. Napisati
		 * program koji pita korisnika da unese string i koji karakter želi da
		 * prebroji u datom stringu te mu ispiše koliko se puta odreðeni
		 * karakter ponovio u zadatom stringu.
		 */

		Scanner input = new Scanner(System.in);

		// uzimamo unos od korisnika
		System.out.print("Unesite string: ");
		String str = input.nextLine();

		boolean wrongCharInput = true;
		String sChar = "";

		while (wrongCharInput) {
			System.out.print("Unesite karakter koji zelite da prebrojite: ");
			sChar = input.nextLine();

			wrongCharInput = false;

			// ako korisnik unese vise od 1 karaktera, ispisujemo odgovarajucu
			// poruku i pitamo ga za novi unos
			if (sChar.length() != 1) {
				System.out
						.println("Pogresan unos. Morate unijeti jedan karakter.");
				wrongCharInput = true;
			}
		}

		input.close();

		char ch = sChar.charAt(0);

		// ispisujemo broj ponavljanja karaktera
		System.out.println("\nKarakter '" + ch + "' se ponavlja "
				+ count(str, ch) + " puta u unesenom stringu.");

	}

	// metoda koja vraca broj ponavljanja karaktera u stringu
	public static int count(String str, char a) {
		int counter = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a) {
				counter++;
			}
		}

		return counter;
	}

}
