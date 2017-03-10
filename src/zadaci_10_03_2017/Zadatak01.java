package zadaci_10_03_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.StringUserInput;

public class Zadatak01 {

	public static void main(String[] args) {

		/*
		 * (NumberFormatException) Write the bin2Dec(String binaryString) method
		 * to convert a binary string into a decimal number. Implement the
		 * bin2Dec method to throw a NumberFormatException if the string is not
		 * a binary string.
		 */

		Scanner input = new Scanner(System.in);

		// take string input from user
		String binary = StringUserInput.getString(input,
				"Enter a binary string: ");

		input.close();

		try {
			System.out.println("A decimal number is: " + bin2Dec(binary));
		} catch (NumberFormatException ex) {
			System.out.println("Not a binary string.");
		}

	}

	// method that convert binary string into a decimal number
	public static int bin2Dec(String binaryString) {
		int decimal = 0;

		if (isBinary(binaryString)) {
			long number = Long.parseLong(binaryString);
			int n = 0;
			int q = 2; // base value

			while (number != 0) {
				long digit = number % 10;
				decimal += digit * Math.pow(q, n);
				number /= 10;
				n++;
			}
		}

		return decimal;
	}

	// method that return true if a string is binary string
	public static boolean isBinary(String binaryString) {
		boolean isBinary = true;

		for (int i = 0; i < binaryString.length(); i++) {
			if (binaryString.charAt(i) == '0' || binaryString.charAt(i) == '1') {
				isBinary = true;
			} else {
				isBinary = false;
				throw new NumberFormatException();
			}
		}

		return isBinary;
	}

}
