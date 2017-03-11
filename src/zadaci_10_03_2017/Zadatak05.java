package zadaci_10_03_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import ba.adan.zadaci.ui.StringUserInput;

public class Zadatak05 {

	public static void main(String[] args) throws IOException {

		/*
		 * (Process scores in a text file) Suppose that a text file contains an
		 * unspecified number of scores separated by blanks. Write a program
		 * that prompts the user to enter the file, reads the scores from the
		 * file, and displays their total and average.
		 */

		Scanner input = new Scanner(System.in);
		
		String fileName = StringUserInput.getString(input, "Enter the file: ");

		Path path = Paths.get("src/zadaci_10_03_2017/" + fileName + ".txt");

		if (!Files.exists(path)) {
			System.out.println("File does not exist.");
			System.exit(0);
		}

		BufferedReader reader = Files.newBufferedReader(path);

		// create array list of doubles to store scores
		ArrayList<Double> scores = new ArrayList<>();
		String line = "";

		// read scores from a file
		while ((line = reader.readLine()) != null) {
			try {
				double number = Double.parseDouble(line);
				
				scores.add(number);
			} catch (Exception ex) {
				System.out.println("Line from a text file is not a number.");
				System.exit(0);
			}
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
