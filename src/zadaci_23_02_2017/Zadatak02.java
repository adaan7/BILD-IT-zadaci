package zadaci_23_02_2017;

import java.util.Scanner;

public class Zadatak02 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji pita korisnika da unese neki string te mu
		 * ispisuje dužinu tog stringa kao i prvo slovo stringa.
		 */

		Scanner input = new Scanner(System.in);

		// uzimamo unos od korisnika
		System.out.print("Unesite string: ");
		String s = input.nextLine();

		input.close();

		// ispisujemo duzinu stringa i prvo slovo
		System.out.println("\nDuzina unesenog stringa je: " + s.length());
		// pozivamo metodu koja vraca prvo slovo stringa i ispisujemo ga, ako
		// metoda vrati 0, ispisujemo da string nema slova
		System.out
				.println(((getFirstLetter(s) != '0') ? "Prvo slovo unesenog stringa je: "
						+ getFirstLetter(s)
						: "Uneseni string nema slova."));

	}

	// metoda koja vraca prvo slovo stringa, ako string nema slova metoda vraca
	// karakter 0
	public static char getFirstLetter(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				return s.charAt(i);
			}
		}

		return '0';
	}

}
