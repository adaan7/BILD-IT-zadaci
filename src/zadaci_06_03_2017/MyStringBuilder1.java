package zadaci_06_03_2017;

public class MyStringBuilder1 {

	private String s;

	public MyStringBuilder1(String s) {
		this.s = s;
	}

	// method that append specified string to this string
	public MyStringBuilder1 append(MyStringBuilder1 s) {
		return new MyStringBuilder1(this.s + s);
	}

	// method that append specified int to this string
	public MyStringBuilder1 append(int i) {
		String temp = i + "";

		return new MyStringBuilder1(this.s + temp);
	}

	// method that return length of this string
	public int length() {
		return s.length();
	}

	// method that return specified character of this string
	public char charAt(int index) {
		return s.charAt(index);
	}

	// method that return MyStringBuilder1 as lowercase
	public MyStringBuilder1 toLowerCase() {
		String temp = this.s.toLowerCase();

		return new MyStringBuilder1(temp);
	}

	// method that return MyStringBuilder1 as specified substring
	public MyStringBuilder1 substring(int begin, int end) {
		String temp = this.s.substring(begin, end);

		return new MyStringBuilder1(temp);
	}

	public String toString() {
		return this.s;
	}

}
