package zadaci_07_03_2017;

public class Student extends Person {

	// creating a class Student that extends Person class, with constant data
	// field STATUS, one constructor and getter method

	private final String STATUS;

	public Student(String name, String address, String phone, String email,
			String STATUS) {
		// invoking constructor from parrent class
		super(name, address, phone, email);
		this.STATUS = STATUS;
	}

	public String getSTATUS() {
		return STATUS;
	}

	public String toString() {
		return super.toString() + "\nStatus: " + STATUS;
	}

}
