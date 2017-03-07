package zadaci_07_03_2017;

public class Person {

	/*
	 * creating a class Person, with data fields name, address, phone and email,
	 * with one constructor and getter and setter methods
	 */

	protected String name;
	protected String address;
	protected String phone;
	protected String email;

	public Person(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Name: " + this.name + "\nAddress: " + this.address + "\nPhone: " + this.phone
				+ "\nE-mail: " + this.email;
	}

}
