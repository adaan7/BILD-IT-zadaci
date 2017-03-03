package zadaci_03_03_2017;

public class MyInteger {

	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	// metoda koja vraca integer
	public int getValue() {
		return value;
	}

	// metoda koja vraca true ako je broj paran
	public boolean isEven() {
		if (value % 2 != 0) {
			return false;
		}

		return true;
	}

	// metoda koja vraca true ako je broj neparan
	public boolean isOdd() {
		return !this.isEven();
	}

	// metoda vraca true ako je broj prost
	public boolean isPrime() {
		if (value < 2) {
			return false;
		}

		for (int divisor = 2; divisor <= value / 2; divisor++) {
			if (value % divisor == 0) {
				return false;
			}
		}

		return true;
	}

	public static boolean isEven(int number) {
		MyInteger myInteger = new MyInteger(number);

		return myInteger.isEven();
	}

	public static boolean isOdd(int number) {
		return !MyInteger.isEven(number);
	}

	public static boolean isPrime(int number) {
		MyInteger myInteger = new MyInteger(number);

		return myInteger.isPrime();
	}

	public static boolean isEven(MyInteger myInteger) {
		return myInteger.isEven();
	}

	public static boolean isOdd(MyInteger myInteger) {
		return myInteger.isOdd();
	}

	public static boolean isPrime(MyInteger myInteger) {
		return myInteger.isPrime();
	}

	public boolean equals(int number) {
		return value == number;
	}

	public boolean equals(MyInteger myInteger) {
		return value == myInteger.getValue();
	}

	// metoda koja pretvara niz karaktera u integer
	public static int parseInt(char[] chars) {
		String number = "";

		for (int i = 0; i < chars.length; i++) {
			number += chars[i];
		}

		return Integer.parseInt(number);
	}

	// metoda koja pretvara string u integer
	public static int parseInt(String sNumber) {
		return Integer.parseInt(sNumber);
	}

}
