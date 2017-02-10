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
		System.out.print("Unesite velicinu prvog niza: ");
		int[] array1 = new int[input.nextInt()];

		// uzimamo unos od korisnika
		System.out
				.print("Unesite " + array1.length + " elemenata prvog niza: ");
		for (int e : array1) {
			array1[e] = input.nextInt();
		}

		// uzimamo unos od korisnika te odredjujemo velicinu niza
		System.out.print("\nUnesite velicinu drugog niza: ");
		int[] array2 = new int[input.nextInt()];

		// uzimamo unos od korisnika
		System.out.print("Unesite " + array2.length
				+ " elemenata drugog niza: ");
		for (int e : array2) {
			array2[e] = input.nextInt();
		}

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

}
