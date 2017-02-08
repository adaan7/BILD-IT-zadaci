package zadaci_08_02_2017;

import java.util.ArrayList;

public class Zadatak01 {

	public static void main(String[] args) {

		// kreiramo novi ArrayList objekat
		ArrayList<Integer> list = new ArrayList<>();
		// dodajemo brojeve u listu
		list.add(5);
		list.add(2);
		list.add(8);
		list.add(19);
		list.add(4);

		// ispisujemo najveci broj u listi
		System.out.println("Najveci broj u listi je: " + max(list));

	}

	public static Integer max(ArrayList<Integer> list) {
		// provjeravamo da li je lista prazna i ukoliko jest vraæamo null
		if (list.size() == 0 || list.isEmpty()) {
			return null;
		}

		int max = list.get(0);

		// prolazimo petljom kroz listu i trazimo najveci broj u listi
		for (int i = 0; i < list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
			}
		}

		// vraæamo najveci broj u listi
		return max;
	}

}
