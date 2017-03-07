package zadaci_07_03_2017;

public class GeometricObject {

	private String color;
	private boolean isFilled;

	public GeometricObject() {
		color = "white";
		isFilled = false;
	}

	public GeometricObject(String color, boolean isFilled) {
		this.color = color;
		this.isFilled = isFilled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}

	@Override
	public String toString() {
		return "Color: " + color + "\n" + "Is filled: " + isFilled;
	}

}
