package zadaci_08_02_2017;

import java.util.Scanner;

public class Zadatak03 {

	public static void main(String[] args) {

		// kreiramo scanner objekat
		Scanner input = new Scanner(System.in);

		// uzimamo unos od korisnika
		System.out.print("Unesite prvi broj: ");
		int num1 = input.nextInt();
		System.out.print("Unesite drugi broj: ");
		int num2 = input.nextInt();

		// zatvaramo scanner
		input.close();

		// ispisujemo najveci zajednicki djelilac za unesene brojeve
		System.out.println("Najveci zajednicki djelilac brojeva " + num1
				+ " i " + num2 + " je: " + gcd(num1, num2));

	}

	public static int gcd(int num1, int num2) {
		int gcd = 1;

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

}
