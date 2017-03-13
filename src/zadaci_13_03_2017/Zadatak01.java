package zadaci_13_03_2017;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak01 {

	public static void main(String[] args) {

		/*
		 * (Process large dataset) A university posts its employees’ salaries at
		 * http:// cs.armstrong.edu/liang/data/Salary.txt. Each line in the file
		 * consists of a faculty member’s first name, last name, rank, and
		 * salary (see Programming Exercise 12.24). Write a program to display
		 * the total salary for assistant professors, associate professors, full
		 * professors, and all faculty, respectively, and display the average
		 * salary for assistant professors, associate professors, full
		 * professors, and all faculty, respectively.
		 */

		// create array list of double to store each salary
		ArrayList<Double> assistantSalaryList = new ArrayList<>();
		ArrayList<Double> associateSalaryList = new ArrayList<>();
		ArrayList<Double> fullSalaryList = new ArrayList<>();

		try {
			URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");

			Scanner readFromUrl = new Scanner(url.openStream());

			while (readFromUrl.hasNext()) {
				@SuppressWarnings("unused")
				String firstName = readFromUrl.next();
				@SuppressWarnings("unused")
				String lastName = readFromUrl.next();
				String rank = readFromUrl.next();
				double salary = readFromUrl.nextDouble();

				// add salary into array list
				if (rank.equals("assistant")) {
					assistantSalaryList.add(salary);
				} else if (rank.equals("associate")) {
					associateSalaryList.add(salary);
				} else if (rank.equals("full")) {
					fullSalaryList.add(salary);
				}
			}

			readFromUrl.close();

		} catch (Exception ex) {
			System.out.println("Invalid URL or no such file.");
			System.exit(0);
		}

		double totalAssistantSalary = getTotalSalary(assistantSalaryList);
		double totalAssociateSalary = getTotalSalary(associateSalaryList);
		double totalFullSalary = getTotalSalary(fullSalaryList);
		double totalSalary = totalAssistantSalary + totalAssociateSalary
				+ totalFullSalary;

		double averageAssistantSalary = getAverageSalary(assistantSalaryList);
		double averageAssociateSalary = getAverageSalary(associateSalaryList);
		double averageFullSalary = getAverageSalary(fullSalaryList);
		double averageSalary = totalSalary
				/ (assistantSalaryList.size() + associateSalaryList.size() + fullSalaryList
						.size());

		// display total salary
		System.out.printf("The total salary for assistant professors: %2.2f",
				totalAssistantSalary);
		System.out.printf("\nThe total salary for associate professors: %2.2f",
				totalAssociateSalary);
		System.out.printf("\nThe total salary for full professors: %2.2f",
				totalFullSalary);
		System.out.printf("\nThe total salary: %2.2f", totalSalary);

		// display average salary
		System.out.printf(
				"\n\nThe average salary for assistant professors: %2.2f",
				averageAssistantSalary);
		System.out.printf(
				"\nThe average salary for associate professors: %2.2f",
				averageAssociateSalary);
		System.out.printf("\nThe average salary for full professors: %2.2f",
				averageFullSalary);
		System.out.printf("\nThe average salary: %2.2f", averageSalary);

	}

	// method that return total salary
	public static double getTotalSalary(ArrayList<Double> list) {
		double sum = 0;

		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}

		return sum;
	}

	// method that return average salary
	public static double getAverageSalary(ArrayList<Double> list) {
		double total = getTotalSalary(list);

		return total / list.size();
	}

}
