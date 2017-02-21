package zadaci_21_02_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.DoubleUserInput;

public class Zadatak01 {

	public static void main(String[] args) {

		/*
		 * (Izra�unavanje napojnice) Napisati program koji u�itava ukupan iznos
		 * ra�una koji treba uplatiti kao i procenat tog ra�una kojeg �elimo
		 * platiti kao napojnicu te izra�unava ukupan ra�un i napojnicu. Na
		 * primjer, ukoliko korisnik unese 10 kao ra�un i 15 % kao procenat za
		 * napojnicu program treba da ispi�e da je ukupan ra�un za uplatiti 11.5
		 * a napojnica 1.5.
		 */
		
		Scanner input = new Scanner(System.in);
		
		// pozivamo metode koje uzimaju unos od korisnika
		double ammount = DoubleUserInput.getDouble(input, "Unesite ukupan iznos racuna: ", 0);
		double tipPercent = DoubleUserInput.getDouble(input, "Unesite procenat napojnice: ", 0, 100);
		
		input.close();
		
		// izracunamo ukupan iznos racuna
		double totalCost = ammount + (ammount * (tipPercent / 100));
		// izracunamo iznos napojnice
		double tip = ammount * (tipPercent / 100);
		
		// ispisujemo ukupan iznos racuna i napojnicu
		System.out.printf("\nUkupan racun za uplatiti: %2.2f KM", totalCost);
		System.out.printf("\nNapojnica: %2.2f KM", tip);

	}

}
