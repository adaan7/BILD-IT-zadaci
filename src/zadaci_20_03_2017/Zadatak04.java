package zadaci_20_03_2017;

public class Zadatak04 {

	public static void main(String[] args) {

		/*
		 * (Maximum element in a two-dimensional array) Write a generic method
		 * that returns the maximum element in a two-dimensional array. public
		 * static <E extends Comparable<E>> E max(E[][] list)
		 */
		
		Integer[][] matrix = {{1, 2, 3}, {7, 4, 3}, {9, 5, 6}};
		
		System.out.println("The maximum element in a two dimensional array is: " + max(matrix));
		
	}

	// method that returns the maximum element in a two-dimensional array
	public static <E extends Comparable<E>> E max(E[][] list) {
		E max = list[0][0];

		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				if (max.compareTo(list[i][j]) < 0) {
					max = list[i][j];
				}
			}
		}

		return max;
	}

}
