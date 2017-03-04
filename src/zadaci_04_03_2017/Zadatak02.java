package zadaci_04_03_2017;

import java.math.BigInteger;

public class Zadatak02 {

	public static void main(String[] args) {

		/*
		 * *10.17 (Square numbers) Find the first ten square numbers that are
		 * greater than Long.MAX_VALUE. A square number is a number in the form
		 * of n2. For example, 4, 9, and 16 are square numbers. Find an
		 * efficient approach to run your program fast.
		 */

		// create BigInteger with Long.MAX_VALUE for comparing
		String sLongMaxNumber = Long.MAX_VALUE + "";
		BigInteger longMaxNumber = new BigInteger(sLongMaxNumber);

		// create BigInteger with Long.MAX_VALUE for multiplying
		long square = (long) Math.sqrt(Long.MAX_VALUE);
		BigInteger squareNumber = new BigInteger(square + "");

		for (int i = 0; i < 10;) {
			// multiply square number by square number and compare it to
			// Long.MAX_VALUE
			if ((squareNumber.multiply(squareNumber)).compareTo(longMaxNumber) > 0) {
				System.out.println(squareNumber.multiply(squareNumber));
				i++;
			}

			// increase square number by one
			squareNumber.add(BigInteger.ONE);
		}

	}

}
