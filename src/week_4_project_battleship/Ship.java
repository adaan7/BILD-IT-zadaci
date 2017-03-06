package week_4_project_battleship;

public class Ship {

	private String shipName;
	private boolean isDestroyed;
	private int shipLength;
	private int numberOfHits;

	public Ship() {
		shipName = "";
		isDestroyed = false;
		shipLength = 1;
		numberOfHits = 0;
	}

	public Ship(String shipName, int shipLength) {
		this.shipName = shipName;
		this.shipLength = shipLength;
		isDestroyed = false;
		numberOfHits = 0;
	}

	public boolean isDestroyed() {
		return isDestroyed;
	}

	public void setDestroyed(boolean isDestroyed) {
		this.isDestroyed = isDestroyed;
	}

	public int getNumberOfHits() {
		return numberOfHits;
	}

	public void hit() {
		this.numberOfHits++;
	}

	public String getShipName() {
		return shipName;
	}

	public int getShipLength() {
		return shipLength;
	}

}
