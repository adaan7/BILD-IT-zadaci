package zadaci_06_03_2017;

public class Zadatak01TestMyString1 {

	public static void main(String[] args) {

		char[] chars = { 'n', 'e', 's', 't', 'o', ' ', 'b', 'E', 'z', 'Z', 'e' };
		char[] chars1 = { 'n', 'e', 's', 't', 'o' };

		MyString1 s = new MyString1(chars);

		// testing MyString1 methods
		System.out.println(s.charAt(4));
		System.out.println(s.length());
		System.out.println(s.substring(2, 8).toString());
		System.out.println(s.toLowerCase().toString());
		System.out.println(s.equals(new MyString1(chars1)));
		System.out.println(MyString1.valueOf(12345).toString());

	}

}
