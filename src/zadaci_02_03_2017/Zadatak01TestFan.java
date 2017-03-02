package zadaci_02_03_2017;

public class Zadatak01TestFan {

	public static void main(String[] args) {

		// pravimo novi fan objekat
		Fan philips = new Fan();
		// postavimo power na true, upalimo fan
		philips.setPower(true);
		// postavimo speed na high
		philips.setSpeed(3);
		// postavimo radius 10
		philips.setRadius(10);
		// postavimo zutu boju
		philips.setColor("yellow");

		Fan bosch = new Fan();
		bosch.setPower(false);
		bosch.setSpeed(2);
		bosch.setRadius(5);
		bosch.setColor("blue");

		// ispisujemo stanje fan-a
		System.out.println("Fan Philips: ");
		System.out.println(philips.toString());
		System.out.println("Fan Bosch:");
		System.out.println(bosch.toString());

	}

}
