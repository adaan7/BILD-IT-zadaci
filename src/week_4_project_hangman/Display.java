package week_4_project_hangman;

public class Display {

	// metoda koja ispisuje vjesalicu
	public static void printHanger() {
		System.out.println(" ________");
		System.out.println(" |      |");
		System.out.println("        |");
		System.out.println("        |");
		System.out.println("        |");
		System.out.println("        |");
		System.out.println(" _______|__");
	}

	// metoda koja ispisuje glavu
	public static void printHead() {
		System.out.println(" ________");
		System.out.println(" |      |");
		System.out.println(" O      |");
		System.out.println("        |");
		System.out.println("        |");
		System.out.println("        |");
		System.out.println(" _______|__");
	}

	// metoda koja ispisuje glavu i tijelo
	public static void printHeadBody() {
		System.out.println(" ________");
		System.out.println(" |      |");
		System.out.println(" O      |");
		System.out.println(" |      |");
		System.out.println(" |      |");
		System.out.println("        |");
		System.out.println(" _______|__");
	}

	// metoda koja ispisuje glavu, tijelo i jednu ruku
	public static void printHeadBodyOneArm() {
		System.out.println(" ________");
		System.out.println(" |      |");
		System.out.println(" O      |");
		System.out.println("/|      |");
		System.out.println(" |      |");
		System.out.println("        |");
		System.out.println(" _______|__");
	}

	// metoda koja ispisuje glavu, tijelo i obje ruke
	public static void printHeadBodyArms() {
		System.out.println(" ________");
		System.out.println(" |      |");
		System.out.println(" O      |");
		System.out.println("/|\\     |");
		System.out.println(" |      |");
		System.out.println("        |");
		System.out.println(" _______|__");
	}

	// metoda koja ispisuje glavu, tijelo, obje ruke i jednu nogu
	public static void printHeadBodyArmsLeg() {
		System.out.println(" ________");
		System.out.println(" |      |");
		System.out.println(" O      |");
		System.out.println("/|\\     |");
		System.out.println(" |      |");
		System.out.println("/       |");
		System.out.println(" _______|__");
	}

	// metoda koja ispisuje hangmana
	public static void printFullBody() {
		System.out.println(" ________");
		System.out.println(" |      |");
		System.out.println(" O      |");
		System.out.println("/|\\     |");
		System.out.println(" |      |");
		System.out.println("/ \\     |");
		System.out.println(" _______|__");
	}

}
