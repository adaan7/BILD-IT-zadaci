package zadaci_04_03_2017;

import java.math.BigInteger;

public class Zadatak03 {

	public static void main(String[] args) {

		/*
		 * *10.18 (Large prime numbers) Write a program that finds five prime
		 * numbers larger than Long.MAX_VALUE.
		 */

		// creating biginteger as Long.MAX_VALUE
		BigInteger number = new BigInteger(Long.MAX_VALUE + "");
		// increase number by one to be bigger than Long.MAX_VALUE
		number = number.add(BigInteger.ONE);

		for (int i = 0; i < 5;) {
			if (isPrimeBigInteger(number)) {
				// check if BigInteger number is prime and display that number
				System.out.println(number);
				i++;
			}

			// increase number by one
			number = number.add(BigInteger.ONE);
		}

	}

	// method that checks if a BigInteger number is prime
	public static boolean isPrimeBigInteger(BigInteger number) {
		BigInteger divisor;

		for (divisor = new BigInteger("2"); divisor.compareTo(number
				.divide(new BigInteger("2"))) <= 0; divisor = divisor
				.add(BigInteger.ONE)) {
			if (number.remainder(divisor).equals(BigInteger.ZERO)) {
				return false;
			}
		}

		return true;
	}

}
