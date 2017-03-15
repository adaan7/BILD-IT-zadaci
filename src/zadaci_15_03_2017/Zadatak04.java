package zadaci_15_03_2017;

public class Zadatak04 {

	public static void main(String[] args) {

		/*
		 * (Sum the areas of geometric objects) Write a method that sums the
		 * areas of all the geometric objects in an array. The method signature
		 * is: public static double sumArea(GeometricObject[] a) Write a test
		 * program that creates an array of four objects (two circles and two
		 * rectangles) and computes their total area using the sumArea method.
		 */
		
		// testing sumArea method
		GeometricObject[] group = new GeometricObject[4];

		group[0] = new Circle(2);
		group[1] = new Circle(5);
		group[2] = new Rectangle(5, 6);
		group[3] = new Rectangle(7, 9);

		System.out.println("The sum of the areas: " + sumArea(group));

	}

	// method that return sum of the area of geometric objects
	public static double sumArea(GeometricObject[] a) {
		double sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum += a[i].getArea();
		}

		return sum;
	}

}
