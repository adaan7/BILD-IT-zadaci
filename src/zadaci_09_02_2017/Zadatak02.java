package zadaci_09_02_2017;

import java.util.Scanner;

public class Zadatak02 {

	public static void main(String[] args) {

		/*
		 * Napisati metodu koja prima jedan argument, broj pitanja, te generiše
		 * toliko nasumiènih, jednostavnih pitanja oduzimanja tipa : „Koliko je
		 * 5 - 2 ?“. Metoda treba da broji broj taènih i netaènih odgovora te ih
		 * ispiše korisniku.
		 */

		// pozivamo metodu
		getRandomQuestions(5);

	}

	public static void getRandomQuestions(int numberOfQuestions) {
		// kreiramo novi scanner objekat
		Scanner input = new Scanner(System.in);

		int countCorrect = 0;

		for (int i = 0; i < numberOfQuestions; i++) {
			// generišemo dva random broja od 0 do 9
			int num1 = (int) (Math.random() * 10);
			int num2 = (int) (Math.random() * 10);

			// ako je prvi broj manji od drugog, zamijenimo im mjesta
			if (num1 < num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}

			// uzimamo unos od korisnika
			System.out.print("Koliko je " + num1 + " - " + num2 + "? ");
			int userAnswer = input.nextInt();

			// ako je korisnik taèno odgovorio ispisujemo odgovarajuæu poruku i
			// poveæavamo brojaè taènih odgovora za 1
			if (userAnswer == num1 - num2) {
				System.out.println(userAnswer + " je taèan odgovor.");
				countCorrect++;
			} else {
				// ako korisnik nije taèno odgovorio ispisujemo odgovarajuæu
				// poruku
				System.out.println(userAnswer
						+ " nije taèan odgovor. Taèan odgovor je "
						+ (num1 - num2));
			}
		}

		// zatvaramo scanner
		input.close();

		// ispisujemo broj taènih i broj netaènih odgovora
		System.out.println("\nBroj taènih odgovora: " + countCorrect);
		System.out.println("Broj netaènih odgovora: "
				+ (numberOfQuestions - countCorrect));
	}

}
