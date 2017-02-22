package zadaci_22_02_2017;

public class Zadatak01 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji nasumièno generiše cijeli broj izmeðu 1 i 12 te
		 * ispisuje ime mjeseca za taj broj. (Januar za 1, Ferbruar za 2....)
		 */
		
		// niz stringova sa imenima mjeseca
		String[] months = { "", "Januar", "Februar", "Mart", "April", "Maj",
				"Juni", "Juli", "August", "Septembar", "Oktobar", "Novembar",
				"Decembar" };
		
		// generisemo randomm integer izmedju 1 i 12
		int randomNumber = (int)(Math.random() * 12 + 1);
		
		// ispisujemo slucajni mjesec
		System.out.println("Slucajni mjesec: " + months[randomNumber]);

	}

}
