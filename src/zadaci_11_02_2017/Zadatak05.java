package zadaci_11_02_2017;

import java.util.Scanner;

public class Zadatak05 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji uèitava neodreðeni broj cijelih brojeva (nula
		 * prekida unos) te ispisuje koliko je brojeva bilo iznad ili jednako
		 * prosjeku svih unešenih brojeva a koliko je bilo brojeva ispod
		 * prosjeka. Pretpostavimo da je maksimalan niz brojeva koje korisnik
		 * može unijeti 100.
		 */

		// novi scanner
		Scanner input = new Scanner(System.in);

		// novi niz od 100 integera
		int[] tempNumbers = new int[100];

		int number = -1, counter = 0, countBellowAverage = 0;
		double sum = 0, average = 0;

		// petlja radi dok se ne unese 0
		while (number != 0) {
			// boolean varijabla koja ce kontrolisati petlju
			boolean wrongUserInput = true;
			
			// petlja radi dok je unos korisnika pogresan
			while (wrongUserInput) {
				try {
					// uzimamo unos od korisnika
					System.out.print("Unesite cijeli broj: ");
					number = input.nextInt();
					
					// postavljamo boolean na false da bi izasli iz petlje
					wrongUserInput = false;
				} catch (Exception ex) {
					// ukoliko je uhvacen exception ispisujemo odgovarajucu poruku
					System.out
					.println("Pogresan unos. Morate unijeti cijeli broj.");
					input.nextLine();
				}				
			}

			// ako je broj razlicit od nule, broj ubacujemo u niz
			if (number != 0) {
				tempNumbers[counter] = number;
				sum += number;
				// povecavamo brojac za 1
				counter++;
			}
		}

		// zatvaramo scanner
		input.close();

		// izracunamo prosjek
		average = sum / counter;

		// novi niz integera koje korisnik unese
		int[] numbers = new int[counter];

		for (int i = 0; i < numbers.length; i++) {
			// ubacujemo unesene brojeve u niz iz privremenog niza
			numbers[i] = tempNumbers[i];

			if (numbers[i] < average) {
				// povecavamo brojac za jedan ako je broj ispod prosjeka
				countBellowAverage++;
			}
		}

		// ispisujemo prosjek brojeva
		System.out.println("Prosjek brojeva: " + average);
		// ispisujemo broj brojeva koji su iznad ili jednaki prosjeku
		System.out.println("Brojeva iznad ili jednako prosjeku: "
				+ (counter - countBellowAverage));
		// ispisujemo broj brojeva koji su ispod prosjeka
		System.out.println("Brojeva ispod prosjeka: " + countBellowAverage);

	}

}
