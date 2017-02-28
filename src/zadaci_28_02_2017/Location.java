package zadaci_28_02_2017;

public class Location {

	public int row;
	public int column;
	public double maxValue;

	Location() {
	}

	public static Location locateLargest(double array[][]) {
		Location largest = new Location();

		largest.maxValue = array[0][0];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (largest.maxValue < array[i][j]) {
					largest.maxValue = array[i][j];
					largest.row = i;
					largest.column = j;
				}
			}
		}

		return largest;
	}

}
