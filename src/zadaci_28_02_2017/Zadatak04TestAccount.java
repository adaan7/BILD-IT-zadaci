package zadaci_28_02_2017;

public class Zadatak04TestAccount {

	public static void main(String[] args) {

		// pravimo novi account sa specificnim id-em i balance-om
		Account acc = new Account(1122, 20000);

		// postavljamo annual interest rate
		acc.setAnnualInterestRate(4.5);
		// povlacimo 2500 dolara sa racuna
		acc.withdraw(2500);
		// uplacujemo 3000 dolara na racun
		acc.deposit(3000);

		// ispisujemo id, balance, monthly interest i date created
		System.out.println("Account ID: " + acc.getId());
		System.out.printf("Balance: $%2.2f\n", acc.getBalance());
		System.out.printf("Monthly Interest: $%2.2f\n",
				acc.getMonthlyInterest());
		System.out.println("Date created: " + acc.getDateCreated());

	}

}
