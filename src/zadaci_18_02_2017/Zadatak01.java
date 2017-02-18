package zadaci_18_02_2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak01 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji pita korisnika da unese imena tri grada te ih
		 * ispiše u abecednom redu. Na primjer, ukoliko korisnik unese Chicago,
		 * Los Angeles i Atlanta kao gradove, program vraæa Atlanta, Chicago,
		 * Los Angeles.
		 */

		Scanner input = new Scanner(System.in);

		// novi arraylist
		ArrayList<String> cityList = new ArrayList<>();

		// uzimamo unos gradova od korisnika
		for (int i = 0; i < 3; i++) {
			System.out.print("Unesite ime grada: ");
			String city = input.nextLine();

			// ubacujemo grad u arraylist
			cityList.add(city);
		}

		input.close();

		// sortiramo arraylist
		Collections.sort(cityList);

		// ispisujemo listu gradova
		System.out.println("\nGradovi sortirani po abecednom redu:\n"
				+ cityList.get(0) + ", " + cityList.get(1) + ", "
				+ cityList.get(2) + ".");

	}

}
