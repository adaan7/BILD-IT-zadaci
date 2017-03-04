package zadaci_04_03_2017;

import java.math.BigInteger;

public class Zadatak05 {

	public static void main(String[] args) {

		/*
		 * 10.21 (Divisible by 5 or 6) Find the first ten numbers greater than
		 * Long.MAX_VALUE that are divisible by 5 or 6.
		 */

		// create BigInteger number as Long.MAX_VALUE
		BigInteger number = new BigInteger(Long.MAX_VALUE + "");
		// increase number by one to be bigger than Long.MAX_VALUE
		number = number.add(BigInteger.ONE);

		for (int i = 0; i < 10;) {
			// display number if it is divisible by 5 or 6
			if (number.remainder(new BigInteger("5")).equals(BigInteger.ZERO)
					|| number.remainder(new BigInteger("6")).equals(
							BigInteger.ZERO)) {
				System.out.println(number);
				i++;
			}

			// increase number by one
			number = number.add(BigInteger.ONE);
		}

	}

}
