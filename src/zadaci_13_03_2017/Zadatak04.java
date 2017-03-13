package zadaci_13_03_2017;

import java.util.ArrayList;
import java.util.Collections;

public class Zadatak04 {

	public static void main(String[] args) {

		/*
		 * (Shuffle ArrayList) Write the following method that shuffles an
		 * ArrayList of numbers: public static void shuffle(ArrayList<Number>
		 * list)
		 */
		
		// create array list of numbers
		ArrayList<Number> numbers = new ArrayList<>();
		
		// add numbers
		numbers.add(2);
		numbers.add(2.5);
		numbers.add(75);
		numbers.add(55.4);
		
		shuffle(numbers);
		
		// display list
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i) + " ");
		}

	}
	
	// method that shuffles an arraylist of numbers
	public static void shuffle(ArrayList<Number> list) {
		Collections.shuffle(list);
	}

}
