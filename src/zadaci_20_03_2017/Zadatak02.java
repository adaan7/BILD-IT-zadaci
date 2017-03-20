package zadaci_20_03_2017;

public class Zadatak02 {

	public static void main(String[] args) {

		/*
		 * (Generic linear search) Implement the following generic method for
		 * linear search. public static <E extends Comparable<E>> int
		 * linearSearch(E[] list, E key)
		 */

		Integer[] list = { 5, 7, 1, 3, 4 };

		System.out.println("Position of the number 1 in the list is: "
				+ linearSearch(list, 1));
		System.out.println("Position of the number 2 in the list is: "
				+ linearSearch(list, 2));

	}

	// method that return position of a key, or -1 if there is no key in the
	// list
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
		for (int i = 0; i < list.length; i++) {
			if (list[i].compareTo(key) == 0) {
				return i;
			}
		}

		return -1;
	}

}
