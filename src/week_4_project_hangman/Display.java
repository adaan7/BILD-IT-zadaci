package week_4_project_hangman;

import java.util.ArrayList;
import java.util.Collections;

public class Display {

	// metoda koja ispisuje vjesalicu
	public static void printHanger() {
		System.out.println("\n ________");
		System.out.println(" |      |");
		System.out.println("        |");
		System.out.println("        |");
		System.out.println("        |");
		System.out.println("        |");
		System.out.println(" _______|__");
	}

	// metoda koja ispisuje glavu
	public static void printHead() {
		System.out.println("\n ________");
		System.out.println(" |      |");
		System.out.println(" O      |");
		System.out.println("        |");
		System.out.println("        |");
		System.out.println("        |");
		System.out.println(" _______|__");
	}

	// metoda koja ispisuje glavu i tijelo
	public static void printHeadBody() {
		System.out.println("\n ________");
		System.out.println(" |      |");
		System.out.println(" O      |");
		System.out.println(" |      |");
		System.out.println(" |      |");
		System.out.println("        |");
		System.out.println(" _______|__");
	}

	// metoda koja ispisuje glavu, tijelo i jednu ruku
	public static void printHeadBodyOneArm() {
		System.out.println("\n ________");
		System.out.println(" |      |");
		System.out.println(" O      |");
		System.out.println("/|      |");
		System.out.println(" |      |");
		System.out.println("        |");
		System.out.println(" _______|__");
	}

	// metoda koja ispisuje glavu, tijelo i obje ruke
	public static void printHeadBodyArms() {
		System.out.println("\n ________");
		System.out.println(" |      |");
		System.out.println(" O      |");
		System.out.println("/|\\     |");
		System.out.println(" |      |");
		System.out.println("        |");
		System.out.println(" _______|__");
	}

	// metoda koja ispisuje glavu, tijelo, obje ruke i jednu nogu
	public static void printHeadBodyArmsLeg() {
		System.out.println("\n ________");
		System.out.println(" |      |");
		System.out.println(" O      |");
		System.out.println("/|\\     |");
		System.out.println(" |      |");
		System.out.println("/       |");
		System.out.println(" _______|__");
	}

	// metoda koja ispisuje hangmana
	public static void printFullBody() {
		System.out.println("\n ________");
		System.out.println(" |      |");
		System.out.println(" O      |");
		System.out.println("/|\\     |");
		System.out.println(" |      |");
		System.out.println("/ \\     |");
		System.out.println(" _______|__");
	}

	// metoda koja ispisuje hangmana u zavisnosti od broja promasaja
	public static void printHangman(int countMiss) {
		if (countMiss == 0) {
			Display.printHanger();
		} else if (countMiss == 1) {
			Display.printHead();
		} else if (countMiss == 2) {
			Display.printHeadBody();
		} else if (countMiss == 3) {
			Display.printHeadBodyOneArm();
		} else if (countMiss == 4) {
			Display.printHeadBodyArms();
		} else if (countMiss == 5) {
			Display.printHeadBodyArmsLeg();
		}
	}

	// metoda koja ispisuje promasene karaktere
	public static void printMissedChars(ArrayList<Character> missedCharList) {
		Collections.sort(missedCharList);

		System.out.print(" Missed: ");

		for (int i = 0; i < missedCharList.size(); i++) {
			if (i == missedCharList.size() - 1) {
				System.out.print(missedCharList.get(i));
			} else {
				System.out.print(missedCharList.get(i) + ", ");
			}
		}

		System.out.print("\n");
	}

}
