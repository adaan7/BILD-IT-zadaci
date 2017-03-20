package zadaci_20_03_2017;

import java.util.ArrayList;

public class Zadatak01 {

	public static void main(String[] args) {

		/*
		 * (Distinct elements in ArrayList) Write the following method that
		 * returns a new ArrayList. The new list contains the non-duplicate
		 * elements from the original list. public static <E> ArrayList<E>
		 * removeDuplicates(ArrayList<E> list)
		 */

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(7);
		numbers.add(5);
		numbers.add(3);
		numbers.add(4);
		numbers.add(4);

		ArrayList<Integer> distinctNumbers = removeDuplicates(numbers);

		for (Integer f : distinctNumbers) {
			System.out.print(f + " ");
		}

	}

	// method that return an array list with distinct elements
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		ArrayList<E> distinctElements = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			if (!distinctElements.contains(list.get(i))) {
				distinctElements.add(list.get(i));
			}
		}

		return distinctElements;
	}

}
