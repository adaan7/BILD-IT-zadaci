package zadaci_06_03_2017;

public class Zadatak03TestMyCharacter {

	public static void main(String[] args) {
		
		MyCharacter myChar = new MyCharacter('d');
		
		// testing some MyCharacter methods
		System.out.println(myChar.charValue());
		System.out.println(myChar.equals('e'));
		
		System.out.println(MyCharacter.isDigit('e'));
		System.out.println(MyCharacter.toLowerCase('D'));

	}

}
