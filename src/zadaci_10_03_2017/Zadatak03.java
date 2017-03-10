package zadaci_10_03_2017;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Zadatak03 {

	public static void main(String[] args) throws IOException {

		/*
		 * (Remove text) Write a program that removes all the occurrences of a
		 * specified string from a text file. For example, invoking java
		 * Exercise12_11 John filename removes the string John from the
		 * specified file. Your program should get the arguments from the
		 * command line.
		 */

		String fileName = args[0];
		String stringToRemove = args[1];

		ArrayList<String> list = new ArrayList<>();

		copyFileToStringList(list, fileName);

		removeSpecifiedString(list, stringToRemove);

		copyStringListToFile(list, fileName);

	}

	// method that remove specified string from array list of strings
	public static void removeSpecifiedString(ArrayList<String> list,
			String stringToRemove) {

		int counter = 0;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(stringToRemove)) {
				list.remove(i);
				counter++;
			}
		}

		if (counter == 0) {
			System.out.println("There was no such string in this file.");
		} else {
			System.out.println(counter + " occurences of '" + stringToRemove
					+ "' are successfully removed.");
		}
	}

	// method that copy a file to array list of strings
	public static void copyFileToStringList(ArrayList<String> list,
			String fileName) throws IOException {

		Path path = Paths.get("src/zadaci_10_03_2017/" + fileName);

		if (!Files.exists(path)) {
			Files.createFile(path);
		}

		BufferedReader reader = Files.newBufferedReader(path);

		String line = "";

		while ((line = reader.readLine()) != null) {
			String[] words = line.split(" ");

			for (int i = 0; i < words.length; i++) {
				list.add(words[i]);
			}

			list.add("|||");
		}

		reader.close();
	}

	// method that copy array list of strings to a file
	public static void copyStringListToFile(ArrayList<String> list,
			String fileName) throws IOException {

		Path path = Paths.get("src/zadaci_10_03_2017/" + fileName);

		if (!Files.exists(path)) {
			Files.createFile(path);
		}

		BufferedWriter writer = Files.newBufferedWriter(path);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("|||")) {
				writer.newLine();
			} else {
				writer.write(list.get(i) + " ");
			}
		}

		writer.close();
	}

}
