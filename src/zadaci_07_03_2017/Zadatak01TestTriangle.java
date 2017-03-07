package zadaci_07_03_2017;

import java.util.Scanner;

import ba.adan.zadaci.ui.DoubleUserInput;
import ba.adan.zadaci.ui.IntUserInput;
import ba.adan.zadaci.ui.StringUserInput;

public class Zadatak01TestTriangle {

	public static void main(String[] args) {

		/*
		 * Write a test program that prompts the user to enter three sides of
		 * the triangle, a color, and a Boolean value to indicate whether the
		 * triangle is filled. The program should create a Triangle object with
		 * these sides and set the color and filled properties using the input.
		 * The program should display the area, perimeter, color, and true or
		 * false to indicate whether it is filled or not.
		 */

		Scanner input = new Scanner(System.in);

		// taking input from user
		double side1 = DoubleUserInput.getDouble(input,
				"Enter side1 of triangle: ", 1);
		double side2 = DoubleUserInput.getDouble(input,
				"Enter side2 of triangle: ", 1);
		double side3 = DoubleUserInput.getDouble(input,
				"Enter side3 of triangle: ", 1);
		input.nextLine();
		String color = StringUserInput.getString(input,
				"Enter a color of triangle: ");
		int getFilledOption = IntUserInput.getInt(input,
				"Is triangle filled (1 - yes, 2 - no): ", 1, 2);
		boolean isFilled = false;

		if (getFilledOption == 1) {
			isFilled = true;
		}
		
		input.close();

		// create new triangle object with specified values
		GeometricObject triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(isFilled);

		System.out.println("\n" + triangle.toString());

	}

}
