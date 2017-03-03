package zadaci_03_03_2017;

public class Zadatak05 {

	public static void main(String[] args) {

		/*
		 * *10.6 (Displaying the prime numbers) Write a program that displays
		 * all the prime numbers less than 120 in decreasing order. Use the
		 * StackOfIntegers class to store the prime numbers (e.g., 2, 3, 5, ...)
		 * and retrieve and display them in reverse order.
		 */

		// pravimo novi stackOfIntegers objekat
		StackOfIntegers stack = new StackOfIntegers();

		for (int number = 2; number < 120; number++) {
			if (MyInteger.isPrime(number)) {
				// ako je broj prost, dodajemo ga u stack
				stack.push(number);
			}
		}

		// ispisujemo proste brojeve u obrnutom redoslijedu
		for (int i = stack.getSize() - 1; i >= 0; i--) {
			System.out.print(stack.getElement(i) + ", ");
		}

	}

}
