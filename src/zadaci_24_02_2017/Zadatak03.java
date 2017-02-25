package zadaci_24_02_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.ShortUserInput;

public class Zadatak03 {

	public static void main(String[] args) {

		/*
		 * U javi, short vrijednost se sprema u samo 16 bita. Napisati program
		 * koji pita korisnika da unese short broj te mu ispiše svih 16 bita za
		 * dati cijeli broj. Na primjer, ukoliko korisnik unese broj 5 - program
		 * mu ispisuje 0000000000000101
		 */

		Scanner input = new Scanner(System.in);

		// uzimamo unos short broja od korisnika
		short number = ShortUserInput.getShort(input, "Unesite pozitivan short broj: ", 0);
		
		input.close();

		// ispisujemo odgovarajuci binarni broj
		System.out.printf("\nBinarni broj: %016d",
				Long.parseLong(Integer.toBinaryString(number)));

	}

}
