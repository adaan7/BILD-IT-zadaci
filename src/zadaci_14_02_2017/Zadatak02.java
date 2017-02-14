package zadaci_14_02_2017;

import java.util.Scanner;

public class Zadatak02 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji ispisuje sve prijestupne godine, 10 po liniji,
		 * u rasponu godina koje korisnik unese. Program pita korisnika da unese
		 * poèetnu godinu, krajnju godinu te ispisuje sve godine u tom rasponu.
		 * Razmak izmeðu godina treba biti jedan space.
		 */
		
		Scanner input = new Scanner(System.in);
		
		// pozivamo metode koje uzimaju unos od korisnika
		int firstYear = getUserInput(input, "Unesite pocetnu godinu: ");
		int lastYear = getUserInput(input, "Unesite krajnju godinu: ");
		int counter = 0;
		
		// ako je pocetna godina veca od krajnje, zamijenimo im mjesta
		if (firstYear > lastYear) {
			int temp = firstYear;
			firstYear = lastYear;
			lastYear = temp;
		}
		
		input.close();
		
		System.out.println("\nPrijestupne godine: ");
		
		// ispisujemo prijestupne godine, svaku 4tu ali ne i 100tu, i svaku 400tu
		for (int year = firstYear; year <= lastYear; year++) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.print(year + " ");
				counter++;
				
				// ako je brojac jednak 10, prelazimo u novi red i resetujemo brojac
				if (counter == 10) {
					System.out.println();
					counter = 0;
				}
			}
		}

	}
	
	// metoda koja uzima unos od korisnika
	public static int getUserInput(Scanner input, String text) {
		int userInput = 0;
		boolean wrongUserInput = true;
		
		while (wrongUserInput) {
			try {
				System.out.print(text);
				userInput = input.nextInt();
				
				wrongUserInput = false;
				
				if (userInput < 1) {
					System.out.println("Pogresan unos. Morate unijeti pozitivan cijeli broj.");
					wrongUserInput = true;
				}
			} catch (Exception ex) {
				System.out.println("Pogresan unos. Morate unijeti pozitivan cijeli broj.");
				input.nextLine();
			}
		}
		
		return userInput;
	}

}
