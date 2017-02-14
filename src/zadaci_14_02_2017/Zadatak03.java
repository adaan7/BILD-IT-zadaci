package zadaci_14_02_2017;

import java.util.Scanner;

public class Zadatak03 {

	public static void main(String[] args) {

		/*
		 * Napisati metode sa sljedeæim headerima: public static int reverse(int
		 * number) i public static boolean isPalindrome(int number). Prva metoda
		 * prima cijeli broj kao argument i vraæa isti ispisan naopako. (npr.
		 * reverse(456) vraæa 654.) Druga metoda vraæa true ukoliko je broj
		 * palindrom a false ukoliko nije. Koristite reverse metodu da
		 * implementirate isPalindrome metodu. Napišite program koji pita
		 * korisnika da unese broj te mu vrati da li je broj palindrome ili ne.
		 */
		
		Scanner input = new Scanner(System.in);
		
		boolean wrongUserInput = true;
		int number = 0;
		
		while (wrongUserInput) {
			try {
				System.out.print("Unesite cijeli broj: ");
				number = input.nextInt();
				
				wrongUserInput = false;
			} catch (Exception ex) {
				System.out.println("Pogresan unos. Morate unijeti cijeli broj.");
				input.nextLine();
			}
		}
		
		input.close();
		
		// pozivamo metodu koja provjerava da li je broj palindrome i ispisujemo rezultat
		System.out.println("Broj " + number + " " + ((isPalindrome(number)) ? "je palindrom." : "nije palindrom."));

	}
	
	// metoda koja vraca broj ispisan naopako
	public static int reverse(int number) {
		int reverseNumber = 0;
		
		while (number != 0) {
			reverseNumber = reverseNumber * 10 + number % 10;
			
			number /= 10;
		}
		
		return reverseNumber;
	}
	
	// metoda koja provjerava da li je broj palindrom
	public static boolean isPalindrome(int number) {
		// ako je broj negativan, vracamo false jer negativan broj nije palindrom
		if (number < 0) {
			return false;
		}
		
		// ako broj nije jednak istom broju ispisanom naopako, vracamo false
		if (number != reverse(number)) {
			return false;
		}
		
		return true;
	}

}
