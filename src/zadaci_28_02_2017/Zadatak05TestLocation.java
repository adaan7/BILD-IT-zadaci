package zadaci_28_02_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.DoubleUserInput;
import ba.adan.zadaci.ui.IntUserInput;

public class Zadatak05TestLocation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// uzimamo unos redova i kolona od korisnika
		int rows = IntUserInput.getInt(input,
				"Enter the number of rows in the array: ", 1, 100);
		int columns = IntUserInput.getInt(input,
				"Enter the number of columns in the array: ", 1, 100);

		double[][] array = new double[rows][columns];

		System.out.println("\nEnter the " + rows + "x" + columns + " array");

		// uzimamo unos vrijednosti niza od korisnika
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = DoubleUserInput.getDouble(input,
						"Enter a value: ");
			}
		}

		input.close();

		// pozivamo metodu locate largest za lokaciju najveceg elementa u nizu
		Location largest = Location.locateLargest(array);

		// ispisujemo najveci element u nizu i njegovu lokaciju
		System.out.println("\nThe location of the largest element is "
				+ largest.maxValue + " at (" + largest.row + ", "
				+ largest.column + ")");

	}

}
