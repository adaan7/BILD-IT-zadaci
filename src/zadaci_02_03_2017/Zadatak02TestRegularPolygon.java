package zadaci_02_03_2017;

public class Zadatak02TestRegularPolygon {

	public static void main(String[] args) {

		// pravimo 3 regularpolygon objekta
		RegularPolygon rp1 = new RegularPolygon();
		RegularPolygon rp2 = new RegularPolygon(6, 4);
		RegularPolygon rp3 = new RegularPolygon(10, 4, 5.6, 7.8);

		// ispisujemo povrsinu i obim za prvi rp objekat
		System.out.println("Regular Polygon 1:");
		System.out.println("The area: " + rp1.getArea());
		System.out.println("The perimeter: " + rp1.getPerimeter());

		// ispisujemo povrsinu i obim za drugi rp objekat
		System.out.println("\nRegular Polygon 2:");
		System.out.println("The area: " + rp2.getArea());
		System.out.println("The perimeter: " + rp2.getPerimeter());

		// ispisujemo povrsinu i obim za treci rp objekat
		System.out.println("\nRegular Polygon 3:");
		System.out.println("The area: " + rp3.getArea());
		System.out.println("The perimeter: " + rp3.getPerimeter());

	}

}
