package zadaci_11_02_2017;

import java.util.Scanner;

public class Zadatak01 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji pita korisnika da unese neki cijeli broj te
		 * ispisuje njegove najmanje faktore u rastuæem redosljedu. Na primjer,
		 * ukoliko korisnik unese 120 program treba da ispiše 2, 2, 2, 3, 5. (2
		 * * 2 * 2 * 3 * 5 = 120)
		 */

		// novi scanner
		Scanner input = new Scanner(System.in);

		// boolean varijabla koja ce kontrolisati petlju
		boolean wrongUserInput = true;
		int number = 0;

		// petlja radi dok je unos korisnika pogresan
		while (wrongUserInput) {
			try {
				// uzimamo unos od korisnika
				System.out.print("Unesite cijeli broj veci od 1: ");
				number = input.nextInt();

				// postavljamo boolean na false da bi izasli iz petlje
				wrongUserInput = false;

				if (number < 2) {
					// ako je broj manji od 2 ispisujemo odgovarajucu poruku
					System.out
							.println("Pogresan unos. Morate unijeti cijeli broj veci od 1.");
					wrongUserInput = true;
				}
			} catch (Exception ex) {
				// ako je uhvacen exception ispisujemo odgovarajucu poruku
				System.out
						.println("Pogresan unos. Morate unijeti cijeli broj veci od 1.");
				input.nextLine();
			}
		}

		// zatvaramo scanner
		input.close();

		// broj sa kojim cemo dijeliti unijeti broj, stavljamo mu pocetnu
		// vrijednost na 2
		int divisor = 2;

		System.out.print("Najmanji faktori broja " + number + " su: ");

		// petlja radi dok je broj veci od 1
		while (number > 1) {
			// provjeravamo da li je broj djeljiv sa trenutnim divisorom, ako
			// jest ispisujemo divisor a broj podijelimo sa divisorom
			if (number % divisor == 0) {
				System.out.print(divisor + ", ");
				number = number / divisor;
			} else {
				// ako broj nije djeljiv sa trenutnim divisorom, divisor
				// povecamo za 1
				divisor++;
			}
		}

	}

}
