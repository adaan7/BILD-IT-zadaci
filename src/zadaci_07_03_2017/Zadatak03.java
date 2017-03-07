package zadaci_07_03_2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import ba.adan.zadaci.ui.IntUserInput;

public class Zadatak03 {

	public static void main(String[] args) {

		/*
		 * (Maximum element in ArrayList) Write the following method that
		 * returns the maximum value in an ArrayList of integers. The method
		 * returns null if the list is null or the list size is 0. public static
		 * Integer max(ArrayList<Integer> list) Write a test program that
		 * prompts the user to enter a sequence of numbers ending with 0, and
		 * invokes this method to return the largest number in the input.
		 */

		Scanner input = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();
		int number = -1;

		while (number != 0) {
			// taking input from user
			number = IntUserInput.getInt(input,
					"Enter a number (input ends when it is 0): ");

			if (number != 0) {
				// add number in the list if it is not a zero
				list.add(number);
			}
		}

		input.close();

		// display the max number in the list
		System.out.println("\nThe max number in the list is: " + max(list));

	}

	// method that return max Integer from ArrayList of Integers
	public static Integer max(ArrayList<Integer> list) {
		if (list == null || list.size() == 0) {
			return null;
		}

		Collections.sort(list);

		return list.get(list.size() - 1);
	}

}
