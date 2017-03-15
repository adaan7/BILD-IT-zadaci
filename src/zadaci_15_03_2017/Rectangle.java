package zadaci_15_03_2017;

public class Rectangle extends GeometricObject implements Comparable<Rectangle> {
	
	private double width = 1;
	private double height = 1;
	
	public Rectangle() {
		
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return 2 * (width * height);
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWidth() {
		return width;
	}

	@Override
	public int compareTo(Rectangle rectangle) {
		if (this.getArea() > rectangle.getArea()) {
			return 1;
		} else if (this.getArea() < rectangle.getArea()) {
			return -1;
		}
		
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.compareTo((Rectangle)obj) == 0) {
			return true;
		}
		
		return false;
	}

}
