package zadaci_15_03_2017;

public class Zadatak02TestRectangleComparable {

	public static void main(String[] args) {
		
		// testing rectangle equals method
		GeometricObject rectangle1 = new Rectangle(4, 5);
		GeometricObject rectangle2 = new Rectangle(2, 4);
		GeometricObject rectangle3 = new Rectangle(4, 5);
		
		System.out.println("Is equals? " + rectangle1.equals(rectangle2));
		System.out.println("Is equals? " + rectangle1.equals(rectangle3));

	}

}
