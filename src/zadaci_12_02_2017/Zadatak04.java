package zadaci_12_02_2017;

import java.util.Scanner;

public class Zadatak04 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji prima 10 cijelih brojeva te ih ispisuje u
		 * obrnutom redosljedu.
		 */
		
		// novi scanner
		Scanner input = new Scanner(System.in);
		
		int[] numbers = new int[10];
		
		System.out.println("Potrebno je unijeti 10 cijelih brojeva");
		
		// uzimamo unos od korisnika
		for (int i = 0; i < numbers.length; i++) {
			boolean wrongUserInput = true;
			int number = 0;
			
			while (wrongUserInput) {
				try {
					System.out.print("Unesite cijeli broj: ");
					number = input.nextInt();
					
					wrongUserInput = false;
				} catch (Exception ex) {
					System.out.println("Pogresan unos. Morate unijeti cijeli broj.");
					input.nextLine();
				}
			}
			numbers[i] = number;
		}
		
		// zatvaramo scanner
		input.close();
		
		// ispisujemo niz cijelih brojeva u obrnutom redoslijedu
		System.out.println("\nUneseni brojevi u obrnutom redoslijedu: ");
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}

	}

}
