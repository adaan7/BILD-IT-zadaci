package zadaci_06_03_2017;

public class MyString1 {

	private char[] chars;

	public MyString1(char[] chars) {
		this.chars = chars;
	}

	// method that returns character on specified index
	public char charAt(int index) {
		return chars[index];
	}

	// method that returns lenght of MyString1
	public int length() {
		return chars.length;
	}

	// method that returns specified substring
	public MyString1 substring(int begin, int end) {
		char[] chars1 = new char[end - begin];

		for (int i = 0, j = begin; j < end; i++, j++) {
			chars1[i] = chars[j];
		}

		return new MyString1(chars1);
	}

	// method that returns MyString1 with all characters lowercase
	public MyString1 toLowerCase() {
		for (int i = 0; i < chars.length; i++) {
			chars[i] = Character.toLowerCase(this.chars[i]);
		}

		return new MyString1(chars);
	}

	// method that checks if this MyString1 is equal with specified MyString1
	public boolean equals(MyString1 s) {
		if (this.length() != s.length()) {
			return false;
		}

		for (int i = 0; i < this.length(); i++) {
			if (this.charAt(i) != s.charAt(i)) {
				return false;
			}
		}

		return true;
	}

	// method that returns a MyString1 representation of int value
	public static MyString1 valueOf(int i) {
		char[] charsZero = { '0' };
		boolean isNegative = false;

		if (i == 0) {
			return new MyString1(charsZero);
		}

		if (i < 0) {
			i = Math.abs(i);
			isNegative = true;
		}

		int counter = 0;
		int tempValue = i;

		while (tempValue != 0) {
			// counting digits of i
			tempValue = tempValue / 10;
			counter++;
		}

		if (isNegative) {
			counter++;
		}

		char[] chars1 = new char[counter];

		if (isNegative) {
			// if i is less than zero, add a '-' prefix
			chars1[0] = '-';
		}

		for (int j = chars1.length - 1; j >= 0; j--) {
			if (isNegative && j == 0) {
				continue;
			} else {
				int number = i % 10;
				chars1[j] = (char) (48 + number);
				i /= 10;
			}
		}

		return new MyString1(chars1);
	}

	public String toString() {
		String s = "";

		for (int i = 0; i < chars.length; i++) {
			s += chars[i];
		}

		return s;
	}

}
