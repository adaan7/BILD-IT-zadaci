package zadaci_07_03_2017;

public class Faculty extends Employee {

	/*
	 * creating a class Faculty that extends Employee class, with data fields
	 * officeHours and rank, one constructor and getter and setter methods
	 */

	private int officeHours;
	private String rank;

	public Faculty(String name, String address, String phone, String email,
			String office, double salary, int officeHours, String rank) {
		// invoking constructor from parrent class
		super(name, address, phone, email, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public int getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(int officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return super.toString() + "\nOffice hours: " + officeHours + "\nRank: "
				+ rank;
	}

}
