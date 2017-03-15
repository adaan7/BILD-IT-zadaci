package zadaci_15_03_2017;

public class Circle extends GeometricObject implements Comparable<Circle> {

	private double radius;

	public Circle() {
		radius = 1;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	@Override
	public double getPerimeter() {
		return radius * 2 * Math.PI;
	}

	@Override
	public String toString() {
		return "Radius: " + radius + ", Area: " + getArea();
	}

	@Override
	public int compareTo(Circle circle) {
		if (this.radius > circle.getRadius()) {
			return 1;
		} else if (this.radius < circle.getRadius()) {
			return -1;
		}

		return 0;
	}

	@Override
	public boolean equals(Object o) {
		if (this.compareTo((Circle)o) == 0) {
			return true;
		}
		
		return false;
	}

}
