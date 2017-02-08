package zadaci_08_02_2017;

public class Zadatak04 {

	public static void main(String[] args) {

		// kreiramo niz od 100 brojeva
		int[] numList = new int[100];
		// kreiramo niz od 10 brojeva koji ce sadržavati broj ponavljanja svakog
		// broja od 0 do 9
		int[] counts = new int[10];

		// prolazimo petljom kroz niz i dodajemo random brojeve
		for (int i = 0; i < numList.length; i++) {
			int randomNumber = (int) (Math.random() * 10);

			numList[i] = randomNumber;
		}

		int counter = 0;

		// prolazimo petljom kroz niz i brojimo ponavljanje svakog broja
		for (int i = 0; i < numList.length; i++) {
			counts[numList[i]]++;

			// ispisujemo sve brojeve u nizu
			System.out.print(numList[i] + " ");
			counter++;

			// ako je 10 brojeva u jednom redu, prelazimo u novi red i counter
			// vraæamo na 0
			if (counter == 10) {
				System.out.println();
				counter = 0;
			}
		}

		System.out.println();

		// prolazimo petljom kroz niz i ispisujemo broj ponavljanja svakog broja
		for (int i = 0; i < counts.length; i++) {
			System.out.println("Broj " + i + " se ponavlja " + counts[i]
					+ " puta.");
		}

	}

}
