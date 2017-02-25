package zadaci_25_02_2017;

public class Zadatak01 {

	public static void main(String[] args) {

		/*
		 * *7.7 (Count single digits) Write a program that generates 100 random
		 * integers between 0 and 9 and displays the count for each number.
		 * (Hint: Use an array of ten integers, say counts, to store the counts
		 * for the number of 0s, 1s, . . . , 9s.)
		 */

		int[] numbers = new int[100];
		int[] counts = new int[10];

		int counter = 0;

		System.out.println("The random numbers are: ");

		for (int i = 0; i < numbers.length; i++) {
			// generisemo slucajni broj od 0 do 9
			numbers[i] = (int) (Math.random() * 10);
			counter++;

			// ispisujemo slucajni broj
			System.out.print(numbers[i] + " ");

			// ako je brojac djeljiv sa 10, prelazimo u novi red
			if (counter % 10 == 0) {
				System.out.println();
			}

			// povecavamo brojac odredjenog broja u nizu
			counts[numbers[i]]++;
		}

		System.out.println();

		// ispisujemo broj ponavljanja
		for (int i = 0; i < counts.length; i++) {
			System.out.println("The number of " + i + "s: " + counts[i]);
		}

	}

}
