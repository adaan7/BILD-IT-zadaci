package zadaci_09_03_2017;

public class Zadatak05 {

	public static void main(String[] args) {

		/*
		 * (IllegalArgumentException) Modify the Loan class in Listing 10.2 to
		 * throw IllegalArgumentException if the loan amount, interest rate, or
		 * number of years is less than or equal to zero.
		 */
		
		// testing Loan class with IllegalArgumentException
		try {
			Loan loan = new Loan(5, 7, 1000);
			
			System.out.printf("Total payment: %2.2f", loan.getTotalPayment());
		} catch (IllegalArgumentException ex) {
			System.out.println("Wrong input");
		}
		

	}

}
