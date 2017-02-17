package zadaci_17_02_2017;

import java.util.Scanner;

public class Zadatak05 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji pita korisnika da unese dva stringa te
		 * provjerava i ispisuje da li je drugi string substring prvog stringa.
		 * Na primjer, ukoliko korisnik unese ABCD kao prvi string a BC kao
		 * drugi string program mu ispisuje da je BC substring ABCD stringa.
		 */

		// novi scanner
		Scanner input = new Scanner(System.in);

		// uzimamo unos od korisnika
		System.out.print("Unesite prvi string: ");
		String str1 = input.nextLine();
		System.out.print("Unesite drugi string: ");
		String str2 = input.nextLine();

		// zatvaramo scanner
		input.close();

		if (str1.contains(str2)) {
			// ako prvi string sadrzi drugi string ispisujemo odgovarajucu
			// poruku
			System.out.println("'" + str2 + "' je substring '" + str1
					+ "' stringa.");
		} else {
			System.out.println("String '" + str2 + "' nije substring '" + str1
					+ "' stringa.");
		}

	}

}
