package bonus_zadaci_05_03_2017.bonus_four;

public class Nokia implements Phone {

	private String operatingSystem;
	private int verticalPixels;
	private int horisontalPixels;
	private double cameraMegaPixels;

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public int getVerticalPixels() {
		return verticalPixels;
	}

	public void setVerticalPixels(int verticalPixels) {
		this.verticalPixels = verticalPixels;
	}

	public int getHorisontalPixels() {
		return horisontalPixels;
	}

	public void setHorisontalPixels(int horisontalPixels) {
		this.horisontalPixels = horisontalPixels;
	}

	public double getCameraMegaPixels() {
		return cameraMegaPixels;
	}

	public void setCameraMegaPixels(double cameraMegaPixels) {
		this.cameraMegaPixels = cameraMegaPixels;
	}

	@Override
	public void printInfo() {
		System.out.println("Phone type: "
				+ super.getClass().getSuperclass().getSimpleName());
		System.out.println("Operating system: " + getOperatingSystem());
		System.out.println("Resolution: " + getHorisontalPixels() + "x"
				+ getVerticalPixels());
		System.out.println("Camera resolution: " + getCameraMegaPixels()
				+ "MP\n");
	}

}