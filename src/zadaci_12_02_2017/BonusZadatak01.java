package zadaci_12_02_2017;

import java.util.Scanner;

public class BonusZadatak01 {

	public static void main(String[] args) {

		/*
		 * Napisati jednostavni konzolni kalkulator. Kalkulator treba da
		 * podržava sljedeæe operacije:
		 * 
		 * Sabiranje Oduzimanje Množenje Djeljenje Korjenovanje (opcionalno)
		 * Kvadriranje (opcionalno) Modulo (opcionalno)
		 * 
		 * Znate kako kalkulatori rade - nema se tu šta objašnjavati.
		 */

		Scanner input = new Scanner(System.in);

		double number1 = 0, number2 = 0, result;
		int userOption = 0;
		String operator = "";

		System.out.println("*** Kalkulator ***");

		while (userOption != 2) {
			System.out.println("");

			// pozivamo metodu koja uzima unos broja od korisnika
			number1 = getFirstNumberUserInput(input);

			// pozivamo metodu koja uzima unos operatora od korisnika
			operator = getOperatorUserInput(input);

			// ako je uneseni operator sqrt ili root, ispisujemo rezultat
			// korisniku, a ako nije uzimamo unos drugog broja od korisnika i
			// onda ispisujemo rezultat
			if (operator.equals("sqrt") || operator.equals("root")) {
				// pozivamo metodu koja racuna rezultat
				result = getResult(operator, number1, number2);

				// ispisujemo formatiran rezultat
				System.out.println("\nRezultat: " + getFormatedResult(result));
			} else {
				number2 = getSecondNumberUserInput(input, operator);

				// pozivamo metodu koja racuna rezultat
				result = getResult(operator, number1, number2);

				// ispisujemo formatiran rezultat
				System.out.println("\nRezultat: " + getFormatedResult(result));
			}

			System.out.println("");

			boolean wrongUserOption = true;

			while (wrongUserOption) {
				try {
					System.out
							.print("Zelite li racunati ponovo (1 - DA, 2 - NE)? ");
					userOption = input.nextInt();

					wrongUserOption = false;

					if (userOption < 1 || userOption > 2) {
						System.out
								.println("Pogresan unos. Opcije su vam broj 1 ili 2.");
						wrongUserOption = true;
					}
				} catch (Exception ex) {
					System.out
							.println("Pogresan unos. Opcije su vam broj 1 ili 2.");
					input.nextLine();
				}
			}
		}

		System.out.println("\nKalkulator OFF");

		input.close();

	}

	// metoda koja vraca kao string formatirani rezultat
	public static String getFormatedResult(double result) {
		String formatedResult = "";

		// provjerimo ako je rezultat cijeli broj, vrsimo typecasting u int, ako
		// nije ispisujemo ga kao double
		if (isResultInteger(result)) {
			formatedResult = (int) result + "";
		} else {
			formatedResult = result + "";
		}

		return formatedResult;
	}

	// metoda koja provjerava da li je rezultat cijeli broj
	public static boolean isResultInteger(double result) {
		String sResult = result + "";
		boolean isInteger = true;

		// provjerimo da li su na predzadnjem i zadnjem mjestu rezultata tacka i
		// nula, ako jest vracamo true
		if (sResult.charAt(sResult.length() - 2) == '.'
				&& sResult.charAt(sResult.length() - 1) == '0') {
			isInteger = true;
		} else {
			isInteger = false;
		}

		return isInteger;
	}

	// metoda koja izracunava rezultat u zavisnosti od operatora
	public static double getResult(String operator, double num1, double num2) {
		double result = 0;

		if (operator.equals("+")) {
			result = num1 + num2;
		} else if (operator.equals("-")) {
			result = num1 - num2;
		} else if (operator.equals("*")) {
			result = num1 * num2;
		} else if (operator.equals("/")) {
			result = num1 / num2;
		} else if (operator.equals("sqrt")) {
			result = Math.pow(num1, 2);
		} else if (operator.equals("root")) {
			result = Math.sqrt(num1);
		}

		return result;
	}

	// metoda koja uzima unos prvog broja od korisnika
	public static double getFirstNumberUserInput(Scanner input) {
		boolean wrongNumberInput = true;
		double number = 0;

		while (wrongNumberInput) {
			try {
				System.out.print("Unesite broj: ");
				number = input.nextDouble();

				wrongNumberInput = false;
			} catch (Exception ex) {
				System.out.println("Pogresan unos. Morate unijeti broj.");
				input.nextLine();
			}
		}

		return number;
	}

	// metoda koja uzima unos drugog broj od korisnika
	public static double getSecondNumberUserInput(Scanner input, String operator) {
		boolean wrongNumberInput = true;
		double number = 0;

		while (wrongNumberInput) {
			try {
				System.out.print("Unesite broj: ");
				number = input.nextDouble();

				wrongNumberInput = false;

				// ako je korisnik odabrao dijeljenje kao operaciju i drugi broj
				// 0, ispisujemo odgovarajucu poruku i nastavljamo rad petlje
				// dok ne odabere broj razlicit od 0
				if (operator.equals("/") && number == 0) {
					System.out
							.println("Pogresan unos. Ne mozete dijeliti sa 0.");
					wrongNumberInput = true;
				}
			} catch (Exception ex) {
				System.out.println("Pogresan unos. Morate unijeti broj.");
				input.nextLine();
			}
		}

		return number;
	}

	// metoda koja uzima unos operatora od korisnika
	public static String getOperatorUserInput(Scanner input) {
		boolean wrongOperatorInput = true;
		String operator = "";

		input.nextLine();

		while (wrongOperatorInput) {
			System.out
					.print("Unesite operator ('+', '-', '*', '/', 'sqrt', 'root'): ");
			operator = input.nextLine();

			operator = operator.toLowerCase();

			wrongOperatorInput = false;

			if (!checkOperator(operator)) {
				System.out
						.println("Pogresan unos. Morate unijeti neku od navedenih operacija.");
				wrongOperatorInput = true;
			}
		}

		return operator;
	}

	// metoda koja provjerava da li je korisnik unijeo ispravan operator
	public static boolean checkOperator(String s) {
		boolean checkOperator = true;

		if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")
				|| s.equals("sqrt") || s.equals("root")) {
			checkOperator = true;
			;
		} else {
			checkOperator = false;
		}

		return checkOperator;
	}

}
