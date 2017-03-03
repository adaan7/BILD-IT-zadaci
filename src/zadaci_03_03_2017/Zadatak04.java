package zadaci_03_03_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.IntUserInput;

public class Zadatak04 {

	public static void main(String[] args) {

		/*
		 *  *10.5 (Displaying the prime factors) Write a program that prompts the
		 * user to enter a positive integer and displays all its smallest
		 * factors in decreasing order. For example, if the integer is 120, the
		 * smallest factors are displayed as 5, 3, 2, 2, 2. Use the
		 * StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and
		 * retrieve and display them in reverse order.
		 */

		Scanner input = new Scanner(System.in);

		// uzimamo unos od korisnika
		int number = IntUserInput.getInt(input,
				"Enter an integer bigger than 1: ", 2);

		int divisor = 2;

		StackOfIntegers stack = new StackOfIntegers();

		while (number > 1) {
			// provjeravamo da li je broj djeljiv sa trenutnim divisorom, ako
			// jest divisor dodajemu u stackOfIntegers a broj podijelimo sa
			// divisorom
			if (number % divisor == 0) {
				stack.push(divisor);
				number = number / divisor;
			} else {
				// ako broj nije djeljiv sa trenutnim divisorom, divisor
				// povecamo za 1
				divisor++;
			}
		}

		// ispisujemo elemente stack-a u obrnutom redoslijedu
		for (int i = stack.getSize() - 1; i >= 0; i--) {
			System.out.print(stack.getElement(i) + ", ");
		}

	}

}
