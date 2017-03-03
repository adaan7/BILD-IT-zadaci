package zadaci_03_03_2017;

public class MyPoint {

	private double x;
	private double y;

	public MyPoint() {
		x = 0;
		y = 0;
	}

	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	// metoda koja vraca udaljenost izmedju mypoint objekta i drugog specificnog
	// mypoint objekta
	public double distance(MyPoint myPoint) {
		double x1 = this.x;
		double y1 = this.y;
		double x2 = myPoint.getX();
		double y2 = myPoint.getY();

		return Math.pow((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)),
				0.5);
	}

	// metoda koja vraca udaljenost izmedju mypoint objekta i specificnih
	// koordinata
	public double distance(double x2, double y2) {
		MyPoint myPoint = new MyPoint(x2, y2);

		return this.distance(myPoint);
	}

}
