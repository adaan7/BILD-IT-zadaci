package zadaci_08_02_2017;

import java.util.Scanner;

public class Zadatak03 {

	public static void main(String[] args) {

		// kreiramo scanner objekat
		Scanner input = new Scanner(System.in);

		// pozivamo metodu koja uzima unos od korisnika i dodijelimo ga int
		// varijabli
		int num1 = getIntUserInput(input);
		int num2 = getIntUserInput(input);

		// zatvaramo scanner
		input.close();

		// ispisujemo najveci zajednicki djelilac za unesene brojeve
		System.out.println("Najveci zajednicki djelilac brojeva " + num1
				+ " i " + num2 + " je: " + gcd(num1, num2));

	}

	public static int gcd(int num1, int num2) {
		int gcd = 1;

		num1 = Math.abs(num1);
		num2 = Math.abs(num2);

		for (int i = 2; i <= num1 && i <= num2; i++) {
			// posljednji broj sa kojim su i prvi i drugi broj djeljivi je
			// najveci zajednicki djelilac ta dva broja
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}

		// vraæamo najveæi zajednièki djelilac
		return gcd;
	}

	// metoda koja uzima unos od korisnika
	public static int getIntUserInput(Scanner input) {
		// boolean varijabla koja ce kontrolisati petlju
		boolean wrongUserInput = true;
		int number = 0;

		// petlja radi dok je unos korisnika pogresan
		while (wrongUserInput) {
			try {
				// uzimamo unos od korisnika
				System.out.print("Unesite broj: ");
				number = input.nextInt();

				// postavljamo boolean na false da bi izasli iz petlje
				wrongUserInput = false;
			} catch (Exception ex) {
				// ako je uhvacen exception ispisujemo odgovarajucu poruku
				System.out
						.println("Pogresan unos. Morate unijeti cijeli broj.");
				input.nextLine();
			}
		}

		// vracamo int
		return number;
	}

}
