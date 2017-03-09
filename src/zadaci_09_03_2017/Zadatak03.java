package zadaci_09_03_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.IntUserInput;

public class Zadatak03 {

	public static void main(String[] args) {

		/*
		 * (InputMismatchException) Write a program that prompts the user to
		 * read two integers and displays their sum. Your program should prompt
		 * the user to read the number again if the input is incorrect.
		 */

		Scanner input = new Scanner(System.in);

		// take input from user as an integer
		int number1 = IntUserInput.getInt(input,
				"Enter number1 as an integer: ");
		int number2 = IntUserInput.getInt(input,
				"Enter number2 as an integer: ");
		
		input.close();

		// display sum of two integers
		System.out.println("The sum is: " + (number1 + number2));

	}

}
