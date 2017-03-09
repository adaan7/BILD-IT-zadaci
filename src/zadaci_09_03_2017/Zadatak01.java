package zadaci_09_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

import zadaci_03_03_2017.MyPoint;
import ba.adan.zadaci.ui.DoubleUserInput;
import ba.adan.zadaci.ui.IntUserInput;

public class Zadatak01 {

	public static void main(String[] args) {

		/*
		 * (Area of a convex polygon) A polygon is convex if it contains any
		 * line segments that connects two points of the polygon. Write a
		 * program that prompts the user to enter the number of points in a
		 * convex polygon, then enter the points clockwise, and display the area
		 * of the polygon.
		 */

		Scanner input = new Scanner(System.in);

		// take input of number of points from user
		int numberOfPoints = IntUserInput.getInt(input,
				"Enter the number of the points: ", 3);

		// create array list of MyPoint to store points
		ArrayList<MyPoint> pointList = new ArrayList<>();

		// take input of points from user
		for (int i = 0; i < numberOfPoints; i++) {
			System.out.println("Enter point" + (i + 1));
			double x = DoubleUserInput.getDouble(input, "Enter x: ");
			double y = DoubleUserInput.getDouble(input, "Enter y: ");

			MyPoint point = new MyPoint(x, y);

			pointList.add(point);
		}

		input.close();

		// display area
		System.out.printf("\nThe total area is: %2.3f", getArea(pointList));

	}

	// method that return area of convex polygon
	public static double getArea(ArrayList<MyPoint> pointList) {
		double area = 0;
		double sum1 = 0;
		double sum2 = 0;

		for (int i = 0; i < pointList.size() - 1; i++) {
			MyPoint point1 = pointList.get(i);
			MyPoint point2 = pointList.get(i + 1);

			sum1 += (point1.getX() * point2.getY() - point1.getY()
					* point2.getX());
		}

		MyPoint lastPoint = pointList.get(pointList.size() - 1);
		MyPoint firstPoint = pointList.get(0);

		sum2 += (lastPoint.getX() * firstPoint.getY() - lastPoint.getY()
				* firstPoint.getX());

		area = Math.abs((sum1 + sum2) / 2);

		return area;
	}

}
