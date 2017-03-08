package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

import ba.adan.zadaci.ui.DoubleUserInput;

public class Zadatak03 {

	public static void main(String[] args) {

		/*
		 * (Sum ArrayList) Write the following method that returns the sum of
		 * all numbers in an ArrayList: public static double
		 * sum(ArrayList<Double> list) Write a test program that prompts the
		 * user to enter 5 numbers, stores them in an array list, and displays
		 * their sum.
		 */

		Scanner input = new Scanner(System.in);

		ArrayList<Double> list = new ArrayList<>();

		// take double input from user and add it to list
		for (int i = 0; i < 5; i++) {
			double number = DoubleUserInput
					.getDouble(input, "Enter a number: ");

			list.add(number);
		}
		
		input.close();

		double sum = sum(list);

		// print the sum of elements
		System.out.println("\nThe sum of elements: " + sum);

	}

	// method that return sum of ArrayList of Double values
	public static double sum(ArrayList<Double> list) {
		double sum = 0;

		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}

		return sum;
	}

}
