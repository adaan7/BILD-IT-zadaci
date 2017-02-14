package zadaci_14_02_2017;

import java.util.Scanner;

public class Zadatak04 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji pita korisnika da unese neki string te mu
		 * ispisuje sve karaktere koji se nalaze na neparnim pozicijama. Na
		 * primjer, ako korisnik unese string Beijing Chicago, program vraæa
		 * BiigCiao.
		 */
		
		Scanner input = new Scanner(System.in);
		
		// uzimamo unos od korisnika
		System.out.print("Unesite string: ");
		String s = input.nextLine();
		
		// zatvaramo scanner
		input.close();
		
		for (int i = 0; i < s.length(); i++) {
			// ako se karakter nalazi na neparnom mjestu, ispisujemo ga
			if (i % 2 == 0) {
				System.out.print(s.charAt(i));
			}
		}

	}

}
