package zadaci_06_03_2017;

import java.util.ArrayList;

public class Zadatak04 {

	public static void main(String[] args) {

		/*
		 * (New string split method) The split method in the String class
		 * returns an array of strings consisting of the substrings split by the
		 * delimiters. However, the delimiters are not returned. Implement the
		 * following new method that returns an array of strings consisting of
		 * the substrings split by the matching delimiters, including the
		 * matching delimiters. public static String[] split(String s, String
		 * regex) For example, split("ab#12#453", "#") returns ab, #, 12, #, 453
		 * in an array of String, and split("a?b?gf#e", "[?#]") returns a, b, ?,
		 * b, gf, #, and e in an array of String.
		 */

		// calling methods to split array with regex
		String[] sArray1 = split("ab#12#453", "#");
		String[] sArray2 = split("a?b?gf#e", "[?#]");

		// display elements from array
		for (int i = 0; i < sArray1.length; i++) {
			System.out.print(sArray1[i] + ", ");
		}

		System.out.println();

		for (int i = 0; i < sArray2.length; i++) {
			System.out.print(sArray2[i] + ", ");
		}

	}

	public static String[] split(String s, String regex) {
		String[] sArray = new String[s.length()];
		int index = 0;

		if (checkRegex(regex)) {
			// check if regex is an array
			regex = getRegex(regex);
		}

		for (int i = 0; i < sArray.length; i++) {
			if (sArray[index] == null) {
				sArray[index] = "";
			}

			if (regex.contains(s.charAt(i) + "")) {
				sArray[index + 1] = s.charAt(i) + "";

				index += 2;
			} else {

				sArray[index] += s.charAt(i);
			}
		}

		// creating temp arraylist to store elements
		ArrayList<String> tempArray = new ArrayList<>();
		int counter = 0;

		for (int i = 0; i < sArray.length; i++) {
			if (sArray[i] != null) {
				tempArray.add(sArray[i]);
				counter++;
			} else {
				break;
			}
		}

		String[] splitArray = new String[counter];

		// copy elements from arraylist to array of strings
		for (int i = 0; i < splitArray.length; i++) {
			splitArray[i] = tempArray.get(i);
		}

		return splitArray;
	}

	// method that return true if a regex is array
	public static boolean checkRegex(String regex) {
		if (regex.charAt(0) == '[' && regex.charAt(regex.length() - 1) == ']') {
			return true;
		}

		return false;
	}

	// method that return regex
	public static String getRegex(String regex) {
		if (checkRegex(regex)) {
			return regex.substring(1, regex.length() - 1);
		}

		return regex;
	}

}
