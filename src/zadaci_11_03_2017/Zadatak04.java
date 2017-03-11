package zadaci_11_03_2017;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak04 {

	public static void main(String[] args) {

		/*
		 * (Process scores in a text file on the Web) Suppose that the text file
		 * on the Web http://cs.armstrong.edu/liang/data/Scores.txt contains an
		 * unspecified number of scores. Write a program that reads the scores
		 * from the file and displays their total and average. Scores are
		 * separated by blanks.
		 */

		String fileName = "http://cs.armstrong.edu/liang/data/Scores.txt";

		ArrayList<Double> scores = new ArrayList<>();
		double sum = 0, average = 0;

		try {
			URL url = new URL(fileName);

			Scanner readFromUrl = new Scanner(url.openStream());

			while (readFromUrl.hasNext()) {
				// read file from url
				try {
					double number = readFromUrl.nextDouble();

					scores.add(number);
				} catch (Exception ex) {
					System.out.println("Input from a text is not a number.");
					System.exit(0);
				}
			}

			readFromUrl.close();

		} catch (Exception ex) {
			System.out.println("Invalid URL or no such file.");
			System.exit(0);
		}

		// get total of scores
		for (int i = 0; i < scores.size(); i++) {
			sum += scores.get(i);
		}

		// get average
		average = sum / scores.size();

		// display total and average
		System.out.println("The total is: " + sum);
		System.out.println("The average is: " + average);

	}

}
