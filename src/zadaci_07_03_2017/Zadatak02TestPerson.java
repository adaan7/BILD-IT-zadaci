package zadaci_07_03_2017;

public class Zadatak02TestPerson {

	public static void main(String[] args) {

		// creating person, student, employee, faculty and staff object
		Person person1 = new Person("John Doe", "Some Street 14",
				"061-222-333", "john.doe@hotmail.com");
		Person person2 = new Student("John Doe", "Some Street 14",
				"061-222-333", "john.doe@hotmail.com", "senior");
		Person person3 = new Employee("John Doe", "Some Street 14",
				"061-222-333", "john.doe@hotmail.com", "Office", 2500);
		Person person4 = new Faculty("John Doe", "Some Street 14",
				"061-222-333", "john.doe@hotmail.com", "Office", 2500, 8,
				"Director");
		Person person5 = new Staff("John Doe", "Some Street 14", "061-222-333",
				"john.doe@hotmail.com", "Office", 2500, "Director");

		// testing toString method
		System.out.println(person1.toString());
		System.out.println("\n" + person2.toString());
		System.out.println("\n" + person3.toString());
		System.out.println("\n" + person4.toString());
		System.out.println("\n" + person5.toString());

	}

}
