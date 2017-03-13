package zadaci_13_03_2017;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import ba.adan.zadaci.ui.StringUserInput;

public class Zadatak02 {

	public static void main(String[] args) throws IOException {

		/*
		 * (Occurrences of each letter) Write a program that prompts the user to
		 * enter a file name and displays the occurrences of each letter in the
		 * file. Letters are case-insensitive.
		 */

		Scanner input = new Scanner(System.in);

		String fileName = "";
		boolean wrongFileName = true;

		Path path = Paths.get("src/zadaci_13_03_2017/" + fileName);

		while (wrongFileName) {
			// take input of filename from user until
			fileName = StringUserInput.getString(input, "Enter a filename: ");

			wrongFileName = false;

			path = Paths.get("src/zadaci_13_03_2017/" + fileName);

			if (!Files.exists(path)) {
				System.out.println("That file does not exist.");
				wrongFileName = true;
			}
		}

		int[] countUppercase = new int[26];

		Scanner readInput = new Scanner(path);

		String word = "";

		while (readInput.hasNext()) {
			word = readInput.next();

			// convert letters to uppercase
			word = word.toUpperCase();

			for (int i = 0; i < word.length(); i++) {
				char character = word.charAt(i);

				if (character >= 65 && character <= 90) {
					// count occurence of each letter
					countUppercase[character - 65]++;
				}
			}
		}

		readInput.close();
		input.close();

		// display occurences of each letter
		for (int i = 0; i < countUppercase.length; i++) {
			System.out.println("Number of " + (char) (i + 65) + "'s: "
					+ countUppercase[i]);
		}

	}

}
