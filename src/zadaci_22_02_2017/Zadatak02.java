package zadaci_22_02_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.IntUserInput;

public class Zadatak02 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji igra sa protivnikom rock-paper-scissors.
		 * (papir-bunar-makaze ili tako nekako po naški) Program nasumièno
		 * generiše brojeve 0, 1 i 2 koji predstavljaju papir, bunar i makaze.
		 * Program pita korisnika da unese 0, 1 ili 2 te mu ispisuje poruku da
		 * li je korisnik pobijedio, da li je raèunar pobijedio ili je bilo
		 * neriješeno.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("*** PAPIR - BUNAR - MAKAZE ***\n");

		// uzimamo unos od korisnika
		int user = IntUserInput.getInt(input,
				"Unesite broj (0 - papir, 1 - bunar, 2 - makaze): ", 0, 2);

		input.close();

		// generisemo random integer izmedju 0 i 2 koji predstavlja izbor
		// racunara
		int computer = (int) (Math.random() * 3);

		String[] names = { "papir", "bunar", "makaze" };

		String text = "\nVi ste odabrali: " + names[user]
				+ "\nRacunar je odabrao: " + names[computer];

		if (user == computer) {
			// provjeravamo da li je nerjeseno
			System.out.println(text + "\n\nNerjeseno je.");
		} else if ((user == 0 && computer == 1) || (user == 1 && computer == 2)
				|| (user == 2 && computer == 0)) {
			// provjeravamo da li je korisnik pobijedio
			System.out.println(text + "\n\nVi ste pobijedili.");
		} else {
			// provjeravamo da li je racunar pobijedio
			System.out.println(text + "\n\nRacunar je pobijedio.");
		}

	}

}
