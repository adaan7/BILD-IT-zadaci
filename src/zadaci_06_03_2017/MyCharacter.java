package zadaci_06_03_2017;

public class MyCharacter {

	private char ch;

	public MyCharacter(char ch) {
		this.ch = ch;
	}

	// method that return a char
	public char charValue() {
		return this.ch;
	}

	// method that return true if specified character is a letter
	public static boolean isLetter(char ch) {
		return ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122));
	}

	// method that return true if specified character is digit
	public static boolean isDigit(char ch) {
		return (ch >= 48 && ch <= 57);
	}

	// method that return true if specified character is lowercase
	public static boolean isLowerCase(char ch) {
		return (ch >= 97 && ch <= 122);
	}

	// method that return true if specified character is uppercase
	public static boolean isUpperCase(char ch) {
		return (ch >= 65 && ch <= 90);
	}

	// method that return an lowercase character
	public static char toLowerCase(char ch) {
		if (isLowerCase(ch)) {
			return ch;
		}

		return (char) (ch - 65 + 97);
	}

	// method that return an uppercase character
	public static char toUpperCase(char ch) {
		if (isUpperCase(ch)) {
			return ch;
		}

		return (char) (ch - 97 + 65);
	}

	// method that return true if this character is equal to specified character
	public boolean equals(MyCharacter ch) {
		return this.ch == ch.charValue();
	}

	// method that cmopare two specified characters
	public static int compare(char x, char y) {
		if ((int) x > (int) y)
			return 1;
		else if ((int) x < (int) y)
			return -1;
		else
			return 0;
	}

}
