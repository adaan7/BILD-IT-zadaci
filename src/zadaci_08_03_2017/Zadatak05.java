package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

import ba.adan.zadaci.ui.IntUserInput;

public class Zadatak05 {

	public static void main(String[] args) {

		/*
		 * (Combine two lists) Write a method that returns the union of two
		 * array lists of integers using the following header: public static
		 * ArrayList<Integer> union( ArrayList<Integer> list1,
		 * ArrayList<Integer> list2) For example, the union of two array lists
		 * {2, 3, 1, 5} and {3, 4, 6} is {2, 3, 1, 5, 3, 4, 6}. Write a test
		 * program that prompts the user to enter two lists, each with five
		 * integers, and displays their union. The numbers are separated by
		 * exactly one space in the output.
		 */

		Scanner input = new Scanner(System.in);

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		System.out.println("Enter 5 elements for list1");

		// take input from user for list1
		for (int i = 0; i < 5; i++) {
			int number = IntUserInput.getInt(input, "Enter a number: ");

			list1.add(number);
		}

		System.out.println("\nEnter 5 elements for list2");

		// take input from user for list2
		for (int i = 0; i < 5; i++) {
			int number = IntUserInput.getInt(input, "Enter a number: ");

			list2.add(number);
		}

		ArrayList<Integer> unionList = union(list1, list2);

		System.out.print("\nUnion: ");

		// display elements of union list
		for (int i = 0; i < unionList.size(); i++) {
			System.out.print(unionList.get(i) + " ");
		}

	}

	// method that return the union of two array lists of integers
	public static ArrayList<Integer> union(ArrayList<Integer> list1,
			ArrayList<Integer> list2) {
		ArrayList<Integer> unionList = new ArrayList<>(list1);

		for (int i = 0; i < list2.size(); i++) {
			unionList.add(list2.get(i));
		}

		return unionList;
	}

}
