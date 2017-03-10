package zadaci_10_03_2017;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import ba.adan.zadaci.ui.DoubleUserInput;
import ba.adan.zadaci.ui.IntUserInput;

public class Zadatak05 {

	public static void main(String[] args) throws IOException {

		/*
		 * (Process scores in a text file) Suppose that a text file contains an
		 * unspecified number of scores separated by blanks. Write a program
		 * that prompts the user to enter the file, reads the scores from the
		 * file, and displays their total and average.
		 */

		Scanner input = new Scanner(System.in);

		Path path = Paths.get("src/zadaci_10_03_2017/scores.txt");

		if (!Files.exists(path)) {
			Files.createFile(path);
		}

		Scanner reader = new Scanner(path);
		BufferedWriter writer = Files.newBufferedWriter(path);

		boolean continueInput = true;

		// take input from user and write it down in file
		while (continueInput) {
			double score = DoubleUserInput.getDouble(input, "Enter a score: ",
					0);

			writer.write(score + " ");
			writer.newLine();

			int moreScores = IntUserInput.getInt(input,
					"Do you want to add more scores (1 - yes, 2 - no)? ", 1, 2);

			if (moreScores == 1) {
				continueInput = true;
			} else if (moreScores == 2) {
				continueInput = false;
			}
		}

		input.close();
		writer.close();

		// create array list of doubles to store scores
		ArrayList<Double> scores = new ArrayList<>();
		String line;

		// read scores from a file
		while (reader.hasNext()) {
			line = reader.nextLine();
			double number = Double.parseDouble(line);

			scores.add(number);
		}

		reader.close();

		// calculate total and average
		double sum = 0, average = 0;

		for (int i = 0; i < scores.size(); i++) {
			sum += scores.get(i);
		}

		average = sum / scores.size();

		// display total and average
		System.out.println("\nThe sum is " + sum);
		System.out.printf("The average is %2.2f", average);

	}

}
