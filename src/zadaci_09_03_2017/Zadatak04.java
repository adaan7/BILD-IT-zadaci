package zadaci_09_03_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.IntUserInput;

public class Zadatak04 {

	public static void main(String[] args) {

		/*
		 * (ArrayIndexOutOfBoundsException) Write a program that meets the
		 * following requirements: ■ Creates an array with 100 randomly chosen
		 * integers. ■ Prompts the user to enter the index of the array, then
		 * displays the corresponding element value. If the specified index is
		 * out of bounds, display the message Out of Bounds.
		 */

		Scanner input = new Scanner(System.in);

		int[] array = new int[100];

		// fill int array with random numbers from 0 to 100
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}

		// take input from user
		int index = IntUserInput.getInt(input,
				"Enter the index of the array: ", 0);

		input.close();

		try {
			// display element of the array
			System.out
					.println("\nThe element of the array is: " + array[index]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			// display out of bounds message if exception is caught
			System.out.println("\nOut of Bounds");
		}

	}

}
