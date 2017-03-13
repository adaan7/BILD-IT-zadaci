package zadaci_13_03_2017;

import java.util.ArrayList;

public class Zadatak05 {

	public static void main(String[] args) {

		/*
		 * (Sort ArrayList) Write the following method that sorts an ArrayList
		 * of numbers. public static void sort(ArrayList<Number> list)
		 */

		// create array list of number
		ArrayList<Number> numbers = new ArrayList<>();
		
		// add numbers in a list
		numbers.add(5);
		numbers.add(5.5);
		numbers.add(444444444);
		numbers.add(2);

		sort(numbers);
		
		// display list elements
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i) + " ");
		}

	}

	// method that sort array list of number
	public static void sort(ArrayList<Number> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			Number currentMin = list.get(i);
			int currentMinIndex = i;

			for (int j = i + 1; j < list.size(); j++) {
				if (currentMin.doubleValue() > list.get(j).doubleValue()) {
					currentMin = list.get(j);
					currentMinIndex = j;
				}
			}

			if (currentMinIndex != i) {
				list.set(currentMinIndex, list.get(i));
				list.set(i, currentMin);
			}
		}
	}

}
