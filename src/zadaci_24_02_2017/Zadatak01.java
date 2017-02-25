package zadaci_24_02_2017;

import java.util.Scanner;

import week_3_project_tic_tac_toe.UserInput;

public class Zadatak01 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji prima ASCII kod (cijeli broj izmeðu 0 i 127) te
		 * ispisuje koji je to karakter. Na primjer, ukoliko korisnik unese 69
		 * kao ASCII kod, program mu ispisuje da je karakter sa tim brojem
		 * karakter E.
		 */

		Scanner input = new Scanner(System.in);

		// uzimamo unos od korisnika
		int number = UserInput
				.getInt(input,
						"Unesite cijeli broj izmedju 0 i 127 koji predstavlja ASCII kod: ",
						0, 127);

		// zatvaramo scanner
		input.close();

		// ispisujemo broj i ispisujemo odgovarajuci karakter
		System.out.println("\nBroj " + number + " odgovara karakteru "
				+ (char) number);

	}

}
