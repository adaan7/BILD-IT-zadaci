package zadaci_15_02_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.IntUserInput;

public class Zadatak01 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji ispisuje tri nasumièna cijela broja te pita
		 * korisnika da unese njihov zbir. Ukoliko korisnik pogriješi, program
		 * ispisuje pitanje ponovo sve sa porukom da pokuša ponovo. Ukoliko
		 * korisnik unese taèan odgovor, program mu èestita i završava sa radom.
		 */
		
		Scanner input = new Scanner(System.in);
		
		// generisemo tri nasumicna cijela broja
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int number3 = (int)(Math.random() * 10);
		
		// izracunamo zbir tri broja
		int result = number1 + number2 + number3;
		
		int userInput = -1;
		String text = "Koliko je " + number1 + " + " + number2 + " + " + number3 + "? ";
		
		// petlja radi dok korisnik ne unese tacan rezultat
		while (result != userInput) {
			// pozivamo metodu koja uzima unos od korisnika
			userInput = IntUserInput.getInt(input, text);
			
			// ispisujemo odgovarajuce poruke u zavisnosti od odgovora korisnika
			if (result == userInput) {
				System.out.println("\nSvaka cast, pogodili ste!");
			} else {
				System.out.println(userInput + " nije tacan odgovor. Pokusajte ponovo.");
			}
		}
		
		// zatvaramo scanner
		input.close();

	}

}
