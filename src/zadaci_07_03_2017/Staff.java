package zadaci_07_03_2017;

public class Staff extends Employee {

	/*
	 * creating a class Staff that extends Employee class, with one data field
	 * named title, one constructor and getter and setter method
	 */

	private String title;

	public Staff(String name, String address, String phone, String email,
			String office, double salary, String title) {
		// invoking constructor from parrent class
		super(name, address, phone, email, office, salary);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return super.toString() + "\nTitle: " + title;
	}

}
