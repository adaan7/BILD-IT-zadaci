package zadaci_03_03_2017;

public class Zadatak02TestMyInteger {

	public static void main(String[] args) {

		// pravimo nove objekte MyInteger
		MyInteger myInt1 = new MyInteger(7);
		MyInteger myInt2 = new MyInteger(77);
		int number = 12;
		char[] chars = { '1', '2' };
		String sNumber = "-52";

		// testiramo metode iz MyInteger klase
		System.out.println("Value: " + myInt1.getValue());
		System.out.println("Even number: " + myInt1.isEven());
		System.out.println("Odd number: " + myInt1.isOdd());
		System.out.println("Prime number: " + myInt1.isPrime());

		System.out.println("Is even " + number + ": "
				+ MyInteger.isEven(number));
		System.out.println("Is odd " + number + ": " + MyInteger.isOdd(number));
		System.out.println("Is prime " + number + ": "
				+ MyInteger.isPrime(number));

		System.out.println("Is even " + myInt2.getValue() + ": "
				+ MyInteger.isEven(myInt2));
		System.out.println("Is odd " + myInt2.getValue() + ": "
				+ MyInteger.isOdd(myInt2));
		System.out.println("Is prime " + myInt2.getValue() + ": "
				+ MyInteger.isPrime(myInt2));

		System.out.println("Is " + myInt1.getValue() + " equals " + number
				+ "? " + myInt1.equals(number));
		System.out.println("Is " + myInt1.getValue() + " equals "
				+ myInt2.getValue() + "? " + myInt1.equals(myInt2));

		System.out.println("Chars to number: " + MyInteger.parseInt(chars));
		System.out.println("String to number: " + MyInteger.parseInt(sNumber));

	}

}
