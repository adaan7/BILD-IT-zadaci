package zadaci_15_03_2017;

public class Zadatak01TestCircleComparable {

	public static void main(String[] args) {
		
		GeometricObject circle1 = new Circle(5);
		GeometricObject circle2 = new Circle(7);
		GeometricObject circle3 = new Circle(5);
		
		// testing circle equals method
		System.out.println("Is equals? " + circle1.equals(circle2));
		System.out.println("Is equals? " + circle1.equals(circle3));

	}

}
