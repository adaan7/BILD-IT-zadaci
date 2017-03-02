package zadaci_02_03_2017;

public class Fan {

	private final int SLOW = 1, MEDIUM = 2, FAST = 3;
	private int speed;
	private boolean on;
	private double radius;
	private String color;

	Fan() {
		speed = SLOW;
		on = false;
		radius = 5;
		color = "blue";
	}

	public int getSpeed() {
		return speed;
	}

	public boolean isOn() {
		return on;
	}

	public double getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}

	public void setSpeed(int speed) {
		if (speed >= SLOW && speed <= FAST) {
			this.speed = speed;
		}
	}

	public void setPower(boolean on) {
		this.on = on;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		String description = "";

		String sSpeed = "";

		switch (speed) {
		case 1:
			sSpeed = "SLOW";
			break;
		case 2:
			sSpeed = "MEDIUM";
			break;
		case 3:
			sSpeed = "FAST";
		}

		if (on == true) {
			description = "Speed: " + sSpeed + ", Radius: " + radius
					+ ", Color: " + color;
		} else {
			description = "Fan is off, Radius: " + radius + ", Color: " + color;
		}

		return description;
	}

	public String speedLevels() {
		return "SLOW = " + SLOW + " MEDIUM = " + MEDIUM + " FAST = " + FAST;
	}

}
