package zadaci_11_02_2017;

import java.util.Scanner;

public class Zadatak02 {

	public static void main(String[] args) {

		/*
		 * ISBN-10 (International Standard Book Number) se sadrži od 10 brojeva:
		 * d1 d2 d3 d4 d5 d6 d7 d8 d9 d10. Posljednji broj, d10, služi kao
		 * checksum i njega izraèunavamo iz prvih devet brojeva koristeæi se
		 * sljedeæom formulom: (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6
		 * * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11. Ukoliko je checksum 10, zadnji
		 * broj oznaèavamo sa X u skladu sa ISBN-10 konvencijom. Napisati
		 * program koji pita korisnika da unese prvih 9 brojeva te ispiše
		 * desetocifreni ISBN-10 broj. (Primjer: ukoliko unesemo, kao prvih 9
		 * brojeva, 013601267 program nam ispisuje 0136012671 kao ISBN-10 broj.
		 * Ukoliko unesemo 013031997 kao prvih 9 brojeva, program nam ispisuje
		 * 013031997X kao ISBN-10 broj)
		 */

		// novi scanner
		Scanner input = new Scanner(System.in);

		// boolean varijabla koja kontrolise petlju
		boolean wrongUserInput = true;
		String sNumber = "", isbn10 = "";
		int n = 1, checksum = 0;

		// petlja radi sve dok je unos korisnika pogresan
		while (wrongUserInput) {
			// uzimamo unos od korisnika
			System.out.print("Unesite prvih 9 brojeva ISBN-10: ");
			sNumber = input.next();

			// postavljamo boolean na false da bi izasli iz petlje ako je unos
			// ispravan
			wrongUserInput = false;

			if (sNumber.length() != 9) {
				// provjeravamo da li unijeti string ima tacno 9 karaktera, ako
				// nema, ispisujemo odgovarajucu poruku i postavljamo boolean
				// vrijednost na false
				System.out
						.println("Neispravan unos. Morate unijeti 9 brojeva.");
				wrongUserInput = true;
			} else if (!isDigits(sNumber)) {
				// pozivamo metodu koja provjerava jesu li svi karakteri u stringu brojevi
				System.out
						.println("Neispravan unos. Morate unijeti 9 brojeva.");
				wrongUserInput = true;
			}
		}
		
		// zatvaramo scanner
		input.close();
		
		for (int i = 0; i < sNumber.length(); i++) {
			// pretvaramo svaki karakter u int
			int digit = Integer.parseInt(sNumber.charAt(i) + "");
			
			// cifru broja mnozimo sa n i sabiramo sa checksum
			checksum += digit * n;
			
			// povecavamo n za 1
			n++;
		}
		
		checksum = checksum % 11;
		
		if (checksum == 10) {
			// ako je checksum jednak 10, dodajemo X kao 10-tu cifru ISBN-10 broja
			isbn10 = sNumber + "X";
		} else {
			isbn10 = sNumber + checksum;
		}
		
		// ispisujemo ISBN-10 broj
		System.out.println("ISBN-10 broj: " + isbn10);

	}
	
	// metoda koja provjerava da li su svi karakteri stringa brojevi
	public static boolean isDigits(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i))) {
				return false;
			}
		}

		return true;
	}

}
