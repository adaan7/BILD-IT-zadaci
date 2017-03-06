package zadaci_06_03_2017;

public class Zadatak05TestMyStringBuilder1 {

	public static void main(String[] args) {
		
		MyStringBuilder1 test = new MyStringBuilder1("nesto bezze");
		
		// testing methods from MyStringBuilder1
		System.out.println(test.append(new MyStringBuilder1(" nako")));
		System.out.println(test.append(27));
		System.out.println(test.length());
		System.out.println(test.charAt(8));
		System.out.println(test.toLowerCase());
		System.out.println(test.substring(2, 8));
		System.out.println(test.toString());
		
	}

}
