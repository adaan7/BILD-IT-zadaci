package zadaci_11_03_2017;

import java.net.URL;
import java.util.Scanner;

public class Zadatak03 {

	public static void main(String[] args) {

		/*
		 * (Count words) Write a program that counts the number of words in
		 * President Abraham Lincoln’s Gettysburg address from
		 * http://cs.armstrong.edu/liang/data/ Lincoln.txt.
		 */

		String urlString = "http://cs.armstrong.edu/liang/data/Lincoln.txt";
		int countWords = 0;

		try {
			URL url = new URL(urlString);

			// new scanner object for reading a file from url
			Scanner readFromUrl = new Scanner(url.openStream());

			while (readFromUrl.hasNextLine()) {
				String line = readFromUrl.nextLine();

				// split line into words
				String[] words = line.split(" ");

				// sum every words array length and get words count
				countWords += words.length;
			}

			readFromUrl.close();

			// display number of words
			System.out.println("The number of words: " + countWords);
		} catch (Exception ex) {
			System.out.println("Invalid URL or no such file.");
		}

	}

}
