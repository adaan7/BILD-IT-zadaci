package zadaci_20_03_2017;

public class Zadatak03 {

	public static void main(String[] args) {

		/*
		 * (Maximum element in an array) Implement the following method that
		 * returns the maximum element in an array. public static <E extends
		 * Comparable<E>> E max(E[] list)
		 */

		Integer[] numbers = { 1, 5, 7, 2, 3 };
		String[] cities = { "London", "Paris", "Birmingham", "Oslo" };

		System.out.println("The maximum element in an array is: "
				+ max(numbers));
		System.out
				.println("The maximum element in an array is: " + max(cities));

	}

	// method that returns the maximum element in an array
	public static <E extends Comparable<E>> E max(E[] list) {
		E max = list[0];

		for (int i = 0; i < list.length; i++) {
			if (max.compareTo(list[i]) < 0) {
				max = list[i];
			}
		}

		return max;
	}

}
