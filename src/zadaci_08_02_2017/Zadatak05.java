package zadaci_08_02_2017;

import java.util.Scanner;

public class Zadatak05 {

	public static void main(String[] args) {

		// kreiramo novi scanner objekat
		Scanner input = new Scanner(System.in);

		int number = -1;
		int max = 0;
		int counter = 0;

		// petlja radi dok ne unesemo 0
		while (number != 0) {
			// boolean varijabla koja ce kontrolisati petlju
			boolean wrongUserInput = true;

			// petlja radi dok je unos korisnika pogresan
			while (wrongUserInput) {
				try {
					// uzimamo unos od korisnika
					System.out
							.print("Unesite cijeli broj (unos završava kada unesete 0): ");
					number = input.nextInt();

					// postavima boolean na false da bi izasli iz petlje
					wrongUserInput = false;
				} catch (Exception ex) {
					// ako je uhvacen exception ispisujemo odgovarajucu poruku
					System.out
							.println("Pogresan unos. Morate unijeti cijeli broj.");
					input.nextLine();
				}
			}

			// ako je uneseni broj veci od trenutno najveceg broja, trenutni
			// najveci broj postaje uneseni broj i brojac postavljamo na 1, a
			// ukoliko je uneseni broj jednak trenutno najvecem broju brojac
			// povecavamo za 1
			if (max < number) {
				max = number;
				counter = 1;
			} else if (max == number) {
				counter++;
			}
		}

		// zatvaramo scanner
		input.close();

		// ispisujemo najveci broj i broj ponavljanja najveceg broja
		System.out.println("Najveci broj je " + max + " i ponavlja se "
				+ counter + " puta.");

	}

}
