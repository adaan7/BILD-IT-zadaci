package zadaci_10_02_2017;

import java.util.Scanner;

public class Zadatak03 {

	public static void main(String[] args) {

		/*
		 * Nizovi niz1 i niz2 su striktno identièni ukoliko su svi njihovi
		 * elementi na istim pozicijama jednaki. Napisati metodu koja vraæa true
		 * ukoliko su nizovi niz1 i niz2 striktno identièni. Koristiti sljedeæi
		 * header:
		 * 
		 * public static boolean equals(int[ ] niz1, int[ ] niz2)
		 * 
		 * Napisati testni program koji pita korisnika da unese dva niza cijelih
		 * brojeva te provjerava da li su striktno identièni.
		 */

		// kreiramo novi scanner objekat
		Scanner input = new Scanner(System.in);

		// uzimamo unos od korisnika te odredjujemo velicinu niza
		int[] array1 = new int[getIntUserInput(input)];

		System.out.print("Potrebno je da unesete " + array1.length
				+ " elemenata prvog niza\n");
		
		// uzimamo unos niza integera od korisnika
		array1 = getIntArrayUserInput(input, array1.length);

		// uzimamo unos od korisnika te odredjujemo velicinu niza
		int[] array2 = new int[getIntUserInput(input)];

		System.out.print("Potrebno je da unesete " + array2.length
				+ " elemenata drugog niza\n");
		
		// uzimamo unos niza integera od korisnika
		array2 = getIntArrayUserInput(input, array2.length);

		// zatvaramo scanner
		input.close();

		// ispisujemo da li dva niza striktno identicna
		System.out.println("\nDva niza su striktno identicna: "
				+ equals(array1, array2));

	}

	// metoda koja provjerava da li su dva niza striktno identicna
	public static boolean equals(int[] array1, int[] array2) {
		// ako dva niza nemaju istu velicinu, vracamo false
		if (array1.length != array2.length) {
			return false;
		}

		// poredimo svaki elemenat niza i vracamo false ako nisu isti
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}

		return true;
	}

	// metoda koja uzima unos integera od korisnika
	public static int getIntUserInput(Scanner input) {
		boolean wrongUserInput = true;
		int number = 0;

		while (wrongUserInput) {
			try {
				System.out.print("Unesite velicinu niza: ");
				number = input.nextInt();

				wrongUserInput = false;

				if (number < 1) {
					System.out
							.println("Pogresan unos. Morate unijeti cijeli broj veci od 0.");
					wrongUserInput = true;
				}
			} catch (Exception ex) {
				System.out
						.println("Pogresan unos. Morate unijeti cijeli broj veci od 0.");
				input.nextLine();
			}
		}

		return number;
	}
	
	// metoda koja uzima unos niza integera od korisnika
	public static int[] getIntArrayUserInput(Scanner input, int arrayLength) {
		int[] numbers = new int[arrayLength];

		for (int i = 0; i < numbers.length; i++) {
			boolean wrongUserInput = true;
			int number = 0;

			while (wrongUserInput) {
				try {
					System.out.print("Unesite broj: ");
					number = input.nextInt();

					wrongUserInput = false;
				} catch (Exception ex) {
					System.out
							.println("Pogresan unos. Morate unijeti cijeli broj.");
					input.nextLine();
				}
			}

			numbers[i] = number;
		}

		return numbers;
	}

}
