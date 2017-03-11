package zadaci_11_03_2017;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Zadatak05 {

	public static void main(String[] args) throws IOException {

		/*
		 * (Create large dataset) Create a data file with 1,000 lines. Each line
		 * in the file consists of a faculty member’s first name, last name,
		 * rank, and salary. The faculty member’s first name and last name for
		 * the ith line are FirstNamei and LastNamei. The rank is randomly
		 * generated as assistant, associate, and full. The salary is randomly
		 * generated as a number with two digits after the decimal point. The
		 * salary for an assistant professor should be in the range from 50,000
		 * to 80,000, for associate professor from 60,000 to 110,000, and for
		 * full professor from 75,000 to 130,000. Save the file in Salary.txt.
		 * Here are some sample data: FirstName1 LastName1 assistant 60055.95
		 * FirstName2 LastName2 associate 81112.45 . . . FirstName1000
		 * LastName1000 full 92255.21
		 */

		Path path = Paths.get("src/zadaci_11_03_2017/Salary.txt");

		if (!Files.exists(path)) {
			Files.createFile(path);
		}

		BufferedWriter writer = Files.newBufferedWriter(path);

		for (int i = 1; i <= 1000; i++) {
			// write firstname and lastname
			writer.write("FirstName" + i + " ");
			writer.write("LastName" + i + " ");

			// write rank
			String rank = getRandomRank();
			writer.write(rank + " ");

			// format and write salary
			double salary = getSalaryFromRank(rank);
			writer.write(String.format("%2.2f", salary) + " ");

			writer.newLine();
		}

		writer.close();

	}

	// method that generates random rank
	public static String getRandomRank() {
		String rank = "";
		int randomNumber = (int) (Math.random() * 3);

		switch (randomNumber) {
		case 0:
			rank = "assistant";
			break;
		case 1:
			rank = "associate";
			break;
		case 2:
			rank = "full";
		}

		return rank;
	}

	// method that return salary from rank
	public static double getSalaryFromRank(String rank) {
		double salary = 0;

		if (rank.equals("assistant")) {
			salary = (Math.random() * 30000 + 50000);
		} else if (rank.equals("associate")) {
			salary = (Math.random() * 50000 + 60000);
		} else if (rank.equals("full")) {
			salary = (Math.random() * 55000 + 75000);
		}

		return salary;
	}

}
