package zadaci_04_03_2017;

import java.math.BigInteger;

public class Zadatak01 {

	public static void main(String[] args) {

		/*
		 * *10.16 (Divisible by 2 or 3) Find the first ten numbers with 50
		 * decimal digits that are divisible by 2 or 3.
		 */

		// create a smallest BigInteger with 50 digits
		BigInteger number = new BigInteger(
				"10000000000000000000000000000000000000000000000000");
		// create BigInteger 2 and BigInteger 3 for dividing a number
		BigInteger divisor2 = new BigInteger("2");
		BigInteger divisor3 = new BigInteger("3");

		for (int i = 0; i < 10;) {
			// if number is divisible by 2 or 3, display that number and
			// increase i by 1
			if ((number.remainder(divisor2)).equals(BigInteger.ZERO)
					|| (number.remainder(divisor3)).equals(BigInteger.ZERO)) {
				System.out.println(number);
				i++;
			}

			// increase number by one
			number = number.add(BigInteger.ONE);
		}

	}

}
