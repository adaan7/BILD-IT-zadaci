package zadaci_03_03_2017;

public class Zadatak03TestMyPoint {

	public static void main(String[] args) {

		// kreiramo dva MyPoint objekta
		MyPoint point1 = new MyPoint();
		MyPoint point2 = new MyPoint(10, 30.5);

		// ispisujemo udaljenost izmedju dvije tacke
		System.out.println("Distance is: " + point1.distance(point2));

	}

}
