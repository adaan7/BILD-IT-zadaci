package zadaci_07_03_2017;

public class Employee extends Person {

	/*
	 * creating a class Employee that extends Person class, with data fields
	 * office, salary and dateHired, with one constructor and getter methods
	 */

	private String office;
	private double salary;
	private java.util.Date dateHired;

	public Employee(String name, String address, String phone, String email,
			String office, double salary) {
		// invoking constructor from parrent class
		super(name, address, phone, email);
		this.office = office;
		this.salary = salary;
		dateHired = new java.util.Date();
	}

	public String getOffice() {
		return office;
	}

	public double getSalary() {
		return salary;
	}

	public java.util.Date getDateHired() {
		return dateHired;
	}

	@Override
	public String toString() {
		return super.toString() + "\nOffice: " + office + "\nSalary: " + salary
				+ "\nDate hired: " + dateHired;
	}

}
