package zadaci_06_03_2017;

public class Zadatak02TestMyString2 {

	public static void main(String[] args) {
		
		MyString2 myStr = new MyString2("nesto bezze");
		
		// testing MyString2 methods
		System.out.println(myStr.toUpperCase());
		System.out.println(myStr.substring(4));
		System.out.println(myStr.compare("nesto bezze"));
		System.out.println(MyString2.valueOf(true).toString());
		
		char[] chars = myStr.toChars();
		
		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i] + " ");
		}

	}

}
