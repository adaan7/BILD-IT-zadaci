package zadaci_03_03_2017;

public class Zadatak01TestTime {

	public static void main(String[] args) {

		// pravimo dva Time objekta, jedan sa trenutnim vremenom a drugi sa
		// specificnim proteklim vremenom
		Time time1 = new Time();
		Time time2 = new Time(555550000);
		
		// ispisujemo vrijeme
		System.out.println("Current time: " + time1.toString());
		System.out.println("Specified time: " + time2.toString());

	}

}
