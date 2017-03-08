package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import ba.adan.zadaci.ui.IntUserInput;

public class Zadatak02 {

	public static void main(String[] args) {

		/*
		 * (Sort ArrayList) Write the following method that sorts an ArrayList
		 * of numbers: public static void sort(ArrayList<Integer> list) Write a
		 * test program that prompts the user to enter 5 numbers, stores them in
		 * an array list, and displays them in increasing order.
		 */

		Scanner input = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();

		// take user input of int and add it to ArrayList
		for (int i = 0; i < 5; i++) {
			int number = IntUserInput.getInt(input, "Enter an integer: ");
			list.add(number);
		}
		
		input.close();

		// calling a method that sort a list
		sort(list);

		System.out.print("\nSorted numbers: ");

		// display elements of list
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

	}

	// method that sort ArrayList of Integers int increasing order
	public static void sort(ArrayList<Integer> list) {
		Collections.sort(list);
	}

}
