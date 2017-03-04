package zadaci_04_03_2017;

import java.math.BigInteger;

public class Zadatak04 {

	public static void main(String[] args) {

		/*
		 * *10.19 (Mersenne prime) A prime number is called a Mersenne prime if
		 * it can be written in the form 2p - 1 for some positive integer p.
		 * Write a program that finds all Mersenne primes with p … 100 and
		 * displays the output as shown below. (Hint: You have to use BigInteger
		 * to store the number, because it is too big to be stored in long. Your
		 * program may take several hours to run.) p 2^p – 1 2 3 3 7 5 31 ...
		 */

		BigInteger p;

		System.out.printf("%-10s%10s\n\n", "p", "2^p - 1");

		// loop working as long as p is less or equal than 100
		for (p = new BigInteger("2"); p.compareTo(new BigInteger("100")) <= 0; p = p
				.add(BigInteger.ONE)) {
			if (Zadatak03.isPrimeBigInteger(p)) {
				// check if p is prime
				BigInteger mersennePrime = new BigInteger("2")
						.pow(p.intValue()).subtract(BigInteger.ONE);

				if (Zadatak03.isPrimeBigInteger(mersennePrime)) {
					// display mersenne prime number
					System.out.printf("%-10s%10s\n", p, mersennePrime);
				}
			}
		}

	}

}
