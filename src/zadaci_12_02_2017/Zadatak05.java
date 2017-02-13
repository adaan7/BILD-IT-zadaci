package zadaci_12_02_2017;

import java.util.Scanner;

public class Zadatak05 {

	public static void main(String[] args) {

		/*
		 * Napisati metodu koja broji slova u stringu. Metoda treba koristiti
		 * sljedeæi header: public static int countLetters(String s). Napisati
		 * program koji pita korisnika da unese neki string te mu vrati koliko
		 * taj string ima slova.
		 */
		
		// novi scanner
		Scanner input = new Scanner(System.in);
		
		// uzimamo unos od korisnika
		System.out.print("Unesite neki string: ");
		String s = input.nextLine();
		
		// zatvaramo scanner
		input.close();
		
		// ispisujemo broj slova u stringu
		System.out.println("Broj slova u unesenom stringu: " + countLetters(s));
		
	}
	
	// metoda koja broji slova u stringu
	public static int countLetters(String s) {
		int counter = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				counter++;
			}
		}
		
		return counter;
	}

}
