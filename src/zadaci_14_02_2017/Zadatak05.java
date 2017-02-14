package zadaci_14_02_2017;

import java.util.Scanner;

public class Zadatak05 {

	public static void main(String[] args) {

		/*
		 * Ako imamo ubrzanje aviona a te brzinu pri kojoj avion uzlijeće v,
		 * možemo izračunati minimalnu dužinu piste potrebne da avion uzleti
		 * koristeći se sljedećom formulom: dužina = v * v / 2a. Napisati
		 * program koji pita korisnika da unese v u m/s i a u m/s² te ispisuje
		 * korisniku minimalnu dužinu piste. (Primjer: ukoliko unesemo 60 za
		 * brzinu i 3.5 za ubrzanje dužina piste je 514.286)
		 */
		
		Scanner input = new Scanner(System.in);
		
		// pozivamo metode koje uzimaju unos od korisnika
		double v = getUserInput(input, "Unesite brzinu pri kojoj avion uzlijece (m/2): ");
		double a = getUserInput(input, "Unesite ubrzanje aviona (m/s^2): ");
		
		input.close();
		
		// formula za izracunavanje minimalne duzine piste
		double minLengthOfRailway = (v * v) / (2 * a);
		
		// formatiramo i ispisujemo minimalnu duzinu piste
		System.out.printf("\nMinimalna duzina piste je: %2.3f m", minLengthOfRailway);

	}
	
	// metoda koja uzima unos od korisnika
	public static double getUserInput(Scanner input, String text) {
		double userInput = 0;
		boolean wrongUserInput = true;
		
		while (wrongUserInput) {
			try {
				System.out.print(text);
				userInput = input.nextDouble();
				
				wrongUserInput = false;
				
				if (userInput < 1) {
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

}
