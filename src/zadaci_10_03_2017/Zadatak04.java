package zadaci_10_03_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Zadatak04 {

	public static void main(String[] args) throws IOException {

		/*
		 * (Count characters, words, and lines in a file) Write a program that
		 * will count the number of characters, words, and lines in a file.
		 * Words are separated by whitespace characters. The file name should be
		 * passed as a command-line argument, as shown in Figure 12.13.
		 */

		String fileName = args[0];

		Path path = Paths.get("src/zadaci_10_03_2017/" + fileName);

		// check if file exists
		if (!Files.exists(path)) {
			Files.createFile(path);
		}

		BufferedReader reader = Files.newBufferedReader(path);

		String line = "";
		int countLines = 0;
		int countWords = 0;
		int countChars = 0;

		while ((line = reader.readLine()) != null) {
			countLines++;
			countChars += line.length();

			// split line into a array of strings
			String[] words = line.split(" ");

			countWords += words.length;
		}

		reader.close();

		// display number of lines, words and chars
		System.out.println("The number of lines: " + countLines);
		System.out.println("The number of words: " + countWords);
		System.out.println("The number of characters: " + countChars);

	}

}
