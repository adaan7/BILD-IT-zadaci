package zadaci_27_02_2017;

public class Zadatak04 {

	public static void main(String[] args) {

		/*
		 * *8.16 (Sort two-dimensional array) Write a method to sort a
		 * two-dimensional array using the following header: public static void
		 * sort(int m[][]) The method performs a primary sort on rows and a
		 * secondary sort on columns. For example, the following array {{4,
		 * 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}} will be sorted to {{1, 1},{1,
		 * 2},{1, 7},{4, 1},{4, 2},{4, 5}}.
		 */

		int[][] array = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 },
				{ 4, 1 } };

		// pozivamo metodu koja sortira niz
		sort(array);

		// ispisujemo 2d niz
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}

			System.out.println();
		}

	}

	// metoda koja sortira 2d niz
	public static void sort(int m[][]) {
		for (int i = 0; i < m.length - 1; i++) {
			int currentMinRow = m[i][0];
			int currentMinCol = m[i][1];
			int currentMinIndex = i;

			for (int j = i + 1; j < m.length; j++) {
				if (currentMinRow > m[j][0]) {
					// ako je trenutni najmanji broj na poziciji 0 veci od
					// trenutnog broja na poziciji 0, taj broj postaje trenutni
					// najmanji broj, broj na poziciji 1 ostaje isti
					currentMinRow = m[j][0];
					currentMinCol = m[j][1];
					currentMinIndex = j;
				} else if (currentMinRow == m[j][0] && currentMinCol > m[j][1]) {
					// ako je trenutni najmanji broj na poziciji 0 jednak
					// trenutnom broju na poziciji 0, provjeravamo brojeve na
					// poziciji 1 i mijenjamo mjesta ako je potrebno
					currentMinRow = m[j][0];
					currentMinCol = m[j][1];
					currentMinIndex = j;
				}
			}

			if (currentMinIndex != i) {
				m[currentMinIndex][0] = m[i][0];
				m[i][0] = currentMinRow;
				m[currentMinIndex][1] = m[i][1];
				m[i][1] = currentMinCol;
			}
		}
	}

}
