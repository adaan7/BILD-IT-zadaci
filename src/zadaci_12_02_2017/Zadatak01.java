package zadaci_12_02_2017;

import java.util.Scanner;

public class Zadatak01 {

	public static void main(String[] args) {

		/*
		 * Pretpostavimo da uplatimo $100 svaki mjesec na štedni raèun koji ima
		 * godišnju interesnu stopu od 5%. Mjeseèna interesna stopa je stoga
		 * 0.05 / 12 = 0.00417. Nakon prvog mjeseca vrijednost na raèunu postaje
		 * 100 * (1 + 0.00417) = 100.417. Nakon drugog mjeseca, vrijednost na
		 * raèunu postaje (100 + 100.417) * (1 + 0.00417) = 201.252. Nakon
		 * treæeg mjeseca, vrijednost na raèunu postaje (100 + 201.252) * (1 +
		 * 0.00417) = 302.507 i tako dalje. Napisati program koji pita korisnika
		 * da unese mjeseèni iznos štednje te broj mjeseci nakon kojeg bi želio
		 * znati stanje raèuna. *(
		 */

		// novi scanner
		Scanner input = new Scanner(System.in);

		boolean wrongAmmountInput = true;
		boolean wrongMonthInput = true;
		double savingAmmount = 0;
		double monthlyInterest = 0.00417;
		double balance = 0;
		int numberOfMonths = 0;

		while (wrongAmmountInput) {
			try {
				// uzimamo unos od korisnika
				System.out.print("Unesite mjesecni iznos stednje: ");
				savingAmmount = input.nextDouble();

				wrongAmmountInput = false;

				// ako je uneseni broj negativan ispisujemo odgovarajucu poruku
				if (savingAmmount < 0) {
					System.out
							.println("Pogresan unos. Morate unijeti pozitivan broj.");
					wrongAmmountInput = true;
				}
			} catch (Exception ex) {
				// ako je uhvacen exception ispisujemo odgovarajucu poruku
				System.out
						.println("Pogresan unos. Morate unijeti pozitivan broj.");
				input.nextLine();
			}
		}

		while (wrongMonthInput) {
			try {
				System.out.print("Unesite broj mjeseci: ");
				numberOfMonths = input.nextInt();

				wrongMonthInput = false;

				if (numberOfMonths < 0) {
					System.out
							.println("Pogresan unos. Morate unijeti pozitivan cijeli broj.");
					wrongMonthInput = true;
				}
			} catch (Exception ex) {
				System.out
						.println("Pogresan unos. Morate unijeti pozitivan cijeli broj.");
				input.nextLine();
			}
		}

		input.close();

		// racunamo stanje racuna nakon odredjenog broja mjeseci
		for (int i = 0; i < numberOfMonths; i++) {
			balance = (balance + savingAmmount) * (1 + monthlyInterest);
		}

		// ispisujemo stanje racuna
		if (numberOfMonths == 0) {
			System.out.printf("\nStanje vaseg racuna je: %2.3f KM", savingAmmount);
		} else {
			System.out.printf("\nStanje vaseg racuna je: %2.3f KM", balance);			
		}

	}

}
