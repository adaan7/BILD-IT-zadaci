package zadaci_07_03_2017;

import java.util.ArrayList;

public class Zadatak05 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			// add numbers from 1 to 10 in a list
			list.add(i + 1);
		}

		shuffle(list);

		// print elements from a list
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

	}

	// method that shuffle ArrayList of Integers
	public static void shuffle(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			// get random index from 0 to list.size
			int index = (int) (Math.random() * list.size());

			// simple swap
			int temp = list.get(index);
			list.set(index, list.get(i));
			list.set(i, temp);
		}
	}

}
