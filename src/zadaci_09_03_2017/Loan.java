package zadaci_09_03_2017;

import java.util.Date;

public class Loan {

	/**
	 * Loan class with Illegal Argument Exception
	 */

	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private Date loanDate;

	public Loan() throws IllegalArgumentException {
		this(3, 1, 1000);
		loanDate = new Date();
	}

	public Loan(double annualInterestRate, int numberOfYears, double loanAmount)
			throws IllegalArgumentException {
		setAnnualInterestRate(annualInterestRate);
		setNumberOfYears(numberOfYears);
		setLoanAmount(loanAmount);
		loanDate = new Date();
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		if (annualInterestRate > 0) {
			this.annualInterestRate = annualInterestRate;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) {
		if (numberOfYears > 0) {
			this.numberOfYears = numberOfYears;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		if (loanAmount > 0) {
			this.loanAmount = loanAmount;
		} else {
			throw new IllegalArgumentException();
		}
	}

	// method that return monthly payment
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;

		return loanAmount
				* monthlyInterestRate
				/ (1 - (1 / Math.pow(1 + monthlyInterestRate,
						numberOfYears * 12)));
	}

	// method that return total payment
	public double getTotalPayment() {
		return getMonthlyPayment() * numberOfYears * 12;
	}

	public Date getLoanDate() {
		return loanDate;
	}

	@Override
	public String toString() {
		return "Annual interest rate: " + annualInterestRate + ", Years: "
				+ numberOfYears + ", Ammount: " + loanAmount + ", Date: "
				+ loanDate;
	}

}
