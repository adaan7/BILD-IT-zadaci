package zadaci_14_02_2017;

import java.util.Scanner;

public class Zadatak01 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji uèitava iznos investicije, godišnju interesnu
		 * stopu i broj godina te vraæa buduæu vrijednost investicije koristeæi
		 * se sljedeæom formulom: buducaVrijednostInvesticije = iznosInvesticije
		 * * (1 + mjesecnaInteresnaStopa)^brojGodina*12. Na primjer, ukoliko
		 * uneste kao iznos investicije 1000, 3.25 kao godišnju interesnu stopu
		 * i 1 kao broj godina program vam vraæa 1032.98 kao buducu vrijednost
		 * investicije.
		 */
		
		Scanner input = new Scanner(System.in);
		
		// pozivamo metode koje uzimaju unose od korisnika
		double investmentAmmount = getDoubleUserInput(input, "Unesite iznos investicije: ");
		double annualInterestRate = getDoubleUserInput(input, "Unesite godisnju interesnu stopu: ");
		int numberOfYears = getIntUserInput(input, "Unesite broj godina: ");
		
		input.close();
		
		// izracunamo mjesecnu kamatnu stopu
		double monthlyInterestRate = (annualInterestRate / 100) / 12;
		// izracunamo broj mjeseci
		int months = numberOfYears * 12;
		
		// izracunamo buducu vrijednost investicije
		double futureInvestmentAmmount = investmentAmmount * Math.pow((1 + monthlyInterestRate), months);
		
		// formatiramo i ispisujemo buducu vrijednost investicije
		System.out.printf("\nBuduca vrijednost investicije iznosi: %2.2f KM", futureInvestmentAmmount);

	}
	
	// metoda koja uzima unos od korisnika kao double
	public static double getDoubleUserInput(Scanner input, String text) {
		double userInput = 0;
		boolean wrongUserInput = true;
		
		while (wrongUserInput) {
			try {
				System.out.print(text);
				userInput = input.nextDouble();
				
				wrongUserInput = false;
				
				if (userInput < 0) {
					System.out.println("Pogresan unos. Morate unijeti pozitivan broj.");
					wrongUserInput = true;
				}
			} catch (Exception ex) {
				System.out.println("Pogresan unos. Morate unijeti pozitivan broj.");
				input.nextLine();
			}
		}
		
		return userInput;
	}
	
	// metoda koja uzima unos od korisnika kao int
	public static int getIntUserInput(Scanner input, String text) {
		int userInput = 0;
		boolean wrongUserInput = true;
		
		while (wrongUserInput) {
			try {
				System.out.print(text);
				userInput = input.nextInt();
				
				wrongUserInput = false;
				
				if (userInput < 0) {
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
