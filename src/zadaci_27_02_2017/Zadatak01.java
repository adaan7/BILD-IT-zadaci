package zadaci_27_02_2017;

public class Zadatak01 {

	public static void main(String[] args) {

		/*
		 * (Compute the weekly hours for each employee) Suppose the weekly hours
		 * for all employees are stored in a two-dimensional array. Each row
		 * records an employee’s seven-day work hours with seven columns. For
		 * example, the following array stores the work hours for eight
		 * employees. Write a program that displays employees and their total
		 * hours in decreasing order of the total hours.
		 */

		// pravimo niz sa satima zaposlenika
		int[][] workHours = { { 2, 4, 3, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4, 4 },
				{ 3, 3, 4, 3, 3, 2, 2 }, { 9, 3, 4, 7, 3, 4, 1 },
				{ 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 6, 3, 4, 4 },
				{ 3, 7, 4, 8, 3, 8, 4 }, { 6, 3, 5, 9, 2, 7, 9 } };

		// pravimo niz koji ce da sadrzi zbir sati svakog zaposlenika
		int[][] totalHours = new int[workHours.length][2];

		for (int i = 0; i < workHours.length; i++) {
			int sumHours = 0;

			for (int j = 0; j < workHours[0].length; j++) {
				// sabiramo svaki red niza
				sumHours += workHours[i][j];
			}

			totalHours[i][0] = i;
			totalHours[i][1] = sumHours;
		}

		// pozivamo metodu koja sortira po rastucem redoslijedu
		sortArray(totalHours);

		// ispisujemo sortirani niz od kraja
		for (int i = totalHours.length - 1; i >= 0; i--) {
			System.out.println("Employee " + totalHours[i][0]
					+ "'s total hours is " + totalHours[i][1]);
		}

	}
	
	// metoda koja sortira 2d niz
	public static void sortArray(int[][] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int currentMin = array[i][1];
			int currentMinIndex = i;

			for (int j = i + 1; j < array.length; j++) {
				if (currentMin > array[j][1]) {
					currentMin = array[j][1];
					currentMinIndex = j;
				}
			}

			if (currentMinIndex != i) {
				array[currentMinIndex][1] = array[i][1];
				array[i][1] = currentMin;
				array[currentMinIndex][0] = array[i][0];
				array[i][0] = currentMinIndex;
			}
		}
	}

}
