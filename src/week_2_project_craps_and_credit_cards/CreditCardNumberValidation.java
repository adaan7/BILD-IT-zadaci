package week_2_project_craps_and_credit_cards;

import java.util.Scanner;

public class CreditCardNumberValidation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("*** CREDIT CARD NUMBER VALIDATION ***");

		int userOption = 0;

		while (userOption != 2) {
			// pozivamo metodu koja uzima unos od korisnika
			long cardNumber = getLongUserInput(input);

			// pozivanje metoda koje pauziraju program na odredjeno vrijeme (u
			// ovom slucaju po 1 sekundu)
			try {
				System.out.print("\nChecking");
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
			} catch (Exception ex) {

			}

			// provjeravamo da li je broj kreditne kartice validan
			if (isValid(cardNumber)) {
				System.out.println("\n\n------------------------------");
				System.out.println("Card is valid.");
				System.out.println("------------------------------");
			} else {
				System.out.println("\n\n------------------------------");
				System.out.println("Card is invalid.");
				System.out.println("------------------------------");
			}

			// pozivamo metodu koja uzima unos od korisnika za nastavak rada
			// programa
			userOption = getIntUserInput(input);
		}

		input.close();

		System.out.println("\nSee you soon!");

	}

	// metoda koja uzima unos integera od korisnika
	public static int getIntUserInput(Scanner input) {
		int userInput = 0;
		boolean wrongUserInput = true;

		System.out.println("");

		while (wrongUserInput) {
			try {
				System.out
						.print("Check another card number (1 - Yes, 2 - No)? ");
				userInput = input.nextInt();

				wrongUserInput = false;

				if (userInput < 1 || userInput > 2) {
					System.out
							.println("Wrong input. You have to enter an integer from 1 to 2.");
					wrongUserInput = true;
				}
			} catch (Exception ex) {
				System.out
						.println("Wrong input. You have to enter an integer from 1 to 2.");
				input.nextLine();
			}
		}

		return userInput;
	}

	// metoda koja uzima unos long broja od korisnika
	public static long getLongUserInput(Scanner input) {
		long userInput = 0;
		boolean wrongUserInput = true;

		System.out.println("\n------------------------------");

		while (wrongUserInput) {
			try {
				System.out.println("Enter a credit card number: ");
				userInput = input.nextLong();

				wrongUserInput = false;

				if (userInput < 0
						|| (getSize(userInput) < 13 || getSize(userInput) > 16)) {
					System.out
							.println("Wrong input. You have to enter a positive "
									+ "integer with min 13 and max 16 digits.");
					wrongUserInput = true;
				}
			} catch (Exception ex) {
				System.out.println("Wrong input. You have to enter a positive "
						+ "integer with min 13 and max 16 digits.");
				input.nextLine();
			}
		}

		return userInput;
	}

	// metoda koja provjerava validnost broja kreditne kartice
	public static boolean isValid(long cardNumber) {
		int sum = sumOfDoubleEvenPlace(cardNumber) + sumOfOddPlace(cardNumber);

		if (!checkLength(cardNumber)) {
			return false;
		}

		if (getPrefix(cardNumber, 37) == 37 || getPrefix(cardNumber, 4) == 4
				|| getPrefix(cardNumber, 5) == 5
				|| getPrefix(cardNumber, 6) == 6) {
			if ((sum % 10 == 0)) {
				return true;
			}
		}

		return false;
	}

	// metoda koja provjerava duzinu broja kreditne kartice
	public static boolean checkLength(long cardNumber) {
		if (getSize(cardNumber) < 13 || getSize(cardNumber) > 16) {
			return false;
		}

		return true;
	}

	// metoda koja vraca zbir cifara na parnim mjestima koje su pomnozene sa 2
	public static int sumOfDoubleEvenPlace(long cardNumber) {
		int sum = 0;
		String sCardNumber = cardNumber + "";
		String reverseCardNumber = "";

		for (int i = sCardNumber.length() - 1; i >= 0; i--) {
			reverseCardNumber += sCardNumber.charAt(i);
		}

		for (int i = 1; i < reverseCardNumber.length(); i += 2) {
			int digit = Integer.parseInt(reverseCardNumber.charAt(i) + "");
			int doubleDigit = digit * 2;

			sum += getDigit(doubleDigit);
		}

		return sum;
	}

	// metoda koja vraca jednu cifru
	public static int getDigit(int number) {
		int sumDigits = 0;
		String sDigit = number + "";

		if (number < 10) {
			sumDigits += number;
		} else {
			for (int i = 0; i < sDigit.length(); i++) {
				int digit = Integer.parseInt(sDigit.charAt(i) + "");

				sumDigits += digit;
			}
		}

		return sumDigits;
	}

	// metoda koja vraca zbir cifara na neparnim mjestima
	public static int sumOfOddPlace(long cardNumber) {
		int sum = 0;
		String sCardNumber = cardNumber + "";
		String reverseNumber = "";

		for (int i = sCardNumber.length() - 1; i >= 0; i--) {
			reverseNumber += sCardNumber.charAt(i);
		}

		for (int i = 0; i < reverseNumber.length(); i += 2) {
			sum += Integer.parseInt(reverseNumber.charAt(i) + "");
		}

		return sum;
	}

	// metoda koja provjerava prefix
	public static boolean prefixMatched(long cardNumber, int d) {
		String stringCardNumber = cardNumber + "";
		String stringD = d + "";

		if (d < 10) {
			if (stringCardNumber.charAt(0) == stringD.charAt(0)) {
				return true;
			}
		} else {
			if (stringCardNumber.charAt(0) == stringD.charAt(0)
					&& stringCardNumber.charAt(1) == stringD.charAt(1)) {
				return true;
			}
		}

		return false;
	}

	// metoda koja vraca broj cifara kreditne kartice
	public static int getSize(long cardNumber) {
		return (cardNumber + "").length();
	}

	// metoda koja vraca prvu cifru broja kreditne kartice ako je prefix u redu,
	// ako nije vracamo broj kreditne kartice
	public static long getPrefix(long cardNumber, int k) {
		if (prefixMatched(cardNumber, k)) {
			return k;
		}

		return cardNumber;
	}

}
