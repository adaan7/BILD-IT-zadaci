package zadaci_12_02_2017;

import java.util.Scanner;

public class Zadatak03 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji pita korisnika da unese 2 stringa te ispisuje
		 * najveæi zajednièki prefix za ta dva stringa, ukoliko isti postoji. Na
		 * primjer, ukoliko korisnik unese sljedeæa dva stringa
		 * "Dobrodošli u Dubai" i "Dobrodošli u Vankuver" program treba da
		 * ispiše: Najveæi zajednièki prefix za dva stringa je "Dobrodošli u".
		 */

		// novi scanner
		Scanner input = new Scanner(System.in);

		// uzimamo unos od korisnika
		System.out.print("Unesite prvi string: ");
		String s1 = input.nextLine();
		System.out.print("Unesite drugi string: ");
		String s2 = input.nextLine();

		// zatvaramo scanner
		input.close();
		
		// nadjemo manji string
		String shortestString = (s1.length() < s2.length()) ? s1 : s2;

		int indexOfDifferentChars = 0;

		// prolazimo petljom kroz string i kada dodjemo do karaktera koji je
		// razlicit u dva stringa, index tog karaktera dodjeljujemo varijabli i
		// izlazimo iz petlje
		for (int i = 0; i < shortestString.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				indexOfDifferentChars = i;
				break;
			} else {
				// ako ne nadje razlicit karakter, varijabli dodijelimo duzinu
				// stringa kroz koji prolazimo
				indexOfDifferentChars = shortestString.length();
			}
		}

		// ako dva stringa nemaju zajednièki prefix, ispisujemo odgovarajucu
		// poruku, a ako imaju ispisujemo taj prefix
		if (indexOfDifferentChars == 0) {
			System.out.println("Dva stringa nemaju zajednicki prefix.");
		} else {
			System.out.println("Najveci zajednicki prefix za dva stringa je: "
					+ shortestString.substring(0, indexOfDifferentChars));
		}

	}

}
