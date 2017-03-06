package zadaci_06_03_2017;

public class MyString2 {

	private String s;

	public MyString2(String s) {
		this.s = s;
	}

	// method that returns 1 if this string is bigger than specified string, 0
	// if they are equal and -1 if this string is less than specified string
	public int compare(String s) {
		return this.s.compareTo(s);
	}

	// method that returns MyString2 substring from specified index
	public MyString2 substring(int begin) {
		String temp = s.substring(begin);

		return new MyString2(temp);
	}

	// method that returns MyString2 as all characters uppercase
	public MyString2 toUpperCase() {
		String temp = s.toUpperCase();

		return new MyString2(temp);
	}

	// method that returns array of chars
	public char[] toChars() {
		char[] chars = new char[this.s.length()];

		for (int i = 0; i < chars.length; i++) {
			chars[i] = this.s.charAt(i);
		}

		return chars;
	}

	// method that returns MyString2 representation of boolean value
	public static MyString2 valueOf(boolean b) {
		String temp = "";

		if (b) {
			temp = "true";
		} else {
			temp = "false";
		}

		return new MyString2(temp);
	}

	public String toString() {
		return this.s;
	}

}
