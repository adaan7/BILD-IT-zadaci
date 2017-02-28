package zadaci_28_02_2017;

public class Zadatak03TestStopwatch {

	public static void main(String[] args) {

		/*
		 * Write a test program that measures the execution time of sorting
		 * 100,000 numbers using selection sort.
		 */

		Stopwatch casio = new Stopwatch();

		int[] numbers = new int[100000];

		// generisemo random integere izmedju 0 do 100000 i ubacujemo u niz
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100000);
		}

		// pozivamo metodu koja pocinje mjerenje vremena
		casio.start();

		// pozivamo metodu koja sortira brojeve
		selectionSort(numbers);

		// pozivamo metodu koja zaustavlja mjerenje vremena
		casio.stop();

		// ispisujemo proteklo vrijeme
		System.out.println("The execution time of sorting 100,000"
				+ " numbers with selection sort is " + casio.getElapsedTime()
				+ " milliseconds.");

	}

	// metoda koja sortira niz
	public static void selectionSort(int[] numbers) {
		for (int i = 0; i < numbers.length - 1; i++) {
			int currentMin = numbers[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < numbers.length; j++) {
				if (currentMin > numbers[j]) {
					currentMin = numbers[j];
					currentMinIndex = j;
				}
			}

			if (currentMinIndex != i) {
				numbers[currentMinIndex] = numbers[i];
				numbers[i] = currentMin;
			}
		}
	}

}
