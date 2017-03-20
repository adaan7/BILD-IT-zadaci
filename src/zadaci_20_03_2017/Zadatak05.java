package zadaci_20_03_2017;

public class Zadatak05 {

	public static void main(String[] args) {

		/*
		 * (Generic binary search) Implement the following method using binary
		 * search. public static <E extends Comparable<E>> int binarySearch(E[]
		 * list, E key)
		 */

		Integer[] list = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };

		System.out.println("The position of the number 3 is: "
				+ binarySearch(list, 3));
		System.out.println("The position of the number 6 is: "
				+ binarySearch(list, 6));

	}

	// method that returns a position of a key, or a negative position if there
	// is no key in the list
	public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {

		return java.util.Arrays.binarySearch(list, key);
	}

}
