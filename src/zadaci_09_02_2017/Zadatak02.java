package zadaci_09_02_2017;

import java.util.Scanner;

public class Zadatak02 {

	public static void main(String[] args) {

		/*
		 * Napisati metodu koja prima jedan argument, broj pitanja, te generi�e
		 * toliko nasumi�nih, jednostavnih pitanja oduzimanja tipa : �Koliko je
		 * 5 - 2 ?�. Metoda treba da broji broj ta�nih i neta�nih odgovora te ih
		 * ispi�e korisniku.
		 */

		// pozivamo metodu
		getRandomQuestions(5);

	}

	public static void getRandomQuestions(int numberOfQuestions) {
		// kreiramo novi scanner objekat
		Scanner input = new Scanner(System.in);

		int countCorrect = 0;

		for (int i = 0; i < numberOfQuestions; i++) {
			// generi�emo dva random broja od 0 do 9
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

			// ako je korisnik ta�no odgovorio ispisujemo odgovaraju�u poruku i
			// pove�avamo broja� ta�nih odgovora za 1
			if (userAnswer == num1 - num2) {
				System.out.println(userAnswer + " je ta�an odgovor.");
				countCorrect++;
			} else {
				// ako korisnik nije ta�no odgovorio ispisujemo odgovaraju�u
				// poruku
				System.out.println(userAnswer
						+ " nije ta�an odgovor. Ta�an odgovor je "
						+ (num1 - num2));
			}
		}

		// zatvaramo scanner
		input.close();

		// ispisujemo broj ta�nih i broj neta�nih odgovora
		System.out.println("\nBroj ta�nih odgovora: " + countCorrect);
		System.out.println("Broj neta�nih odgovora: "
				+ (numberOfQuestions - countCorrect));
	}

}
