package zadaci_08_02_2017;

import java.util.Scanner;

public class Zadatak02 {

	public static void main(String[] args) {

		// kreiramo novi scanner objekat
		Scanner input = new Scanner(System.in);

		// uzimamo unos od korisnika
		System.out.print("Unesite string: ");
		String s = input.nextLine();

		// zatvaramo scanner
		input.close();

		// pretvaramo uneseni string u velika slova
		s = s.toUpperCase();

		// pravimo novi string u kojem uklanjamo prazna mjesta unesenog stringa
		String s1 = s.replace(" ", "");

		// pravimo novi string u kojem uklanjamo sve samoglasnike unesenog
		// stringa
		String s2 = s1.replaceAll("A|E|I|O|U", "");

		// ispisujemo broj samoglasnika i suglasnika
		System.out.println("Broj samoglasnika: " + (s1.length() - s2.length()));
		System.out.println("Broj suglasnika: " + s2.length());

	}

}
