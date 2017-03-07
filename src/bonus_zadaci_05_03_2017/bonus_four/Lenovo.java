package bonus_zadaci_05_03_2017.bonus_four;

public class Lenovo implements Phone {

	private boolean possessingFrontCamera;
	private int numberOfCPUCores;
	private double displaySize;
	private double androidVersion;

	public boolean isPossessingFrontCamera() {
		return possessingFrontCamera;
	}

	public void setPossessingFrontCamera(boolean possessingFrontCamera) {
		this.possessingFrontCamera = possessingFrontCamera;
	}

	public int getNumberOfCPUCores() {
		return numberOfCPUCores;
	}

	public void setNumberOfCPUCores(int numberOfCPUCores) {
		this.numberOfCPUCores = numberOfCPUCores;
	}

	public double getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(double displaySize) {
		this.displaySize = displaySize;
	}

	public double getAndroidVersion() {
		return androidVersion;
	}

	public void setAndroidVersion(double androidVersion) {
		this.androidVersion = androidVersion;
	}

	@Override
	public void printInfo() {
		System.out.println("Phone type: "
				+ super.getClass().getSuperclass().getSimpleName());
		System.out.println("Supports front camera: "
				+ isPossessingFrontCamera());
		System.out.println("Number of cores: " + getNumberOfCPUCores());
		System.out.println("Display size: " + getDisplaySize());
		System.out.println("Android version: " + getAndroidVersion() + "\n");
	}

}
