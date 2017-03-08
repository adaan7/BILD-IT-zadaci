package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

import ba.adan.zadaci.ui.IntUserInput;

public class Zadatak04 {

	public static void main(String[] args) {

		/*
		 * (Remove duplicates) Write a method that removes the duplicate
		 * elements from an array list of integers using the following header:
		 * public static void removeDuplicate(ArrayList<Integer> list) Write a
		 * test program that prompts the user to enter 10 integers to a list and
		 * displays the distinct integers separated by exactly one space.
		 */

		Scanner input = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();
		
		// take input from user
		for (int i = 0; i < 10; i++) {
			int number = IntUserInput.getInt(input, "Enter an integer: ");

			list.add(number);
		}

		input.close();

		removeDuplicate(list);

		System.out.print("\nDistinct integers: ");
		
		// display elements from list
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

	}

	// method that remove duplicate elements in ArrayList of Integers
	public static void removeDuplicate(ArrayList<Integer> list) {
		ArrayList<Integer> tempList = new ArrayList<>(list);

		list.clear();

		for (int i = 0; i < tempList.size(); i++) {
			if (!list.contains(tempList.get(i))) {
				list.add(tempList.get(i));
			}
		}
	}

}
