package zadaci_09_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

import ba.adan.zadaci.ui.IntUserInput;

public class Zadatak02 {

	public static void main(String[] args) {

		/*
		 * **11.17 (Algebra: perfect square) Write a program that prompts the
		 * user to enter an integer m and find the smallest integer n such that
		 * m * n is a perfect square. (Hint: Store all smallest factors of m
		 * into an array list. n is the product of the factors that appear an
		 * odd number of times in the array list. For example, consider m = 90,
		 * store the factors 2, 3, 3, 5 in an array list. 2 and 5 appear an odd
		 * number of times in the array list. So, n is 10.)
		 */

		Scanner input = new Scanner(System.in);

		// create an array list of integers to store smallest factors of number
		ArrayList<Integer> smallestFactors = new ArrayList<>();

		// take input from user
		int number = IntUserInput.getInt(input, "Enter an integer m: ", 2);

		input.close();

		int m = number;
		int n = 1;
		int divisor = 2;

		while (number > 1) {
			// find smallest factors of m and store it in array list
			if (number % divisor == 0) {
				smallestFactors.add(divisor);

				number /= divisor;
			} else {
				divisor++;
			}
		}

		// create array of integers to count repetition of smallest factors
		int[] counts = new int[m + 1];

		for (int i = 0; i < smallestFactors.size(); i++) {
			// count repetition of smallest factors
			counts[smallestFactors.get(i)]++;
		}

		for (int i = 0; i < counts.length; i++) {
			if (counts[i] % 2 != 0) {
				// get a product of all smallest factors that repeat odd times
				n *= i;
			}
		}

		System.out
				.println("The smallest number m for n to be a perfect square is "
						+ n);
		System.out.println("m * n is " + (m * n));

	}

}
